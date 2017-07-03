<%@page import="com.lhfeiyu.service.PhrArchiveNumberService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.lhfeiyu.po.Admin"%>
<%@page import="com.lhfeiyu.tools.ActionUtil"%>
<%@page import="com.lhfeiyu.po.Doctor"%>
<%@page import="com.lhfeiyu.util.ArchiveUtils"%>
<%@page import="com.lhfeiyu.po.PhrBasicInfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="/third-party/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
<%
String openType = request.getParameter("openType");

if("add".equals(openType)){
	Doctor doctor = ActionUtil.checkSession4Doctor(session);
	if(doctor != null){
		PhrBasicInfo model = new PhrBasicInfo();
		ServletContext context = request.getSession().getServletContext();
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);
		PhrArchiveNumberService phrArchiveNumberService = (PhrArchiveNumberService) ctx.getBean(PhrArchiveNumberService.class);
		model.setUserNo(String.valueOf(phrArchiveNumberService.generateArchiveNumber(doctor.getHospitalId())));
		request.setAttribute("model", model);
	}
}
request.setAttribute("openType", openType);
%>
</head>

<body>
<!--print start-->
<table width="900" border="1" cellspacing="0" cellpadding="0" align="center">
	<input type="hidden" value="${model.patientId }" id="patientId" />
	<input type="hidden" value="${model.id }" id="id" />
  <tbody>
  <tr>
      <td height="40" colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>姓名</td>
      <td height="40" colspan="2" align="left" valign="middle"><input type="text" value="${model.name }" id="name"></td>
      <td height="40" align="left" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>编号</td>
      <td height="40" colspan="2" align="left" valign="middle"><input onblur="fnCheckUserNo(this);" type="text" value="${model.userNo }" id="userNo" style="width:280px;" ></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">性别</td>
      <td height="40" colspan="3" align="left" valign="middle"><p>
        <label>
          <input type="radio" name="sex" value="未知的性别" ${model.sex == '未知的性别' ? 'checked' : '' }>
          未知的性别</label>
        <label>
        <c:choose>
        <c:when test="${model.id != null }">
        	<input type="radio" name="sex" value="男" ${model.sex == '男' ? 'checked' : '' }>
        </c:when>
        <c:otherwise>
         	<input type="radio" name="sex" value="男" checked>
        </c:otherwise>
         </c:choose>
          男</label>
        <label>
          <input type="radio" name="sex" value="女" ${model.sex == '女' ? 'checked' : '' }>
          女</label>
        <label>
          <input type="radio" name="sex" value="未说明的性别" ${model.sex == '未说明的性别' ? 'checked' : '' }>
          未说明的性别</label>
      </p></td>
      <td height="40" align="left" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>出生日期</td>
      <td height="40" align="left" valign="middle">
      <input type="text" id="birthday" value='<fmt:formatDate value="${model.birthday }" pattern="yyyy-MM-dd"/>'></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">身份证号</td>
      <td height="40" colspan="2" align="left" valign="middle"><input placeholder="不填默认为‘无’" value="${model.idCardNo }" type="text" id="idCardNo"></td>
      <td height="40" align="left" valign="middle">工作单位</td>
      <td height="40" colspan="2" align="left" valign="middle"><input placeholder="不填默认为‘无’" value="${model.workUnit }" type="text" id="workUnit"></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">本人电话</td>
      <td height="40" align="left" valign="middle"><input type="text" id="tel" value="${model.tel }"></td>
      <td height="40" align="left" valign="middle">联系人姓名</td>
      <td height="40" align="left" valign="middle"><input type="text" id="linkman" value="${model.linkman }"></td>
      <td height="40" align="left" valign="middle">联系人电话</td>
      <td height="40" align="left" valign="middle"><input type="text" id="linkmanTel" value="${model.linkmanTel }"></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">常住类型</td>
      <td height="40" colspan="2" align="left" valign="middle">
      <c:choose>
      <c:when test="${model.id != null }">
      <input type="radio" name="residentType" value="户籍" ${model.residentType == '户籍' ? 'checked' : '' }>
      </c:when>
      <c:otherwise>
      <input type="radio" name="residentType" value="户籍" checked>
      </c:otherwise>
      </c:choose>
      <label for="radio">户籍
        <input type="radio" name="residentType" value="非户籍" ${model.residentType == '非户籍' ? 'checked' : '' }>
        非户籍
      </label></td>
      <td height="40" align="left" valign="middle">民  族</td>
      <td height="40" colspan="2" align="left" valign="middle">
      <c:choose>
      <c:when test="${model.id != null }">
      <input type="radio" name="nation" value="汉族" ${model.nation == '汉族' ? 'checked' : '' }>
      </c:when>
      <c:otherwise>
      <input type="radio" name="nation" value="汉族" checked>
      </c:otherwise>
      </c:choose>
      <label for="radio3" checked>汉族
        <input type="radio" name="nation" value="其他" ${model.nation == '其他' ? 'checked' : '' }>
        其他</label>
      <input type="text" id="nationName" value="${model.nationName }">
      <label for="radio3">
      </label></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">血型</td>
      <td height="40" colspan="3" align="left" valign="middle">
      <input type="radio" name="bloodType" value="A型" ${model.bloodType == 'A型' ? 'checked' : '' }>
      <label for="radio5">A型 
        <input type="radio" name="bloodType" value="B型" ${model.bloodType == 'B型' ? 'checked' : '' }>
        B型 
        <input type="radio" name="bloodType" value="O型" ${model.bloodType == 'O型' ? 'checked' : '' }>
      O型 
      <input type="radio" name="bloodType" value="AB型" ${model.bloodType == 'AB型' ? 'checked' : '' }>
      AB型 
      <c:choose>
      <c:when test="${model.id != null }">
      <input type="radio" name="bloodType" value="不详" ${model.bloodType == '不详' ? 'checked' : '' }>
      </c:when>
      <c:otherwise>
      <input type="radio" name="bloodType" value="不详" checked>
      </c:otherwise>
      </c:choose>
      不详
      </label></td>
      <td height="40" align="left" valign="middle">RH阴性</td>
      <td height="40" align="left" valign="middle"><input type="radio" name="rhType" value="否" ${model.rhType == '否' ? 'checked' : '' }>
      <label for="radio10">否
        <input type="radio" name="rhType" value="是" ${model.rhType == '是' ? 'checked' : '' }>
        是
        <c:choose>
        <c:when test="${model.id != null }">
      <input type="radio" name="rhType" value="不详" ${model.rhType == '不详' ? 'checked' : '' }>
      </c:when>
      <c:otherwise>
      <input type="radio" name="rhType" value="不详" checked>
      </c:otherwise>
      </c:choose>
        
      不详</label></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>文化程度</td>
      <td height="40" colspan="5" align="left" valign="middle"><input type="radio" name="degree" value="文盲及半文盲" ${model.degree == '文盲及半文盲' ? 'checked' : '' }>
      <label for="radio13">文盲及半文盲
        <input type="radio" type="radio" name="degree" value="小学" ${model.degree == '小学' ? 'checked' : '' }>
        小学
        <input type="radio" type="radio" name="degree" value="初中" ${model.degree == '初中' ? 'checked' : '' }>
        初中
        <input type="radio" type="radio" name="degree" value="高中/技校/中专" ${model.degree == '高中/技校/中专' ? 'checked' : '' }>
        高中/技校/中专
        <input type="radio" type="radio" name="degree" value="大学专科及以上" ${model.degree == '大学专科及以上' ? 'checked' : '' }>
        大学专科及以上
        <input type="radio" type="radio" name="degree" value="不详" ${model.degree == '不详' ? 'checked' : '' }>
        不详</label></td>
    </tr>
    <tr>
      <td colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>职业</td>
      <td colspan="5" align="left" valign="middle"><p>
        <label>
          <input type="checkbox" name="profession" value="国家机关、党群组织、企业、事业单位负责人" ${fn:contains(model.profession, '国家机关、党群组织、企业、事业单位负责人') ? 'checked' : '' }>
          国家机关、党群组织、企业、事业单位负责人</label>
      <br />
          <label>
            <input type="checkbox" name="profession" value="专业技术人员" ${fn:contains(model.profession, '专业技术人员') ? 'checked' : '' }>
          专业技术人员</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="办事人员和有关人员" ${fn:contains(model.profession, '办事人员和有关人员') ? 'checked' : '' }>
          办事人员和有关人员</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="商业、服务业人员" ${fn:contains(model.profession, '商业、服务业人员') ? 'checked' : '' }>
          商业、服务业人员</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="农、林、牧、渔、水利业生产人员" ${fn:contains(model.profession, '农、林、牧、渔、水利业生产人员') ? 'checked' : '' }>
          农、林、牧、渔、水利业生产人员</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="生产、运输设备操作人员及有关人员" ${fn:contains(model.profession, '生产、运输设备操作人员及有关人员') ? 'checked' : '' }>
          生产、运输设备操作人员及有关人员</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="军人" ${fn:contains(model.profession, '军人') ? 'checked' : '' }>
          军人</label>
        <br />
          <label>
            <input type="checkbox" name="profession" value="不便分类的其他从业人员" ${fn:contains(model.profession, '不便分类的其他从业人员') ? 'checked' : '' }>
          不便分类的其他从业人员</label>
      </p></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>婚姻状况</td>
      <td height="40" colspan="5" align="left" valign="middle"><input type="radio" name="maritalStatus" value="未婚" ${model.maritalStatus == '未婚' ? 'checked' : '' }>
      <label for="radio19">未婚
