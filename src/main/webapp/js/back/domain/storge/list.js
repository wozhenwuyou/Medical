/** 基础数据和基础设置 */
lh.config = {
	mainObjLowerName : 'dataOrders',
	mainObjUpperName : 'DataOrders',
	gridUrl : '/back/orders/list'
}

$(function() {
	loadGrid();
});

//添加订单及详情
function addOrders(type){
	var openT = null;
	if(type == 'add'){
		openT = '添加';
	}else if(type == 'update'){
		openT = '修改';
	}
	var index = top.layer.open({
		title : openT + '订单窗口',
		area : [ '950px', '520px' ],
		btn :  [ '保存', '取消' ],
		content : 'details.jsp' ,
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
	

	function layerAlert(content){
		top.layer.alert(content, {icon : 0, title : '提示'});
	}




/** 加载主表格 */
function loadGrid(type) {
	
	var url = lh.config.gridUrl;
	
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
		pageSize : 20,// 每页数据条数
		pageList : lh.grid.pageList,// 每页数据条数选择数组
		width : lh.dom.clientSafeWidth - 1,
		height : lh.dom.clientHeight - 100,
		columns : [ [
				{
					field : 'id',
					title : '',
					hidden : false
				},
				{
					field : 'operate',
					title : '操作',
					width : 100,
					hidden : type && type == 'hsz',
					align : 'center',
					formatter : function(value, row, index) {
						return '<span class="opt_alive">\
						<span onclick="fnView('+row.id+', \''+row.name+'\')" style="cursor: pointer;color: green">查看</span>|\
						<span onclick="fnEdit('+row.id+', \''+row.name+'\')" style="cursor: pointer;color: green">编辑</span>|\
						<span onclick="fnDeletePhrBasicInfo('+row.id+', \'删除\')" style="cursor: pointer;color: green">删除</span>|\
					</span>';
					}
				}, {
					field : 'ordersid',
					title : '订单编号',
					width : 100,
					align : 'center'
				}, {
					field : 'cuser.username',
					title : '创建人',
					width : 120,
					align : 'center',
					formatter: function (value, row, index) {
						if(row.cuser!=undefined){
			                return row.cuser.username;
			            }
                         
                     }
				}, {
					field : 'createtime',
					title : '创建时间',
					width : 100,
					align : 'center',
					formatter : function(value, row, index) {
						if(value){
							return value.toDate().fmt('yyyy-MM-dd');
						}
					}
				}, {
					field : 'inuser.username',
					title : '入库人',
					width : 120,
					align : 'center',
					formatter: function (value, row, index) {
						if(row.inuser!=undefined)
                        return row.inuser.username;
                    }
				}, {
					field : 'inserttime',
					title : '入库时间',
					width : 120,
					align : 'center',
					formatter : function(value, row, index) {
						if(value){
							return value.toDate().fmt('yyyy-MM-dd');
						}
					}
				}] ],
		onLoadError : function(data) {
			lh.backDatagridErrorCheck(data);
		},
		onDblClickRow : function(index, row) {
			showMain('仓库数据详情', '/back/dataHospitalDetail/' + row.id);
		},
		onLoadSuccess : function(data) {
			lh.filtGridOperation();
			lh.clipboard();// 复制功能
		}
	});
	
}

function fnReset(){
	$("input[id^='sc_']").textbox('setValue', '');
	loadGrid();
}
