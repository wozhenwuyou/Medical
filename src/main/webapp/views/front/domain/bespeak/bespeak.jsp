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
	href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
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
				当前位置：<a href="/">首页</a> - <a href="/userBespeak">我要预约</a>-
				<c:if test="${typeId == 1}">远程诊疗</c:if>
				<c:if test="${typeId == 2}">上门服务</c:if>
				<c:if test="${typeId == 3}">血液检测</c:if>
			</div>
			<div class="c_1100_13">
				<div class="t_1100_1">
					沃诊无忧 · 我要预约 ·
					<c:if test="${typeId == 1}">远程诊疗</c:if>
					<c:if test="${typeId == 2}">上门服务</c:if>
					<c:if test="${typeId == 3}">血液检测</c:if>
				</div>
				<div id="mainDiv" class="m_355" style="display: none;">
					<div id="mainSubDiv" class="c_355">
						<table cellpadding="0" cellspacing="0" border="0"
							style="float: left;">
							<tr height="40">
								<td width="85">患者姓名：</td>
								<td width="340"><input style="width: 300px;" type="text"
									id="username" readonly="readonly" class="l_270"
									value="${patient.username}" /></td>
							</tr>
							<tr height="52">
								<td width="85">患者性别：</td>
								<td width="340" style="font-size: 12px; color: #444444"><input
									type="radio" disabled="disabled" name="sex" value="1"
									<c:if test="${patient.sex == 1}"> checked = checked</c:if> />
									&nbsp;男 &nbsp;&nbsp;&nbsp; <input type="radio"
									disabled="disabled" name="sex" value="2"
									<c:if test="${patient.sex == 2}"> checked = checked</c:if> />
									&nbsp;女</td>
							</tr>
							<tr height="40">
								<td width="85">手机号码：</td>
								<td width="340"><input style="width: 300px;" type="text"
									id="phone" readonly="readonly" class="l_270"
									value="${patient.phone}" /></td>
							</tr>
							<c:if test="${typeId == 2}">
								<!--  <tr height="52">
			                        	<td width="100">是否代为远程诊疗：</td>
			                            <td width="300" style="font-size:12px; color:#444444">
			                            	<input type="radio" id="isRegisterAgentYes" checked="checked" onclick="isRegisterAgentStatus('yes')"/>是 &nbsp;&nbsp;
			                            	<input type="radio" id="isRegisterAgentNo" onclick="isRegisterAgentStatus('no')"/>否 &nbsp;&nbsp;
			                            </td>
			                        </tr> -->

								<tr height="52">
									<td width="100">服务项目：</td>
									<td width="300"
										style="font-size: 12px; color: #444444; width: 300px;"><select
										id="isRegisterAgent"
										style="width: 300px; height: 38px; border: 1px solid #e4e4e3;">
											<option value="">请选择上门服务项目</option>
											<option value="上门点滴">上门点滴</option>
											<option value="上门送药">上门送药</option>
											<option value="上门诊疗">上门诊疗</option>
									</select></td>
								</tr>
							</c:if>
							<c:if test="${typeId == 3}">
								<tr height="52">
									<td width="85">检测类型：</td>
									<td width="340"><select class="l_270" id="cancerTypes"
										style="width: 300px;">
											<c:forEach var="cancerTypes" items="${cancerTypes}">
												<option value="${cancerTypes.id}">${cancerTypes.name}</option>
											</c:forEach>
									</select></td>
								</tr>
							</c:if>
							<tr id="doctorLabelTr" height="30" style="display: none;">
								<td colspan="2">选择检测医生：</td>
							</tr>
							<tr id="doctorTr" style="display: none;">
								<td width="425" colspan="2">
									<div class="list_text" id="doctorDiv" style="width: 420px;">
										<ul id="doctorListUl">
											<!-- 医生列表 -->
										</ul>
										<div class="fl" style="margin-left: 50px;">
											<div id="page" class="inline-center"></div>
										</div>
									</div>
								</td>
							</tr>

							<tr height="80">
								<td width="85">预约时间：</td>
								<td width="340">
									<!-- <select class="input17"><option>月份</option></select>
		                                <select class="input17" style="margin:0 10px;"><option>日期</option></select>
		                                <select class="input17"><option>时间</option></select> -->
									<input id="datetimepicker" type="text"
									style="width: 300px; height: 38px; border: 1px solid #e4e4e3;">
								</td>
							</tr>
							<tr height="133" valign="bottom">
								<td width="85" valign="top" style="line-height: 80px;">患者病情：</td>
								<td width="300"><textarea class="input18"
										id="baseCondition" style="width: 300px;"></textarea></td>
							</tr>
							<tr height="40">
								<td width="85">&nbsp;</td>
								<td width="340" style="font-size: 12px; color: #666666"><span
									style="color: #444444;">提示：</span>您的个人信息及联系方式我们将保密，仅医患双方可见。</td>
							</tr>
							<tr height="57" valign="bottom">
								<td width="85">&nbsp;</td>
								<td width="340"><input type="submit" value="提交"
									class="input20" onclick="addBespeak()" /></td>
							</tr>
						</table>

					</div>
				</div>
			</div>

			<div class="h_20">&nbsp;</div>
		</div>
	</div>

	<input type="hidden" id="typeId" value="${typeId}">
	<input type="hidden" id="doctorId" value="${doctorId}">
	<input type="hidden" id="hospitalId" value="${hospitalId}">
	<input type="hidden" id="isBloodTest" value="${isBloodTest}">

	<div class="pz_down">
		<%@ include file="/views/front/common/menuBottom.htm"%>
		<%@ include file="/views/front/common/bottom.htm"%>
	</div>
	<%@ include file="/views/front/common/nav.htm"%>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript"
		src="/js/front/domain/user/userCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/bespeak/bespeak.js" title="v"></script>

	<script id="template" type="x-tmpl-mustache">
		<li style="width:320px;border:none;">
			<table cellpadding="0" cellspacing="0" border="0">
				<tr height="110">
					{{#rows}}
					<td width="19" id="doctor_td_{{id}}" onclick="chooseDoctor({{id}})"; style="padding-top: 20px;">
						<div class="l_71" style="width: 120px;text-align: center;"><img src="{{avatar}}" width="60" height="60" onerror="this.src='/images/front/main13.png'"/></div>
						<div class="r_100 l_120_1" style="height:25px;text-align: center;"><span>{{username}}</span></div>
						<div class="l_120_1" style="height:25px;text-align: center;"><span>上次登陆时间</span></div>
						<div class="l_120_1" style="width:120px;height:25px;text-align: center;">{{&lastLoginDate}}</div>
					</td>
					{{/rows}}		 		 
				</tr>
			</table>
		</li>
	</script>


</body>
</html>