<input type="radio" name="maritalStatus" value="已婚" ${model.maritalStatus == '已婚' ? 'checked' : '' }>
已婚
<input type="radio" name="maritalStatus" value="丧偶" ${model.maritalStatus == '丧偶' ? 'checked' : '' }>
丧偶
<input type="radio" name="maritalStatus" value="离婚" ${model.maritalStatus == '离婚' ? 'checked' : '' }>
离婚
<input type="radio" name="maritalStatus" value="未说明的婚姻状况" ${model.maritalStatus == '未说明的婚姻状况' ? 'checked' : '' }>
未说明的婚姻状况</label></td>
    </tr>
    <tr>
      <td height="50" colspan="2" align="center" valign="middle"><p align="center"><span
										style="color: red; font-weight: bolder;">*</span>医疗费用</p>
      <p align="center">支付方式</p></td>
      <td height="50" colspan="5" align="left" valign="middle"><p>
        <input type="checkbox" name="payType" value="城镇职工基本医疗保险" ${fn:contains(model.payType, '城镇职工基本医疗保险') ? 'checked' : '' }>
        <label for="checkbox">城镇职工基本医疗保险</label><br />
          <input type="checkbox" name="payType" value="城镇居民基本医疗保险" ${fn:contains(model.payType, '城镇居民基本医疗保险') ? 'checked' : '' }>
          <label for="checkbox">城镇居民基本医疗保险</label><br />
          <input type="checkbox" name="payType" value="新型农村合作医疗" ${fn:contains(model.payType, '新型农村合作医疗') ? 'checked' : '' }>
          <label for="checkbox">新型农村合作医疗</label><br/>          
        <input type="checkbox" name="payType" value="贫困救助" ${fn:contains(model.payType, '贫困救助') ? 'checked' : '' }>
          <label for="checkbox">贫困救助</label> <br />
            <input type="checkbox" name="payType" value="商业医疗保险" ${fn:contains(model.payType, '商业医疗保险') ? 'checked' : '' }>
           <label for="checkbox">商业医疗保险</label><br />
            <input type="checkbox" name="payType" value="全公费" ${fn:contains(model.payType, '全公费') ? 'checked' : '' }>
          <label for="checkbox">全公费</label>
      <br/>
          <input type="checkbox" name="payType" value="全自费" ${fn:contains(model.payType, '全自费') ? 'checked' : '' }>
          <label for="checkbox">全自费</label><br />
            <input type="checkbox" name="payType" value="其他" ${fn:contains(model.payType, '其他') ? 'checked' : '' }>
          <label for="checkbox">其他</label>
          <input type="text" id="payTypeOther" name="payTypeOther" value="${model.payTypeOther }">
      </p></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>药物过敏史</td>
      <td height="40" colspan="5" align="left" valign="middle"><input type="checkbox" name="ywgms" value="无" ${fn:contains(model.ywgms, '无') ? 'checked' : '' }>
      <label for="checkbox9">无 
        <input type="checkbox" name="ywgms" value="青霉素 " ${fn:contains(model.ywgms, '青霉素') ? 'checked' : '' }>
      青霉素 
      <input type="checkbox" name="ywgms" value="磺胺" ${fn:contains(model.ywgms, '磺胺') ? 'checked' : '' }>
      磺胺</label>
      <input type="checkbox" name="ywgms" value="链霉素" ${fn:contains(model.ywgms, '链霉素') ? 'checked' : '' }>
      <label for="checkbox12">链霉素
        <input type="checkbox" name="ywgms" value="其他" ${fn:contains(model.ywgms, '其他') ? 'checked' : '' }>
      其他</label>
      <input type="text" id="ywgmsName" value="${model.ywgmsName }"></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle"><span
										style="color: red; font-weight: bolder;">*</span>暴 露 史</td>
      <td height="40" colspan="5" align="left" valign="middle"><input type="checkbox" name="bls" value="无" ${fn:contains(model.bls, '无') ? 'checked' : '' }>
      <label for="checkbox14">无
        <input type="checkbox" name="bls" value="化学品" ${fn:contains(model.bls, '化学品') ? 'checked' : '' }>
        化学品
        <input type="checkbox" name="bls" value="毒物" ${fn:contains(model.bls, '毒物') ? 'checked' : '' }>
        毒物
        <input type="checkbox" name="bls" value="射线" ${fn:contains(model.bls, '射线') ? 'checked' : '' }>
        射线</label></td>
    </tr>
    <tr>
      <td height="40" rowspan="4" align="center" valign="middle"><p>既</p>
      <p>往</p>
      <p>史</p></td>
      <td height="40" align="center" valign="middle">疾病</td>
      <td height="40" colspan="5" align="left" valign="middle"><table width="596" border="0" cellspacing="0" cellpadding="0">
        <tbody>
          <tr>
            <td width="244"><label for="select">疾病名称:</label>
              <select id="jbType" name="jbType">
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
              </select></td>
            <td width="317"><label for="input">确诊时间：</label>
              <input type="text" name="jbSj" id="jbSj"></td>
            <td width="35"><input type="button" value="+" class="btn-primary" id="jb_btn"></td>
          </tr>
          <!-- 疾病回显 -->
		<c:if test="${model.jwsDiseaseDes != '无' && fn:length(model.jwsDiseaseDes) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jwsDiseaseDes, ',') }">
				<tr type=dynamic_gen_jb'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td height="40" align="center" valign="middle">手 术</td>
      <td height="40" colspan="5" align="left" valign="middle"><table width="596" border="0" cellspacing="0" cellpadding="0">
        <tbody>
          <tr>
            <td width="244"><label for="input">手术名称:</label>
              <input type="text" value="无" id="shType"></td>
            <td width="317"><label for="input">手术时间：</label>
              <input type="text" id="shSj"></td>
            <td width="35"><input type="button" value="+" class="btn-primary" id="sh_btn"></td>
          </tr>
           <!-- 手术回显 -->
		<c:if test="${model.jwsOperationDes != '无' && fn:length(model.jwsOperationDes) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jwsOperationDes, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td height="40" align="center" valign="middle">外 伤</td>
      <td height="40" colspan="5" align="left" valign="middle">
      <table width="596" border="0" cellspacing="0" cellpadding="0">
        <tbody>
          <tr>
            <td width="244"><label for="input">外伤名称:</label>
              <input type="text" value="无" id="wsType"></td>
            <td width="317"><label for="input">外伤时间：</label>
              <input type="text" id="wsSj"></td>
            <td width="35"><input type="button" value="+" class="btn-primary" id="ws_btn"></td>
          </tr>
           <!-- 外伤回显 -->
		<c:if test="${model.jwsTraumaDes != '无' && fn:length(model.jwsTraumaDes) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jwsTraumaDes, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td height="40" align="center" valign="middle">输 血</td>
      <td height="40" colspan="5" align="left" valign="middle"><table width="596" border="0" cellspacing="0" cellpadding="0">
        <tbody>
          <tr>
            <td width="244"><label for="input">输血名称:</label>
              <input type="text" value="无" id="sxType"></td>
            <td width="317"><label for="input">输血时间：</label>
              <input type="text" id="sxSj"></td>
            <td width="35"><input type="button" value="+" class="btn-primary" id="sx_btn"></td>
          </tr>
          <!-- 输血回显 -->
		<c:if test="${model.jwsTransfusionDes != '无' && fn:length(model.jwsTransfusionDes) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jwsTransfusionDes, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">家 族 史</td>
      <td colspan="5" align="left" valign="middle"><table width="596" border="0" cellspacing="0" cellpadding="0">
        <tbody>
          <tr>
            <td width="244"><label for="select2">亲属:</label>
              <select id="jzsType">
                <option value="父亲">父亲</option>
                <option value="母亲">母亲</option>
                <option value="兄弟姐妹">兄弟姐妹</option>
                <option value="子女">子女</option>
              </select></td>
            <td width="317"><label for="input">疾病：</label>
             <select id="jzsSj">
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
                <option value="先天畸形">先天畸形</option>
                <option value="其他">其他</option>
              </select>
            </td>
            <td width="35"><input type="button" value="+" class="btn-primary" id="jzs_btn"></td>
          </tr>
          <c:if test="${model.jzsFq != '无' && fn:length(model.jzsFq) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jzsFq, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
		<c:if test="${model.jzsMq != '无' && fn:length(model.jzsMq) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jzsMq, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
		<c:if test="${model.jzsXdjm != '无' && fn:length(model.jzsXdjm) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jzsXdjm, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
		<c:if test="${model.jzsZn != '无' && fn:length(model.jzsZn) > 0 }">
			<c:forEach var="one" items="${fn:split(model.jzsZn, ',') }">
				<tr type=dynamic_gen_sh'>
				    <td>${fn:split(one, ';')[0] }</td>
				    <td>${fn:split(one, ';')[1] }</td>
				    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>
			  	</tr>					
			</c:forEach>							
		</c:if>
        </tbody>
      </table></td>
    </tr>
    <tr>
      <td height="40" colspan="2" align="center" valign="middle">遗产病史</td>
      <td height="40" colspan="5" align="left" valign="middle"><input type="radio" name="ycbs" value="无" ${model.ycbs == '无' ? 'checked' : '' }>
      <label for="radio24">无</label>
        <input type="radio" name="ycbs" value="有" ${model.ycbs == '有' ? 'checked' : '' }>
     <label for="radio24">有
      ：疾病名称</label>       <input type="text" id="ycbs" value="${model.ycbs }"></td>
    </tr>
    <tr>
      <td height="50" colspan="2" align="center" valign="middle">残疾情况</td>
      <td height="50" colspan="5" align="left" valign="middle"><input type="checkbox" name="cjqk" value="无" ${fn:contains(model.bls, '无') ? 'checked' : '' }>
      <label for="checkbox">无残疾</label>
        <input type="checkbox" name="cjqk" value="视力残疾" ${fn:contains(model.cjqk, '视力残疾') ? 'checked' : '' }>
        <label for="checkbox">视力残疾</label>
        <input type="checkbox" name="cjqk" value="听力残疾" ${fn:contains(model.cjqk, '听力残疾') ? 'checked' : '' }>
       <label for="checkbox"> 听力残疾</label>
        <input type="checkbox" name="cjqk" value="言语残疾" ${fn:contains(model.cjqk, '言语残疾') ? 'checked' : '' }>
      <label for="checkbox">言语残疾</label>
        <input type="checkbox" name="cjqk" value="肢体残疾" ${fn:contains(model.cjqk, '肢体残疾') ? 'checked' : '' }>
        <label for="checkbox">肢体残疾</label><br>
        <input type="checkbox" name="cjqk" value="智力残疾" ${fn:contains(model.cjqk, '智力残疾') ? 'checked' : '' }>
        <label for="checkbox">智力残疾</label>
        <input type="checkbox" name="cjqk" value="精神残疾" ${fn:contains(model.cjqk, '精神残疾') ? 'checked' : '' }>
        <label for="checkbox">精神残疾</label>
        <input type="checkbox" name="cjqk" value="其他残疾" ${fn:contains(model.cjqk, '其他残疾') ? 'checked' : '' }>
        <label for="checkbox">其他残疾</label>
    </tr>
    <tr>
      <td height="40" colspan="2" rowspan="5" align="center" valign="middle">生活环境</td>
      <td height="40" align="left" valign="middle">厨房排风设施</td>
      <td height="40" colspan="4" align="left" valign="middle"><input type="checkbox" name="shhjCfpfss" ${fn:contains(model.shhjCfpfss, '无') ? 'checked' : '' } value="无">
      <label for="checkbox26">无
        <input type="checkbox" name="shhjCfpfss" value="油烟机" ${fn:contains(model.shhjCfpfss, '油烟机') ? 'checked' : '' }>
        油烟机
        <input type="checkbox" name="shhjCfpfss" value="换气扇" ${fn:contains(model.shhjCfpfss, '换气扇') ? 'checked' : '' }>
        换气扇
        <input type="checkbox" name="shhjCfpfss" value="烟囱" ${fn:contains(model.shhjCfpfss, '烟囱') ? 'checked' : '' }>
        烟囱</label></td>
    </tr>
    <tr>
      <td height="40" align="left" valign="middle">燃料类型</td>
      <td height="40" colspan="4" align="left" valign="middle"><input type="checkbox" name="shhjRllx" value="液化气" ${fn:contains(model.shhjRllx, '液化气') ? 'checked' : '' }>
      <label for="checkbox30">液化气
        <input type="checkbox" name="shhjRllx" value="煤" ${fn:contains(model.shhjRllx, '煤') ? 'checked' : '' }>
        煤
        <input type="checkbox" name="shhjRllx" value="天然气" ${fn:contains(model.shhjRllx, '天然气') ? 'checked' : '' }>
        天然气
        <input type="checkbox" name="shhjRllx" value="沼气" ${fn:contains(model.shhjRllx, '沼气') ? 'checked' : '' }>
        沼气
        <input type="checkbox" name="shhjRllx" value="柴火" ${fn:contains(model.shhjRllx, '柴火') ? 'checked' : '' }>
        柴火
        <input type="checkbox" name="shhjRllx" value="其他" ${fn:contains(model.shhjRllx, '其他') ? 'checked' : '' }>
        其他</label></td>
    </tr>
    <tr>
      <td height="40" align="left" valign="middle">饮水</td>
      <td height="40" colspan="4" align="left" valign="middle"><input type="checkbox" name="shhjYs" value="自来水" ${fn:contains(model.shhjYs, '自来水') ? 'checked' : '' }>
      <label for="checkbox36">自来水
        <input type="checkbox" name="shhjYs" value="经净化过滤的水" ${fn:contains(model.shhjYs, '经净化过滤的水') ? 'checked' : '' }>
        经净化过滤的水
        <input type="checkbox" name="shhjYs" value="井水" ${fn:contains(model.shhjYs, '井水') ? 'checked' : '' }>
        井水
        <input type="checkbox" name="shhjYs" value="河湖水" ${fn:contains(model.shhjYs, '河湖水') ? 'checked' : '' }>
        河湖水
        <input type="checkbox" name="shhjYs" value="塘水" ${fn:contains(model.shhjYs, '塘水') ? 'checked' : '' }>
        塘水
        <input type="checkbox" name="shhjYs" value="其他" ${fn:contains(model.shhjYs, '其他') ? 'checked' : '' }>
        其他</label></td>
    </tr>
    <tr>
      <td height="40" align="left" valign="middle">厕所</td>
      <td height="40" colspan="4" align="left" valign="middle"><input type="checkbox" name="shhjCs" value="卫生厕所" ${fn:contains(model.shhjCs, '卫生厕所') ? 'checked' : '' }>
      <label for="checkbox42">卫生厕所
        <input type="checkbox" name="shhjCs" value="一格或二格粪池式" ${fn:contains(model.shhjCs, '一格或二格粪池式') ? 'checked' : '' }>
        一格或二格粪池式
        <input type="checkbox" name="shhjCs" value="马桶" ${fn:contains(model.shhjCs, '马桶') ? 'checked' : '' }>
        马桶
        <input type="checkbox" name="shhjCs" value="露天粪坑" ${fn:contains(model.shhjCs, '露天粪坑') ? 'checked' : '' }>
        露天粪坑
        <input type="checkbox" name="shhjCs" value="简易棚厕" ${fn:contains(model.shhjCs, '简易棚厕') ? 'checked' : '' }>
        简易棚厕</label></td>
    </tr>
    <tr>
      <td height="40" align="left" valign="middle">禽畜栏</td>
      <td height="40" colspan="4" align="left" valign="middle">
      <input type="checkbox" name="shhjQcl" value="单设" ${fn:contains(model.shhjQcl, '单设') ? 'checked' : '' }>
        <label for="checkbox">单设</label>
        <input type="checkbox" name="shhjQcl" value="室内" ${fn:contains(model.shhjQcl, '室内') ? 'checked' : '' }>
      <label for="checkbox">室内</label>
        <input type="checkbox" name="shhjQcl" value="室外" ${fn:contains(model.shhjQcl, '室外') ? 'checked' : '' }>
        <label for="checkbox">室外</label></td>
    </tr>
  </tbody>
