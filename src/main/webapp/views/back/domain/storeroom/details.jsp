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
<script src="/third-party/jquery/jquery-1.11.3.min.js"></script>
</head>
<body style="min-width: 1000px;">
	<div align="center"><form action="" >
		<table ><tr><th align="center">订单添加</th></tr><tr><td>入库人:</td><td align="center"><select id="expressCompany"><option value="0">--请选择入库人--</option></select></td></tr></table>
	</form></div>
	<script type="text/javascript">
		function getExpressCompany() {
			$.ajax({
				type : "post",
				url : '/back/adminSelect', //url根据自己的项目实际定义
				async : false,
				dataType : "text",
				error : function() {
					alert("系统忙，请稍后再试！");
					return false;
				},
				success : function(text) {
					var expressCompany = $("#expressCompany");

					var str = '';
					var data = eval("(" + text + ")");
					alert(text);
					
					for (var int = 0; int < data.rows.length; int++) {
						str += '<option value="'+data.rows[int].id+'">'
						+ data.rows[int].username + '</option>';
					}
					expressCompany.append(str);
				}
			});
		}
		window.onload = getExpressCompany();
	</script>
</body>
</html>