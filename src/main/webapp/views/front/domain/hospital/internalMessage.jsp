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
	<%@ include file="/views/front/common/hospital/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/hospital/hospitalTop.htm"%>
		<div class="w_1000">
			<%@ include file="/views/front/common/hospital/hospitalLeft.htm"%><!--左边导航 -->
			<div class="w_851">
				<div class="t_851_2">站内信</div>
				<div class="t_851_3">
					<table cellpadding="0" cellspacing="0" border="0">
						<tr height="44" valign="middle">
							<td width="75">标题：</td>
							<td width="199"><input type="text" class="text_input2"
								id="name" /></td>
							<td width="64"><input type="submit" class="sub_1" value="搜索"
								onclick="loadGridData()" /></td>
							<td width="64"><input type="submit" class="sub_1" value="重置"
								onclick="resetQuery()" style="margin-left: 10px;" /></td>
						</tr>
					</table>
				</div>
				<div>
					<table cellpadding="0" cellspacing="0" border="0" width="849">
						<tbody id="internalMessageList"></tbody>
						<tr height="53" align="center"
							style="color: #666666; display: none" id="noData">
							<td>暂无数据</td>
						</tr>
					</table>
				</div>
				<div class="fy_new">
					<div id="page" class="inline-center"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="pz_down">
		<%@ include file="/views/front/common/bottom.htm"%><!-- 底部栏 -->
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/js/front/domain/hospital/hospitalCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/hospital/internalMessage.js" title="v"></script>
	<script id="template" type="x-tmpl-mustache">
		<tr height="53" align="center" style="font-size:14px; color:#63a13f">
	        	<td width="300">标题</td>
				<td width="120">创建时间</td>
				<td width="120">操作</td>
	        </tr>
			{{#rows}}
				<tr height="58" align="center" style="color:#666666">
		    		<td width="300" class="pointer">{{title}}</td>
					<td width="120">{{&createDate}}</td>
					<td width="120">
						<button class="btn btn-success" onclick="lh.alert({content:'{{content}}',title:'{{title}}'})">查看详情</button>
					</td>
		    	</tr>

			{{/rows}}
	</script>
</body>
</html>