</table>
<!--print end-->
<script src="/third-party/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="/third-party/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	bindDateField("#birthday, input[id$='Sj']");
	
	//绑定事件
	$("input[id$='_btn']").click(function(){

		var type = this.id.split("_")[0];
		
		name = $("#" + type + "Type").val(), time = $("#" + type + "Sj").val();
		if(!name || name == '无')
			return;
		if(!time){
			alert('日期输入错误.');
			return;
		}
		
		if(time == '无')
			return;
		
		addItem(type, name, time);
	});
	
	function addItem(type, name, time){
		var tpl = '<tr type=dynamic_gen_'+type+'>\
		    <td>'+name+'</td>\
		    <td>'+time+'</td>\
		    <td><input type="button" value="x" class="btn-danger" onclick="$(this).parent().parent().remove();"></td>\
	  	</tr>';
		$("#" + type + "_btn").parent().parent().after(tpl);
	}
	
	var openType = '${openType}';
	if(openType == 'detail'){
		$("input[type=checkbox], input[type=radio]").attr('disabled', true);
		$("input[type=text]").attr('readonly', true);
		$("input[type=button]").css('display', 'none');
	}
	
});

function bindDateField(selector){
	$(selector).datetimepicker({
		bootcssVer:3,
        format:'yyyy-mm-dd',
        todayBtn:true,
        language: 'zh-CN',
        startView:2,
        viewSelect:'year',
        minView: 2, //选择日期后，不会再跳转去选择时分秒 
        autoclose:true //选择日期后自动关闭 
    });
}

function fnCheckUserNo(input) {

	var userNo = $.trim($(input).val());
	var id = $("#id").val();

	if (!userNo)
		return;

	var o = {};
	o.userNo = userNo;
	if (id) {
		o.id = id;
	}

	$.post("/phr/checkUserNo", o, function(json) {
		if(json && json.success && json.map.isRepeat){
			top.layer.alert("该档案号已被占用，请重新输入。");
		}
	}, "json");

}
</script>
</body>
</html>
