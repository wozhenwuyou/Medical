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
	href="/css/front/hospital/hospital.css" title="v" />
<link rel="stylesheet" type="text/css"
	href="/third-party/pagination/paging.css" />
</head>
<body>
	<%@ include file="/views/front/common/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/hospital/hospitalTop.htm"%>
		<!-- 顶部菜单栏 -->
		<div style="clear: both;"></div>
		<div id="geren"
			style="height: auto; overflow: hidden; zoom: 1; margin-bottom: 20px; padding-bottom: 60px;">
			<div class="ge-fl"
				style="height: auto; margin-bottom: -10000px; padding-bottom: 10000px;">
				<input type="hidden" id="hospitalId" value="${hospitalId}">
				<div class="flbt" id="flbt1">
					<h2>诊所信息</h2>
				</div>
				<div class="neirong1">
					<span class="span1">诊所介绍</span>
				</div>
				<div class="neirong2"
					style="height: auto; margin-top: 5px; width: 225px;">
					<p style="letter-spacing: normal;">
						<c:if test="${!empty hospital.introduction}">${hospital.introduction}</c:if>
						<c:if test="${empty hospital.introduction}">暂无介绍</c:if>
					</p>
				</div>
				<div class="neirong3 ys-nr3" style="margin-top: 55px;">
					<span class="span2">联系方式</span>
				</div>
				<div class="neirong4"
					style="height: auto; margin-top: 5px; width: 225px;">
					<p style="letter-spacing: normal;">
						<b>地址：</b><br /> <br /> ${hospital.address} <br /> <br /> <b>诊所电话：</b><br />
						${hospital.phone}<br /> ${hospital.tel}
					</p>
				</div>
				<div class="flbt" id="flbt2" style="margin-top: 80px;">
					<h2>网站统计</h2>
				</div>
				<div class="neirong5" style="height: auto;">
					<h4>
						上次在线：<br> <i><fmt:formatDate
								value="${hospital.lastLoginTime}" pattern="YYYY-MM-dd HH:mm:ss" /></i>
					</h4>
					<h4>
						开通时间：<br> <i><fmt:formatDate
								value="${hospital.createdAt}" pattern="YYYY-MM-dd HH:mm:ss" /></i>
					</h4>
				</div>
			</div>
			<div class="ge-fr"
				style="height: auto; margin-bottom: -10000px; padding-bottom: 10000px;">

				<div class="ys-zixun">
					<div class="ge-fr-tit2" style="margin-bottom: 0;">
						<h2>${hospital.wholeName}诊所可咨询专家</h2>
						<i style="font-size: 16px; color: #fff; font-style: normal;"></i>
					</div>
					<div id="doctorList">
						<!--  <div class="zixun-box">
		                    <img src="images/ys-zixun.png" style="padding-top:4px;">
		                    <h4>马艳</h4>
		                    <b>副主任医师</b>
		                    <span>血液科  皮肤病科  儿科</span>
		                    <a href="#"><input type="button" value="咨询" class="zx-btn1"/></a>
		                    <a href="#"><input type="button" value="预约" class="zx-btn2"/></a>
		                </div> -->
					</div>
					<div style="clear: both;"></div>
					<div class="fy_new"
						style="float: none; width: 853px; padding-top: 10px;">
						<div id="page" class="inline-center"></div>
					</div>
				</div>

				<div class="ge-fr-tit" style="margin-top: 0px;">
					<h2>诊所公告</h2>
					<span> <!-- （已帮助43782位患者） -->
					</span>
				</div>
				<div class="wzswitch pz_tab"
					style="width: 100%; float: none; max-height: 800px; overflow: auto;">
					<!-- <button id="annoBtn" style="float: right;" type="button" onclick="toggleAnno();" class="btn btn-success">折叠</button> -->
					<c:if test="${!empty announcementList}">
						<div id="annoContainer"
							style="word-wrap: break-word; word-break: break-all;">
							<c:forEach var="announcement" items="${announcementList}">
								<div class="annoItem g_811 bd" style="">
									<li>
										<div class="box_811">
											<div class="t_771">
												<span><strong><fmt:formatDate
															value="${announcement.createdAt}" pattern="dd" /></strong><br />
													<fmt:formatDate value="${announcement.createdAt}"
														pattern="YYYY/MM" /></span>
												<div class="r_600">
													<c:if test="${announcement.gradeId == 2}">
														<span style="color: orange;">系统公告：</span>
													</c:if>
													<span>${announcement.title}</span><br />
												</div>
											</div>
											<div class="d_771 pointer"
												style="max-height: 200px; overflow: auto;"
												id="showContent_${announcement.id}"
												onclick="showContent(${announcement.id})">${announcement.content}</div>
										</div>
									</li>
								</div>
							</c:forEach>
						</div>
					</c:if>
					<c:if test="${empty announcementList}">
						<div>
							<li>
								<div class="box_811">
									<div class="d_771">暂无数据</div>
								</div>
							</li>
						</div>
					</c:if>
				</div>

				<div style="clear: both;"></div>

				<div class="ge-fr-tit2" style="margin-top: 0px;">
					<h2>${hospital.wholeName}诊所的最新文章</h2>
					<span> <!-- <a href="#">More></a> -->
					</span>
				</div>
				<div class="ge-ul ys-zy">
					<ul>
						<c:if test="${!empty articleList}">
							<c:forEach var="article" items="${articleList}">
								<li><a href="/article/${article.typeId}/${article.id}"><span>${article.title}</span></a>
									<i><fmt:formatDate value="${article.createdAt}"
											pattern="yyyy-MM-dd" /></i> <img src="/images/front/yanj.jpg">
									<div>${article.scans}</div></li>
								<hr />
							</c:forEach>
						</c:if>
						<c:if test="${empty articleList}">
							<li><span>暂无数据</span></li>
						</c:if>
					</ul>
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
		src="/js/front/domain/user/userCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/hospital/hospitalHome.js" title="v"></script>
	<script id="template" type="x-tmpl-mustache"><!-- -->
		{{#rows}}
			<div class="zixun-box" style="width:184px;">
	           <img src="{{avatar}}" onclick="javascript:window.open('/doctor/{{attrStr}}')" class="pointer img-circle"  style="padding-top:4px;width:130px;height:130px;" onerror="this.src='/images/front/main13.png'" onclick="location.href='/doctor/{{id}}'">
	            <div style="margin:10px;">
					<span onclick="javascript:window.open('/doctor/{{attrStr}}')" class="pointer" style="color: rgb(101,153,70);font-size: 18px;">{{username}}</span>
	            	<span style="font-size: 14px;font-weight: 700;">{{titleNames}}</span>
				</div>
				<div style="margin:10px;">
	            	<span>{{departmentName}}</span>
				</div>
	            <a href="/consult?doctorId={{id}}&hospitalId={{hospitalId}}"><input type="button" value="咨询" class="zx-btn1"/></a>
	            <a href="#"><input type="button" value="预约" onclick="selectBespeak('{{id}}','{{hospitalId}}')" class="zx-btn2"/></a>
	         </div>
		{{/rows}}		 		 
	</script>
</body>
</html>

