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
		<%@ include file="/views/front/common/top.htm"%>
		<%@ include file="/views/front/common/menuTop.htm"%>
	</div>
	<div class="pz_main">
		<div class="w_1000">
			<div class="c_1100_10">
				当前位置：<a href="/">首页</a>
			</div>
			<%@ include file="/views/front/common/user/userLeft.htm"%>
			<div class="w_824">
				<c:choose>
					<c:when test="${model != null && model.id > 0}">
						<div style="padding-left:15px;">
							<button type="button" class="btn btn-success btn-lg" onclick="fnView('${model.id}', '${user.realName }'); return false;">查看健康档案</button>
						</div>
					</c:when>
					<c:otherwise>
						<div style="padding-left:15px;">
							<h3><span class="label label-info">您暂时还没有健康档案哦，不过我们已正在帮你建立了，请您耐心等待...</span></h3>
						</div>
					</c:otherwise>		
				</c:choose>
			</div>
		</div>
	</div>

	<div class="pz_down">
		<%@ include file="/views/front/common/menuBottom.htm"%>
		<%@ include file="/views/front/common/bottom.htm"%>
	</div>
	<%@ include file="/views/front/common/nav.htm"%>

	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript" src="/third-party/z.js" title="v"></script>
	<script type="text/javascript" src="/js/front/domain/user/userCommon.js" title="v"></script>
	<script type="text/javascript" src="/third-party/layer/layer.js" title="v"></script>
	<script type="text/javascript" src="/js/front/domain/user/myPhr.js" title="v"></script>
	
	<script type="text/javascript">
		setCacheLoginInfo('${user.username}', 1);
	</script>
</body>
</html>

