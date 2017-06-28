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
				<td width="130">查询范围：</td>
				<td width="118">
					<select class="text_input1" id="queryScope">
						<option value="1">我建立的</option>
						<option value="2" selected>本诊所</option>
						<option value="3">全部</option>
					</select>
				</td>
				<td width="130">患者姓名：</td>
				<td width="199"><input type="text" class="text_input1"
					id="username" /></td>
			</tr>
		</table>
	</div>
	<div class="d_851_1" style="width: 520px;">
		<table cellpadding="0" cellspacing="0" border="1" width="515">
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
		src="/js/front/domain/doctor/patientLibrary4select.js" title="v"></script>
	<script id="template" type="x-tmpl-mustache">
		<tr height="30" align="center" style="font-size:14px; color:#63a13f">
			<td width=100">姓名</td>
            <td width="100">电话</td>
			<td width="100">选择</td>
        </tr>
		{{#rows}}
			<tr height="30" align="center" style="font-size:14px;">
			<td width="100">{{realName}}</td>
            <td width="100">{{phone}}</td>
			<td width="100"><input type="radio" name="patientRadio" value="{{id}}"></td>
        </tr>
		{{/rows}}
	</script>
	
	<script type="text/javascript">
		$(function(){
			setTimeout(function(){
				$('#dataListContainer').delegate('tr', 'click', function(){
					$(this).find("input[type=radio]").prop('checked', true);
				});
			}, 900);
			$("#queryScope").change(function(){
				loadGridData(1, 20);
			});
			$("#username").keyup(function(){
				loadGridData(1, 20);
			});
		});
	</script>
</body>
</html>

