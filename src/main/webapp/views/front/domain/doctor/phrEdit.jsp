<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/meta_info.htm"%>
<%@ include file="/views/common/common_css.htm"%>
<link rel="stylesheet" type="text/css" href="/css/front/style.css"
	title="v" />
<link rel="stylesheet" type="text/css"
	href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
</head>
<body>
	<%@ include file="/views/front/common/doctor/top.htm"%>
	<div class="pz_main">
		<%@ include file="/views/front/common/doctor/doctorTop.htm"%>
		<!-- 顶部菜单栏 -->
		<div class="w_1000">
			<%@ include file="/views/front/common/doctor/doctorLeft.htm"%><!-- 左边菜单栏 -->
			<div class="w_851">
				<div class="c_851">
					<div class="t_851_2">编辑社区居民健康档案</div>
					<div id="mainDiv" class="l_849">
						<input type="hidden" id="patientId" value="${phrBasicInfo.patientId }" />
						<input type="hidden" id="phrId" value="${phrBasicInfo.id }" /> 
						<table cellpadding="0" cellspacing="0" border="0" width="773">
							<tr height="50" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>姓名</td>
								<td width="310"><input type="text" class="input14"
									id="name" value="${phrBasicInfo.name }" placeholder='双击可关联患者' /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>编号</td>
								<td width="310"><input type="text" class="input14"
									id="userNo" value="${phrBasicInfo.userNo }"/></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>性别</td>
								<td width="329"><select class="input8" id="sex" style="width: 268px;">
											<option value="未说明的性别" ${phrBasicInfo.sex == '未说明的性别' ? 'selected' : '' }>--未说明的性别--</option>
											<option value="男" ${phrBasicInfo.sex == '男' ? 'selected' : '' }>男</option>
											<option value="女" ${phrBasicInfo.sex == '女' ? 'selected' : '' }>女</option>
											<option value="未知的性别" ${phrBasicInfo.sex == '未知的性别' ? 'selected' : '' }>未知的性别</option>
								</select></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>出生日期</td>
								<td width="329"><input type="text" class="input14"
									id="birthday" value='<fmt:formatDate pattern="yyyy-MM-dd" value="${phrBasicInfo.birthday }" />' /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>身份证号</td>
								<td width="310"><input type="text" class="input14"
									id="idCardNo" value="${phrBasicInfo.idCardNo }" placeholder="不写，默认是‘无’" /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>工作单位</td>
								<td width="310"><input type="text" class="input14"
									id="workUnit" value="${phrBasicInfo.workUnit }" placeholder="不写，默认是‘无’" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">本人电话</td>
								<td width="310"><input value="${phrBasicInfo.tel }" type="text" class="input14"
									id="tel" /></td>
								<td width="67" style="line-height: 30px;">联系人</td>
								<td width="310"><input value="${phrBasicInfo.linkman }" type="text" class="input14"
									id="linkman" /></td>
							</tr>
							<tr height="40" valign="bottom">
							<td width="67" style="line-height: 30px;">联系人电话</td>
								<td width="329"><input value="${phrBasicInfo.linkmanTel}" type="text" class="input14"
									id="linkmanTel" /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>常住类型</td>
								<td width="329"><select class="input8" id="residentType" style="width: 268px;">
											<option value="">--请选择--</option>
											<option value="户籍" ${phrBasicInfo.residentType == '户籍' ? 'selected' : '' }>户籍</option>
											<option value="非户籍" ${phrBasicInfo.residentType == '非户籍' ? 'selected' : '' }>非户籍</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">民族</td>
									<td width="329">
									${phrBasicInfo.nation }
										<input type="radio"  name="nation" value="汉族" ${phrBasicInfo.nation == '汉族' ? 'checked' : '' } /> 汉族
										<input type="radio" name="nation" value="其他" ${phrBasicInfo.nation == '其他' ? 'checked' : '' } /> 其他
										<input type="text" id="nationName" value="${phrBasicInfo.nationName }">
									</td>
									<td width="67" style="line-height: 30px;">血型</td>
									<td width="329"><select class="input8" id="bloodType" style="width: 268px;">
												<option value="不详" ${phrBasicInfo.bloodType == '不详' ? 'selected' : '' }>--不详--</option>
												<option value="A型" ${phrBasicInfo.bloodType == 'A型' ? 'selected' : '' }>A型</option>
												<option value="B型" ${phrBasicInfo.bloodType == 'B型' ? 'selected' : '' }>B型</option>
												<option value="O型" ${phrBasicInfo.bloodType == 'O型' ? 'selected' : '' }>O型</option>
												<option value="AB型" ${phrBasicInfo.bloodType == 'AB型' ? 'selected' : '' }>AB型</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">RH阴性</td>
									<td width="329"><select class="input8" id="rhType" style="width: 268px;">
												<option value="不详" ${phrBasicInfo.rhType == '不详' ? 'selected' : '' }>--不详--</option>
												<option value="否" ${phrBasicInfo.rhType == '否' ? 'selected' : '' }>否</option>
												<option value="是" ${phrBasicInfo.rhType == '是' ? 'selected' : '' }>是</option>
								</select></td>
								<td width="67" style="line-height: 30px;">文化程度</td>
									<td width="329"><select class="input8" id="degree" style="width: 268px;">
												<option value="不详" ${phrBasicInfo.degree == '不详' ? 'selected' : '' }>--不详--</option>
												<option value="文盲及半文盲" ${phrBasicInfo.degree == '文盲及半文盲' ? 'selected' : '' }>文盲及半文盲</option>
												<option value="小学" ${phrBasicInfo.degree == '小学' ? 'selected' : '' }>小学</option>
												<option value="初中" ${phrBasicInfo.degree == '初中' ? 'selected' : '' }>初中</option>
												<option value="高中/技校/中专" ${phrBasicInfo.degree == '高中/技校/中专' ? 'selected' : '' }>高中/技校/中专</option>
												<option value="大学专科及以上" ${phrBasicInfo.degree == '大学专科及以上' ? 'selected' : '' }>大学专科及以上</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">职业</td>
									<td width="329"><select class="input8" id="profession" style="width: 268px;">
												<option value="不便分类的其他从业人员" ${phrBasicInfo.profession == '不便分类的其他从业人员' ? 'selected' : '' }>--不便分类的其他从业人员--</option>
												<option value="国家机关、党群组织、企业、事业单位负责人" ${phrBasicInfo.profession == '国家机关、党群组织、企业、事业单位负责人' ? 'selected' : '' }>国家机关、党群组织、企业、事业单位负责人</option>
												<option value="专业技术人员" ${phrBasicInfo.profession == '专业技术人员' ? 'selected' : '' }>专业技术人员</option>
												<option value="办事人员和有关人员" ${phrBasicInfo.profession == '办事人员和有关人员' ? 'selected' : '' }>办事人员和有关人员</option>
												<option value="商业、服务业人员" ${phrBasicInfo.profession == '商业、服务业人员' ? 'selected' : '' }>商业、服务业人员</option>
												<option value="农、林、牧、渔、水利业生产人员" ${phrBasicInfo.profession == '农、林、牧、渔、水利业生产人员' ? 'selected' : '' }>农、林、牧、渔、水利业生产人员</option>
												<option value="生产、运输设备操作人员及有关人员" ${phrBasicInfo.profession == '生产、运输设备操作人员及有关人员' ? 'selected' : '' }>生产、运输设备操作人员及有关人员</option>
												<option value="军人">军人</option>
								</select></td>
								<td width="67" style="line-height: 30px;">婚姻状况</td>
									<td width="329"><select class="input8" id="maritalStatus" style="width: 268px;">
												<option value="未说明的婚姻状况" ${phrBasicInfo.maritalStatus == '未说明的婚姻状况' ? 'selected' : '' }>--未说明的婚姻状况--</option>
												<option value="未婚" ${phrBasicInfo.maritalStatus == '未婚' ? 'selected' : '' }>未婚</option>
												<option value="已婚" ${phrBasicInfo.maritalStatus == '已婚' ? 'selected' : '' }>已婚</option>
												<option value="丧偶" ${phrBasicInfo.maritalStatus == '丧偶' ? 'selected' : '' }>丧偶</option>
												<option value="离婚" ${phrBasicInfo.maritalStatus == '离婚' ? 'selected' : '' }>离婚</option>
								</select></td>
								<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">医疗费用支付方式</td>
									<td width="329"><select class="input8" id="payType" style="width: 268px;">
												<option value="">--请选择--</option>
												<option value="城镇职工基本医疗保险" ${phrBasicInfo.payType == '城镇职工基本医疗保险' ? 'selected' : '' }>城镇职工基本医疗保险</option>
												<option value="城镇居民基本医疗保险" ${phrBasicInfo.payType == '城镇居民基本医疗保险' ? 'selected' : '' }>城镇居民基本医疗保险</option>
												<option value="新型农村合作医疗" ${phrBasicInfo.payType == '新型农村合作医疗' ? 'selected' : '' }>新型农村合作医疗</option>
												<option value="贫困救助" ${phrBasicInfo.payType == '贫困救助' ? 'selected' : '' }>贫困救助</option>
												<option value="商业医疗保险" ${phrBasicInfo.payType == '商业医疗保险' ? 'selected' : '' }>商业医疗保险</option>
												<option value="全公费" ${phrBasicInfo.payType == '全公费' ? 'selected' : '' }>全公费</option>
												<option value="全自费" ${phrBasicInfo.payType == '全自费' ? 'selected' : '' }>全自费</option>
								</select></td>
								<td width="67" style="line-height: 30px;">遗传病史</td>
									<td width="329">
										<input type="text" id="ycbs" class="input14" value="${phrBasicInfo.ycbs }" placeholder="多个用，号分割，默认为无" />
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">暴露史</td>
									<td width="329">
										<input type="checkbox" name="bls" value="无" ${fn:contains(phrBasicInfo.bls, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="bls" value="化学品" ${fn:contains(phrBasicInfo.bls, '化学品') ? 'checked' : '' }/>化学品
										<input type="checkbox" name="bls" value="毒物" ${fn:contains(phrBasicInfo.bls, '毒物') ? 'checked' : '' }/>毒物
										<input type="checkbox" name="bls" value="射线" ${fn:contains(phrBasicInfo.bls, '射线') ? 'checked' : '' }/>射线
									</td>
									<td width="67" style="line-height: 30px;">药物过敏史</td>
									<td width="329">
										<input type="checkbox" name="ywgms" value="无" ${fn:contains(phrBasicInfo.ywgms, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="ywgms" value="青霉素" ${fn:contains(phrBasicInfo.ywgms, '青霉素') ? 'checked' : '' } />青霉素
										<input type="checkbox" name="ywgms" value="磺胺" ${fn:contains(phrBasicInfo.ywgms, '磺胺') ? 'checked' : '' }/>磺胺
										<input type="checkbox" name="ywgms" value="链霉素" ${fn:contains(phrBasicInfo.ywgms, '链霉素') ? 'checked' : '' }/>链霉素
										<input type="text" name="ywgmsName" style="display:none" placeholder="其他，多个用，号分割" />
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">父亲</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsFq" value="无" ${fn:contains(phrBasicInfo.jzsFq, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="jzsFq" value="高血压" ${fn:contains(phrBasicInfo.jzsFq, '高血压') ? 'checked' : '' } />高血压
										<input type="checkbox" name="jzsFq" value="糖尿病" ${fn:contains(phrBasicInfo.jzsFq, '糖尿病') ? 'checked' : '' }/>糖尿病
										<input type="checkbox" name="jzsFq" value="冠心病" ${fn:contains(phrBasicInfo.jzsFq, '冠心病') ? 'checked' : '' }/>冠心病
										<input type="checkbox" name="jzsFq" value="慢性阻塞性肺疾病" ${fn:contains(phrBasicInfo.jzsFq, '慢性阻塞性肺疾病') ? 'checked' : '' }/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsFq" value="恶性肿瘤" ${fn:contains(phrBasicInfo.jzsFq, '恶性肿瘤') ? 'checked' : '' }/>恶性肿瘤
										<input type="checkbox" name="jzsFq" value="脑卒中" ${fn:contains(phrBasicInfo.jzsFq, '脑卒中') ? 'checked' : '' }/>脑卒中
										<input type="checkbox" name="jzsFq" value="重性精神疾病" ${fn:contains(phrBasicInfo.jzsFq, '重性精神疾病') ? 'checked' : '' }/>重性精神疾病
										<input type="checkbox" name="jzsFq" value="结核病" ${fn:contains(phrBasicInfo.jzsFq, '结核病') ? 'checked' : '' }/>结核病
										<input type="checkbox" name="jzsFq" value="肝炎" ${fn:contains(phrBasicInfo.jzsFq, '肝炎') ? 'checked' : '' }/>肝炎
										<input type="checkbox" name="jzsFq" value="先天畸形" ${fn:contains(phrBasicInfo.jzsFq, '先天畸形') ? 'checked' : '' }/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">母亲</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsMq" value="无" ${fn:contains(phrBasicInfo.jzsMq, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="jzsMq" value="高血压" ${fn:contains(phrBasicInfo.jzsMq, '高血压') ? 'checked' : '' } />高血压
										<input type="checkbox" name="jzsMq" value="糖尿病" ${fn:contains(phrBasicInfo.jzsMq, '糖尿病') ? 'checked' : '' } />糖尿病
										<input type="checkbox" name="jzsMq" value="冠心病" ${fn:contains(phrBasicInfo.jzsMq, '冠心病') ? 'checked' : '' }/>冠心病
										<input type="checkbox" name="jzsMq" value="慢性阻塞性肺疾病" ${fn:contains(phrBasicInfo.jzsMq, '慢性阻塞性肺疾病') ? 'checked' : '' }/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsMq" value="恶性肿瘤" ${fn:contains(phrBasicInfo.jzsMq, '恶性肿瘤') ? 'checked' : '' }/>恶性肿瘤
										<input type="checkbox" name="jzsMq" value="脑卒中" ${fn:contains(phrBasicInfo.jzsMq, '脑卒中') ? 'checked' : '' }/>脑卒中
										<input type="checkbox" name="jzsMq" value="重性精神疾病" ${fn:contains(phrBasicInfo.jzsMq, '重性精神疾病') ? 'checked' : '' }/>重性精神疾病
										<input type="checkbox" name="jzsMq" value="结核病" ${fn:contains(phrBasicInfo.jzsMq, '结核病') ? 'checked' : '' }/>结核病
										<input type="checkbox" name="jzsMq" value="肝炎" ${fn:contains(phrBasicInfo.jzsMq, '肝炎') ? 'checked' : '' }/>肝炎
										<input type="checkbox" name="jzsMq" value="先天畸形" ${fn:contains(phrBasicInfo.jzsMq, '先天畸形') ? 'checked' : '' }/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
							<td width="67" style="line-height: 30px;">兄弟姐妹</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsXdjm" value="无" ${fn:contains(phrBasicInfo.jzsXdjm, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="jzsXdjm" value="高血压" ${fn:contains(phrBasicInfo.jzsXdjm, '高血压') ? 'checked' : '' } />高血压
										<input type="checkbox" name="jzsXdjm" value="糖尿病" ${fn:contains(phrBasicInfo.jzsXdjm, '糖尿病') ? 'checked' : '' } />糖尿病
										<input type="checkbox" name="jzsXdjm" value="冠心病" ${fn:contains(phrBasicInfo.jzsXdjm, '冠心病') ? 'checked' : '' }/>冠心病
										<input type="checkbox" name="jzsXdjm" value="慢性阻塞性肺疾病" ${fn:contains(phrBasicInfo.jzsXdjm, '慢性阻塞性肺疾病') ? 'checked' : '' }/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsXdjm" value="恶性肿瘤" ${fn:contains(phrBasicInfo.jzsXdjm, '恶性肿瘤') ? 'checked' : '' }/>恶性肿瘤
										<input type="checkbox" name="jzsXdjm" value="脑卒中" ${fn:contains(phrBasicInfo.jzsXdjm, '脑卒中') ? 'checked' : '' }/>脑卒中
										<input type="checkbox" name="jzsXdjm" value="重性精神疾病" ${fn:contains(phrBasicInfo.jzsXdjm, '重性精神疾病') ? 'checked' : '' }/>重性精神疾病
										<input type="checkbox" name="jzsXdjm" value="结核病" ${fn:contains(phrBasicInfo.jzsXdjm, '结核病') ? 'checked' : '' }/>结核病
										<input type="checkbox" name="jzsXdjm" value="肝炎" ${fn:contains(phrBasicInfo.jzsXdjm, '肝炎') ? 'checked' : '' }/>肝炎
										<input type="checkbox" name="jzsXdjm" value="先天畸形" ${fn:contains(phrBasicInfo.jzsXdjm, '先天畸形') ? 'checked' : '' }/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">子女</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsZn" value="无" ${fn:contains(phrBasicInfo.jzsZn, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="jzsZn" value="高血压" ${fn:contains(phrBasicInfo.jzsZn, '高血压') ? 'checked' : '' } />高血压
										<input type="checkbox" name="jzsZn" value="糖尿病" ${fn:contains(phrBasicInfo.jzsZn, '糖尿病') ? 'checked' : '' } />糖尿病
										<input type="checkbox" name="jzsZn" value="冠心病" ${fn:contains(phrBasicInfo.jzsZn, '冠心病') ? 'checked' : '' }/>冠心病
										<input type="checkbox" name="jzsZn" value="慢性阻塞性肺疾病" ${fn:contains(phrBasicInfo.jzsZn, '慢性阻塞性肺疾病') ? 'checked' : '' }/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsZn" value="恶性肿瘤" ${fn:contains(phrBasicInfo.jzsZn, '恶性肿瘤') ? 'checked' : '' }/>恶性肿瘤
										<input type="checkbox" name="jzsZn" value="脑卒中" ${fn:contains(phrBasicInfo.jzsZn, '脑卒中') ? 'checked' : '' }/>脑卒中
										<input type="checkbox" name="jzsZn" value="重性精神疾病" ${fn:contains(phrBasicInfo.jzsZn, '重性精神疾病') ? 'checked' : '' }/>重性精神疾病
										<input type="checkbox" name="jzsZn" value="结核病" ${fn:contains(phrBasicInfo.jzsZn, '结核病') ? 'checked' : '' }/>结核病
										<input type="checkbox" name="jzsZn" value="肝炎" ${fn:contains(phrBasicInfo.jzsZn, '肝炎') ? 'checked' : '' }/>肝炎
										<input type="checkbox" name="jzsZn" value="先天畸形" ${fn:contains(phrBasicInfo.jzsZn, '先天畸形') ? 'checked' : '' }/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">残疾情况</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="cjqk" value="无" ${fn:contains(phrBasicInfo.cjqk, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="cjqk" value="视力残疾" ${fn:contains(phrBasicInfo.cjqk, '视力残疾') ? 'checked' : '' } />视力残疾
										<input type="checkbox" name="cjqk" value="听力残疾" ${fn:contains(phrBasicInfo.cjqk, '听力残疾') ? 'checked' : '' }/>听力残疾
										<input type="checkbox" name="cjqk" value="言语残疾" ${fn:contains(phrBasicInfo.cjqk, '言语残疾') ? 'checked' : '' }/>言语残疾
										<input type="checkbox" name="cjqk" value="肢体残疾" ${fn:contains(phrBasicInfo.cjqk, '肢体残疾') ? 'checked' : '' }/>肢体残疾
										<input type="checkbox" name="cjqk" value="智力残疾" ${fn:contains(phrBasicInfo.cjqk, '智力残疾') ? 'checked' : '' }/>智力残疾
										<input type="checkbox" name="cjqk" value="精神残疾" ${fn:contains(phrBasicInfo.cjqk, '精神残疾') ? 'checked' : '' }/>精神残疾
										<input type="checkbox" name="cjqk" value="其他残疾" ${fn:contains(phrBasicInfo.cjqk, '其他残疾') ? 'checked' : '' }/>其他残疾
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">厨房排风</td>
									<td width="329">
										<input type="checkbox" name="shhjCfpfss" value="无" ${fn:contains(phrBasicInfo.shhjCfpfss, '无') ? 'checked' : '' } />无
										<input type="checkbox" name="shhjCfpfss" value="油烟机" ${fn:contains(phrBasicInfo.shhjCfpfss, '油烟机') ? 'checked' : '' } />油烟机
										<input type="checkbox" name="shhjCfpfss" value="换气扇" ${fn:contains(phrBasicInfo.shhjCfpfss, '换气扇') ? 'checked' : '' } />换气扇
										<input type="checkbox" name="shhjCfpfss" value="烟囱" ${fn:contains(phrBasicInfo.shhjCfpfss, '烟囱') ? 'checked' : '' }/>烟囱
									</td>
									<td width="67" style="line-height: 30px;">禽畜栏</td>
									<td width="329">
										<input type="checkbox" name="shhjQcl" value="单设" ${fn:contains(phrBasicInfo.shhjQcl, '单设') ? 'checked' : '' } />单设
										<input type="checkbox" name="shhjQcl" value="室内" ${fn:contains(phrBasicInfo.shhjQcl, '室内') ? 'checked' : '' }/>室内
										<input type="checkbox" name="shhjQcl" value="室外" ${fn:contains(phrBasicInfo.shhjQcl, '室外') ? 'checked' : '' }/>室外
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">燃料类型</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjRllx" value="液化气" ${fn:contains(phrBasicInfo.shhjRllx, '液化气') ? 'checked' : '' } />液化气
										<input type="checkbox" name="shhjRllx" value="煤" ${fn:contains(phrBasicInfo.shhjRllx, '煤') ? 'checked' : '' }/>煤
										<input type="checkbox" name="shhjRllx" value="天然气" ${fn:contains(phrBasicInfo.shhjRllx, '天然气') ? 'checked' : '' }/>天然气
										<input type="checkbox" name="shhjRllx" value="沼气 " ${fn:contains(phrBasicInfo.shhjRllx, '沼气') ? 'checked' : '' }/>沼气
										<input type="checkbox" name="shhjRllx" value="柴火" ${fn:contains(phrBasicInfo.shhjRllx, '柴火') ? 'checked' : '' }/>柴火
										<input type="checkbox" name="shhjRllx" value="其他" ${fn:contains(phrBasicInfo.shhjRllx, '其他') ? 'checked' : '' }/>其他
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">饮水</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjYs" value="自来水" ${fn:contains(phrBasicInfo.shhjYs, '自来水') ? 'checked' : '' } />自来水
										<input type="checkbox" name="shhjYs" value="经净化过滤的水" ${fn:contains(phrBasicInfo.shhjYs, '经净化过滤的水') ? 'checked' : '' }/>经净化过滤的水
										<input type="checkbox" name="shhjYs" value="井水" ${fn:contains(phrBasicInfo.shhjYs, '井水') ? 'checked' : '' }/>井水
										<input type="checkbox" name="shhjYs" value="河湖水" ${fn:contains(phrBasicInfo.shhjYs, '河湖水') ? 'checked' : '' }/>河湖水
										<input type="checkbox" name="shhjYs" value="塘水" ${fn:contains(phrBasicInfo.shhjYs, '塘水') ? 'checked' : '' }/>塘水
										<input type="checkbox" name="shhjYs" value="其他" ${fn:contains(phrBasicInfo.shhjYs, '其他') ? 'checked' : '' }/>其他
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">厕所</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjCs" value="卫生厕所" ${fn:contains(phrBasicInfo.shhjCs, '卫生厕所') ? 'checked' : '' } />卫生厕所
										<input type="checkbox" name="shhjCs" value="一格或二格粪池式" ${fn:contains(phrBasicInfo.shhjCs, '一格或二格粪池式') ? 'checked' : '' }/>一格或二格粪池式
										<input type="checkbox" name="shhjCs" value="马桶" ${fn:contains(phrBasicInfo.shhjCs, '马桶') ? 'checked' : '' }/>马桶
										<input type="checkbox" name="shhjCs" value="露天粪坑" ${fn:contains(phrBasicInfo.shhjCs, '露天粪坑') ? 'checked' : '' }/>露天粪坑
										<input type="checkbox" name="shhjCs" value="简易棚厕" ${fn:contains(phrBasicInfo.shhjCs, '简易棚厕') ? 'checked' : '' }/>简易棚厕
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="758" colspan="4"
									style="border-bottom: 1px solid #f2f2f2; line-height: 36px; font-size: 14px; color: #333333">
									<strong>既往史</strong>
									<div  style="line-height: 20px; word-wrap: break-word; word-break: break-all; overflow: auto;"></div>
								</td>
							</tr>
							<!-- 疾病 -->
							<tr height="40" valign="bottom">
								<td colspan="4">
								<span style="margin-top: 7px;">疾病类型：</span>
									<select id="jbType" class="pre_text" style="width: 150px; float: none;">
										<option value="无">无</option>
										<option value="高血压">高血压</option>
										<option value="糖尿病">糖尿病</option>
										<option value="冠心病">冠心病</option>
										<option value="慢性阻塞性肺疾病">慢性阻塞性肺疾病</option>
										<option value="恶性肿瘤">恶性肿瘤</option>
										<option value="脑卒中">脑卒中</option>
										<option value="重性精神疾病">重性精神疾病</option>
										<option value="结核病">结核病</option>
										<option value="肝炎">肝炎</option>
										<option value="其他法定传染病">其他法定传染病</option>
										<option value="职业病">职业病</option>
										<option value="其他">其他</option>
								</select> <span style="margin-top: 7px;">确诊时间：</span>  
									<input type="text" class="pre_text" id="jbSj"
									style="width: 150px; float: none;" /> <a
									class="sub_but" href="javascript:;"
									onclick="fnAddUI(this, 'jb');"
									style="float: none; padding: 5px 20px;">+</a>
									</td>
									
							</tr>
							<!-- 疾病回显 -->
							<c:if test="${phrBasicInfo.jwsDiseaseDes != '无' && fn:length(phrBasicInfo.jwsDiseaseDes) > 0 }">
								<c:forEach var="one" items="${fn:split(phrBasicInfo.jwsDiseaseDes, ',') }">
											<tr height="40" valign="bottom" type="dynamic_gen_jb">
												<td colspan="4">
												<span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>
													<input value="${fn:split(one, ';')[0] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													 <span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  
													<input value="${fn:split(one, ';')[1] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													&nbsp;<a class="sub_but" href="javascript:;"
													onclick="$(this).parent().parent().remove();"
													style="float: none; padding: 5px 20px;"><font color=red>x</font></a>
													</td>
											</tr>						
								</c:forEach>							
							</c:if>
							
							<!-- 手术 -->
							<tr height="40" valign="bottom">
								<td colspan="4">
								<span style="margin-top: 7px;">手术名称：</span>
									<input type="text" value="无" class="pre_text" id="shType"
									style="width: 150px; float: none;" />
								 <span style="margin-top: 7px;">手术时间：</span>  
									<input type="text" class="pre_text" id="shSj"
									style="width: 150px; float: none;" /> <a
									class="sub_but" href="javascript:;"
									onclick="fnAddUI(this, 'sh');"
									style="float: none; padding: 5px 20px;">+</a>
									</td>
									
							</tr>
							
							<!-- 手术回显 -->
							<c:if test="${phrBasicInfo.jwsOperationDes != '无' && fn:length(phrBasicInfo.jwsOperationDes) > 0 }">
								<c:forEach var="one" items="${fn:split(phrBasicInfo.jwsOperationDes, ',') }">
											<tr height="40" valign="bottom" type="dynamic_gen_sh">
												<td colspan="4">
												<span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>
													<input value="${fn:split(one, ';')[0] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													 <span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  
													<input value="${fn:split(one, ';')[1] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													&nbsp;<a class="sub_but" href="javascript:;"
													onclick="$(this).parent().parent().remove();"
													style="float: none; padding: 5px 20px;"><font color=red>x</font></a>
													</td>
											</tr>						
								</c:forEach>							
							</c:if>
							
							<!-- 外伤 -->
							<tr height="40" valign="bottom">
								<td colspan="4">
								<span style="margin-top: 7px;">外伤名称：</span>
									<input type="text" value="无" class="pre_text" id="wsType"
									style="width: 150px; float: none;" />
								 <span style="margin-top: 7px;">外伤时间：</span>  
									<input type="text" class="pre_text" id="wsSj"
									style="width: 150px; float: none;" /> <a
									class="sub_but" href="javascript:;"
									onclick="fnAddUI(this, 'ws');"
									style="float: none; padding: 5px 20px;">+</a>
									</td>
									
							</tr>
							
							<!-- 外伤回显 -->
							<c:if test="${phrBasicInfo.jwsTraumaDes != '无' && fn:length(phrBasicInfo.jwsTraumaDes) > 0 }">
								<c:forEach var="one" items="${fn:split(phrBasicInfo.jwsTraumaDes, ',') }">
											<tr height="40" valign="bottom" type="dynamic_gen_ws">
												<td colspan="4">
												<span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>
													<input value="${fn:split(one, ';')[0] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													 <span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  
													<input value="${fn:split(one, ';')[1] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													&nbsp;<a class="sub_but" href="javascript:;"
													onclick="$(this).parent().parent().remove();"
													style="float: none; padding: 5px 20px;"><font color=red>x</font></a>
													</td>
											</tr>						
								</c:forEach>							
							</c:if>
							
							<!-- 输血 -->
							<tr height="40" valign="bottom">
								<td colspan="4">
								<span style="margin-top: 7px;">输血名称：</span>
									<input type="text" value="无" class="pre_text" id="sxType"
									style="width: 150px; float: none;" />
								 <span style="margin-top: 7px;">输血时间：</span>  
									<input type="text" class="pre_text" id="sxSj"
									style="width: 150px; float: none;" /> <a
									class="sub_but" href="javascript:;"
									onclick="fnAddUI(this, 'sx');"
									style="float: none; padding: 5px 20px;">+</a>
									</td>
									
							</tr>
							
							<!-- 输血回显 -->
							<c:if test="${phrBasicInfo.jwsTransfusionDes != '无' && fn:length(phrBasicInfo.jwsTransfusionDes) > 0 }">
								<c:forEach var="one" items="${fn:split(phrBasicInfo.jwsTransfusionDes, ',') }">
											<tr height="40" valign="bottom" type="dynamic_gen_sx">
												<td colspan="4">
												<span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>
													<input value="${fn:split(one, ';')[0] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													 <span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  
													<input value="${fn:split(one, ';')[1] }" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />
													&nbsp;<a class="sub_but" href="javascript:;"
													onclick="$(this).parent().parent().remove();"
													style="float: none; padding: 5px 20px;"><font color=red>x</font></a>
													</td>
											</tr>						
								</c:forEach>							
							</c:if>
							
							<tr height="92" valign="bottom">
								<td width="67">&nbsp;</td>
								<td colspan="3" width="706">
									<input type="submit" class="sub_fil hover" value="编辑"
										style="margin-left: 165px;" onclick="fnEditPhr(this);" />
									<input type="submit" style="margin-left: 240px;"
										class="sub_fil" value="取消" onclick="lh.back();" />
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
	<%@ include file="/views/common/common_front_js.htm"%>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript"
		src="/js/front/domain/doctor/doctorCommon.js" title="v"></script>
		<script type="text/javascript"
		src="/third-party/layer/layer.js" title="v"></script>
		<script type="text/javascript"
		src="/third-party/z.js" title="v"></script>
	<script type="text/javascript"
		src="/js/front/domain/doctor/phrEdit.js" title="v"></script>
</body>
</html>

