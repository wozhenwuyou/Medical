<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_back_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/back/back.css"
	title="v" />
</head>
<body style="min-width: 1000px;">
	<!-- 查询条件  开始 -->
	<table id="mainQueryTable" style="min-width: 1000px;">
		<tbody>
			<tr class="tr_ht" align="right">
				<td class="td_pad"><span>姓名：</span><input role="textbox"
					id="sc_name" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>编号：</span><input role="textbox"
					id="sc_userNo" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>身份证号：</span><input role="textbox"
					id="sc_idCardNo" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>电话：</span><input role="textbox"
					id="sc_tel" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><button id="searchYes"
						onclick="doSearch();return false;"
						class="button button-primary button-rounded button-small">查
						询</button></td>
			</tr>
		</tbody>
	</table>
	<div class="clear-both height10"></div>
	<!-- 查询条件 结束 -->
	<div id="opt_outer_div">
		<div class="fl_opt_div">
			<button role="opt_1" onclick="fnAddPhrBasicInfo(null, '添加');"
				class="button button-primary button-rounded button-small" id="btn_add">添加</button>
			<button role="opt_2" id="btn_batchRecover"
				onclick="fnBatchRecover()"
				class="hide button button-primary button-rounded button-small">批量恢复</button>
		</div>
		<div class="fr_opt_div">
			<button role="opt_1" id="btn_trash" onclick="loadGrid('hsz')"
				class="button button-primary button-rounded button-small">回收站</button>
			<button role="opt_2" id="btn_trashBack"
				onclick='loadGrid();'
				class="hide button button-primary button-rounded button-small">返回</button>
		</div>
	</div>
	<!-- 表格  开始 -->
	<div id='datagrid_div'>
		<table id="datagrid"></table>
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<%@ include file="/views/common/common_upload_js.htm"%>
	<script type="text/javascript">
		lh.paramJsonStr = '${paramJson}';
	</script>
	<script type="text/javascript" src="/js/common/back_template.js" title="v"></script>
	<script type="text/javascript" src="/third-party/z.js" title="v"></script>
	<script type="text/javascript" src="/js/back/domain/phr/list.js" title="v"></script>
</body>
</html>