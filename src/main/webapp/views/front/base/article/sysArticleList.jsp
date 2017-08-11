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

	<div class="pz_top">
		<%@ include file="/views/front/common/top.htm"%><!-- 顶部栏 -->
		<%@ include file="/views/front/common/menuTop.htm"%><!-- 顶部菜单栏（搜索+菜单） -->
	</div>
	<div class="pz_main">
		<div class="w_1000">
			<div class="c_1100_10">
				当前位置： <a href="/">首页</a> - <a href="javascript:">${typeName}</a>
				<!--  - <a href="javascript:;">健康资讯分类一</a> -->
			</div>
			<div class="w_824" style="width: 1100px;">
				<div class="c_824" style="width: auto;">
					<ul id="articleListUl">
					</ul>
					<div class="fy_new">
						<div id="page" class="inline-center"></div>
					</div>
				</div>
			</div>

		</div>
	</div>

	<input type="hidden" value="${typeId}" id="typeId">
	<input type="hidden" value="${postUrl}" id="postUrl">

	<div class="pz_down">
		<%@ include file="/views/front/common/menuBottom.htm"%><!-- 底部菜单栏 -->
		<%@ include file="/views/front/common/bottom.htm"%><!-- 底部栏 -->
	</div>
	<%@ include file="/views/front/common/nav.htm"%><!-- 右侧浮动导航菜单 -->

	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/js/front/domain/user/userCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/base/article/articleList.js" title="v"></script>
	<script id="template" type="x-tmpl-mustache">
		{{#rows}}
			<li class="gray" style="width:1060px;">
				<a {{#isAnno}} href="/anno/{{id}}" {{/isAnno}} {{^isAnno}} href="/baseArticle/{{id}}" {{/isAnno}}  style="width:1060px;">
					<div class="l_new" style="width:900px;">
						<nobr>{{title}}</nobr>
					</div>
					<span>{{&createDate}}</span>
				</a>
			</li>
		{{/rows}}
	</script>
</body>
</html>

