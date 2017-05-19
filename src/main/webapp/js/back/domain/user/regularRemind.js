/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'regularRemind',
	mainObjUpperName : 'RegularRemind',
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
	    height:lh.dom.clientHeight-88,
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
	        {field:'username',title:'用户名',width:120,align:'center'},
	        {field:'title',title:'标题',width:200,align:'center'},
	        {field:'content',title:'内容',width:260,align:'center'},
	        {field:'remindTime',title:'时间',width:140,align:'center',formatter: function(value,row,index){
	        	return lh.formatDate({date : new Date(value), flag:'datetime'});
	        }},
	        {field:'mainStatus',title:'状态',width:80,align:'center',formatter: function(value,row,index){
	        	return value == 2 ? '<span style="color:orange">取消提醒</span>' : '提醒';
	        }},
	        {field:'deletedBy',title:'删除人',width:120,align:'center'},
	        {field:'deletedAt',title:'删除时间',width:120,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'updatedBy',title:'修改人',width:120,align:'center'},
	        {field:'updatedAt',title:'修改时间',width:120,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'createdBy',title:'创建人',width:120,align:'center'},
	        {field:'createdAt',title:'创建时间',width:120,align:'center',formatter: function(value,row,index){
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
	
	$('#sc_userId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
	    required : false,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    url : '/back/getUserArray'
	});
	
	$('#sc_mainStatus').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : false,
	    panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '提醒'
		},{
			'id' : 2,
			'name' : '取消提醒'
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
			'name' : '标题升序'
		},{
			'id' : 4,
			'name' : '标题降序'
		},{
			'id' : 5,
			'name' : '提醒时间升序'
		},{
			'id' : 6,
			'name' : '提醒时间降序'
		}]
	});
}

/** 初始化表单中的组件及数据 */
function initFormComponent(){
	
	$('#f_userId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
	    required : true,
	    panelHeight : 200,
	    filter: lh.comboboxDefaultFilter,
	    url : '/back/getUserArray'
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
			'name' : '提醒'
		},{
			'id' : 2,
			'name' : '取消提醒'
		}]
	});
}

/** 新增修改操作执行之前的拦截方法，返回false则不执行新增修改，如无对应操作可不用申明此方法 */
function preAddOrUpdate(mainObj){
	return true;
}

function afterOpenWin(data, operation, isReadOnly){
	if(!data)return;
	if(data.remindTime){
		$('#f_remindTime').datetimebox('setValue', lh.formatDate({date : new Date(data.remindTime), flag:'datetime'}));
	}
}
