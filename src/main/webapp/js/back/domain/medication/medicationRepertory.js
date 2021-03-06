/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'medicationRepertory',
	mainObjUpperName : 'MedicationRepertory'
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
			{field:'hospitalName',title:'诊所名称',width:200,align:'center'},
			{field:'medicationTypeName',title:'药物类型名称',width:180,align:'center'},
			{field:'medicationName',title:'药物名称',width:180,align:'center'},
			{field:'warningNum',title:'告警数量',width:120,align:'center'},
			{field:'remainNum',title:'库存数量',width:120,align:'center'},
			{field:'price',title:'药品单价',width:120,align:'center'},
	        {field:'mainStatus',title:'状态',width:60,align:'center',formatter: function(value,row,index){
	        	return value == 2 ? '<span style="color:orange">停用</span>' : '启用';
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
	$('#sc_hospitalId').combobox({
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
			'name' : '出库'
		},{
			'id' : 2,
			'name' : '入库'
		}]*/
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
			'name' : '剩余数量升序'
		},{
			'id' : 2,
			'name' : '剩余数量降序'
		},{
			'id' : 3,
			'name' : '警告数量升序'
		},{
			'id' : 4,
			'name' : '警告数量降序'
		},{
			'id' : 5,
			'name' : '创建时间升序'
		},{
			'id' : 6,
			'name' : '创建时间降序'
		}]
	});
	$('#sc_medicationTypeId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 200,
		url : '/back/getMedicationTypeArray'
		/*data : [{
			'id' : 1,
			'name' : '出库'
		},{
			'id' : 2,
			'name' : '入库'
		}]*/
	});
	$('#sc_medicationId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : 200,
		url : '/back/getMedicationArray'
		/*data : [{
			'id' : 1,
			'name' : '出库'
		},{
			'id' : 2,
			'name' : '入库'
		}]*/
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
			'name' : '启用'
		},{
			'id' : 2,
			'name' : '停用'
		}]
	});
}

/** 初始化表单中的组件及数据 */
function initFormComponent(){
	$('#f_hospitalId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : true,
		panelHeight : 200,
		filter: lh.comboboxDefaultFilter,
		url : '/back/getHospitalArray'
		/*data : [{
			'id' : 1,
			'name' : '出库'
		},{
			'id' : 2,
			'name' : '入库'
		}]*/
	});
	$('#f_mtId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : true,
		panelHeight : 200,
		url : '/back/getMedicationTypeArray',
		onSelect: function(rec){
            var url = '/back/getMedicationArray?typeId='+rec.id;
            $('#f_medicationId').combobox('clear');
            $('#f_medicationId').combobox('reload', url);
        }
	});
	$('#f_medicationId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : true,
		panelHeight : 200,
		url : '/back/getMedicationArray'
		/*data : [{
			'id' : 1,
			'name' : '出库'
		},{
			'id' : 2,
			'name' : '入库'
		}]*/
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
	if(mainObj){
		var remainNum = freshRemainNum();
		mainObj.remainNum = remainNum;
	}
	return true;
}

function afterOpenWin(data, operation, isReadOnly){
	if(!data){
		$('#f_remainNumFresh').numberbox('setValue', 0);
		$('#td_remainNumFresh').hide();
		$('#f_mainStatus').combobox('setValue', 1);
		return;
	}else{
		$('#td_remainNumFresh').show();
	}
	
}

function freshRemainNum(){
	var remainNumFresh = $('#f_remainNumFresh').numberbox('getValue');
	var remainNum = $('#f_remainNum').numberbox('getValue');
	if(!remainNumFresh)remainNumFresh = 0;
	if(!remainNum)remainNum = 0;
	remainNumFresh = new Number(remainNumFresh);
	remainNum = new Number(remainNum);
	var remainNum = remainNumFresh + remainNum;
	$('#f_remainNum').numberbox('setValue', remainNum);
	$('#f_remainNumFresh').numberbox('clear');
	return remainNum;
}

function whenAddOrUpdateFailure(rsp){
	return false;
}

function exportmedicationRepertory(){
	var obj = lh.getQueryObj();
	delete obj.ascOrdesc;
	window.location.href = '/back/medicationRepertoryExcel?obj='+obj;
}