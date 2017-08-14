$(function(){
	initBloodTestDoctorList();
	initData();
	 $("#datetimepicker").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd hh:00:00',//:ii:ss
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 1, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
	 });
	 
	/* $("#datetimepicker").datetimepicker().on('changeDate', function(ev){
         	$("#datetimepicker").val($("#datetimepicker").val()+'00:00');
     });*/
});
function initData(){
	$(window).resize(function () { goTop(); });
    $(window).scroll(function () { goTop(); });
	jQuery(".menu").slide({ type: "menu", titCell: ".nli", targetCell: ".sub", effect: "slideDown", delayTime:200, triggerTime: 0,returnDefault: true });
}

function initBloodTestDoctorList(){
	var isBloodTest = $("#isBloodTest").val();
	var hospitalId = $("#hospitalId").val();
	var doctorId = $("#doctorId").val();
	lh.hospitalId = hospitalId;
	lh.doctorId = doctorId;
	if(isBloodTest && hospitalId){//血液检测：加载诊所医生列表
		//$("#mainDiv,#mainSubDiv").css('width', 1200);
		$("#mainDiv").show();
		if(lh.doctorId){//已经指定医生，不再加载显示医生列表
			if(!lh.current)lh.current = {};
			lh.current.doctorId = doctorId;
		}else{
			$("#doctorTr,#doctorLabelTr").show();
			loadGridData();
		}
	}else{
		$("#mainDiv").show();
		lh.hospitalId = null;
	}
}

function loadGridData(page, size, count){
	if(!page)page = 1;
	if(!size)size = 4;//每页显示4个医生
	if(!count)count = 1;
	var obj = lh.param;
	if(!obj) obj = {};
	//obj.hospitalId = lh.hospitalId;
	obj.page = page;
	obj.rows = size;
	if(lh.hospitalId)obj.hospitalId = lh.hospitalId;
	lh.post("front", '/getDoctorList', obj, function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#doctorListUl').html(buildDom(rsp.rows));
		    $('#page').empty().Paging({
		    	current:page,
		    	pagesize:size,
		    	count:totalNumber,
		    	toolbar:false,
		    	callback:function(page,size,count){
		    		loadGridData(page,size,count);
		    	}
		    });
		}else{
			lh.alert(rsp.msg);return;
		}
	});
}

function buildDom(data){
	if(!data) return '';
	var obj = {
		rows:data,
		createDate:function(){
			return lh.formatDate({date:this.createdAt});
		},
		lastLoginDate:function(){
			return lh.formatDate({date:this.lastLoginTime,flag:'date'});
		}
	} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

function isRegisterAgentStatus(operation){
	if(operation == 'yes'){
		$("#isRegisterAgentYes")[0].checked = true;
		$("#isRegisterAgentNo")[0].checked = false;
	}else{
		$("#isRegisterAgentYes")[0].checked = false;
		$("#isRegisterAgentNo")[0].checked = true;
	}
}

function chooseDoctor(doctorId){
	if(!lh.current)lh.current = {};
	lh.current.doctorId = doctorId;
	$("#doctorListUl td").css('background-color', 'white');
	$("#doctor_td_"+doctorId).css('background-color', '#3885C7');
	
}

function addBespeak(){
	var baseCondition = $("#baseCondition").val();
	var typeId = $("#typeId").val();
	var doctorId = $("#doctorId").val();
	var hospitalId = $("#hospitalId").val();
	var datetimepicker = $("#datetimepicker").val();
	//var isRegisterAgent = $("#isRegisterAgentYes").val();
	var isRegisterAgent = $("#isRegisterAgent").val();
	if(typeId == 2){
		if(!isRegisterAgent){
			lh.alert('请选择上门服务项目'); return;
		}
		/*var isRegisterAgentYes = $("#isRegisterAgentYes")[0].checked;
		var isRegisterAgentNo = $("#isRegisterAgentNo")[0].checked ;
		if(isRegisterAgentYes){
			var isRegisterAgent = 1;
		}else if(isRegisterAgentNo){
			var isRegisterAgent = 2;
		}else{
			lh.alert('请选择是否代为挂号'); return;
		}*/
	}
	if(typeId == 3){
		var cancerTypes = $("#cancerTypes").val(); 
	}
	if(!datetimepicker){
			lh.alert('请选择预约时间'); return;
		}
	//if(!baseCondition){lh.alert("请填写基本病情");return;}
	var obj = {baseCondition:baseCondition,typeId:typeId,doctorId:doctorId,bespeakTime:datetimepicker,hospitalId:hospitalId};
	if(typeId == 2){
		obj.isRegisterAgent = isRegisterAgent;
	}
	if(typeId == 3){
		obj.cancerTypes = cancerTypes;
		if(lh.current && lh.current.doctorId){
			obj.doctorId = lh.current.doctorId;
		}else{
			lh.alert('请选择医生');return;
		}
	}
	saveData(obj)
}

function jumpToIndex(){
	lh.jumpToUrl('/bespeakRecord');
}

function saveData(obj){
	if(lh.preventRepeat()){//防止重复提交
		lh.post("front", "/addOrUpdateBespeak", obj, function(rsp){
			if(rsp.status == 'success'){
				lh.alert({content:"您的预约已成功提交，点击确定返回首页", clickYes:jumpToIndex});
			}else{
				lh.alert(rsp.msg);
			}
		}, "json");
	}else{
		//lh.showRepeatTip();//提示重复提交
		lh.alert('请不要重复提交数据');
	}
}