/** 基础数据和基础设置 */
/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'hospital',
	mainObjUpperName : 'Hospital'
}

$(function() {
	initData();
	//loadGrid();
	initQueryComponent();
	//initUploadSimple({showEdBtns:true});
	
});

function updateFilePaths1(filePath, opt, fileId){
	var paths = lh.currentOutdoorPics || '';
	if(opt == 'add'){
		paths += ','+filePath;
		lh.currentOutdoorPics = paths;
	}else if(opt == 'del'){
		var toRemove = ','+filePath;
		paths = paths.replace(toRemove, '');
		paths = paths.replace(filePath, '');
		lh.currentOutdoorPics = paths;
		if(fileId)$("#outdoor_pic_"+fileId).remove();
	}
}

function appendFileLink1(filePath){
	if(!filePath || filePath.length<3)return;
	var fileId = lh.createSerial();
	var name = filePath.substring(filePath.indexOf('_')+1, filePath.length);
	var dom =     
		'<div id="outdoor_pic_'+fileId+'" style="display:inline-block;"><img src="'+filePath+'" onclick="window.open(\''+filePath+'\');" style="max-height:100px;"/>'+
			'<span onclick="updateFilePaths1(\''+filePath+'\',\'del\',\''+fileId+'\');return false;" style="position: relative;right: 30px;bottom:5px;background-color: #BCBCBC;padding: 3px;cursor: pointer;">删除</span>'+
		'</div>';
	
	$("#upload_outer_div1").append(dom);
}

function updateFilePaths2(filePath, opt, fileId){
	if(!filePath)return;
	var paths = lh.currentIndoorPics || '';
	if(opt == 'add'){
		paths += ','+filePath;
		lh.currentIndoorPics = paths;
	}else if(opt == 'del'){
		var toRemove = ','+filePath;
		paths = paths.replace(toRemove, '');
		paths = paths.replace(filePath, '');
		lh.currentIndoorPics = paths;
		if(fileId)$("#indoor_pic_"+fileId).remove();
	}
}

function appendFileLink2(filePath){
	if(!filePath || filePath.length<3)return;
	var fileId = lh.createSerial();
	var name = filePath.substring(filePath.indexOf('_')+1, filePath.length);
	var dom =     
		'<div id="indoor_pic_'+fileId+'" style="display:inline-block;"><img src="'+filePath+'" onclick="window.open(\''+filePath+'\');" style="max-height:100px;"/>'+
			'<span onclick="updateFilePaths2(\''+filePath+'\',\'del\',\''+fileId+'\');return false;" style="position: relative;right: 30px;bottom:5px;background-color: #BCBCBC;padding: 3px;cursor: pointer;">删除</span>'+
		'</div>';
	
	$("#upload_outer_div2").append(dom);
}

function updateFilePaths3(filePath, opt, fileId){
	if(!filePath)return;
	var paths = lh.currentDoctorPics || '';
	if(opt == 'add'){
		paths += ','+filePath;
		lh.currentDoctorPics = paths;
	}else if(opt == 'del'){
		var toRemove = ','+filePath;
		paths = paths.replace(toRemove, '');
		paths = paths.replace(filePath, '');
		lh.currentDoctorPics = paths;
		if(fileId)$("#doctor_pic_"+fileId).remove();
	}
}

function appendFileLink3(filePath){
	if(!filePath || filePath.length<3)return;
	var fileId = lh.createSerial();
	var name = filePath.substring(filePath.indexOf('_')+1, filePath.length);
	var dom =     
		'<div id="doctor_pic_'+fileId+'" style="display:inline-block;"><img src="'+filePath+'" onclick="window.open(\''+filePath+'\');" style="max-height:100px;"/>'+
			'<span onclick="updateFilePaths3(\''+filePath+'\',\'del\',\''+fileId+'\');return false;" style="position: relative;right: 30px;bottom:5px;background-color: #BCBCBC;padding: 3px;cursor: pointer;">删除</span>'+
		'</div>';
	
	$("#upload_outer_div3").append(dom);
}

function updateFilePaths4(filePath, opt, fileId){
	if(!filePath)return;
	var paths = lh.currentNursePics || '';
	if(opt == 'add'){
		paths += ','+filePath;
		lh.currentNursePics = paths;
	}else if(opt == 'del'){
		var toRemove = ','+filePath;
		paths = paths.replace(toRemove, '');
		paths = paths.replace(filePath, '');
		lh.currentNursePics = paths;
		if(fileId)$("#nurse_pic_"+fileId).remove();
	}
}

