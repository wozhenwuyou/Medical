MYEDITOR = null;
$(function(){
	initUploadSimple({showEdBtns:true,showItemDiv:true,multiFlag:false,multiReplace:true,
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			$("#pic").attr('src', filePath);
	}});
	MYEDITOR = UE.getEditor('editor');
	initData();
});

function initData(){
	$('#f_userId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : 200,
		url : '/back/getDoctorArray'//getUserArray:此项目接收人是医生
	});
	
	$('#f_typeId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : false,
	    panelHeight : 200,
	    url : '/back/getArticleTypeArray'
		/*data : [{
			'id' : 1,
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]*/
	});
	$('#f_isTop').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '否'
		},{
			'id' : 2,
			'name' : '是'
		}]
	});
	$('#f_mainStatus').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]
	});
	if(lh.param){
		var article = lh.param.article;
		setData(article);
	}
}

function setData(data){
	if(!data)return;
	//$("#articleId").val(data.id);
	$("#f_title").textbox('setValue',data.title);
	$("#f_typeId").combobox('setValue',data.typeId);
	$("#f_isTop").combobox('setValue',data.isTop);
	$("#f_mainStatus").combobox('setValue',data.mainStatus);
	$("#f_description").textbox('setValue',data.description);
	if(data.userId){
		$("#f_userId").combobox('setValue',data.userId);
	}
	setTimeout(function(){
		MYEDITOR.setContent(data.content,true);
    },600);
}

function saveMainObj(){
	var articleId = $("#articleId").val();
	var filePaths = $("#filePaths").val();
	var title = $("#f_title").textbox('getValue');
	//var description = $("#f_description").textbox('getValue');
	var typeId = $("#f_typeId").combobox('getValue');
	var isTop = $("#f_isTop").combobox('getValue');
	var mainStatus = $("#f_mainStatus").combobox('getValue');
	var userId = $("#f_userId").combobox('getValue');
	var content = MYEDITOR.getContent();
	if(!title){$.messager.alert('提示','请填写标题');return;}
	if(!typeId){$.messager.alert('提示','请选择类型');return;}
	if(!mainStatus){$.messager.alert('提示','请选择状态');return;}
	//if(!filePaths){$.messager.alert('提示','请上传文章图片');return;}
	if(!content){$.messager.alert('提示','请填写内容');return;}
	//if(!description){$.messager.alert('提示','请填写描述');return;}
	if(!isTop)isTop = 1;
	var obj = {};
	obj.id = articleId;
	obj.title = title;
	//obj.description = description;
	obj.content = content;
	obj.typeId = typeId;
	obj.userId = userId;
	obj.isTop = isTop;
	if(filePaths){
		if(filePaths.indexOf(',') == 0){
			obj.picPaths = filePaths.substring(1);
		}else{
			obj.picPaths = filePaths;
		}
	}
	obj.mainStatus = mainStatus;
	if(lh.preventRepeat()){//防止重复提交
		saveData(obj);
	}else{
		lh.showRepeatTip();//提示重复提交
	}
}

function saveData(obj){
	lh.post('back','/back/addOrUpdateArticle',obj,function(rsp){
		if(rsp.status == 'success'){
			$.messager.confirm('提示','您已经成功更新文章，是否返回文章页面？',function(r){
				if(r){
					lh.jumpToUrl('/back/article');
				}else{
					lh.reload();
				}
			});
		}
	},'json');
}
