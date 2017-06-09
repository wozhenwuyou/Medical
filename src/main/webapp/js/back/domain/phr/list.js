/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'dataHospital',
	mainObjUpperName : 'DataHospital',
	gridUrl : '/back/phr/list'
}

$(function() {
	loadGrid();
});

// 添加信息
function fnAddPhrBasicInfo(id, openType) {
	
	var openT = 'add';
	if(openType == '编辑'){
		openT = 'edit';
	}else if(openType == '查看'){
		openT = 'detail';
	}
	
	var index = top.layer.open({
		title : openType + '档案窗口',
		type : 2,
		area : [ '950px', '520px' ],
		btn : openT == 'detail' ? [] : [ '保存', '取消' ],
		content : '/back/phr/phrBasicInfoForm?id=' + (id || '') + "&openType=" + openT,
		yes : function() {
			var table = top.layer.getChildFrame('body>table', index);
			doSave(table, function(){
				top.layer.close(index);
				top.layer.msg('保存成功');
				loadGrid();
			});
		},
		btn2 : function() {
			top.layer.close(index);
		}
	});
	
}

// 执行添加方法
function doSave(table, cb) {
	var o = {};
	o.id = getValueByIdOrName("id");
	o.patientId = getValueByIdOrName("patientId");
	o.name = getValueByIdOrName("name");
	if(!o.name){
		layerAlert('姓名不能为空');
		return;
	}
	o.userNo = getValueByIdOrName("userNo");
	if(!o.userNo){
		layerAlert('编号不能为空');
		return;
	}
	o.sex = getValueByIdOrName(null, "sex");
	o.birthday = getValueByIdOrName("birthday");
	if(!o.birthday){
		layerAlert('出生日期不能为空');
		return;
	}
	o.idCardNo = getValueByIdOrName("idCardNo") || '无';
	o.workUnit = getValueByIdOrName("workUnit") || '无';
	o.tel = getValueByIdOrName("tel");
	o.linkman = getValueByIdOrName("linkman");
	o.linkmanTel = getValueByIdOrName("linkmanTel");
	
	o.residentType = getValueByIdOrName(null, "residentType");
	o.nation = getValueByIdOrName(null, "nation");
	o.nationName = getValueByIdOrName("nationName");
	o.bloodType = getValueByIdOrName(null, "bloodType");
	if(!o.bloodType){
		layerAlert('请选择血型');
		return;
	}
	o.rhType = getValueByIdOrName(null, "rhType");
	o.degree = getValueByIdOrName(null, "degree");
	if(!o.degree){
		layerAlert('请选择文化程度');
		return;
	}
	o.profession = getValueByIdOrName(null, "profession");
	if(!o.profession){
		layerAlert('请选择职业');
		return;
	}
	o.maritalStatus = getValueByIdOrName(null, "maritalStatus");
	if(!o.maritalStatus){
		layerAlert('请选择婚姻状况');
		return;
	}
	o.payType = getValueByIdOrName(null, "payType");
	o.payTypeOther = getValueByIdOrName("payTypeOther");
	
	if(!o.payType){
		layerAlert('请选择医疗费用支付方式');
		return;
	}
	
	if(o.payType.indexOf('其他') > -1){
		if(!o.payTypeOther){
			layerAlert('请输入其他类型的支付方式名称');
			return;
		}
	}
	
	o.ywgms = getValueByIdOrName(null, "ywgms");
	o.ywgmsName = getValueByIdOrName("ywgmsName");
	o.bls = getValueByIdOrName("bls");
	o.ycbs = getValueByIdOrName(null, "ycbs") || getValueByIdOrName("ycbs");
	
	o.cjqk = getValueByIdOrName(null, "cjqk") || getValueByIdOrName("cjqk");
	o.shhjCfpfss = getValueByIdOrName(null, "shhjCfpfss");
	o.shhjRllx = getValueByIdOrName(null, "shhjRllx");
	o.shhjYs = getValueByIdOrName(null, "shhjYs");
	o.shhjCs = getValueByIdOrName(null, "shhjCs");
	o.shhjQcl = getValueByIdOrName(null, "shhjQcl");
	
	//其他
	o.jwsDiseaseDes = getDynamicDomValue('jb');
	o.jwsOperationDes = getDynamicDomValue('sh');
	o.jwsTraumaDes = getDynamicDomValue('ws');
	o.jwsTransfusionDes = getDynamicDomValue('sx');
	
	//家族史
	var jzsText = getDynamicDomValue('jzs');
	if(jzsText && jzsText != '无'){
		var a1 = [], a2 = [], a3 = [], a4 = [];
		var array = jzsText.split(",");
		for(var i=0;i<array.length;i++){
			var value = array[i];
			if(value.indexOf("父亲") > -1){
				a1.push(value);
			}else if(value.indexOf("母亲") > -1){
				a2.push(value);
			}else if(value.indexOf("兄弟姐妹") > -1){
				a3.push(value);
			}else if(value.indexOf("子女") > -1){
				a4.push(value);
			}
		}
		if(a1.length){
			o.jzsFq = a1.join(",");
		}
		if(a2.length){
			o.jzsMq = a2.join(",");
		}
		if(a3.length){
			o.jzsXdjm = a3.join(",");
		}
		if(a4.length){
			o.jzsZn = a4.join(",");
		}
	}
	
	$.post('/back/phr/phrAdd', o, function(rsp){
		if(rsp.status == 'success'){
			cb();
		}else{
			top.layer.alert(rsp.msg);
		}
	}, 'json');
	
	
	//private
	function getDynamicDomValue(typeStr){
		var trs = table.find("tr[type='dynamic_gen_"+typeStr+"']");
		if(trs.length == 0)
			return '无';
		var arr = [];
		trs.each(function(){
			var me = $(this);
			var input1 = $.trim(me.find("td:eq(0)").text());
			var input2 = $.trim(me.find("td:eq(1)").text());
			arr.push(input1 + ";" + input2);
		});
		return arr.join(",");
	}
	//private
	function getValueByIdOrName(id, name){
		if(id){
			return $.trim(table.find("#" + id).val());
		}
		if(name){
			var ary = [];
			table.find("input[name='"+name+"']:checked").each(function(){
				ary.push($.trim(this.value));
			});
			return ary.join(",");
		}
	}
	
}