function appendFileLink4(filePath){
	if(!filePath || filePath.length<3)return;
	var fileId = lh.createSerial();
	var name = filePath.substring(filePath.indexOf('_')+1, filePath.length);
	var dom =     
		'<div id="nurse_pic_'+fileId+'" style="display:inline-block;"><img src="'+filePath+'" onclick="window.open(\''+filePath+'\');" style="max-height:100px;"/>'+
			'<span onclick="updateFilePaths4(\''+filePath+'\',\'del\',\''+fileId+'\');return false;" style="position: relative;right: 30px;bottom:5px;background-color: #BCBCBC;padding: 3px;cursor: pointer;">删除</span>'+
		'</div>';
	
	$("#upload_outer_div4").append(dom);
}


function initData(){
	
	$('#f_province').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		//required : true,
		panelHeight : 200,
		url : "/back/getProvinceArray",
		onSelect: function(rec){
            var url = '/back/getCityArray?provinceId='+rec.id;
            $('#f_city').combobox('reload', url);
        }
	});
	
	$('#f_adminId').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		//required : true,
		panelHeight : 200,
		url : "/back/getAdminArray"
	});
	
	$('#f_city').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple:false,
	    required:false,
	    panelHeight:200
	});
	
	UPLOAD_OBJ_1.initUploadSimple({chooseBtnDomId:'browse1', showEdBtns:false,showItemDiv:true,multiFlag:true,multiReplace:false,
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			updateFilePaths1(filePath, 'add');
			appendFileLink1(filePath);
		}
	});
	$("#upload_outer_div1").empty();
	
	UPLOAD_OBJ_2.initUploadSimple({chooseBtnDomId:'browse2', showEdBtns:false,showItemDiv:true,multiFlag:true,multiReplace:false,
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			updateFilePaths2(filePath, 'add');
			appendFileLink2(filePath);
		}
	});
	$("#upload_outer_div2").empty();
	
	$('#f_typeId').combobox({//医院类型
		valueField : 'id',
		textField : 'codeName',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 200,
		url : "/back/getDictArrayByParentCode?parentCode=hospital_type"
	});
	
	$('#f_hygienismCondition').combobox({//卫生条件
		valueField : 'id',
		textField : 'codeName',
		editable : false,
		multiple : false,
		required : false,
		panelHeight : 200,
		url : "/back/getDictArrayByParentCode?parentCode=hospital_condition"
	});
	
	$('#f_otherFacility').combobox({//其他配套设施
		valueField : 'id',
		textField : 'codeName',
		editable : false,
		multiple : true,
		required : false,
		panelHeight : 200,
		url : "/back/getDictArrayByParentCode?parentCode=hospital_facility"
	});
	
	$('#hospital_baseInfo').show();
	lh.initSubConfig({subObjUpperName:'DataHospital', subObjLowerName:'dataHospital'});
	lh.initSubConfig({subObjUpperName:'DataHospitalDoctor', subObjLowerName:'dataHospitalDoctor'});
	lh.initSubConfig({subObjUpperName:'DataHospitalNurse', subObjLowerName:'dataHospitalNurse'});
	lh.initSubConfig({subObjUpperName:'DataHospitalContract', subObjLowerName:'dataHospitalContract'});
	lh.initSubConfig({subObjUpperName:'DataHospitalVisit', subObjLowerName:'dataHospitalVisit'});
	
	
	var param = lh.paramJsonStr;
	var obj = JSON.parse(param);
	if(!param || !obj || !obj.dataHospital){
		$.messager.alert('提示', '该条数据已不存在，无法查看详细信息');return;
	}
	var dataHospitalId = obj.dataHospital.id;
	lh.dataHospitalId = dataHospitalId;
	lh.config.queryObj = {dataHospitalId:dataHospitalId};
	initDataHospital(obj.dataHospital);//初始化诊所基本信息
	loadGridForDoctor();
	loadGridForNurse();
	loadGridForContract();
	loadGridForVisit();
}

