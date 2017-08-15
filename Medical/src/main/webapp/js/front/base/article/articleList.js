
$(function () {
	initPage();
    loadGridData();
});

function initPage(){
	$(window).resize(function () { goTop(); });
    $(window).scroll(function () { goTop(); });
    jQuery(".menu").slide({
		type : "menu",
		titCell : ".nli",
		targetCell : ".sub",
		effect : "slideDown",
		delayTime : 200,
		triggerTime : 0,
		returnDefault : true
	});
}

function loadGridData(page,size,count){
	if(!page)page = 1;
	if(!size)size = lh.grid.frontSize || 20;
	if(!count)count = 1;
	var typeId = $("#typeId").val();
	if(!typeId)typeId = null;
	var postUrl = $("#postUrl").val();
	var obj = {page:page, rows:size};
	if(postUrl){
		lh.isAnno = 1;
		var url = postUrl;
	}else{
		var url = '/getArticleList';
		obj.typeId = typeId;
	}
	lh.post('front', url, obj, function(rsp){
		if(rsp.success){
			var totalNumber = rsp.total || 0;
		    $('#articleListUl').html(buildDom(rsp.rows));
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
			isAnno:function(){
				return lh.isAnno;
			}
		} 
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}