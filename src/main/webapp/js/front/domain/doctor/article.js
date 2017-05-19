$(function(){
	highLightLeftMenu('lm_article');
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
	if(!typeId) typeId = null;
	//userId:doctorId,加载所有对应类型的文章，不限制为医生的文章
	$.post('/getArticleList',{page:page,rows:size,title:name,typeId:typeId},function(rsp){
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