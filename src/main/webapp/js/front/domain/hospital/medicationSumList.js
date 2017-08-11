$(function(){
	highLightLeftMenu('lm_medicationSum');
	initPage();
	loadGridData();
});
function initPage(){
	
	$("#dateFrom").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 2, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
    });
	$("#dateTo").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 2, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
    });
	
	$('.input14').bind('input propertychange', function() {
		$('.input14').on('blur', function(){$('.pf_268').slideUp(300)});
		$('.pf_268').slideDown(300)
		$('.pf_268 ul li').text(event.target.value) 
	});
	//$('#diagnoseList').addClass('hover');
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	//var typeId = $("#typeId").val();
	//if(!typeId)typeId = null;
	var doctorName = $("#doctorName").val();
	var medicationName = $("#medicationName").val();
	var dateFrom = $("#dateFrom").val();
	var dateTo = $("#dateTo").val();
	var searchType = $("#searchType").val();
	//var ascOrdesc = $("#ascOrdesc").val();
	if(!doctorName)doctorName = null;
	if(!medicationName)medicationName = null;
	if(!dateFrom)dateFrom = null;
	if(!dateTo)dateTo = null;
	if(!searchType){searchType = null;}
	//if(!ascOrdesc){ascOrdesc = null;}
	if(doctorName){
		doctorName = doctorName.trim();
	}
	if(medicationName){
		medicationName = medicationName.trim();
	}
	var obj = {page:page,rows:size,doctorName:doctorName,medicationName:medicationName,dateFrom:dateFrom,dateTo:dateTo,searchType:searchType};
	lh.post('front', '/hospital/getMedicationSumList', obj,function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#dataListContainerList').html(buildDom(rsp));
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

function resetQuery(){
	$("#doctorName").val(null);
	$("#medicationName").val(null);
	$("#dateFrom").val(null);
	$("#dateTo").val(null);
	$("#searchType").val(null);
	//$("#ascOrdesc").val(null);
}

function buildDom(data){
	var rows = data.rows;
	var sessionDoctorId = data.doctorId;
	var obj = {
		rows:rows,
		isOwner:function(){
			return sessionDoctorId == this.doctorId;
		},
		createDate:function(){
			return lh.formatDate({date:this.diagnoseTime});
		}
	} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}



