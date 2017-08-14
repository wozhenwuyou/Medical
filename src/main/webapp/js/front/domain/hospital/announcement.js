$(function(){
	highLightLeftMenu('lm_announcement');
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	loadGridData();
});

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var title = $("#title").val();
	if(!title) title = null;
	$.post('/hospital/getAnnouncementList',{page:page,rows:size,title:title},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#dataList').html(buildDom(rsp.rows));
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
				return lh.formatDate({date:this.createdAt, flag:'datetime'});
			}
		} 
		var template = $('#template').html();
		Mustache.parse(template);
		var rendered = Mustache.render(template, obj);
	return rendered;
}

function editData(id){
	lh.jumpToUrl("/hospital/announcementAddOrUpdate?mainId="+id);
}

function showContent(id){
	var content = $("#showContent_"+id);
	lh.alert(content[0].innerHTML);
}

var resetQuery = function(){
	$("#title").val(null);
}

/** 删除病历模板 */
function deleData(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/hospital/updateAnnouncementDelete', {mainId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该条公告');
		}else{
			lh.alert(rsp.msg);
		}
	});
}

