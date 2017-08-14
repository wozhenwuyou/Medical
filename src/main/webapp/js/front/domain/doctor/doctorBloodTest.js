
$(function(){
	getDictArray();
	getDiagnoseTemplate();
	$('#attrDate').val(lh.formatDate( {date:new Date()} ));
	$('#attrDate').datetimepicker({
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
	lh.post('front', '/getDiagnoseTemplateList', {}, function(rsp){
		if(rsp.success){
			var array = rsp.rows;
			lh.data.diagnoseTemplateArray = array;
			var dom = '<option value="0">请选择</option>';
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
	lh.post('front','/searchPatient',{idcardNum:idcardNum},function(rsp){
		if(rsp.success){
			var patient = rsp.patient;
			if(!patient){
				$('#searchNoneTip').show();
				$('#searchSuccessTip').hide();
				$('#diagnoseJump').hide();
				return;
			}
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
			$('#patientId').val(patient.id);
			
			if(!phone)$('#phone').val(patient.phone);
			if(!username){
				$('#username').val(patient.realName || patient.username);
			}
			if(patient.sex == 1){
				$('#sex1').prop('checked',true);
				$('#sex2').prop('checked',false);
			}else if(patient.sex == 2){
				$('#sex1').prop('checked',false);
				$('#sex2').prop('checked',true);
			}
			/*if(!sex1 && !sex2){}*/
			if(!age)$('#age').val(patient.age);
			if(!birthday && patient.birthday)$('#birthday').val(lh.formatDate({date:new Date(patient.birthday)}));
			$('#jobSelect').val(patient.jobId);
			
			if(diagnoseCount){
				$('#diagnoseJump').show();
				lh.data.patientIdcardNum = idcardNum;
			}else{
				$('#diagnoseJump').hide();
			}
		}
	});
}

function chooseTemplate(){
	var templateId = $('#templateSelect').val();
	if(!templateId)return;
	templateId = parseInt(templateId);
	var template = _.find(lh.data.diagnoseTemplateArray, { id: templateId});
	var allergyHistory = $('#allergyHistory').val(template.allergyHistory);
	var baseCondition = $('#baseCondition').val(template.baseCondition);
	//剩下两个 
	
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

function selected(id){
	$("#cancerListTd input").removeProp('checked');//改为单选
	$("#cancer_"+id).prop('checked','checked');
}

/** 新增病历 */
function savePatientReport(){
	var typeIds = "";
	var str=document.getElementsByName("cancer");
	for(i=0;i<str.length;i++){
		if(str[i].checked == true){
			typeIds += ","+str[i].value; 
		}
	}
	var adiconBarcode = $('#adiconBarcode').val();//用户出生日期
	if(!adiconBarcode){
		lh.alert('请填写条形码');return;
	}
	var idcardNumFlag = validatorNum('#idcardNum',/^[0-9]{2,20}$/);
	var phoneFlag = validatorNum('#phone',/^[0-9]{2,11}$/);
	var ageFlag = validatorNum('#age',/^[0-9]{1,3}$/);
	//var errorContent = '';
	if(!idcardNumFlag){
		lh.alert('请输入正确身份证');return;
	}
	
	if(!typeIds){
		lh.alert('请选择血液检测项');return;
	}
	
	var username = $('#username').val();
	if(!username){
		lh.alert('请填写用户姓名');return;
	}
	
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	/*if(!phoneFlag){
		errorContent+='请输入正确电话号码,';
	}*/
	/*if(!ageFlag){
		errorContent+='请输入正确年龄,';
	}*/
	/*if(errorContent!=''){
		lh.alert(errorContent);return;
	}*/
	//var obj = getBaseDiagnoseFromDom();
	var obj = {};
	var phone = $('#phone').val();
	var sex = $("input[name='sex']:checked").val();
	var age = $('#age').val();
	var idcardNum = $('#idcardNum').val();
	//var birthday = $('#birthday').val();
	var jobSelect = $('#jobSelect').val();
	var patientId = $('#patientId').val();
	if(!jobSelect || jobSelect == '0' || jobSelect == '请选择'){ lh.alert('请选择职业');return;}
	//var birthday = $('#birthday').val();
	//var diagnoseTime = $('#diagnoseTime').val();
	//var patientIdcardNum = $('#idcardNum').val();//身份证号码
	//var patientBirthday = $('#birthday').val();//用户出生日期
	//var patientBirthday = $('#birthday').val();//用户出生日期
	var attrDate = $('#attrDate').val();//采血日期
	if(!attrDate){
		lh.alert('请填写采血日期');return;
	}
	if(attrDate)obj.attrDate = attrDate + ' 00:00:00';
	//if(birthday)obj.attrDate = birthday+' 00:00:00';
	//obj.patientName = username;
	obj.patientName = username;
	obj.itemCodes = typeIds.substring(1);
	obj.itemCode = typeIds.substring(1);//暂时只支持单选
	if(phone){
		obj.patientPhone = phone;
		obj.phone = phone;
	}
	if(adiconBarcode)obj.adiconBarcode = adiconBarcode;
	if(sex)obj.sex = sex;
	if(age)obj.age = age;
	if(idcardNum)obj.idcardNum = idcardNum;
	if(jobSelect)obj.attrInt = jobSelect;
	if(patientId)obj.patientId = patientId;
	//if(birthday)obj.birthday = birthday;
	//if(patientIdcardNum)obj.patientIdcardNum = patientIdcardNum;
	//if(patientBirthday)obj.patientBirthday = patientBirthday;
	lh.post('front', '/doctor/addPatientReport', obj, function(rsp){
		if(rsp.success){
			lh.alert({content:'您已经成功添加血液检测项目',clickYes:lh.back});
		}else{
			lh.alert(rsp.msg);
		}
	});
}




