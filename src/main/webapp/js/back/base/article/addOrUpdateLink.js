MYEDITOR = null;
$(function(){
	MYEDITOR = UE.getEditor('editor');
	MYEDITOR.setOpt({
	     'sourceEditorFirst': true
	});
	//editor.execCommand("source");
	initData();
});

function initData(){
	var param = lh.paramJson;
	if(param && param.sysArticle){
		setData(param.sysArticle);
	}
}

function setData(article){
	setTimeout(function(){
		MYEDITOR.setContent(article.content, false);
    },600);
}

function saveMainObj(){
	var content = MYEDITOR.getContent();
	if(!content){$.messager.alert('提示','请填写内容');return;}
	var obj = {content:content, catId:1, typeId:1};//1:友情连接
	if(lh.preventRepeat()){//防止重复提交
		saveData(obj);
	}else{
		lh.showRepeatTip();//提示重复提交
	}
}

function saveData(obj){
	lh.post('back','/back/addOrUpdateLink',obj,function(rsp){
		if(rsp.success){
			$.messager.alert('提示','您成功更新友情链接', null, function(r){
				lh.reload();
			});
		}
	},'json');
}
