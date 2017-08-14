$(function(){
	highLightLeftMenu('lm_medicationLog');
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	initPage();
	loadGridData();
});

function initPage(){
	$("#startDate").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 2, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
    });
	$("#endDate").datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 2, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
    });
	
	var date = lh.formatDate();
	$('#startDate,#endDate').val(date);
	$('#startDate,#endDate').datetimepicker('update');
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var name = $("#optUsername").val();
	var inOrOut = $("#inOrOut").val();
	var dateFrom = $('#startDate').val();
	var dateTo = $('#endDate').val();
	if(!inOrOut)inOrOut = null;
	if(!name)name = null;
	if(name){
		name = name.trim();
	}
	$.post('/hospital/getMedicationLogList',{page:page,rows:size,optUsernameLike:name,inOrOut:inOrOut,dateFrom:dateFrom,dateTo:dateTo},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#medicationLogList').html(buildDom(rsp.rows));
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
			inOrOutDate:function(){
				return lh.formatDate({date:this.inOrOutTime});
			}
		} 
		var template = $('#template').html();
		Mustache.parse(template);
		var rendered = Mustache.render(template, obj);
	return rendered;
}

function editMedicationLog(id){
	lh.jumpToUrl("/hospital/addOrUpdateMedicationLog?medicationLogId="+id);
}

/** 删除病历模板 */
function deleteMedicationLog(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/hospital/updateMedicationLogDelete', {medicationLogId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该药物记录');
		}else{
			lh.alert(rsp.msg);
		}
	});
}

function resetSearch(){
	$('#startDate,#endDate').val(null);
	$('#startDate,#endDate').datetimepicker('update');
	$('#optUsername').val(null);
	$('#inOrOut').val(null);
}
