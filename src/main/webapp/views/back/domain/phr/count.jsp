<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
				<td class="td_pad"><span>省份：</span><input role="textbox"
					id="provinceId" name="provinceId" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>城市：</span><input role="textbox"
					id="cityId" name="cityId" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><span>诊所：</span><input role="textbox"
				id="hospitalId" name="hospitalId" class="domain-input easyui-textbox width100" /></td>
				<td class="td_pad"><button id="searchYes"
						onclick="doSearch();return false;"
						class="button button-primary button-rounded button-small">查
						询</button></td>
				<td class="td_pad"><button id="resetBtn"
						onclick="fnReset();return false;"
						class="button button-primary button-rounded button-small">重置</button></td>
			</tr>
		</tbody>
	</table>
	<div class="clear-both height10"></div>
	<!-- 查询条件 结束 -->
	<div id='datagrid_div'>
		<table id="datagrid"></table>
	</div>
	
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<script type="text/javascript" src="/third-party/z.js" title="v"></script>
	<script type="text/javascript" src="/js/back/domain/phr/count.js?!1111" title="v"></script>
</body>
</html>