function initDataHospital(dataHospital){
	lh.setField({data : dataHospital, inputsDom : lh['dataHospital'].$mainObj});
	if(!dataHospital)return;
	var outdoorPics = dataHospital.outdoorPicPaths;
	var indoorPics = dataHospital.indoorPicPaths;
	
	if(outdoorPics){
		var picAry1 = outdoorPics.split(',');
		for(var i in picAry1){
			var filePath1 = picAry1[i];
			updateFilePaths1(filePath1, 'add');
			appendFileLink1(filePath1);
		}
	}
	if(indoorPics){
		var picAry2 = indoorPics.split(',');
		for(var j in picAry2){
			var filePath2 = picAry2[j];
			updateFilePaths2(filePath2, 'add');
			appendFileLink2(filePath2);
		}
	}
	
	var of = dataHospital.otherFacility;
	if(of){
		var idsAry = of.split(',');
		$("#f_otherFacility").combobox('setValues', idsAry);//其他配套设施：多选
	}
	
	var province = $('#f_province').combobox('getValue');//更新市
	var city = $('#f_city').combobox('getValue');
	if(province){
		var url = '/back/getCityArray?provinceId='+province;
		$('#f_city').combobox('reload', url);
	}
	
}

function loadGridForVisit(){
	$('#dataHospitalVisit_datagrid').datagrid({
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
		url:'/back/getDataHospitalVisitList',
	    queryParams:lh.config.queryObj,//查询参数
	    pageSize:200,//每页数据条数
	    pageList:lh.grid.pageList,//每页数据条数选择数组
	    width:900,
	    height:300,
	    //title : "<center>走访信息</center>",
	    toolbar: [{
            text:'新增走访', iconCls:'icon-add', handler:function(){addMainObj('dataHospitalVisit')}
        },'-',{
            text:'删除走访', iconCls:'icon-remove', handler:function(){batchThoroughDelete('dataHospitalVisit')}
        }],
	    columns:[
		[
			{field:'checkbox',title:'多选框',checkbox:true},
			{field:'id',title:'',hidden:true},
			{field:'operate',title:'操作',width:120,align:'center',formatter: function(value,row,index){
				return  '<span style="cursor: pointer;color: #EC4949" onclick="openMainObjWin(\'dataHospitalVisit\','+index+',\'update\')">修改</span>'
				+'&nbsp;|&nbsp;<span class="update" style="cursor: pointer;color: green" onclick="openMainObjWin(\'dataHospitalVisit\','+index+',\'read\')">查看</span>';
			}},
	        {field:'visitDate',title:'走访日期',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	       /* {field:'visitNum',title:'走访次数',width:100,align:'center'},*/
	        {field:'visitAnalysis',title:'走访分析',width:650,align:'center'}
	    ]],
        onLoadError: function(data){
	    	lh.backDatagridErrorCheck(data);
	    },
	    onDblClickRow: function(index, row){
	    	openMainObjWin('dataHospitalVisit', index, 'read');
        },
	    onLoadSuccess:function(data){
	    	lh.filtGridOperation();
	    	lh.clipboard();//复制功能
	   }  
	});
}

function loadGridForDoctor(){
	$('#dataHospitalDoctor_datagrid').datagrid({
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
		url:'/back/getDataHospitalDoctorList',
	    queryParams:lh.config.queryObj,//查询参数
	    pageSize:200,//每页数据条数
	    pageList:lh.grid.pageList,//每页数据条数选择数组
	    width:900,
	    height:300,
	    //title : "<center>医生信息</center>",
	    toolbar: [{
            text:'新增医生', iconCls:'icon-add', handler:function(){addMainObj('dataHospitalDoctor')}
        },'-',{
            text:'删除医生', iconCls:'icon-remove', handler:function(){batchThoroughDelete('dataHospitalDoctor')}
        }],
	    columns:[
		[
			{field:'checkbox',title:'多选框',checkbox:true},
			{field:'id',title:'',hidden:true},
			{field:'operate',title:'操作',width:120,align:'center',formatter: function(value,row,index){
				return  '<span style="cursor: pointer;color: #EC4949" onclick="openMainObjWin(\'dataHospitalDoctor\','+index+',\'update\')">修改</span>'
				+'&nbsp;|&nbsp;<span class="update" style="cursor: pointer;color: green" onclick="openMainObjWin(\'dataHospitalDoctor\','+index+',\'read\')">查看</span>';
			}},
	        {field:'realname',title:'姓名',width:100,align:'center'},
	        {field:'phone',title:'联系电话',width:100,align:'center'},
	        {field:'goodAt',title:'擅长',width:180,align:'center'},
	        {field:'educationBackground',title:'教育背景',width:185,align:'center'},
	        {field:'introduction',title:'从业简介',width:185,align:'center'}
	    ]],
        onLoadError: function(data){
	    	lh.backDatagridErrorCheck(data);
	    },
	    onDblClickRow: function(index, row){
	    	openMainObjWin('dataHospitalDoctor', index, 'read');
        },
	    onLoadSuccess:function(data){
	    	lh.filtGridOperation();
	    	lh.clipboard();//复制功能
	   }  
	});

}

function loadGridForNurse(){
	$('#dataHospitalNurse_datagrid').datagrid({
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
		url:'/back/getDataHospitalNurseList',
	    queryParams:lh.config.queryObj,//查询参数
	    pageSize:200,//每页数据条数
	    pageList:lh.grid.pageList,//每页数据条数选择数组
	    width:900,
	    height:300,
	    //title : "<center>护士信息</center>",
	    toolbar: [{
            text:'新增护士', iconCls:'icon-add', handler:function(){addMainObj('dataHospitalNurse')}
        },'-',{
            text:'删除护士', iconCls:'icon-remove', handler:function(){batchThoroughDelete('dataHospitalNurse')}
        }],
	    columns:[
		[
			{field:'checkbox',title:'多选框',checkbox:true},
			{field:'id',title:'',hidden:true},
			{field:'operate',title:'操作',width:120,align:'center',formatter: function(value,row,index){
				return  '<span style="cursor: pointer;color: #EC4949" onclick="openMainObjWin(\'dataHospitalNurse\','+index+',\'update\')">修改</span>'
				+'&nbsp;|&nbsp;<span class="update" style="cursor: pointer;color: green" onclick="openMainObjWin(\'dataHospitalNurse\','+index+',\'read\')">查看</span>';
			}},
	        {field:'realname',title:'姓名',width:100,align:'center'},
	        {field:'phone',title:'联系电话',width:100,align:'center'},
	        {field:'educationBackground',title:'教育背景',width:275,align:'center'},
	        {field:'introduction',title:'从业简介',width:275,align:'center'}
	    ]],
        onLoadError: function(data){
	    	lh.backDatagridErrorCheck(data);
	    },
	    onDblClickRow: function(index, row){
	    	openMainObjWin('dataHospitalNurse', index, 'read');
        },
	    onLoadSuccess:function(data){
	    	lh.filtGridOperation();
	    	lh.clipboard();//复制功能
	   }  
	});

}

function loadGridForContract(){
	$('#dataHospitalContract_datagrid').datagrid({
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
		url:'/back/getDataHospitalContractList',
	    queryParams:lh.config.queryObj,//查询参数
	    pageSize:200,//每页数据条数
	    pageList:lh.grid.pageList,//每页数据条数选择数组
	    width:900,
	    height:300,
	    //title : "<center>合同信息</center>",
	    toolbar: [{
            text:'新增合同', iconCls:'icon-add', handler:function(){addMainObj('dataHospitalContract')}
        },'-',{
            text:'删除合同', iconCls:'icon-remove', handler:function(){batchThoroughDelete('dataHospitalContract')}
        }],
	    columns:[
		[
			{field:'checkbox',title:'多选框',checkbox:true},
			{field:'id',title:'',hidden:true},
			{field:'operate',title:'操作',width:120,align:'center',formatter: function(value,row,index){
				return  '<span style="cursor: pointer;color: #EC4949" onclick="openMainObjWin(\'dataHospitalContract\','+index+',\'update\')">修改</span>'
				+'&nbsp;|&nbsp;<span class="update" style="cursor: pointer;color: green" onclick="openMainObjWin(\'dataHospitalContract\','+index+',\'read\')">查看</span>';
			}},
	        {field:'contractSerial',title:'合同编号',width:120,align:'center'},
	        {field:'contractStartDate',title:'合同开始日期',width:100,align:'center',formatter: function(value,row,index){
	        	return lh.formatGridDate(value);
	        }},
	        {field:'contractTimeLimit',title:'合同期限',width:100,align:'center'},
	        {field:'remark',title:'备注',width:200,align:'center'},
	        {field:'filePaths',title:'合同附件',width:230,align:'center',formatter: function(value,row,index){
	        	if(!value){
	        		return '';
	        	}else{
	        		return '有合同附件';
	        	}
	        }}
	    ]],
        onLoadError: function(data){
	    	lh.backDatagridErrorCheck(data);
	    },
	    onDblClickRow: function(index, row){
	    	openMainObjWin('dataHospitalContract', index, 'read');
        },
	    onLoadSuccess:function(data){
	    	lh.filtGridOperation();
	    	lh.clipboard();//复制功能
	   }  
	});
}

/** 初始化查询条件中的组件及数据 */
function initQueryComponent(){}

/** 初始化表单中的组件及数据 */
function initFormComponent(lower){
	initUploadAllFile({showEdBtns:true,showItemDiv:true,multiFlag:true,multiReplace:false,//合同附件
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			updateFilePaths(filePath, 'add');
			appendFileLink(filePath);
	}});
	$("#upload_outer_div").empty();
	
	UPLOAD_OBJ_3.initUploadSimple({chooseBtnDomId:'browse3', showEdBtns:false,showItemDiv:true,multiFlag:true,multiReplace:false,//医生照片
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			updateFilePaths3(filePath, 'add');
			appendFileLink3(filePath);
	}});
	$("#upload_outer_div3").empty();
	
	UPLOAD_OBJ_4.initUploadSimple({chooseBtnDomId:'browse4', showEdBtns:false,showItemDiv:true,multiFlag:true,multiReplace:false,//护士照片
		successFun:function(fileId, filePath){
			$("#upld_container_"+fileId).remove();
			updateFilePaths4(filePath, 'add');
			appendFileLink4(filePath);
	}});
	$("#upload_outer_div4").empty();
	
	/*$('#f_province').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple : false,
		required : true,
		panelHeight : 200,
		url : "/back/getProvinceArray",
		onSelect: function(rec){
            var url = '/back/getCityArray?provinceId='+rec.id;
            $('#f_city').combobox('reload', url);
        }
	});
	$('#f_city').combobox({
		valueField : 'id',
		textField : 'name',
		editable : false,
		multiple:false,
	    required:true,
	    panelHeight:200
	});*/

}

