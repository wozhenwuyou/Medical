<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/front/style.css"
	title="v" />
<link rel="stylesheet" type="text/css"
	href="/third-party/pagination/paging.css" />
</head>
<body>
	<div class="t_851_3" style="width: 500px;">
		<table cellpadding="0" cellspacing="0" border="0">
			<tr height="44" valign="middle">
				<td width="60">区域：</td>
				<td width="118"><select class="text_input1" id="province">
						<option value="">请选择</option>
						<c:forEach items="${provinceCityAreaList}" var="provinceCityArea">
							<option value="${provinceCityArea.id}">${provinceCityArea.areaName}</option>
						</c:forEach>
				</select></td>
				<td width="130">患者姓名：</td>
				<td width="199"><input type="text" class="text_input1"
					id="username" /></td>
				<td width="64"><input type="submit" class="sub_1" value="搜索"
					onclick="loadGridData()" /></td>
			</tr>
		</table>
	</div>
	<div class="d_851_1" style="width: 520px;">
		<table cellpadding="0" cellspacing="0" border="0" width="515">
			<tbody id="dataListContainer">
			</tbody>
		</table>
	</div>
	<div class="fy_new" style="width: 520px;">
		<div id="page" class="inline-center"></div>
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/js/front/domain/doctor/doctorCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/doctor/patientLibrary.js" title="v"></script>
	<script id="template" type="x-tmpl-mustache">
		<tr height="53" align="center" style="font-size:14px; color:#63a13f">
			<td width=100">姓名</td>
            <td width="100">电话</td>
			<td width="100">选择</td>
        </tr>
		{{#rows}}
			<tr height="53" align="center" style="font-size:14px; color:#63a13f">
			<td width="100">{{realName}}</td>
            <td width="100">{{phone}}</td>
			<td width="100"><input type="radio" name="patientRadio" value="{{id}}"></td>
        </tr>
		{{/rows}}
	</script>
</body>
</html>

