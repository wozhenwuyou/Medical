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
<style>
.quote_text {
	overflow: hidden;
	text-overflow: ellipsis;
	-o-text-overflow: ellipsis;
	-webkit-text-overflow: ellipsis;
	-moz-text-overflow: ellipsis;
	word-break: break-all;
	word-wrap: break-word;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
}

.text2 {
	width: 200px;
	word-break: break-all;
	display: -webkit-box;
	-webkit-line-clamp: 2;
	-webkit-box-orient: vertical;
	overflow: hidden;
}
</style>
</head>
<body>
	<div class="pz_top">
		<%@ include file="/views/front/common/top.htm"%>
		<%@ include file="/views/front/common/menuTop.htm"%>
	</div>
	<div class="pz_banner">
		<div class="w_1000">
			<div class="banner">
				<div class="pz_slides_3">
					<div class="_btn"></div>
					<div class="_pic">
						<ul style='height: 331px;'>
							<c:if test="${!empty advertisementList}">
								<c:forEach var="advertisement" items="${advertisementList}">
									<li><a href="${advertisement.linkUrl}" target="_blank"><img
											onerror="this.src='/images/front/banner.jpg'"
											src="${advertisement.picPath}" width="746" height="321" /></a></li>
								</c:forEach>
							</c:if>
							<c:if test="${empty advertisementList}">
								<li><a href="javascript:;"><img
										src="/images/front/banner.jpg" width="746" height="331" /></a></li>
							</c:if>
						</ul>
					</div>
				</div>
			</div>
			<div class="r_344">
				<div class="t_344" style='margin-top: 10px;'>
					<a href="/doctorLogin"><img src="/images/front/main1-1.jpg"
						style="height: 110px; width: 344px;" /></a>
					<div class="pf_280">
						<div class="tit tit-1">
							<strong>会员入口</strong><br /> <span>member entrance</span>
						</div>

						<a href="javascript:" onclick="checkLogin(1);">
							<div class="more-1">登录</div>
						</a> <a href="/register" target="_blank">
							<div class="more-2">注册</div>
						</a>
					</div>
				</div>
				<div class="t_344" style='margin-top: 2px;'>
					<a href="javascript:" onclick="checkLogin(2);"><img
						src="/images/front/main10-10.jpg"
						style="height: 110px; width: 344px;" /></a>
					<div class="pf_280">
						<a href="javascript:" onclick="checkLogin(2);">
							<div class="tit">
								<strong>医生入口</strong><br /> <span>Doctor entrance</span>
							</div>
							<div class="more">进入</div>
						</a>
					</div>
				</div>
				<div class="t_344" style='margin-top: 2px;'>
					<a href="javascript:" onclick="checkLogin(3);"><img
						src="/images/front/main4-4.jpg"
						style="height: 110px; width: 344px;" /></a>
					<div class="pf_280">
						<a href="javascript:" onclick="checkLogin(3);">
							<div class="tit">
								<strong>医疗机构入口</strong><br /> <span>Medical institution
									entrance</span>
							</div>
							<div class="more">进入</div>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="pz_main">
		<div class="w_1000">
			<div class="c_1100_4">
				<div class="l_746">
					<div class="tit_0100">
						<div class="work">
							优医在线 &nbsp;<span>Good doctor online</span>
						</div>
						<div class="more_1">
							<a href="/searchDoctorOrHospitalList/2" style="background: none;">更多</a>
						</div>
					</div>
					<div class="h_1">&nbsp;</div>
					<div class="d_746">
						<ul>
							<c:forEach items="${doctorList}" var="doctor">
								<li>
									<div class="t_img">

										<a href="/doctor/${doctor.attrStr}" target="_blank"><img
											class="img-circle" src="${doctor.avatar}"
											onerror="this.src='/images/front/main13.png'" /></a>

									</div>
									<div class="tit1">
										<a href="/doctor/${doctor.attrStr}" target="_blank">${doctor.username}<br />
											<span>${doctor.departmentName}/${doctor.titleNames}</span></a>
									</div>
									<div class="con">
										<a target="_blank"
											href="/consult?doctorId=${doctor.id}&hospitalId=${doctor.hospitalId}">在线咨询</a>
									</div>
								</li>
							</c:forEach>
						</ul>
					</div>
				</div>

				<div class="r_344_1 pz_tab"
					style="margin-left: 10px; max-height: 289px; overflow: hidden;">
					<div class="t_344_1 hd">
						<ul>
							<li id="slideBox_li_1" onclick="switchIndexArticle(1);"
								onmouseover="switchIndexArticle(1);" class="left1 on">公告</li>
							<li id="slideBox_li_2" onclick="switchIndexArticle(2);"
								onmouseover="switchIndexArticle(2);">活动</li>
							<li id="slideBox_li_3" onclick="switchIndexArticle(3);"
								onmouseover="switchIndexArticle(3);">调查</li>
						</ul>
					</div>
					<div class="d_344">
						<div id="slideBox_1" class="topMarqueeDiv">
							<div class="bd">
								<ul>
									<c:if test="${empty announcementList}">
										<li>
											<div class="t_309">
												<div class="r_242 pointer"
													style="width: 100%; text-align: center;">暂无公告</div>
											</div>
											<div class="d_309"
												style="max-height: 120px; overflow: hidden;"></div>
										</li>
									</c:if>
									<c:forEach var="anno" items="${announcementList}">
										<li>
											<div class="t_309">
												<div class="l_55">
													<strong><fmt:formatDate value="${anno.createdAt}"
															pattern="dd" /></strong><br />
													<fmt:formatDate value="${anno.createdAt}" pattern="YYYY/MM" />
												</div>
												<div class="r_242 pointer quote_text"
													onclick="lh.jumpToUrl('/anno/${anno.id}');"
													style="max-height: 44px;">
													<a style="float: none;" href="/anno/${anno.id}">${anno.title}</a>
												</div>
											</div>
											<div class="d_309 quote_text" style="max-height: 120px;"
												onclick="lh.jumpToUrl('/anno/${anno.id}');">${anno.content}</div>
										</li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div id="slideBox_2" class="topMarqueeDiv" style="display: block;">
							<div class="bd">
								<ul>
									<c:if test="${empty activityList}">
										<li>
											<div class="t_309">
												<div class="r_242 pointer"
													style="width: 100%; text-align: center;">暂无活动</div>
											</div>
											<div class="d_309" style="max-height: 120px;"></div>
										</li>
									</c:if>
									<c:forEach var="activity" items="${activityList}">
										<li>
											<div class="t_309">
												<div class="l_55">
													<strong><fmt:formatDate
															value="${activity.createdAt}" pattern="dd" /></strong><br />
													<fmt:formatDate value="${activity.createdAt}"
														pattern="YYYY/MM" />
												</div>
												<div class="r_242 pointer quote_text"
													style="max-height: 44px;">
													<a style="float: none;" href="/baseArticle/${activity.id}">${activity.title}</a>
												</div>
											</div>
											<div class="d_309 quote_text" style="max-height: 120px;">${activity.content}</div>
										</li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div id="slideBox_3" class="topMarqueeDiv" style="display: block;">
							<div class="bd">
								<ul>
									<c:if test="${empty investigationList}">
										<li>
											<div class="t_309">
												<div class="r_242 pointer"
													style="width: 100%; text-align: center;">暂无调查</div>
											</div>
											<div class="d_309" style="max-height: 120px;"></div>
										</li>
									</c:if>
									<c:forEach var="investigation" items="${investigationList}">
										<li>
											<div class="t_309">
												<div class="l_55">
													<strong><fmt:formatDate
															value="${investigation.createdAt}" pattern="dd" /></strong><br />
													<fmt:formatDate value="${investigation.createdAt}"
														pattern="YYYY/MM" />
												</div>
												<div class="r_242 pointer quote_text"
													style="max-height: 44px;">
													<a style="float: none;"
														href="/baseArticle/${investigation.id}">${investigation.title}</a>
												</div>
											</div> <%-- <div class="d_309 quote_text" style="max-height: 120px;">${investigation.content}</div> --%>
										</li>
									</c:forEach>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="c_1100_3">
				<div class="l_368" style="background-color: #ededed">
					<div class="tit_0100">
						<div class="work">
							热点讨论 &nbsp;<span>Hot discussion</span>
						</div>
						<div class="more_1">
							<a href="/articleList/43" target="_blank">更多</a>
						</div>
					</div>
					<div class="list1">
						<ul>
							<c:forEach items="${hotDiscussionList}" var="hotDiscussion">
								<%-- begin="0" end="0" --%>
								<li class="l1" style="height: 84px;"><a
									href="/article/${hotDiscussion.typeId}/${hotDiscussion.id}">
										<div class="l_80">
											<img src="${hotDiscussion.picPaths}"
												onerror="this.src='/images/front/main8.jpg'" width="80"
												height="60" />
										</div>
										<div class="r_256">
											<div class="t_tit quote_text" style="max-height: 40px;">${hotDiscussion.title}</div>
											<div class="d_time">
												<fmt:formatDate value="${hotDiscussion.createdAt}"
													pattern="YYYY-MM-dd" />
											</div>
										</div>
								</a></li>
							</c:forEach>
							<%--  <c:forEach items="${hotDiscussionList}" var="hotDiscussion" begin="1" >
	                        	<li class="l2 first"><a href="/article/${hotDiscussion.typeId}/${hotDiscussion.id}"><nobr>${hotDiscussion.title}</nobr></a></li>
	                        </c:forEach> --%>
						</ul>
					</div>
				</div>
				<div class="l_368" style="background-color: #ededed">
					<div class="tit_0100">
						<div class="work">
							健康资讯 &nbsp;<span>Health information</span>
						</div>
						<div class="more_1">
							<a href="/articleList/42" target="_blank">更多</a>
						</div>
					</div>
					<div class="list1">
						<ul>
							<c:forEach items="${healthInformationList}"
								var="healthInformation">
								<%-- begin="0" end="0" --%>
								<li class="l1" style="height: 84px;"><a
									href="/article/${healthInformation.typeId}/${healthInformation.id}">
										<div class="l_80">
											<img src="${healthInformation.picPaths}"
												onerror="this.src='/images/front/main10.jpg'" width="80"
												height="60" />
										</div>
										<div class="r_256">
											<div class="t_tit quote_text" style="max-height: 40px;">${healthInformation.title}</div>
											<div class="d_time">
												<fmt:formatDate value="${healthInformation.createdAt}"
													pattern="YYYY-MM-dd" />
											</div>
										</div>
								</a></li>
							</c:forEach>
							<%--  <c:forEach items="${healthInformationList}" var="healthInformation" begin="1" >
	                        	<li class="l2 first"><a href="/article/${healthInformation.typeId}/${healthInformation.id}"><nobr>${healthInformation.title}</nobr></a></li>
	                        </c:forEach> --%>
						</ul>
					</div>
				</div>

				<div class="r_344_2">
					<div class="tit_0100">
						<div class="work">
							名医观点 &nbsp;<span>Medical opinion</span>
						</div>
						<div class="more_1">
							<a href="/articleList/44" target="_blank">更多</a>
						</div>
					</div>
					<div class="d_344_1">
						<div class="top_314 slideBox">
							<div class="hd">
								<ul>
									<li>1</li>
									<li>2</li>
									<li>3</li>
								</ul>
							</div>
							<div class="bd">
								<ul>
									<c:forEach items="${medicalOpinionList}" var="medicalOpinion"
										begin="0" end="2">
										<li><a
											href="/article/${medicalOpinion.typeId}/${medicalOpinion.id}"><img
												src="${medicalOpinion.picPaths}"
												onerror="this.src='/images/front/main14.jpg'" width="314"
												height="100" /></a>
											<div class="pf_314">
												<a
													href="/article/${medicalOpinion.typeId}/${medicalOpinion.id}"><nobr>${medicalOpinion.title}</nobr></a>
											</div></li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div class="d_list">
							<ul>
								<c:forEach items="${medicalOpinionList}" var="medicalOpinion"
									begin="3">
									<li><a
										href="/article/${medicalOpinion.typeId}/${medicalOpinion.id}"><nobr>${medicalOpinion.title}</nobr></a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>

				<div class="r_344_2" style="margin-top: 5px; height: 268px;">
					<div class="d_344_1" style="width: 344px; padding: 0px;">
						<div class="top_314 slideBox" style="width: 344px; height: 268px;">
							<div class="hd">
								<ul>
									<c:forEach items="${advertisementList2}" var="advertisement2"
										varStatus="v">
										<li>${v.index+1}</li>
									</c:forEach>
								</ul>
							</div>
							<div class="bd" style="width: 344px; height: 268px;">
								<ul style="width: 344px; height: 268px;">
									<c:forEach items="${advertisementList2}" var="advertisement2">
										<li style="width: 344px; height: 268px;"><a
											href="${advertisement2.linkUrl}" target="_blank"
											style="width: 344px;"> <img
												onerror="this.src='/images/front/banner.jpg'"
												src="${advertisement2.picPath}" width="344" height="268" />
										</a></li>
									</c:forEach>
								</ul>
							</div>
						</div>
					</div>
				</div>

			</div>
			<div class="c_1100_5" style="height: 320px;">
				<!-- 350 -->
				<div class="tit_0100">
					<div class="work"
						style="padding: 0 0 0 10px; background-position: 0 center;">发生在身边的那些事</div>
					<div class="more_1">
						<a href="/articleList/48" target="_blank">更多</a>
					</div>
				</div>
				<div class="d_1100">
					<ul>
						<c:forEach items="${sideList}" var="side">
							<li>
								<div class="t_260">
									<a href="/article/${side.typeId}/${side.id}"><img
										src="${side.picPaths}"
										onerror="this.src='/images/front/main16.jpg'" width="260"
										height="175" /></a>
								</div>
								<div class="tit_260">
									<a href="/article/${side.typeId}/${side.id}"><nobr>${side.title}</nobr></a>
								</div>
								<div class="time_260">
									<fmt:formatDate value="${side.createdAt}" pattern="YYYY-MM-dd" />
								</div> <%-- <div class="d_260">
									<a href="/article/${side.typeId}/${side.id}">${side.content}</a>
								</div> --%>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="pz_down">
		<!-- include file="/views/front/common/otherlink.htm"-->
		<div id="link"></div>
		<div id='otherlink' style="height: auto;">
			<ul id="link-ul">
				<li class="link1">友情链接</li>
				<li>名站导航</li>
			</ul>
			<div class="link-part linkpart1"
				style="height: auto; min-height: 80px; position: initial; margin-bottom: 15px;">
				<ul id="baseLinkUl" style="display: inline-block;">

				</ul>
			</div>
			<div class="link-part linkpart3"
				style="height: auto; min-height: 80px; position: initial; margin-bottom: 15px; overflow: visiable;">
				<div id="linkFamousDiv"
					style="display: inline-block; color: #666; text-decoration: none; margin-left: 22px; line-height: 28px; font-size: 14px;">
					<table id="linkFamousTable" cellpadding="0" cellspacing="0"
						border="0" width="1100"></table>
				</div>
			</div>
		</div>
		<%@ include file="/views/front/common/menuBottom.htm"%>
		<%@ include file="/views/front/common/bottom.htm"%>
	</div>
	<%@ include file="/views/front/common/nav.htm"%>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/js/front/domain/user/userCommon.js" title="v"></script>
	<script type="text/javascript" src="/js/front/link.js" title="v"></script>
	<!-- <script type="text/javascript" src="/js/front/jquerydotdotdot.js" title="v"></script> -->
	<!-- <script type="text/javascript">
		lh.paramJson = ${paramJson};
  	</script> -->
	<!-- <script type="text/javascript">
	  	$(function () {
		  	 $(".quote_text").dotdotdot({
		         // configuration goes here
		         height:50
		     });
	  	});
  	</script> -->
</body>
</html>