function layerAlert(content){
	top.layer.alert(content, {icon : 0, title : '提示'});
}


function fnBatchRecover(){
	var $grid = lh.$grid;
	var rows = $grid.datagrid('getChecked');// 得到选择的记录，可多条
	if (!rows || !rows.length) {// 如果有选择的记录,rows.length为选中记录的条数
		$.messager.alert('提示', '请勾选数据');return;
	}
	var ids = lh.getIdsFromRows(rows);// common_back:从rows中得到ids
	$.post('/back/phr/phrRecover', {'ids' : ids}, function(rsp){
		if(rsp.status == 'success'){
			top.layer.msg('恢复成功');
			loadGrid();
		}else{
			top.layer.alert(rsp.msg);
		}
	}, 'json');
}

/** 加载主表格 */
function loadGrid(type) {
	
	var url = lh.config.gridUrl;
	
	if(type == 'hsz'){
		url += '?type=hsz'
	}
	
	lh.$grid.datagrid({
		loadMsg : '',
		idField : 'id',
		sortName : 'id',
		sortOrder : 'desc',
		striped : true,
		fitColumns : false,
		singleSelect : true,
		selectOnCheck : false,
		checkOnSelect : false,
		pagination : true,
		url : url,
		queryParams : lh.config.queryObj,// 查询参数
		pageSize : lh.grid.pageSize,// 每页数据条数
		pageList : lh.grid.pageList,// 每页数据条数选择数组
		width : lh.dom.clientSafeWidth - 1,
		height : lh.dom.clientHeight - 160,
		columns : [ [
				/*{
					field : 'checkbox',
					title : '多选框',
					checkbox : true
				},*/
				{
					field : 'id',
					title : '',
					hidden : true
				},
				{
					field : 'operate',
					title : '操作',
					width : 100,
					hidden : type && type == 'hsz',
					align : 'center',
					formatter : function(value, row, index) {
						return '<span class="opt_alive">\
						<span onclick="fnAddPhrBasicInfo('+row.id+', \'查看\')" style="cursor: pointer;color: green">查看</span>|\
						<span onclick="fnAddPhrBasicInfo('+row.id+', \'编辑\')" style="cursor: pointer;color: green">编辑</span>|\
						<span onclick="fnDeletePhrBasicInfo('+row.id+', \'删除\')" style="cursor: pointer;color: green">删除</span>|\
					</span>';
					}
				}, {
					field : 'name',
					title : '姓名',
					width : 100,
					align : 'center'
				}, {
					field : 'userNo',
					title : '编号',
					width : 120,
					align : 'center'
				}, {
					field : 'sex',
					title : '性别',
					width : 100,
					align : 'center'
				}, {
					field : 'idCardNo',
					title : '身份证号',
					width : 220,
					align : 'center'
				}, {
					field : 'birthday',
					title : '出生日期',
					width : 120,
					align : 'center'
				}, {
					field : 'workUnit',
					title : '工作单位',
					width : 220,
					align : 'center'
				}, {
					field : 'tel',
					title : '电话',
					width : 100,
					align : 'center'
				}, {
					field : 'linkman',
					title : '联系人',
					width : 100,
					align : 'center'
				}, {
					field : 'linkmanTel',
					title : '联系人电话',
					width : 100,
					align : 'center'
				} ] ],
		onLoadError : function(data) {
			lh.backDatagridErrorCheck(data);
		},
		onDblClickRow : function(index, row) {
			showMain('诊所数据详情', '/back/dataHospitalDetail/' + row.id);
		},
		onLoadSuccess : function(data) {
			lh.filtGridOperation();
			lh.clipboard();// 复制功能
		}
	});
	
	if(type && type == 'hsz'){//回收
		$('#btn_add').addClass('hide');//添加隐藏
		$('#btn_othertable').addClass('hide');//添加隐藏
		$("#btn_batchRecover").removeClass('hide');//恢复显示
		$("#btn_trash").addClass('hide');//返回显示
		$("#btn_trashBack").removeClass('hide');
	}else{
		$('#btn_add').removeClass('hide');//添加显示
		$('#btn_othertable').removeClass('hide');//添加隐藏
		$("#btn_batchRecover").addClass('hide');
		$("#btn_trash").removeClass('hide');
		$("#btn_trashBack").addClass('hide');
	}
	
}

