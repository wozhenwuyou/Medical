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
					<div class="t_851_2">添加社区居民健康档案</div>
					<div id="mainDiv" class="l_849">
						<input type="hidden" id="patientId" /> 
						<table cellpadding="0" cellspacing="0" border="0" width="773">
							<tr height="50" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>姓名</td>
								<td width="310"><input type="text" class="input14"
									id="name" placeholder='双击可关联患者' /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>编号</td>
								<td width="310"><input type="text" class="input14"
									id="userNo" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>性别</td>
								<td width="329"><select class="input8" id="sex" style="width: 268px;">
											<option value="未说明的性别">--未说明的性别--</option>
											<option value="男">男</option>
											<option value="女">女</option>
											<option value="未知的性别">未知的性别</option>
								</select></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>出生日期</td>
								<td width="329"><input type="text" class="input14"
									id="birthday" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>身份证号</td>
								<td width="310"><input type="text" class="input14"
									id="idCardNo" placeholder="不写，默认是‘无’" /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>工作单位</td>
								<td width="310"><input type="text" class="input14"
									id="workUnit" placeholder="不写，默认是‘无’" /></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">本人电话</td>
								<td width="310"><input type="text" class="input14"
									id="tel" /></td>
								<td width="67" style="line-height: 30px;">联系人</td>
								<td width="310"><input type="text" class="input14"
									id="linkman" /></td>
							</tr>
							<tr height="40" valign="bottom">
							<td width="67" style="line-height: 30px;">联系人电话</td>
								<td width="329"><input type="text" class="input14"
									id="linkmanTel" /></td>
								<td width="67" style="line-height: 30px;"><span
									style="color: red; font-weight: bolder;">*</span>常住类型</td>
								<td width="329"><select class="input8" id="residentType" style="width: 268px;">
											<option value="">--请选择--</option>
											<option value="户籍">户籍</option>
											<option value="非户籍">非户籍</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">民族</td>
									<td width="329">
										<input type="radio"  name="nation" value="汉族" checked /> 汉族
										<input type="radio" name="nation" value="其他" /> 其他
										<input type="text" id="nationName">
									</td>
									<td width="67" style="line-height: 30px;">血型</td>
									<td width="329"><select class="input8" id="bloodType" style="width: 268px;">
												<option value="不详">--不详--</option>
												<option value="A型">A型</option>
												<option value="B型">B型</option>
												<option value="O型">O型</option>
												<option value="AB型">AB型</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">RH阴性</td>
									<td width="329"><select class="input8" id="rhType" style="width: 268px;">
												<option value="不详">--不详--</option>
												<option value="否">否</option>
												<option value="是">是</option>
								</select></td>
								<td width="67" style="line-height: 30px;">文化程度</td>
									<td width="329"><select class="input8" id="degree" style="width: 268px;">
												<option value="不详">--不详--</option>
												<option value="文盲及半文盲">文盲及半文盲</option>
												<option value="B型">小学</option>
												<option value="小学">初中</option>
												<option value="高中/技校/中专">高中/技校/中专</option>
												<option value="大学专科及以上">大学专科及以上</option>
								</select></td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">职业</td>
									<td width="329"><select class="input8" id="profession" style="width: 268px;">
												<option value="不便分类的其他从业人员">--不便分类的其他从业人员--</option>
												<option value="国家机关、党群组织、企业、事业单位负责人">国家机关、党群组织、企业、事业单位负责人</option>
												<option value="专业技术人员">专业技术人员</option>
												<option value="办事人员和有关人员">办事人员和有关人员</option>
												<option value="商业、服务业人员">商业、服务业人员</option>
												<option value="农、林、牧、渔、水利业生产人员">农、林、牧、渔、水利业生产人员</option>
												<option value="生产、运输设备操作人员及有关人员">生产、运输设备操作人员及有关人员</option>
												<option value="军人">军人</option>
								</select></td>
								<td width="67" style="line-height: 30px;">婚姻状况</td>
									<td width="329"><select class="input8" id="maritalStatus" style="width: 268px;">
												<option value="未说明的婚姻状况">--未说明的婚姻状况--</option>
												<option value="未婚">未婚</option>
												<option value="已婚">已婚</option>
												<option value="丧偶">丧偶</option>
												<option value="离婚">离婚</option>
								</select></td>
								<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">医疗费用支付方式</td>
									<td width="329"><select class="input8" id="payType" style="width: 268px;">
												<option value="">--请选择--</option>
												<option value="城镇职工基本医疗保险" >城镇职工基本医疗保险</option>
												<option value="城镇居民基本医疗保险" >城镇居民基本医疗保险</option>
												<option value="新型农村合作医疗" >新型农村合作医疗</option>
												<option value="贫困救助" >贫困救助</option>
												<option value="商业医疗保险" >商业医疗保险</option>
												<option value="全公费" >全公费</option>
												<option value="全自费" >全自费</option>
								</select></td>
								<td width="67" style="line-height: 30px;">遗传病史</td>
									<td width="329">
										<input type="text" id="ycbs" class="input14" placeholder="多个用，号分割，默认为无" />
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">暴露史</td>
									<td width="329">
										<input type="checkbox" name="bls" value="无" checked="checked" />无
										<input type="checkbox" name="bls" value="化学品" />化学品
										<input type="checkbox" name="bls" value="毒物"/>毒物
										<input type="checkbox" name="bls" value="射线"/>射线
									</td>
									<td width="67" style="line-height: 30px;">药物过敏史</td>
									<td width="329">
										<input type="checkbox" name="ywgms" value="无" checked="checked" />无
										<input type="checkbox" name="ywgms" value="青霉素" />青霉素
										<input type="checkbox" name="ywgms" value="磺胺"/>磺胺
										<input type="checkbox" name="ywgms" value="链霉素"/>链霉素
										<input type="text" name="ywgmsName" style="display:none" placeholder="其他，多个用，号分割" />
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">父亲</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsFq" value="无" checked="checked" />无
										<input type="checkbox" name="jzsFq" value="高血压" />高血压
										<input type="checkbox" name="jzsFq" value="糖尿病"/>糖尿病
										<input type="checkbox" name="jzsFq" value="冠心病"/>冠心病
										<input type="checkbox" name="jzsFq" value="慢性阻塞性肺疾病"/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsFq" value="恶性肿瘤"/>恶性肿瘤
										<input type="checkbox" name="jzsFq" value="脑卒中"/>脑卒中
										<input type="checkbox" name="jzsFq" value="重性精神疾病"/>重性精神疾病
										<input type="checkbox" name="jzsFq" value="结核病"/>结核病
										<input type="checkbox" name="jzsFq" value="肝炎"/>肝炎
										<input type="checkbox" name="jzsFq" value="先天畸形"/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
								<td width="67" style="line-height: 30px;">母亲</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsMq" value="无" checked="checked" />无
										<input type="checkbox" name="jzsMq" value="高血压" />高血压
										<input type="checkbox" name="jzsMq" value="糖尿病"/>糖尿病
										<input type="checkbox" name="jzsMq" value="冠心病"/>冠心病
										<input type="checkbox" name="jzsMq" value="慢性阻塞性肺疾病"/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsMq" value="恶性肿瘤"/>恶性肿瘤
										<input type="checkbox" name="jzsMq" value="脑卒中"/>脑卒中
										<input type="checkbox" name="jzsMq" value="重性精神疾病"/>重性精神疾病
										<input type="checkbox" name="jzsMq" value="结核病"/>结核病
										<input type="checkbox" name="jzsMq" value="肝炎"/>肝炎
										<input type="checkbox" name="jzsMq" value="先天畸形"/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
							<td width="67" style="line-height: 30px;">兄弟姐妹</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsXdjm" value="无" checked="checked" />无
										<input type="checkbox" name="jzsXdjm" value="高血压" />高血压
										<input type="checkbox" name="jzsXdjm" value="糖尿病"/>糖尿病
										<input type="checkbox" name="jzsXdjm" value="冠心病"/>冠心病
										<input type="checkbox" name="jzsXdjm" value="慢性阻塞性肺疾病"/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsXdjm" value="恶性肿瘤"/>恶性肿瘤
										<input type="checkbox" name="jzsXdjm" value="脑卒中"/>脑卒中
										<input type="checkbox" name="jzsXdjm" value="重性精神疾病"/>重性精神疾病
										<input type="checkbox" name="jzsXdjm" value="结核病"/>结核病
										<input type="checkbox" name="jzsXdjm" value="肝炎"/>肝炎
										<input type="checkbox" name="jzsXdjm" value="先天畸形"/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">子女</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="jzsZn" value="无" checked="checked" />无
										<input type="checkbox" name="jzsZn" value="高血压" />高血压
										<input type="checkbox" name="jzsZn" value="糖尿病"/>糖尿病
										<input type="checkbox" name="jzsZn" value="冠心病"/>冠心病
										<input type="checkbox" name="jzsZn" value="慢性阻塞性肺疾病"/>慢性阻塞性肺疾病
										<input type="checkbox" name="jzsZn" value="恶性肿瘤"/>恶性肿瘤
										<input type="checkbox" name="jzsZn" value="脑卒中"/>脑卒中
										<input type="checkbox" name="jzsZn" value="重性精神疾病"/>重性精神疾病
										<input type="checkbox" name="jzsZn" value="结核病"/>结核病
										<input type="checkbox" name="jzsZn" value="肝炎"/>肝炎
										<input type="checkbox" name="jzsZn" value="先天畸形"/>先天畸形
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">残疾情况</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="cjqk" value="无" checked="checked" />无
										<input type="checkbox" name="cjqk" value="视力残疾" />视力残疾
										<input type="checkbox" name="cjqk" value="听力残疾"/>听力残疾
										<input type="checkbox" name="cjqk" value="言语残疾"/>言语残疾
										<input type="checkbox" name="cjqk" value="肢体残疾"/>肢体残疾
										<input type="checkbox" name="cjqk" value="智力残疾"/>智力残疾
										<input type="checkbox" name="cjqk" value="精神残疾"/>精神残疾
										<input type="checkbox" name="cjqk" value="其他残疾"/>其他残疾
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">厨房排风</td>
									<td width="329">
										<input type="checkbox" name="shhjCfpfss" value="无" checked="checked" />无
										<input type="checkbox" name="shhjCfpfss" value="油烟机" />油烟机
										<input type="checkbox" name="shhjCfpfss" value="换气扇"/>换气扇
										<input type="checkbox" name="shhjCfpfss" value="烟囱"/>烟囱
									</td>
									<td width="67" style="line-height: 30px;">禽畜栏</td>
									<td width="329">
										<input type="checkbox" name="shhjQcl" value="单设" />单设
										<input type="checkbox" name="shhjQcl" value="室内"/>室内
										<input type="checkbox" name="shhjQcl" value="室外"/>室外
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">燃料类型</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjRllx" value="液化气" />液化气
										<input type="checkbox" name="shhjRllx" value="煤"/>煤
										<input type="checkbox" name="shhjRllx" value="天然气"/>天然气
										<input type="checkbox" name="shhjRllx" value="沼气"/>沼气
										<input type="checkbox" name="shhjRllx" value="柴火"/>柴火
										<input type="checkbox" name="shhjRllx" value="其他"/>其他
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">饮水</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjYs" value="自来水" />自来水
										<input type="checkbox" name="shhjYs" value="经净化过滤的水"/>经净化过滤的水
										<input type="checkbox" name="shhjYs" value="井水"/>井水
										<input type="checkbox" name="shhjYs" value="河湖水"/>河湖水
										<input type="checkbox" name="shhjYs" value="塘水"/>塘水
										<input type="checkbox" name="shhjYs" value="其他"/>其他
									</td>
							</tr>
							<tr height="40" valign="bottom">
									<td width="67" style="line-height: 30px;">厕所</td>
									<td width="329" colspan="3">
										<input type="checkbox" name="shhjCs" value="卫生厕所" />卫生厕所
										<input type="checkbox" name="shhjCs" value="一格或二格粪池式" />一格或二格粪池式
										<input type="checkbox" name="shhjCs" value="马桶"/>马桶
										<input type="checkbox" name="shhjCs" value="露天粪坑"/>露天粪坑
										<input type="checkbox" name="shhjCs" value="简易棚厕"/>简易棚厕
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
							
							<tr height="92" valign="bottom">
								<td width="67">&nbsp;</td>
								<td colspan="3" width="706">
									<input type="submit" class="sub_fil hover" value="完成"
										style="margin-left: 165px;" onclick="fnAddPhr(this);" />
									<input type="submit" style="margin-left: 240px;"
										class="sub_fil" value="返回" onclick="lh.back();" />
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
		src="/js/front/domain/doctor/phrAdd.js" title="v"></script>
</body>
</html>

