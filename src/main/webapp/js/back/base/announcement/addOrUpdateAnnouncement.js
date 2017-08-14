MYEDITOR = null;
$(function(){
	MYEDITOR = UE.getEditor('editor');
	initData();
});

function initData(){
	$('#f_gradeId').combobox({
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
	$('#f_hospitalId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : 200,
		filter: lh.comboboxDefaultFilter,
		url : '/back/getHospitalArray'
		/*data : [{
			'id' : 1,
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]*/
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
		var announcement = lh.param.announcement;
		setData(announcement);
	}
}

function setData(data){
	if(!data){
		$('#f_mainStatus').combobox('setValue', 1);return;
	}
	setTimeout(function(){
		MYEDITOR.setContent(data.content,true);
		$('#f_hospitalId').combobox('setValue', data.hospitalId);
    },600);
	$('#f_mainStatus').combobox('setValue', data.mainStatus);
	$('#f_title').textbox('setValue', data.title);
	if(data.gradeId){
		$('#f_gradeId').combobox('setValue', data.gradeId);
	}
}

function saveMainObj(){
	var announcementId = $("#announcementId").val();
	var content = MYEDITOR.getContent();
	var title = $("#f_title").textbox('getValue');
	var mainStatus = $("#f_mainStatus").combobox('getValue');
	var gradeId = $("#f_gradeId").combobox('getValue');
	var hospitalId = $("#f_hospitalId").combobox('getValue');
	if(!content){$.messager.alert('提示','请填写公告内容');return;}
	if(!title){$.messager.alert('提示','请填写公告标题');return;}
	if(!mainStatus){$.messager.alert('提示','请选择状态');return;}
	
	if(hospitalId && gradeId == 2){
		$.messager.alert('提示','如果您是要发布系统公告，请不要选择诊所');return;
	}
	
	//if(!hospitalId){$.messager.alert('提示','请选择诊所');return;}
	var obj = {title:title, content:content, mainStatus:mainStatus};
	if(hospitalId)obj.hospitalId = hospitalId;
	if(gradeId)obj.gradeId = gradeId;
	if(announcementId)obj.id = announcementId;
	if(lh.preventRepeat()){//防止重复提交
		saveData(obj);
	}else{
		lh.showRepeatTip();//提示重复提交
	}
}

function saveData(obj){
	lh.post('back','/back/addOrUpdateAnnouncement',obj,function(rsp){
		if(rsp.status == 'success'){
			$.messager.confirm('提示','您已成功更新公告，是否返回公告页面？',function(r){
				if(r){
					lh.jumpToUrl('/back/announcement');
				}else{
					lh.reload();
				}
			});
		}
	},'json');
}
