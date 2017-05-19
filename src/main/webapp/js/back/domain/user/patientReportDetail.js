$(function(){
	initData();
});

function initData(){
	$("#attrDate").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',//:ii:ss
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 3, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
	 });
	
}

function saveDoctorResult(){
	var reportId = $("#reportId").val();
	var doctorResult = $("#doctorResult").val();
	
	var patientName = $("#patientName").val();
	var adiconBarcode = $("#adiconBarcode").val();
	var patientPhone = $("#patientPhone").val();
	var idcardNum = $("#idcardNum").val();
	var patientPhone = $("#patientPhone").val();
	var age = $("#age").val();
	if(age)age = age.replace('岁','').trim();
	var sexName = $("#sexName").val();
	var itemCodes = $("#itemName").val();
	var attrDate = $("#attrDate").val();
	var sampleType = $("#sampleType").val();
	var sampleChar = $("#sampleChar").val();
	if(attrDate)attrDate += ' 00:00:00';
	
	var obj = {id:reportId,doctorResult:doctorResult,patientName:patientName,adiconBarcode:adiconBarcode,
			idcardNum:idcardNum,patientPhone:patientPhone,phone:patientPhone,age:age,sexName:sexName,itemCodes:itemCodes,attrDate:attrDate,
				sampleType:sampleType,sampleChar:sampleChar};
	lh.post("front", "/back/updateReportDoctorResult", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.back();
		}else{
			$.messager.alert('提示', rsp.msg);
		}
	}, "json");
}