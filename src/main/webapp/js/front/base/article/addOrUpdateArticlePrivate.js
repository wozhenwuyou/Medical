$(function(){
	highLightLeftMenu('lm_doctorInformation');
	/*initUploadSimple({showEdBtns:true,showItemDiv:true,multiFlag:false,multiReplace:true,
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			$("#pic").attr('src', filePath);
	}});*/
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	MYEDITOR = UE.getEditor('editor');
	
	setData();
});




function setData(){
	if(lh.param){
		var article = lh.param.article;
		if(!article)return;
		setTimeout(function(){
			MYEDITOR.setContent(article.content, true);
			//$('#f_hospitalId').combobox('setValue', data.hospitalId);
		},600);
		$('#title').val(article.title);
	}
}

function addOrUpdateArticle(){
	if(lh.preventRepeat()){//防止重复提交
		saveData();
	}else{
		//lh.showRepeatTip();//提示重复提交
		lh.alert('请不要重复提交数据');
	}
}

function saveData(){
	var title = $("#title").val();
	//var filePaths = $("#filePaths").val();
	var content = MYEDITOR.getContent();
	if(!title){
		lh.alert('请输入文章标题');
		return;
	}
	/*if(!filePaths){
		lh.alert('请上传文章图片');
		return;
	}*/
	if(!content){
		lh.alert('请输入文章内容');
		return;
	}
	var obj = {title:title, content:content, typeId:55};//55随手记
	/*if(filePaths){
		filePaths = filePaths.substring(1);
		obj.picPaths = filePaths;
	}*/
	if(lh.param.article)obj.id = lh.param.article.id;
	lh.post("front", "/addOrUpdateArticle", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/doctorHome');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}
