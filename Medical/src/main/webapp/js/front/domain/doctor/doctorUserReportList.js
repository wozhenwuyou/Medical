$(function(){
	highLightLeftMenu('lm_report');
	initData();
});
function initData(){
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	loadGridData();
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var searchType = $("#searchType").val();
	var ascOrdesc = $("#ascOrdesc").val();
	if(!searchType){searchType = null;}
	if(!ascOrdesc){ascOrdesc = null;}
	var username = $("#username").val();
	if(!username)username = null;
	if(username){
		username = username.trim();
	}
	$.post('/doctor/getdoctorUserReportList',{page:page,rows:size,username:username,searchType:searchType,ascOrdesc:ascOrdesc},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#reportList').html(buildDom(rsp.rows));
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
	$("#username").val(null);
	$("#searchType").val(null);
	$("#ascOrdesc").val(null);
}

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			createDate:function(){
				return lh.formatDate({date:this.createdAt});
			},
			updateDate:function(){
				return lh.formatDate({date:this.updatedAt});
			},
			getAttrDate:function(){
				if(!this.attrDate)return '';
				return lh.formatDate({date:this.attrDate,flag:'date'});
			},
			resultHintName:function(){
				var resultHint = this.resultHint;
				if(resultHint == 'd'){
					return '<span style="color:red;">异常</span>';//'低'
				}else if(resultHint == 'z'){
					return '<span style="color:green;">正常</span>';
				}else if(resultHint == 'g'){
					return '<span style="color:red;">异常</span>';//'高'
				}
			}
		} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

function readPatientReport(id){
	lh.jumpToUrl("/doctor/doctorUserReportDetail/"+id);
}

/** 删除检测档案 */
function deletePatientReport(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/deletePatientReport', {patientReportId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert({content:'您已经成功删除该检测档案',clickYes:lh.reload});
		}else{
			lh.alert(rsp.msg);
		}
	});
}
