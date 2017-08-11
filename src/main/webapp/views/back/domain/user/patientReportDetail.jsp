<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<link type="text/css" rel="stylesheet"
	href="/third-party/bootstrap/css/bootstrap.min.css" />
<%@ include file="/views/common/common_back_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/back/back.css"
	title="v" />
<link rel="stylesheet" type="text/css" href="/css/front/style.css"
	title="v" />
<link rel="stylesheet" type="text/css"
	href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
</head>
<body style="min-width: 1000px;">
	<div class="w_851" style="float: left;">
		<div class="c_851">
			<div class="t_851_2">检测报告单</div>
			<input type="hidden" id="reportId" value="${patientReport.id}" />
			<div class="l_849">
				<table cellpadding="0" cellspacing="0" border="0" width="773"
					id="baseInformation">
					<tr height="40" valign="bottom">
						<td><strong>基本信息</strong></td>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">姓&nbsp;&nbsp;&nbsp;&nbsp;名</td>
						<td width="329"><input type="text" class="input14"
							id="patientName" value="${patientReport.patientName}" /></td>
						<td width="67" style="line-height: 30px;">条&nbsp;形&nbsp;码</td>
						<td width="329"><input type="text" class="input14"
							id="adiconBarcode" value="${patientReport.adiconBarcode}" /></td>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">身份证号</td>
						<td width="310"><input type="text" class="input14"
							id="idcardNum" value="${patientReport.idcardNum}" /></td>
						<td width="67" style="line-height: 30px;">电&nbsp;&nbsp;&nbsp;&nbsp;话</td>
						<td width="329"><input type="text" class="input14"
							id="patientPhone" value="${patientReport.patientPhone}" /></td>
						<%-- 	<td width="67" style="line-height: 30px;">出生日期</td>
							<td width="329"><input type="text" class="input14" readonly="readonly" value="${diagnose.patientBirthday}" /></td> --%>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">年&nbsp;&nbsp;&nbsp;&nbsp;龄</td>
						<td width="329"><input type="text" class="input14" id="age"
							value="${patientReport.age}岁" /></td>
						<td width="67" style="line-height: 30px;">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
						<td width="329"><input type="text" class="input14"
							id="sexName" value="${patientReport.sexName}" /></td>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">检测项目</td>
						<td width="329">
							<%-- <input type="text" class="input14" readonly="readonly" id=itemName value="${patientReport.itemName}" /> --%>
							<select id=itemName class="l_270" id="cancerTypes"
							style="width: 268px; margin-top: 10px; height: 30px;">
								<option value="">请选择</option>
								<c:forEach var="cancerTypes" items="${cancerTypes}">
									<option
										<c:if test="${cancerTypes.name == patientReport.itemName}">selected="selected"</c:if>
										value="${cancerTypes.code}">${cancerTypes.name}</option>
								</c:forEach>
						</select>
						</td>
						<td width="67" style="line-height: 30px;">采血日期</td>
						<td width="329"><input type="text" class="input14"
							id="attrDate"
							value='<fmt:formatDate value="${patientReport.attrDate}" pattern="YYYY-MM-dd"/>' /></td>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">标本类型</td>
						<td width="329"><input type="text" class="input14"
							id="sampleType" value="${patientReport.sampleType}" /></td>
						<td width="67" style="line-height: 30px;">标本性状</td>
						<td width="329"><input type="text" class="input14"
							id="sampleChar" value="${patientReport.sampleChar}" /></td>
					</tr>
					<tr height="40" valign="bottom">
						<td colspan="4"><strong>数据报告</strong>（${patientReport.attrStr2}）</td>
					</tr>
				</table>

				<table cellpadding="0" cellspacing="0" border="0" width="773"
					id="resultInformation">
					<tr height="40" valign="bottom"
						style="border-bottom: 1px solid; font-weight: bolder;">
						<td width="80" style="line-height: 30px;">简称</td>
						<td width="120" style="line-height: 30px;">项目</td>
						<td width="80" style="line-height: 30px;">结果</td>
						<td width="80" style="line-height: 30px;">提示</td>
						<td width="160" style="line-height: 30px;">参考值</td>
						<td width="80" style="line-height: 30px;">单位</td>
					</tr>
					<c:forEach items="${prdList}" var="prd">
						<tr height="40" valign="bottom">
							<td width="80">${prd.itemName_EN}</td>
							<td width="120">${prd.itemName_CN}</td>
							<td width="80">${prd.result}</td>
							<td width="80"><c:if test="${prd.resultHint == 'z'}">正常</c:if>
								<c:if test="${prd.resultHint == 'd'}">低↓</c:if> <c:if
									test="${prd.resultHint == 'g'}">高↑</c:if></td>
							<td width="160">${prd.resultReference}</td>
							<td width="80">${prd.resultUnit}</td>
						</tr>
					</c:forEach>
				</table>

				<table cellpadding="0" cellspacing="0" border="0" width="773"
					id="otherInformation">
					<tr height="40" valign="bottom">
					</tr>
					<tr height="40" valign="bottom">
						<td align="center" colspan="3" width="67"
							style="line-height: 30px;">
							注：本结果仅对检测标本负责，供临床参考，如有疑问请在标本保存期内提出</td>
					</tr>
					<tr height="40" valign="bottom">
						<td width="67" style="line-height: 30px;">检测诊所</td>
						<td width="329"><input type="text" class="input14"
							style="width: 660px;" readonly="readonly"
							value="${patientReport.hospitalName}" /></td>
					</tr>
					<tr height="10" valign="bottom">
					</tr>
					<tr height="40" valign="bottom" align="left">
						<td width="67" style="line-height: 30px;">检测结果</td>
						<td width="329"><textarea id="doctorResult"
								style="border: 1px solid #e4e4e3; width: 660px; height: 200px;">${patientReport.doctorResult}</textarea>
						</td>
					</tr>

					<tr height="92" valign="bottom">
						<td width="67">&nbsp;</td>
						<td colspan="3" width="706" style="text-align: center;">
							<button onclick="saveDoctorResult();"
								class="button button-primary button-rounded button-small"
								style="margin: 0 80px 30px 0;">保存</button>
							<button onclick="lh.back();"
								class="button button-primary button-rounded button-small"
								style="margin: 0 80px 30px 0;">返回</button>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>

	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_back_js.htm"%>
	<%@ include file="/views/common/common_upload_js.htm"%>
	<script type="text/javascript">
  		lh.paramJsonStr = '${paramJson}';
  	</script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript"
		src="/js/back/domain/user/patientReportDetail.js" title="v"></script>
</body>
</html>