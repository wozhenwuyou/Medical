
$(function(){
	getDictArray();
	getDiagnoseTemplate();
	$('#diagnoseTime').val(lh.formatDate( {date:new Date()} ));
	$('#birthday').datetimepicker({
		bootcssVer:3,
	    format: 'yyyy-mm-dd',
	    language: 'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
	});
	$('#diagnoseTime').datetimepicker({
		bootcssVer:3,
	    format: 'yyyy-mm-dd',
	    language: 'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
	});
	
});

function getDictArray(){
	lh.post('front', '/getDictArray', {parentCode:'job'}, function(rsp){
		var array = rsp;
		var dom = '<option>请选择</option>';
		for(i = 0;i<array.length;i++){
			var obj = array[i];
			dom += '<option value="'+obj.id+'">'+obj.name+'</option>';
		}
		$('#jobSelect').html(dom);
	});
}

function getDiagnoseTemplate(){
	lh.post('front', '/getDiagnoseTemplateList', {rows:1000,page:1}, function(rsp){
		if(rsp.success){
			var array = rsp.rows;
			lh.data.diagnoseTemplateArray = array;
			var dom = '<option>请选择</option>';
			for(i = 0;i<array.length;i++){
				var obj = array[i];
				dom += '<option value="'+obj.id+'">'+obj.templateName+'</option>';
			}
			$('#templateSelect').html(dom);
		}
	});
}

function searchPatient(){
	var idcardNum = $('#idcardNum').val();
	if(!idcardNum || idcardNum < 5)return;
	lh.currentPatientId = null;
	lh.post('front','/searchPatient',{idcardNum:idcardNum},function(rsp){
		if(rsp.success){
			var patient = rsp.patient;
			if(!patient){
				$('#searchNoneTip').show();
				$('#searchSuccessTip').hide();
				$('#diagnoseJump').hide();
				return;
			}
			lh.currentPatientId = patient.id;
			$('#searchNoneTip').hide();
			$('#searchSuccessTip').show();
			var diagnoseCount = rsp.diagnoseCount;
			
			var phone = $('#phone').val();
			var username = $('#username').val();
			//var sex1 = $('#sex1').val();
			//var sex2 = $('#sex2').val();
			var age = $('#age').val();
			var birthday = $('#birthday').val();
			var jobSelect = $('#jobSelect').val();
			
			if(!phone)$('#phone').val(patient.phone);
			if(!username)$('#username').val(patient.realName || patient.username);
			if(patient.sex == 1){
				$('#sex1').prop('checked',true);
				$('#sex2').prop('checked',false);
			}else if(patient.sex == 2){
				$('#sex1').prop('checked',false);
				$('#sex2').prop('checked',true);
			}
			//if(!sex1 && !sex2){}
			if(!age)$('#age').val(patient.age);
			if(!birthday && patient.birthday)$('#birthday').val(lh.formatDate({date:new Date(patient.birthday)}));
			$('#jobSelect').val(patient.jobId);
			
			if(diagnoseCount > 0){
				$('#diagnoseJump').show();
				lh.data.patientIdcardNum = idcardNum;
			}else{
				$('#diagnoseJump').hide();
			}
		}
	});
}

function chooseTemplate(){
	$('#allergyHistory,#baseCondition').val(null);
	$('#prescriptionContainer,#tagsContainer').empty();//先清空
	FLAG_ADD_DRUG = [];//清空药品记录
	
	var templateId = $('#templateSelect').val();
	if(!templateId)return;
	templateId = parseInt(templateId);
	var template = _.find(lh.data.diagnoseTemplateArray, { id: templateId});
	if(!template)return;
	var allergyHistory = $('#allergyHistory').val(template.allergyHistory);
	var baseCondition = $('#baseCondition').val(template.baseCondition);
	//诊断
	var tagNameAry = template.diagnoseTags;
	if(tagNameAry){
		tagNameAry = JSON.parse(tagNameAry);
		for(var i in tagNameAry){
			var tagName = tagNameAry[i].tagName;
			addTag(tagName);
		}
	}
	//药品
	var prescriptionAry = template.prescription;
	if(prescriptionAry){
		prescriptionAry = JSON.parse(prescriptionAry);
		for(var i in prescriptionAry){
			var obj = prescriptionAry[i];
			var medicalId = obj.id;
			var medicalTypeId = obj.medicalTypeId;
			var medicalType = obj.medicalType;
			var medicalName = obj.medicalName;
			var medicalNum = obj.medicalNum;
			addPrescription(medicalId, medicalTypeId, medicalType, medicalName, medicalNum);
		}
	}
	
}
//验证整数
var validatorNum  = function(obj,reg){
//	var reg = /^[0-9]{2,20}$/;
	var val = $(obj).val();
	if(val){
		if(reg.test(val)){  
//			obj.css({'border':'1px solid #c5c5c5'});
			return true;
		}else{
//			obj.css({'border':'1px solid red'});
			return false;
		}  
	}
}

/** 新增病历 */
function saveDiagnose(){
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	var username = $('#username').val();
	if(!username){
		lh.alert('请填写用户姓名');return;
	}
	/*var adiconBarcode = $('#adiconBarcode').val();//用户出生日期
	if(!adiconBarcode){
		lh.alert('请填写条形码');return;
	}*/
	var idcardNumFlag = validatorNum('#idcardNum',/^[0-9]{2,20}$/);
	var phoneFlag = validatorNum('#phone',/^[0-9]{2,11}$/);
	var ageFlag = validatorNum('#age',/^[0-9]{1,3}$/);
	var errorContent = '';
	/*if(!idcardNumFlag){
		errorContent+='请输入正确身份证,';
	}*/
	if(!phoneFlag){
		errorContent+='请输入正确电话号码,';
	}
	/*if(!ageFlag){
		errorContent+='请输入正确年龄,';
	}*/
	if(errorContent!=''){
		lh.alert(errorContent);return;
	}
	var diagnoseTime = $('#diagnoseTime').val();
	if(!diagnoseTime){lh.alert('请选择就诊时间');return}
	var obj = getBaseDiagnoseFromDom();
	var phone = $('#phone').val();
	var sex = $("input[name='sex']:checked").val();
	var age = $('#age').val();
	var birthday = $('#birthday').val();
	var jobId = $('#jobSelect').val();
	var jobSelect = $("#jobSelect").find("option:selected").text();
	var patientIdcardNum = $('#idcardNum').val();//身份证号码
	var patientBirthday = $('#birthday').val();//用户出生日期
	if(patientBirthday)obj.patientBirthday = patientBirthday;
	obj.patientName = username;
	if(phone)obj.patientPhone = phone;
	//if(adiconBarcode)obj.adiconBarcode = adiconBarcode;
	if(sex)obj.patientSex = sex;
	if(age)obj.patientAge = age;
	if(birthday)obj.patientbirthday = birthday;
	if(jobSelect && jobSelect != '请选择'){
		obj.patientJob = jobSelect;
		obj.jobId = jobId;
	}
	if(diagnoseTime)obj.diagnoseTime = diagnoseTime;
	if(patientIdcardNum)obj.patientIdcardNum = patientIdcardNum;
	var totalPrice = $('#totalPrice').val();
	if(totalPrice)obj.medicalTotalPrice = totalPrice;
	if(lh.currentPatientId)obj.userId = lh.currentPatientId;
	lh.post('front', '/addDiagnose', obj, function(rsp){
		if(rsp.success){
			lh.alert({content:'您已经成功添加病历',clickYes:lh.back});
		}else{
			lh.alert(rsp.msg);
		}
	});
}




