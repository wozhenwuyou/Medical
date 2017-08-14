<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>&nbsp;</title>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/front/style.css"
	title="v" />
</head>
<body style="min-width: 1000px;">
	<div class="pz_main">
		<div class="w_1000" style="width: 100%;">
			<div class="w_851"
				style="float: none; text-align: center; margin: 0 auto;">
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
									readonly="readonly" value="${patientReport.patientName}" /></td>
								<td width="67" style="line-height: 30px;">条&nbsp;形&nbsp;码</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.adiconBarcode}" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">身份证号</td>
								<td width="310"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.idcardNum}" /></td>
								<td width="67" style="line-height: 30px;">电&nbsp;&nbsp;&nbsp;&nbsp;话</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.patientPhone}" /></td>
								<%-- 	<td width="67" style="line-height: 30px;">出生日期</td>
								<td width="329"><input type="text" class="input14" readonly="readonly" value="${diagnose.patientBirthday}" /></td> --%>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">年&nbsp;&nbsp;&nbsp;&nbsp;龄</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.age}岁" /></td>
								<td width="67" style="line-height: 30px;">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.sexName}" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">检测项目</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.itemName}" /></td>
								<td width="67" style="line-height: 30px;">采血日期</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly"
									value='<fmt:formatDate value="${patientReport.attrDate}" pattern="YYYY-MM-dd"/>' /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">样本种类</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.sampleType}" /></td>
								<td width="67" style="line-height: 30px;">标本性状</td>
								<td width="329"><input type="text" class="input14"
									readonly="readonly" value="${patientReport.sampleChar}" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td colspan="4" align="left"><strong>数据报告</strong>（${patientReport.attrStr2}）</td>
							</tr>
						</table>
						<table cellpadding="0" cellspacing="0" border="0" width="773"
							id="baseInformation">
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

						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		window.print();
	</script>

</body>
</html>