function fnDeletePhrBasicInfo(id){
	if(!id) return;
	$.post('/back/phr/phrDelete/' + id, {}, function(rsp){
		if(rsp.status == 'success'){
			top.layer.msg('已成功将数据放入回收站');
			loadGrid();
		}else{
			top.layer.alert(rsp.msg);
		}
	}, 'json');
}


//--添加健康体检表
//btn打开按钮
//openType 打开方式，默认是添加，还可以是编辑和查看
//id表示体检表的id
function fnAddHealthCheckTable(btn, openType, id){
	
	var selected = $("#datagrid").datagrid('getSelected');
	
	if(!selected){
		top.layer.alert('请选择要添加健康表的表格行');
		return;
	}
	
	var openT = 'add';
	if(openType == '编辑'){
		openT = 'edit';
	}else if(openType == '查看'){
		openT = 'detail';
	}
	
	var index = top.layer.open({
		title : openType + '体检表窗口',
		type : 2,
		area : [ '950px', '520px' ],
		btn : openT == 'detail' ? [] : [ '保存', '取消' ],
		content : '/back/phr/phrHealthCheck?id=' + (id || '') + "&openType=" + openT,
		yes : function() {
			var body = top.layer.getChildFrame('body');
			//提交表单，将主表的id提交过去
			var form = body.find("form:first");
			form.append("<input type='hidden' name='phrBasicInfoId' id='phrBasicInfoId' value='"+selected.id+"'>");			
			form.submit();
			top.layer.close(index);
		},
		btn2 : function() {
			top.layer.close(index);
		}
	});
	
}
