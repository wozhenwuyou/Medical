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
	<%@ include file="/views/front/common/doctor/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/doctor/doctorTop.htm"%>
		<div class="w_1000">
			<%@ include file="/views/front/common/doctor/doctorLeft.htm"%><!-- 左边菜单栏 -->
			<input type="hidden" id="articleId" value="${article.id}">
			<div class="w_824" style="margin: 30px 0px 0px 20px;">
				<div class="page">
					<div class="t_824">
						<div class="tit3">${article.title}</div>
						<div class="time1">
							<div class="l_flo" style="float: left; margin-left: 133px;">
								<fmt:formatDate value="${article.createdAt}"
									pattern="YYYY-MM-dd HH:mm:ss" />
								&nbsp;&nbsp;&nbsp;发布人：<span>${article.createdBy}</span>
								&nbsp;&nbsp;&nbsp;访问次数：<font>${article.scans}</font>
								&nbsp;&nbsp;&nbsp;分享到：
							</div>
							<div class="bshare-custom"
								style="float: left; line-height: 24px; font-size: 12px;">
								<a title="分享到QQ空间" class="bshare-qzone"></a> <a title="分享到新浪微博"
									class="bshare-sinaminiblog"></a> <a title="分享到人人网"
									class="bshare-renren"></a> <a title="分享到腾讯微博"
									class="bshare-qqmb"></a> <a title="分享到网易微博"
									class="bshare-neteasemb"></a> <a title="更多平台"
									class="bshare-more bshare-more-icon more-style-addthis"></a>
							</div>
							<script type="text/javascript" charset="utf-8"
								src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script>
							<script type="text/javascript" charset="utf-8"
								src="http://static.bshare.cn/b/bshareC0.js"></script>
						</div>
					</div>
					<div class="d_824">${article.content}</div>
					<div class="plun"></div>
				</div>
			</div>
		</div>
		<div class="pz_down">
			<%@ include file="/views/front/common/bottom.htm"%><!-- 底部栏 -->
		</div>
		<%@ include file="/views/common/common_js.htm"%>
		<%@ include file="/views/common/common_front_js.htm"%>
		<script type="text/javascript"
			src="/js/front/domain/doctor/doctorCommon.js" title="v"></script>
		<script type="text/javascript" src="/js/front/base/article/article.js"
			title="v"></script>
</body>
</html>

