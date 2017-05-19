$(function(){
	highLightLeftMenu('lm_bespeak');
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	loadGridData();
});

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var typeId = $("#typeId").val();
	var baseCondition = $("#baseCondition").val();
	if(baseCondition){
		baseCondition = baseCondition.trim();
	}
	if(!typeId) typeId = null;
	if(!baseCondition) baseCondition = null;
	$.post('/getBespeakList',{page:page,rows:size,flag:'hospital',baseCondition:baseCondition,typeId:typeId},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
			$('#bespeakList').html(buildDom(rsp.rows));
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
	$("#typeId").val(null);
	$("#baseCondition").val(null);
}

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			bespeakDate:function(){
				return lh.formatDate({date:this.bespeakTime,flag:'datetime'});
			},
			typeName:function(){
				var typeId = this.typeId;
				if(typeId == 1){
					return typeName = '远程诊疗';
				}else if(typeId == 2){
					return typeName = '上门服务';
				}else if(typeId == 3){
					return typeName = '血液检测';
				}
			},
			logicStatusName:function(){
				var logicStatus = this.logicStatus;
				if(logicStatus == 1){
					logicStatusName = '确认';
				}else if(logicStatus == 2){
					logicStatusName = '驳回';
				}else{
					logicStatusName = '未处理';
				}
				return logicStatusName;
			}
		} 
		var template = $('#template').html();
		Mustache.parse(template);
		var rendered = Mustache.render(template, obj);
	return rendered;
}

function editBespeak(id){
	lh.jumpToUrl("/hospital/addOrUpdateBespeakForHospital?bespeakId="+id);
}

function deleteBespeak(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/hospital/updateBespeakDeleteForHospital', {bespeakId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该预约');
		}else{
			lh.alert(rsp.msg);
		}
	});
}

