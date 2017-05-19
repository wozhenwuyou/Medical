$(function(){
	highLightLeftMenu('lm_doctorInformation');
	initUploadSimple({showEdBtns:true,showItemDiv:true,multiFlag:false,multiReplace:true,
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			$("#pic").attr('src', filePath);
	}});
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
		$('#typeId').val(article.typeId);
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
	var typeId = $("#typeId").val();
	var filePaths = $("#filePaths").val();
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
	if(!typeId || typeId == '0' || typeId == '请选择'){
		lh.alert('请选择文章栏目');
		return;
	}
	var obj = {typeId:typeId, title:title, content:content};
	if(filePaths){
		filePaths = filePaths.substring(1);
		obj.picPaths = filePaths;
	}
	if(lh.param.article)obj.id = lh.param.article.id;
	lh.post("front", "/addOrUpdateArticle", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/doctorHome');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}
