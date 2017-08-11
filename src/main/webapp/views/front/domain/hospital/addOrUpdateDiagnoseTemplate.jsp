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
<link rel="STYLESHEET" type="text/css"
	href="/third-party/easyui/themes/default/easyui.css" />
<style>
.play_down span {
	position: relative;
	z-index: 11;
	float: left;
	width: auto;
	height: auto;
	background: #f3f3f3;
	margin-top: 5px;
	margin-right: 5px;
	color: #666666;
	text-align: center;
	line-height: 30px;
	padding: 0px 10px;
}

.textbox {
	border: 1px solid #e4e4e3;
}

.combo-arrow {
	background-color: #e4e4e3;
}
</style>
</head>
<body>
	<%@ include file="/views/front/common/hospital/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/hospital/hospitalTop.htm"%>
		<div class="w_1000">
			<%@ include file="/views/front/common/hospital/hospitalLeft.htm"%><!--左边导航 -->
			<div class="w_851">
				<div class="c_851">
					<div class="t_851_2">病历模板</div>
					<div class="l_849">
						<table cellpadding="0" cellspacing="0" border="0" width="773">
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">建立人</td>
								<c:if test="${!empty diagnoseTemplate.createdBy}">
									<td colspan="3" width="706"><input
										style="width: 695px; border: none;" type="text"
										class="input16" readonly="readonly"
										value="${diagnoseTemplate.createdBy}" /></td>
								</c:if>
								<c:if test="${empty diagnoseTemplate.createdBy}">
									<td colspan="3" width="706"><input
										style="width: 695px; border: none;" type="text"
										class="input16" readonly="readonly"
										value="${hospital.wholeName}" /></td>
								</c:if>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">模板名称</td>
								<td colspan="3" width="706"><input style="width: 695px;"
									type="text" class="input16" id="templateName"
									value="${diagnoseTemplate.templateName}" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">过敏历史</td>
								<td colspan="3" width="706"><input style="width: 695px;"
									type="text" class="input16" id="allergyHistory"
									value="${diagnoseTemplate.allergyHistory}" /></td>
							</tr>
							<tr height="93" valign="bottom">
								<td width="67" style="line-height: 50px;" valign="top">基本病情</td>
								<td colspan="3" width="706"><textarea style="width: 695px;"
										class="text_input" id="baseCondition">${diagnoseTemplate.baseCondition}</textarea></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">添加诊断</td>
								<td colspan="3" width="706"
									style="position: relative; z-index: 111;"><input
									id="tagName" type="text" class="input14" /> <a class="sub_but"
									href="javascript:;" onclick="$('#box1').fadeIn(0);addTag();">添加诊断</a>
									<div class="pf_268">
										<ul>
											<li></li>
										</ul>
									</div></td>
							</tr>
							<tr id="box1" style="">
								<td width="67">
									<!-- 诊断结果 -->&nbsp;
								</td>
								<td colspan="3" width="706">
									<div class="play_down" id="tagsContainer">
										<c:forEach items="${diagnoseTagList}" var="tag" varStatus="s">
											<span id="tagItem_${s.index}" class="tagsItem"> <span
												class="tagName">${tag.tagName}</span> <a href="javascript:"
												onclick="removeTag('${s.index}');" class="pf_6"><img
													src="/images/front/er2.png" width="6" height="6" /></a>
											</span>
										</c:forEach>
									</div>
								</td>
							</tr>
							<tr height="54" valign="bottom">
								<td width="773" colspan="4"
									style="border-bottom: 1px solid #f2f2f2; line-height: 36px; font-size: 14px; color: #333333">
									<strong>开具处方</strong>
									<div id="medicationRemark"
										style="line-height: 20px; height: 64px; word-wrap: break-word; word-break: break-all; overflow: auto;"></div>
								</td>
							</tr>
							<tr height="40" valign="bottom" id="bo_b6">
								<!--  <td width="67" style="line-height:30px;">添加处方</td> -->
								<td colspan="3" width="706"><span class=""
									style="margin-top: 7px;">类型：</span> <select class="pre_text"
									style="width: 150px; float: none;" id="mtSelect"
									onchange="loadMedicationList();">
										<option value="">请选择</option>
										<c:forEach items="${mtList}" var="mt">
											<option value="${mt.id}">${mt.name}</option>
										</c:forEach>
								</select> <span class="" style="margin-top: 7px;">名称：</span> <select
									class="pre_text easyui-combobox"
									style="width: 220px; height: 30px; border: 1px solid #e4e4e3; float: none;"
									id="mSelect"></select> <span class="" style="margin-top: 7px;">数量：</span>
									<input type="number" min="1" class="pre_text"
									style="width: 90px; float: none;" id="medicalNum" /> <a
									class="sub_but" href="javascript:;"
									onclick="$('#box2').fadeIn(0);addPrescription();"
									style="float: none; padding: 5px 20px;">添加</a></td>
							</tr>
							<tr id="box2" style="">
								<td width="67">
									<!-- 处&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;方 -->
								</td>
								<td colspan="3" width="706">
									<div class="prescription">
										<div class="t_706" style="height: auto;"
											id="prescriptionContainer">
											<c:forEach items="${prescriptionList}" var="pres"
												varStatus="s">
												<div id="presItem_${s.index}" class="presItem"
													style="height: 35px;">
													<span class="fl" style="margin-top: 7px;">类型：</span> <span
														class="pre_text medicalType"
														style="width: 150px; border: none;">${pres.medicalType}</span>
													<span class="fl" style="margin-top: 7px;">名称：</span> <span
														class="pre_text medicalName"
														style="width: 220px; border: none;">${pres.medicalName}</span>
													<span class="fl" style="margin-top: 7px;">数量：</span> <span
														class="pre_text medicalNum"
														style="width: 90px; border: none;">${pres.medicalNum}</span>
													<%-- <div class="l_60">药物类型：</div>
			                                    <input type="text" class="pre_text medicalType" value="${pres.medicalType}"/>
			                                    <div class="l_60">药物名称：</div>
			                                    <input type="text" class="pre_text medicalName" value="${pres.medicalName}"/>
			                                    <div class="l_60">药物数量：</div>
			                                    <input type="text" class="pre_text medicalNum" value="${pres.medicalNum}"/> --%>
													<a class="sub_but" href="javascript:;"
														onclick="$('#box2').fadeIn(0);removePrescription('${s.index}');">移除</a>
												</div>
											</c:forEach>
										</div>
									</div>
								</td>
							</tr>
							<tr height="92" valign="bottom">
								<td width="67">&nbsp;</td>
								<td colspan="3" width="706" style="text-align: center;">
									<button style="margin-right: 80px;" type="button"
										onclick="adddiagnoseTemplate(${diagnoseTemplate.id})"
										class="btn btn-info">保存</button>
									<button style="margin-right: 80px;" type="button"
										onclick="lh.back();" class="btn btn-success">返回</button>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="pz_down">
		<%@ include file="/views/front/common/bottom.htm"%><!-- 底部栏 -->
	</div>
	<%@ include file="/views/common/common_js.htm"%>
	<%@ include file="/views/common/common_ueditor_js.htm"%>
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/js/front/domain/hospital/hospitalCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/doctor/diagnoseCommon.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/hospital/addOrUpdateDiagnoseTemplate.js"
		title="v"></script>
	<script type="text/javascript"
		src="/third-party/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="/third-party/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script id="template" type="x-tmpl-mustache">
		<div id="presItem_{{serial}}" class="presItem" style="height:35px;">
			<span class="fl" style="margin-top:7px;">类型：</span><span class="pre_text medicalType" style="width:150px;border:none;">{{medicalType}}</span>
			<span class="fl" style="margin-top:7px;">名称：</span><span class="pre_text medicalName" style="width:220px;border:none;">{{medicalName}}</span>
			<span class="fl" style="margin-top:7px;">数量：</span><span class="pre_text medicalNum" style="width:90px;border:none;">{{medicalNum}}</span>
          	<span class="pre_text medicalId" style="display:none;">{{medicalId}}</span>
			<span class="pre_text medicalTypeId" style="display:none;">{{medicalTypeId}}</span>
			<a class="sub_but" href="javascript:;" onclick="$('#box2').fadeIn(0);removePrescription('{{serial}}',{{medicalId}});">移除</a>
         </div>
	</script>
</body>
</html>
