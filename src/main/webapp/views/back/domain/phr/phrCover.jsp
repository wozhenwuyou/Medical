<%@page import="com.lhfeiyu.po.User"%>
<%@page import="com.lhfeiyu.po.Admin"%>
<%@page import="com.lhfeiyu.tools.ActionUtil"%>
<%@page import="com.lhfeiyu.po.Doctor"%>
<%@page import="com.lhfeiyu.po.Hospital"%>
<%@page import="com.lhfeiyu.service.DoctorService"%>
<%@page import="com.lhfeiyu.service.HospitalService"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.lhfeiyu.po.PhrCover"%>
<%@page import="com.lhfeiyu.service.PhrBasicInfoService"%>
<%@page import="com.lhfeiyu.po.PhrBasicInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.lhfeiyu.service.PhrHealthCheckService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>

<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="/third-party/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" />
<%
	
	String openType = request.getParameter("openType");
	if("add".equals(openType)){
		ServletContext context = request.getSession().getServletContext();
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);  
		//得到档案信息id
		Integer basicInfoId = Integer.valueOf(request.getParameter("basicInfoId"));
		//找到档案基本信息
		PhrBasicInfoService service = ctx.getBean(PhrBasicInfoService.class);
		PhrBasicInfo basicInfo = service.findById(basicInfoId);
		//找到医生和诊所
		HospitalService hs = ctx.getBean(HospitalService.class);
		Hospital hospital = hs.selectByPrimaryKey(basicInfo.getHospitalId());
		DoctorService ds = ctx.getBean(DoctorService.class);
		Doctor doctor = ds.selectByPrimaryKey(basicInfo.getDoctorId());
		
		PhrCover model = new PhrCover();
		model.setName(basicInfo.getName());//姓名
		model.setJdrq(new Date());//建档日期
		model.setLxdh(basicInfo.getTel());//联系电话
		if(hospital != null){
			model.setJddw(hospital.getAddress() + hospital.getWholeName());//建档单位
		}
		if(doctor != null){
			model.setZrys(doctor.getRealname());//责任医生
		}
		//建档人
		User currentUser = ActionUtil.checkSession4User(session);
		if(currentUser != null){
			model.setJdr(currentUser.getRealName());
		}
		Admin currentAdmin = ActionUtil.checkSession4Admin(session);
		if(currentAdmin != null){
			model.setJdr(currentAdmin.getUsername());
		}
		Doctor currentDoctor = ActionUtil.checkSession4Doctor(session);
		if(currentDoctor != null){
			model.setJdr(currentDoctor.getRealname());
		}
		request.setAttribute("model", model);
	}
	
	request.setAttribute("openType", openType);
%>
</head>

<body>
<form action="/back/phr/phrCover/save" method="POST" id="phrCoverForm">
	<input type="hidden" name="id" id="id" value="${model.id }">
	<table width="900" border="0" cellspacing="0" cellpadding="0"> 
		<tbody>
			<tr>
				<td height="104" colspan="2" align="center"><h1>居民健康档案</h1></td>
			</tr>
			<tr>
				<td height="40" align="right">姓名：</td>
				<td><input type="text" name="name" id="name" value="${model.name }"></td>
			</tr>
			<tr>
				<td height="40" align="right">现住址：</td>
				<td><input type="text" name="xzz" id="xzz" value="${model.xzz }"></td>
			</tr>
			<tr>
				<td height="40" align="right">户籍地址：</td>
				<td><input type="text" name="hjdz" id="hjdz" value="${model.hjdz }"></td>
			</tr>
			<tr>
				<td height="40" align="right">联系电话：</td> 
				<td><input type="text" name="lxdh" id="lxdh" value="${model.lxdh }"></td>
			</tr>
			<tr>
				<td height="40" align="right">乡镇（街道）名称：</td>
				<td><input type="text" name="xzmc" id="xzmc" value="${model.xzmc }"></td>
			</tr>
			<tr>
				<td height="40" align="right">村（居）委会名称：</td>
				<td><input type="text" name="cwhmc" id="cwhmc" value="${model.cwhmc }"></td>
			</tr>
			<tr>
				<td height="40" align="right">建档单位：</td>
				<td><input type="text" name="jddw" id="jddw" value="${model.jddw }"></td>
			</tr>
			<tr>
				<td height="40" align="right">建档人：</td>
				<td><input type="text" name="jdr" id="jdr" value="${model.jdr }"></td>
			</tr>
			<tr>
				<td height="40" align="right">责任医生：</td>
				<td><input type="text" name="zrys" id="zrys" value="${model.zrys }"></td>
			</tr>
			<tr>
				<td height="40" align="right">建档日期：</td>
				<td><input type="text" name="jdrq" id="jdrq" value='<fmt:formatDate value="${model.jdrq }" pattern="yyyy-MM-dd" />'></td>
			</tr>
		</tbody>
	</table>
</form>
	<script type="text/javascript" src="/third-party/z.js" title="v"></script>
	<script src="/third-party/jquery/jquery-1.11.3.min.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript">
		function bindDateField(selector) {
			$(selector).datetimepicker({
				bootcssVer : 3,
				format : 'yyyy-mm-dd',
				todayBtn : true,
				language : 'zh-CN',
				startView : 2,
				viewSelect : 'year',
				minView : 2, //选择日期后，不会再跳转去选择时分秒
				autoclose : true//选择日期后自动关闭
			});
		}
		$(document).ready(function() {
			bindDateField("#jdrq");//绑定日期字段
			var openType = '${openType}';
			if('detail' == openType){
				$("input[type=checkbox], input[type=radio]").attr('disabled', true);
				$("input[type=text]").attr('readonly', true);
			}
		});
	</script>
</body>

</html>