function updateFilePaths(filePath, opt, fileId){
	var paths = lh.currentContractPaths || '';
	if(opt == 'add'){
		paths += ','+filePath;
		lh.currentContractPaths = paths;
	}else if(opt == 'del'){
		var toRemove = ','+filePath;
		paths = paths.replace(toRemove, '');
		paths = paths.replace(filePath, '');
		lh.currentContractPaths = paths;
		if(fileId)$("#file_link_"+fileId).remove();
	}
}

function appendFileLink(filePath){
	if(!filePath)return;
	if(!lh.fileAry)lh.fileAry = [];
	var fileId = lh.createSerial();
	var name = filePath.substring(filePath.indexOf('_')+1, filePath.length);
	var dom = '<div id="file_link_'+fileId+'"><span>附件：</span><a href="'+filePath+'" download="'+name+'">'+name+'</a>'+
	'<button onclick="updateFilePaths(\''+filePath+'\',\'del\',\''+fileId+'\');return false;" class="button button-primary button-rounded button-tiny" style="margin-left:20px;">删除</button></div>';
	$("#contractFileLinkDiv").append(dom);
}

/** 拦截：打开窗口之前 执行此方法，返回false则不打开窗口，不向下执行 */
function beforeOpenWin(lower, data, operation, isReadOnly){
	/*if(!data)return true;
	lh.currentWinData = data;
	if(lower == 'dataHospitalContract'){
		$("#contractFileLinkDiv").empty();
		lh.currentContractPath = null;
		var paths = data.filePaths;
		lh.currentContractPaths = paths;
		var pathAry = paths.split(',');
		for(var i in pathAry){
			appendFileLink(pathAry[i]);
		}
	}else if(lower == 'dataHospitalDoctor'){
		$("#upload_outer_div3").empty();
		lh.currentDoctorPics = null;
		var paths = data.attrStr;
		if(!paths)return true;
		lh.currentDoctorPics = paths;
		var pathAry = paths.split(',');
		for(var i in pathAry){
			appendFileLink3(pathAry[i]);
		}
	}*/
	return true;
}

