<%@page import="java.util.List"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.lhfeiyu.service.PhrHealthCheckService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="/third-party/bootstrap/css/bootstrap.min.css" />
<script src="/third-party/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="/third-party/bootstrap/js/bootstrap.min.js"></script>
<%

	ServletContext context = request.getSession().getServletContext();  
	ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);  

	//得到基本信息的id
	Integer basicInfoId = Integer.valueOf(request.getParameter("basicInfoId"));
	//找到体检表的id
	PhrHealthCheckService phrHealthCheckService = ctx.getBean(PhrHealthCheckService.class);
	List<Integer> healthCheckIds = phrHealthCheckService.getPhrHealthCheckByBasicInfoId(basicInfoId);
	request.setAttribute("healthCheckIds", healthCheckIds);
%>
</head>
<body>
	<div class="container-flow">
	<div class="row clearfix">
		<div class="col-md-2 column" style="padding-top:5px;">
				<ul class="nav nav-pills nav-stacked nav-stacked">
					<li role="presentation" class="active"><a href="/front/phr/phrCover?basicInfoId=<%=request.getParameter("basicInfoId")%>" target="contentIframe">封面</a></li>
					<li role="presentation"><a href="/back/phr/phrBasicInfoForm?id=<%=request.getParameter("basicInfoId")%>" target="contentIframe">基本信息表</a></li>
					<c:if test="${healthCheckIds != null }">
						<c:forEach var="one" items="${healthCheckIds }" varStatus="varStatus">
							<li role="presentation"><a href="/front/phr/phrHealthCheck?id=${one }" target="contentIframe">体检表${varStatus.count }</a></li>
						</c:forEach>
					</c:if>
				</ul>
		</div>
		<div class="col-md-10 column" style="padding-top:5px;">
			<iframe src="/front/phr/phrCover?basicInfoId=<%=request.getParameter("basicInfoId")%>" name="contentIframe" width="100%" height="530px;" frameborder="0" style="border:0px;"></iframe>
		</div>
	</div>
</div>
	<script type="text/javascript">
		$('ul.nav-pills>li').click(function(){
			$(this).parent().find('li').removeClass('active');
			$(this).addClass('active');
		});
	</script>
	
</body>
</html>
