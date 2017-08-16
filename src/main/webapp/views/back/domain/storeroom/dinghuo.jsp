<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_back_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/back/back.css" title="v" />
</head>
<body style="min-width: 1000px;">
	<!-- 查询条件  开始 -->
	<table id="mainQueryTable" style="min-width: 1000px;">
		<tbody>
			<tr class="tr_ht" align="right">
				<td class="td_pad">订单号：<input role="textbox"
					id="sc_ordersid" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>建立日期：</span><input role="datebox"
					id="sc_createtime" class="domain-input easyui-datebox width100"  data-options="editable:false" /></td>
					<td></td>
					<td></td>
				<td class="td_pad">
					&nbsp;<button id="searchYes" onclick="doSearch();" class="button button-primary button-rounded button-small">查询</button>

				</td>
			</tr>
			<tr class="tr_ht" align="right">
				<td class="td_pad">入库人：<input role="textbox"
					id="sc_createTimeEnd" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad">入库日期：<input role="datebox"
					id="sc_inusername" class="domain-input easyui-datebox width100" data-options="editable:false" /></td>

				<td></td>
				<td></td>
				<td class="td_pad">
					&nbsp;<button onclick="fnReset()" class="button button-primary button-rounded button-small">重置</button>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="clear-both height10"></div>
	
	<!-- 查询条件 结束 -->
	<div id="opt_outer_div">
		<div class="fl_opt_div">
			<button role="opt_1" onclick="addOrders('add')"
				class="button button-primary button-rounded button-small" id="btn_add">新建订单</button>
		</div>
	</div>
	<br />
	<br />
	<!-- 表格  开始 -->
	<div id='datagrid_div'>
		<table id="datagrid"></table>
	</div>
	<!-- 添加 开始 -->
	<div id="addOrderAndDetails" class="easyui-window" closed="true" style="width:300px;height:100px;padding:5px;">
		<form style="padding:10px 20px 10px 40px;">
		<p>Pass: <input type="password"></p>
		<div style="padding:5px;text-align:center;">
		</div>
	</form>
	</div>
	<!-- 下拉菜单 -->
	  

	
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<%@ include file="/views/common/common_upload_js.htm"%>
	<script type="text/javascript">
		lh.paramJsonStr = '${paramJson}';
	</script>
	<script type="text/javascript" src="/js/common/back_template.js" title="v"></script>
	<script type="text/javascript" src="/third-party/z.js" title="v"></script>
	<script type="text/javascript" src="/third-party/jquery.form.js" title="v"></script>
	<script type="text/javascript" src="/js/back/domain/storge/list.js" title="v"></script>
</body>
</html>