function preAddOrUpdate(lower, mainObj){
	mainObj.dataHospitalId = lh.dataHospitalId;
	if(lower == 'dataHospitalContract'){
		if(mainObj.contractStartDate)mainObj.contractStartDate += ' 00:00:00';
		var paths = lh.currentContractPaths;
		mainObj.filePaths = paths;
		if(localStorage){
			localStorage.setItem("data_contractTimeLimit", mainObj.contractTimeLimit);
		}
	}else if(lower == 'dataHospitalVisit'){
		if(mainObj.visitDate)mainObj.visitDate += ' 00:00:00';
	}else if(lower == 'dataHospitalDoctor'){
		var paths = lh.currentDoctorPics;
		if(paths && paths.indexOf(',') === 0)paths = paths.substring(1);
		mainObj.attrStr = paths;
	}else if(lower == 'dataHospitalNurse'){
		var paths = lh.currentNursePics;
		if(paths && paths.indexOf(',') === 0)paths = paths.substring(1);
		mainObj.attrStr = paths;
	}
	
	/*var filePaths = $("#filePaths").val();
	if(!filePaths){
		//$.messager.alert('提示',"请上传用户头像"); return;
	}else{
		var ids = UPLOAD_OBJ.idsStr;
		if(filePaths.substring(0,1) != "/"){
			filePaths = filePaths.substring(1);
			ids = ids.substring(1);
		}
		mainObj.logo = filePaths;
		mainObj.logoPicId = ids;
	}*/
	
	return true;
}

