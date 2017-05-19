/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'internalMessage',
	mainObjUpperName : 'InternalMessage'
}

$(function() {
	loadGrid();
	initQueryComponent();
});

/** 加载主表格 */
function loadGrid(){
	lh.$grid.datagrid({
	    loadMsg:'',
		idField:'id',
		sortName:'id',
		sortOrder:'desc',
		striped:true,
		fitColumns:false,
		singleSelect:true,
		selectOnCheck:false,
		checkOnSelect:false,
		pagination:true,
		url:lh.config.gridUrl,
	    queryParams:lh.config.queryObj,//查询参数
	    pageSize:lh.grid.pageSize,//每页数据条数
	    pageList:lh.grid.pageList,//每页数据条数选择数组
	    width:lh.dom.clientSafeWidth-1,
	    height:lh.dom.clientHeight-125,
	    columns:[
		[
			{field:'checkbox',title:'多选框',checkbox:true},
			{field:'id',title:'',hidden:true},
			{field:'operate',title:'操作',width:120,align:'center',formatter: function(value,row,index){
				return  '<span class="opt_alive"><span style="cursor: pointer;color: #EC4949" onclick="openMainObjWin('+index+',\'update\')">修改</span>'
				+'&nbsp;|&nbsp;<span class="update" style="cursor: pointer;color: green" onclick="openMainObjWin('+index+',\'read\')">查看</span></span>'
				+'<span class="opt_trash"><span style="cursor: pointer;color: #EC4949;" onclick="lh.commonBatchThoroughDelete('+row.id+')">彻底删除</span>'
				+'&nbsp;|&nbsp;<span style="cursor: pointer;color: green" onclick="lh.commonBatchRecover('+row.id+')">恢复</span></span>';
			}},
			/*{field:'senderUsername',title:'发送人',width:120,align:'center'},*/
	        {field:'groupId',title:'接收对象',width:100,align:'center',formatter: function(value,row,index){
	        	var group = '';
	        	if(row.groupId == 1){group = '用户';}
	        	else if(row.groupId == 2){group = '医生';}
	        	else if(row.groupId == 3){group = '诊所';}
	        	return group;
	        }},
	        {field:'toAll',title:'是否全体',width:80,align:'center',formatter: function(value,row,index){
	        	return value == 2 ? '<span style="color:orange;">是</span>' : '否';
	        }},
	        {field:'attrStr',title:'接收人',width:180,align:'center'},
	        {field:'title',title:'标题',width:620,align:'center'},
	       /* {field:'content',title:'内容',width:620,align:'center'},*/
	        {field:'sendTime',title:'发送时间',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'mainStatus',title:'状态',width:60,align:'center',formatter: function(value,row,index){
	        	return value == 2 ? '<span style="color:orange">停用</span>' : '启用';
	        }},
	        {field:'deletedBy',title:'删除人',width:100,align:'center'},
	        {field:'deletedAt',title:'删除时间',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'updatedBy',title:'修改人',width:100,align:'center'},
	        {field:'updatedAt',title:'修改时间',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'createdBy',title:'创建人',width:100,align:'center'},
	        {field:'createdAt',title:'创建时间',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }}
	    ]],
        onLoadError: function(data){
	    	lh.backDatagridErrorCheck(data);
	    },
	    onDblClickRow: function(index, row){
	    	openMainObjWin(index, 'read');
        },
	    onLoadSuccess:function(data){
	    	lh.filtGridOperation();
	    	lh.clipboard();//复制功能
	   }  
	});
}

function onClickRowOfGrid(){}

/** 初始化查询条件中的组件及数据 */
function initQueryComponent(){
	$('#sc_groupId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : false,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    //url : '/back/getUserArray'
		data : [{
			'id' : 1,
			'name' : '用户'
		},{
			'id' : 2,
			'name' : '医生'
		},{
			'id' : 3,
			'name' : '诊所'
		}]
	});
	
	$('#sc_ascOrdesc').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '创建时间升序'
		},{
			'id' : 2,
			'name' : '创建时间降序'
		},{
			'id' : 3,
			'name' : '发送人升序'
		},{
			'id' : 4,
			'name' : '发送人降序'
		},{
			'id' : 5,
			'name' : '接收人升序'
		},{
			'id' : 6,
			'name' : '接收人降序'
		}]
	});
	/*
	$('#sc_toAll').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : false,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    //url : '/back/getUserArray'
		data : [{
			'id' : 1,
			'name' : '否'
		},{
			'id' : 2,
			'name' : '是'
		}]
	});*/
	
	$('#sc_mainStatus').combobox({
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
}

/** 初始化表单中的组件及数据 */
function initFormComponent(){
	$('#f_receiverId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : 200,
		filter: lh.comboboxDefaultFilter
		//,url : '/back/getUserArray'
		//panelHeight : 'auto',
		/*data : [{
			'id' : 1,
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]*/
	});
	
	$('#f_groupId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : true,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    //url : '/back/getUserArray'
		data : [{
			'id' : 1,
			'name' : '用户'
		},{
			'id' : 2,
			'name' : '医生'
		},{
			'id' : 3,
			'name' : '诊所'
		}],
		onSelect: function(record){
			var id = record.id;
			if(id == 1){
				$('#f_receiverId').combobox('reload', '/back/getUserArray'); 
			}else if(id == 2){
				$('#f_receiverId').combobox('reload', '/back/getDoctorArray'); 
			}else if(id == 3){
				$('#f_receiverId').combobox('reload', '/back/getHospitalArray'); 
			}
		}
	});
	
	$('#f_toAll').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : false,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    //url : '/back/getUserArray'
		data : [{
			'id' : 1,
			'name' : '否'
		},{
			'id' : 2,
			'name' : '是'
		}],
		onSelect: function(record){
			var id = record.id;
			if(id == 2){
				$('#f_receiverId').combobox('reset'); 
			}
		}
	});
	
	$('#f_mainStatus').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : true,
	    panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]
	});
}


/** 新增修改操作执行之前的拦截方法，返回false则不执行新增修改，如无对应操作可不用申明此方法 */
function preAddOrUpdate(mainObj){
	if(!mainObj)return false;
	if(mainObj.receiverId){
		var receiverName = $('#f_receiverId').combobox('getText'); 
		mainObj.attrStr = receiverName;
	}
	return true;
}

function afterOpenWin(data, operation, isReadOnly){
	if(!data){
		$('#f_toAll').combobox('setValue', 1);
		$('#f_mainStatus').combobox('setValue', 1);
		return;
	}
	var id = data.groupId;
	if(id == 1){
		$('#f_receiverId').combobox('reload', '/back/getUserArray'); 
	}else if(id == 2){
		$('#f_receiverId').combobox('reload', '/back/getDoctorArray'); 
	}else if(id == 3){
		$('#f_receiverId').combobox('reload', '/back/getHospitalArray'); 
	}
}
