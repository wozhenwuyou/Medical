/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'bespeak',
	mainObjUpperName : 'Bespeak'
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
			{field:'hospitalName',title:'诊所名称',width:220,align:'center'},
			{field:'doctorName',title:'医生姓名',width:120,align:'center'},
			{field:'bespeakTime',title:'预约时间',width:130,align:'center',formatter: function(value,row,index){
				return lh.formatDate({date : new Date(value), flag:'datetime'});
	        }},
	        {field:'logicStatus',title:'处理情况',width:120,align:'center',formatter: function(value,row,index){
	        	var typeName = '';
	        	if(value == 1){
	        		typeName = '<span style="color:green">确认</span>';
	        	}else if(value == 2){
	        		typeName = '<span style="color:orange">驳回</span>';
	        	}else{
	        		typeName = "未处理";
	        	}
	        	return typeName;
	        }},
	        {field:'typeId',title:'类型',width:120,align:'center',formatter: function(value,row,index){
	        	var typeName = '';
	        	if(value == 1){
	        		typeName = "远程诊疗";
	        	}else if(value == 2){
	        		typeName = "上门服务";
	        	}else if(value == 3){
	        		typeName = "血液检测";
	        	}
	        	return typeName;
	        }},
	        {field:'isRegisterAgent',title:'服务项目',width:140,align:'center',formatter: function(value,row,index){
	        	return value;
	        }},
	        {field:'cancerTypesName',title:'检测类型',width:140,align:'center'},
	        {field:'mainStatus',title:'状态',width:60,align:'center',formatter: function(value,row,index){
	        	return value == 2 ? '<span style="color:orange">停用</span>' : '启用';
	        }},
	        {field:'baseCondition',title:'基本病情',width:160,align:'center'},
	        {field:'deletedBy',title:'删除人',width:120,align:'center'},
	        {field:'deletedAt',title:'删除时间',width:120,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'updatedBy',title:'修改人',width:120,align:'center'},
	        {field:'updatedAt',title:'修改时间',width:120,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'createdBy',title:'预约人',width:120,align:'center'},
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
	$('#sc_cancerTypes').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : '200',
		filter: lh.comboboxDefaultFilter,
		url : '/back/getCancerArray'
	});
	$('#sc_isRegisterAgent').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : '上门点滴',
			'name' : '上门点滴'
		},{
			'id' : '上门送药',
			'name' : '上门送药'
		},{
			'id' : '上门诊疗',
			'name' : '上门诊疗'
		}]
	});
	$('#sc_typeId').combobox({//1.挂号，2.陪诊，3.血液检测,4.体检
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '远程诊疗'
		},{
			'id' : 2,
			'name' : '上门服务'
		},{
			'id' : 3,
			'name' : '血液检测'
		}],
		onSelect: function(rec){
			var id = rec.id;
			if(id == 1){
				$('#sc_cancerTypes').combobox('reset');
				$('#sc_isRegisterAgent').combobox('reset');
				$('#sc_cancerTypes').combo('disable');
				$('#sc_isRegisterAgent').combo('disable');
			}else if(id == 2){
				$('#sc_cancerTypes').combobox('reset');
				$('#sc_cancerTypes').combo('disable');
				$('#sc_isRegisterAgent').combo('enable');
			}else if(id == 3){
				$('#sc_isRegisterAgent').combobox('reset');
				$('#sc_isRegisterAgent').combo('disable');
				$('#sc_cancerTypes').combo('enable');
			}
        }
	});
	$('#sc_doctorId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : '200',
		filter: lh.comboboxDefaultFilter,
		url : '/back/getDoctorArray'
		/*data : [{
			'id' : 1,
			'name' : '是'
		},{
			'id' : 2,
			'name' : '否'
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
			'name' : '预约时间升序'
		},{
			'id' : 2,
			'name' : '预约时间降序'
		},{
			'id' : 3,
			'name' : '基本病情升序'
		},{
			'id' : 4,
			'name' : '基本病情降序'
		},{
			'id' : 5,
			'name' : '创建时间升序'
		},{
			'id' : 6,
			'name' : '创建时间降序'
		}]
	});
}

/** 初始化表单中的组件及数据 */
function initFormComponent(){
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
	$('#f_logicStatus').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
	    required : true,
	    panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '确认'
		},{
			'id' : 2,
			'name' : '驳回'
		},{
			'id' : 3,
			'name' : '未处理'
		}]
	});
	$('#f_cancerTypes').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : false,
		panelHeight : '200',
		filter: lh.comboboxDefaultFilter,
		url : '/back/getCancerArray'
	});
	$('#f_isRegisterAgent').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 'auto',
		data : [{
			'id' : '上门点滴',
			'name' : '上门点滴'
		},{
			'id' : '上门送药',
			'name' : '上门送药'
		},{
			'id' : '上门诊疗',
			'name' : '上门诊疗'
		}]
	});
	$('#f_typeId').combobox({//1.挂号，2.陪诊，3.血液检测,4.体检
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : true,
		panelHeight : 'auto',
		data : [{
			'id' : 1,
			'name' : '远程诊疗'
		},{
			'id' : 2,
			'name' : '上门服务'
		},{
			'id' : 3,
			'name' : '血液检测'
		}],
		onSelect: function(rec){
			var id = rec.id;
			if(id == 1){
				$('#f_cancerTypes').combobox('reset');
				$('#f_isRegisterAgent').combobox('reset');
				$('#f_cancerTypes').combo('disable');
				$('#f_isRegisterAgent').combo('disable');
			}else if(rec.id == 2){
				$('#f_cancerTypes').combobox('reset');
				$('#f_cancerTypes').combo('disable');
				$('#f_isRegisterAgent').combo('enable');
			}else if(rec.id == 3){
				$('#f_isRegisterAgent').combobox('reset');
				$('#f_isRegisterAgent').combo('disable');
				$('#f_cancerTypes').combo('enable');
			}
        }
	});
	$('#f_doctorId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : true,
		multiple : false,
		required : true,
		panelHeight : '200',
		filter: lh.comboboxDefaultFilter,
		url : '/back/getDoctorArray'
		/*data : [{
			'id' : 1,
			'name' : '是'
		},{
			'id' : 2,
			'name' : '否'
		}]*/
	});
}

/** 新增修改操作执行之前的拦截方法，返回false则不执行新增修改，如无对应操作可不用申明此方法 */
function preAddOrUpdate(mainObj){
	return true;
}

function afterOpenWin(data, operation, isReadOnly){
	if(!data)return;
	if(data.bespeakTime){
		$('#f_bespeakTime').datetimebox('setValue', lh.formatDate({date : new Date(data.bespeakTime), flag:'datetime'}));
	}
	var typeId = data.typeId;
	if(typeId == 1){
		$('#f_cancerTypes').combobox('reset');
		$('#f_isRegisterAgent').combobox('reset');
		$('#f_cancerTypes').combo('disable');
		$('#f_isRegisterAgent').combo('disable');
	}else if(typeId == 2){
		$('#f_cancerTypes').combobox('reset');
		$('#f_cancerTypes').combo('disable');
		$('#f_isRegisterAgent').combo('enable');
	}else if(typeId == 3){
		$('#f_isRegisterAgent').combobox('reset');
		$('#f_isRegisterAgent').combo('disable');
		$('#f_cancerTypes').combo('enable');
	}
}

function beforeClearSearch(){
	$('#sc_isRegisterAgent').combo('enable');
	$('#sc_cancerTypes').combo('enable');
	return true;
}