function afterOpenWin(lower, data, operation, isReadOnly){
	if(!data){
		if(lower == 'dataHospitalContract'){
			$("#contractFileLinkDiv").empty();
			lh.currentContractPath = null;
			if(localStorage){
				var contractTimeLimit = localStorage.getItem("data_contractTimeLimit");
				if(contractTimeLimit){
					$('#f_contract_contractTimeLimit').textbox('setValue', contractTimeLimit);
				}
			}
		}else if(lower == 'dataHospitalDoctor'){
			$("#upload_outer_div3").empty();
			lh.currentDoctorPics = null;
		}else if(lower == 'dataHospitalNurse'){
			$("#upload_outer_div4").empty();
			lh.currentNursePics = null;
		}
		return true;
	}
	lh.currentWinData = data;
	if(lower == 'dataHospitalContract'){
		if(data.contractStartDate){
			$("#f_contract_contractStartDate").datebox('setValue', lh.formatDate({date:new Date(data.contractStartDate)}));
		}
		
		$("#contractFileLinkDiv").empty();
		lh.currentContractPath = null;
		var paths = data.filePaths;
		if(!paths)return true;
		lh.currentContractPaths = paths;
		var pathAry = paths.split(',');
		for(var i in pathAry){
			appendFileLink(pathAry[i]);
		}
	}else if(lower == 'dataHospitalDoctor'){
		$("#upload_outer_div3").empty();
		lh.currentDoctorPics = null;
		var paths = data.attrStr;
		if(!paths)return true;
		lh.currentDoctorPics = paths;
		var pathAry = paths.split(',');
		for(var i in pathAry){
			appendFileLink3(pathAry[i]);
		}
	}else if(lower == 'dataHospitalNurse'){
		$("#upload_outer_div4").empty();
		lh.currentNursePics = null;
		var paths = data.attrStr;
		if(!paths)return true;
		lh.currentNursePics = paths;
		var pathAry = paths.split(',');
		for(var i in pathAry){
			appendFileLink4(pathAry[i]);
		}
	}
	return true;
}

function preAddOrUpdateDataHospital(mainObj){
	if(!mainObj)return false;
	var indoorPicPaths = lh.currentIndoorPics;
	var outdoorPicPaths = lh.currentOutdoorPics;
	if(outdoorPicPaths && outdoorPicPaths.indexOf(',')===0){
		outdoorPicPaths = outdoorPicPaths.substring(1);
	}
	if(indoorPicPaths && indoorPicPaths.indexOf(',')===0){
		indoorPicPaths = indoorPicPaths.substring(1);
	}
	mainObj.indoorPicPaths = indoorPicPaths;
	mainObj.outdoorPicPaths = outdoorPicPaths;
	
	var of = $("#f_otherFacility").combobox('getValues');//其他配套设施：多选
	var ids = '';
	if(of){
		for(var i in of){
			ids += ','+of[i];
		}
		if(ids.indexOf(',')===0)ids = ids.substring(1);
	}
	mainObj.otherFacility = ids;
	
	return true;
}

function updateDataHospital(lower){
	if(!lower)lower = 'dataHospital';
	if(lh.preventRepeat()){//防止重复提交
		lh[lower].$mainObjForm.submit();
	}else{
		lh.showRepeatTip();//提示重复提交
	}
	var mainObj = getMainObj(lower);//得到需要的字段信息
	mainObj.id = lh.dataHospitalId;//主键ID
	var flag = preAddOrUpdateDataHospital(mainObj);
	if(!flag)return false;
	
	lh.post('back', lh[lower].config.addOrUpdateUrl, mainObj, function(rsp){
		 if(rsp.status=='success'){
			 $.messager.alert('提示', '已经成功保存诊所基本信息');
		 }else{
			 $.messager.alert('提示',rsp.msg);
		 }
	});
}

/** ============================================================= **/


