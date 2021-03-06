$(function(){
	highLightLeftMenu('lm_information');
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
	var doctorId = $("#doctorId").val();
	var name = $("#name").val();
	var typeId = $("#typeId").val();
	if(!name) name = null;
	if(!typeId || typeId == '0' || typeId == '请选择') typeId = null;
	if(name){
		name = name.trim();
	}
	$.post('/getArticleList',{page:page,rows:size,userId:doctorId,title:name,typeId:typeId, notPrivate:1},function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#dataListContainer').html(buildDom(rsp.rows));
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
	$("#name").val(null);
	$("#typeId").val(null);
}

function buildDom(data){
	if(!data) return '';
	var obj = {
			rows:data,
			createDate:function(){
				return lh.formatDate({date:this.createdAt});
			}
		} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

/** 删除 */
function deleteArticle(id){
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/deleteArticle', {articleId:id},function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该文章');
		}else{
			lh.alert(rsp.msg);
		}
	});
}