<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_back_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/back/back.css"
	title="v" />
</head>
<body style="min-width: 900px; margin: 5px;">
	<div>
		<span>
			<!-- 诊所基本信息 -->
		</span>
	</div>
	<div id="hospital_baseInfo" class="easyui-panel"
		title="<center>诊所基本信息</center>"
		style="width: 900px; height: 655px; padding: 5px; background: #fafafa; display: none;"
		data-options="closable:false, collapsible:true,minimizable:false,maximizable:false">
		<table id="dataHospitalObjTable" style="min-width: 890px;">
			<tbody>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>诊所名称：</span><input role="textbox"
						id="f_wholeName" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>诊所类型：</span><input role="combobox"
						id="f_typeId" class="domain-input easyui-combobox width120" /></td>
					<td class="td_pad"><span>地址：</span><input role="textbox"
						id="f_address" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>诊所电话：</span><input role="textbox"
						id="f_phone" class="domain-input easyui-textbox width120" /></td>
				</tr>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>面积：</span><input role="textbox"
						id="f_area" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>负责人姓名：</span><input role="textbox"
						id="f_adminName" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>是否医生：</span><input role="combobox"
						id="f_isDoctor" class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
					<td class="td_pad"><span>是否法人：</span><input role="combobox"
						id="f_isLegalPerson" class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
				</tr>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>年龄区间：</span><input role="textbox"
						id="f_ageBetween" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>联系方式：</span><input role="textbox"
						id="f_contactWay" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>微信号：</span><input role="textbox"
						id="f_weixin" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>诊所声誉：</span><input role="combobox"
						id="f_reputition" class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'优'},{'id':2,'name':'良'},{'id':3,'name':'一般'},{'id':4,'name':'较差'}]" />
					</td>
				</tr>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>医生人数：</span><input role="textbox"
						id="f_doctorNum" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>护士人数：</span><input role="textbox"
						id="f_nurseNum" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>患者流量：</span><input role="textbox"
						id="f_patientFlow" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>药品进货来源：</span><input role="textbox"
						id="f_medicalFrom" class="domain-input easyui-textbox width120" /></td>
				</tr>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>进货方式：</span><input role="textbox"
						id="f_stockway" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>健康档案：</span><input role="combobox"
						id="f_healthDoc" class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'没有'},{'id':2,'name':'有'}]" />
					</td>
					<td class="td_pad"><span>有无宣传广告：</span><input role="combobox"
						id="f_isAdvertisement"
						class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
					<td class="td_pad"><span>床位：</span><input role="textbox"
						id="f_bed" class="domain-input easyui-textbox width120" /></td>
				</tr>
				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>资料是否完整：</span><input role="combobox"
						id="f_haveVisitValid"
						class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
					<td class="td_pad"><span>GPS大数：</span><input role="textbox"
						id="f_gps" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>GPS小数：</span><input role="textbox"
						id="f_qrCode2" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>合作态度：</span><input role="textbox"
						id="f_coporationAttitude"
						class="domain-input easyui-textbox width120" /></td>
				</tr>

				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>是否签合同：</span><input role="combobox"
						id="f_isAssignContract"
						class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
					<td class="td_pad"><span>是否签意向书：</span><input role="combobox"
						id="f_isAssignIntention"
						class="domain-input easyui-combobox width120"
						data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]" />
					</td>
					<td class="td_pad"><span>省(直辖市)：</span><input role="combobox"
						id="f_province" class="domain-input easyui-combobox width120"
						data-options="required:false" /></td>
					<td class="td_pad"><span>市(县)：</span><input role="combobox"
						id="f_city" class="domain-input easyui-combobox width120"
						data-options="required:false" /></td>
				</tr>

				<tr class="tr_ht" align="right">
					<td class="td_pad"><span>卫生条件：</span><input role="combobox"
						id="f_hygienismCondition"
						class="domain-input easyui-combobox width120" /></td>
					<c:if test="${empty notAdmin}">
						<td class="td_pad"><span>创建人：</span><input role="combobox"
							id="f_adminId" class="domain-input easyui-combobox width120"
							data-options="required:false" /></td>
					</c:if>
				</tr>

				<tr class="tr_ht" align="right">
					<td class="td_pad" colspan="4" align="left"><span>其他配套设施：</span><input
						role="combobox" id="f_otherFacility"
						class="domain-input easyui-combobox width120"
						style="width: 570px;" /></td>
					<!-- <td class="td_pad"><span>状态：</span><input role="combobox" id="f_mainStatus" class="domain-input easyui-combobox width120"
					data-options="valueField:'id',textField:'name',editable:false,multiple:false,required:false,panelHeight:'auto',data:[{'id':1,'name':'否'},{'id':2,'name':'是'}]"/>
					</td> -->
				</tr>
				<!-- <td class="td_pad"><span>走访信息：</span><input role="textbox" id="f_visitInfo" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>医生信息：</span><input role="textbox" id="f_doctorinfo" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>护士信息：</span><input role="textbox" id="f_nurseInfo" class="domain-input easyui-textbox width120" /></td>
					<td class="td_pad"><span>合同信息：</span><input role="textbox" id="f_contractInfo" class="domain-input easyui-textbox width120" /></td> -->

				<!-- <tr class="tr_ht" align="left">
				</tr> -->
				<tr class="tr_ht" align="right" style="height: 120px;">
					<td class="td_pad" colspan="5" align="left">
						<div style="display: inline-block;">
							<span>室外照片：</span>
						</div> <input id="f_outdoorPicPaths" style="display: none;" />
						<button id="browse1" type="button"
							class="button button-primary button-rounded button-small">选择照片</button>
						<div style="display: inline-block;" id="upload_outer_div1"></div>
					</td>
				</tr>
				<tr class="tr_ht" align="right" style="height: 120px;">
					<td class="td_pad" colspan="5" align="left">
						<div style="display: inline-block;">
							<span>室内照片：</span>
						</div>
						<button id="browse2" type="button"
							class="button button-primary button-rounded button-small">选择照片</button>
						<div style="display: inline-block;" id="upload_outer_div2"></div>
						<input id="f_indoorPicPaths" style="display: none;" />
					</td>
				</tr>
				<!-- <tr class="tr_ht" align="right">
				</tr> -->
				<tr class="tr_ht" align="right">
					<td class="td_pad" colspan="5" align="center">
						<button id="searchClear" onclick="location.reload();return false;"
							class="button button-primary button-rounded button-small">刷新</button>
						<button id="searchYes"
							onclick="updateDataHospital();return false;"
							class="button button-primary button-rounded button-small">保存</button>
						<!-- <button id="searchYes" onclick="lh.back();return false;" class="button button-primary button-rounded button-small">返回</button> -->
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="clear-both height10"></div>

	<div>
		<span>
			<!-- 诊所走访信息 -->
		</span>
	</div>
	<div id='dataHospitalVisit_datagrid_div' style="width: 900px;">
		<table id="dataHospitalVisit_datagrid"></table>
	</div>

	<div>
		<span>
			<!-- 诊所医生信息 -->
		</span>
	</div>
	<div id='dataHospitalDoctor_datagrid_div' style="width: 900px;">
		<table id="dataHospitalDoctor_datagrid"></table>
	</div>

	<div>
		<span>
			<!-- 诊所护士信息 -->
		</span>
	</div>
	<div id='dataHospitalNurse_datagrid_div' style="width: 900px;">
		<table id="dataHospitalNurse_datagrid"></table>
	</div>

	<div>
		<span>
			<!-- 诊所合同信息 -->
		</span>
	</div>
	<div id='dataHospitalContract_datagrid_div'
		style="width: 900px; margin-bottom: 100px;">
		<table id="dataHospitalContract_datagrid"></table>
	</div>

	<div id="dataHospitalVisitObjWindiv" style="display: none;">
		<div id='dataHospitalVisitObjWin' class="easyui-window" title="走访信息"
			style="width: 680px;"
			data-options="top:670,left:170,modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="dataHospitalVisitObjTip"></div>
			<form id="dataHospitalVisitObjForm">
				<br />
				<table id="dataHospitalVisitObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad" align="left"><span><span
									style="color: red; font-weight: bolder;">*</span>走访日期：</span><input
								role="datebox" id="f_visit_visitDate"
								class="domain-input easyui-datebox width140"
								data-options="required:true,editable:false" /></td>
							<!-- <td class="td_pad" colspan="2" align="left"><span><span style="color:red;font-weight:bolder;"></span>走访次数：</span><input role="textbox" id="f_visit_visitNum" class="domain-input easyui-textbox width140" data-options="required:false"/></td> -->
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>走访分析：</span> <input
								role="textbox" id="f_visit_visitAnalysis"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:200,prompt:'请输入内容',width:570" />
							</td>
						</tr>
					</tbody>
				</table>
			</form>
			<div class="inline-center mgV40">
				<button id="dataHospitalVisitObjSave"
					onclick="saveMainObj('dataHospitalVisit')"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="dataHospitalVisitObjBack"
					onclick="closeMainObjWin('dataHospitalVisit')"
					class="button button-primary button-rounded button-small">返回</button>
			</div>
		</div>
	</div>

	<div id="dataHospitalDoctorObjWindiv" style="display: none;">
		<div id='dataHospitalDoctorObjWin' class="easyui-window" title="医生信息"
			style="width: 680px;"
			data-options="top:970,left:170,modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="dataHospitalDoctorObjTip"></div>
			<form id="dataHospitalDoctorObjForm">
				<br />
				<table id="dataHospitalDoctorObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad" align="left"><span><span
									style="color: red; font-weight: bolder;">*</span>医生姓名：</span><input
								role="textbox" id="f_doctor_realname"
								class="domain-input easyui-textbox width140"
								data-options="required:true" /></td>
							<td class="td_pad" colspan="2" align="left"><span><span
									style="color: red; font-weight: bolder;"></span>联系电话：</span><input
								role="textbox" id="f_doctor_phone"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3" align="right"><span>擅&nbsp;&nbsp;长：</span>
								<input role="textbox" id="f_doctor_goodAt"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:570" />
							</td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>教育背景：</span> <input
								role="textbox" id="f_doctor_educationBackground"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:570" />
							</td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>从业简介：</span> <input
								role="textbox" id="f_doctor_introduction"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:570" />
							</td>
						</tr>

						<tr>
							<td class="td_pad" colspan="5" align="left">
								<div style="display: inline-block;">
									<span>照片：</span>
								</div>
								<button id="browse3" type="button"
									class="button button-primary button-rounded button-small">选择照片</button>
								<div style="display: inline-block;" id="upload_outer_div3"></div>
								<input id="f_attrStr" style="display: none;" />
						</tr>

					</tbody>
				</table>
			</form>
			<div class="inline-center mgV40">
				<button id="dataHospitalDoctorObjSave"
					onclick="saveMainObj('dataHospitalDoctor')"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="dataHospitalDoctorObjBack"
					onclick="closeMainObjWin('dataHospitalDoctor')"
					class="button button-primary button-rounded button-small">返回</button>
			</div>
		</div>
	</div>

	<div id="dataHospitalNurseObjWindiv" style="display: none;">
		<div id='dataHospitalNurseObjWin' class="easyui-window" title="护士信息"
			style="width: 680px;"
			data-options="top:1270,left:170,modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="dataHospitalNurseObjTip"></div>
			<form id="dataHospitalNurseObjForm">
				<br />
				<table id="dataHospitalNurseObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad" align="left"><span><span
									style="color: red; font-weight: bolder;">*</span>护士姓名：</span><input
								role="textbox" id="f_nurse_realname"
								class="domain-input easyui-textbox width140"
								data-options="required:true" /></td>
							<td class="td_pad" colspan="2" align="left"><span><span
									style="color: red; font-weight: bolder;"></span>联系电话：</span><input
								role="textbox" id="f_nurse_phone"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>教育背景：</span> <input
								role="textbox" id="f_nurse_educationBackground"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:570" />
							</td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>从业简介：</span> <input
								role="textbox" id="f_nurse_introduction"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:570" />
							</td>
						</tr>

						<tr>
							<td class="td_pad" colspan="5" align="left">
								<div style="display: inline-block;">
									<span>照片：</span>
								</div>
								<button id="browse4" type="button"
									class="button button-primary button-rounded button-small">选择照片</button>
								<div style="display: inline-block;" id="upload_outer_div4"></div>
								<input id="f_attrStr" style="display: none;" />
						</tr>

					</tbody>
				</table>
			</form>
			<div class="inline-center mgV40">
				<button id="dataHospitalNurseObjSave"
					onclick="saveMainObj('dataHospitalNurse')"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="dataHospitalNurseObjBack"
					onclick="closeMainObjWin('dataHospitalNurse')"
					class="button button-primary button-rounded button-small">返回</button>
			</div>
		</div>
	</div>

	<div id="dataHospitalContractObjWindiv" style="display: none;">
		<div id='dataHospitalContractObjWin' class="easyui-window"
			title="合同信息" style="width: 720px;"
			data-options="top:1480,left:170,modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false">
			<div id="dataHospitalContractObjTip"></div>
			<form id="dataHospitalContractObjForm">
				<br />
				<table id="dataHospitalContractObjTable" class="padL5">
					<tbody>
						<tr class="tr_ht" align="right">
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;">*</span>合同编号：</span><input
								role="textbox" id="f_contract_contractSerial"
								class="domain-input easyui-textbox width140"
								data-options="required:true" /></td>
							<td class="td_pad"><span><span
									style="color: red; font-weight: bolder;"></span>合同开始日期：</span><input
								role="datebox" id="f_contract_contractStartDate"
								class="domain-input easyui-datebox width140"
								data-options="required:false,editable:false" /></td>
							<td class="td_pad"><span>合同期限：</span><input role="textbox"
								id="f_contract_contractTimeLimit"
								class="domain-input easyui-textbox width140"
								data-options="required:false" /></td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>备&nbsp;&nbsp;注：</span>
								<input role="textbox" id="f_contract_remark"
								class="domain-input easyui-textbox"
								data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:600" />
							</td>
						</tr>
						<tr>
							<td class="td_pad" colspan="3"><span>合同附件：</span> <!-- <input role="textbox" id="f_contract_filePaths" class="domain-input easyui-textbox"  data-options="required:false,multiline:true,height:100,prompt:'请输入内容',width:600"/> -->

								<button id="browse" type="button"
									class="button button-primary button-rounded button-small">选择附件</button>
								<div style="display: inline-block; float: left;">
									<input type="hidden" name="filePaths" id="filePaths" /> <input
										type="hidden" name="fileDBIds" id="fileDBIds" />
								</div>
								<div id="upload_outer_div" style="margin-top: 30px;">
									<!-- 上传文件进度展示 -->
								</div>
								<div id="contractFileLinkDiv" style="line-height: 35px;"></div>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
			<div class="inline-center mgV40">
				<button id="dataHospitalContractObjSave"
					onclick="saveMainObj('dataHospitalContract')"
					class="button button-primary button-rounded button-small">保存</button>
				<button id="dataHospitalContractObjBack"
					onclick="closeMainObjWin('dataHospitalContract')"
					class="button button-primary button-rounded button-small">返回</button>
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
		src="/js/back/domain/data/data_sub_common.js" title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/data/upload_hospital_pic1.js" title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/data/upload_hospital_pic2.js" title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/data/upload_hospital_pic3.js" title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/data/upload_hospital_pic4.js" title="v"></script>
	<script type="text/javascript"
		src="/js/back/domain/data/dataHospitalDetail.js" title="v"></script>
</body>
</html>