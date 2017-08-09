package org.apache.jsp.views.back.domain.phr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lhfeiyu.service.PhrArchiveNumberService;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.util.ArchiveUtils;
import com.lhfeiyu.po.PhrBasicInfo;

public final class phrBasicInfoForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:split", org.apache.taglibs.standard.functions.Functions.class, "split", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/third-party/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css\" />\r\n");

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
		
		request.setAttribute("frontAdd", true);
	}
}
request.setAttribute("openType", openType);

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--print start-->\r\n");
      out.write("<table width=\"900\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.patientId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"patientId\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"id\" />\r\n");
      out.write("  <tbody>\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>姓名</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\"><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"name\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frontAdd ? '双击可关联患者' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>编号</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\"><input onblur=\"fnCheckUserNo(this);\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.userNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"userNo\" style=\"width:280px;\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">性别</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"3\" align=\"left\" valign=\"middle\"><p>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"radio\" name=\"sex\" value=\"未知的性别\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.sex == '未知的性别' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("          未知的性别</label>\r\n");
      out.write("        <label>\r\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          男</label>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"radio\" name=\"sex\" value=\"女\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.sex == '女' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("          女</label>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"radio\" name=\"sex\" value=\"未说明的性别\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.sex == '未说明的性别' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("          未说明的性别</label>\r\n");
      out.write("      </p></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>出生日期</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      <input type=\"text\" id=\"birthday\" value='");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("'></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">身份证号</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\"><input placeholder=\"不填默认为‘无’\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.idCardNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" id=\"idCardNo\"></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">工作单位</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\"><input placeholder=\"不填默认为‘无’\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.workUnit }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" id=\"workUnit\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">本人电话</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><input type=\"text\" id=\"tel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.tel }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">联系人姓名</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><input type=\"text\" id=\"linkman\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.linkman }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">联系人电话</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><input type=\"text\" id=\"linkmanTel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.linkmanTel }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">常住类型</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <label for=\"radio\">户籍\r\n");
      out.write("        <input type=\"radio\" name=\"residentType\" value=\"非户籍\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.residentType == '非户籍' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        非户籍\r\n");
      out.write("      </label></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">民  族</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <label for=\"radio3\" checked>汉族\r\n");
      out.write("        <input type=\"radio\" name=\"nation\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.nation == '其他' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        其他</label>\r\n");
      out.write("      <input type=\"text\" id=\"nationName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.nationName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("      <label for=\"radio3\">\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">血型</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"3\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      <input type=\"radio\" name=\"bloodType\" value=\"A型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.bloodType == 'A型' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      <label for=\"radio5\">A型 \r\n");
      out.write("        <input type=\"radio\" name=\"bloodType\" value=\"B型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.bloodType == 'B型' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        B型 \r\n");
      out.write("        <input type=\"radio\" name=\"bloodType\" value=\"O型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.bloodType == 'O型' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      O型 \r\n");
      out.write("      <input type=\"radio\" name=\"bloodType\" value=\"AB型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.bloodType == 'AB型' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      AB型 \r\n");
      out.write("      ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      不详\r\n");
      out.write("      </label></td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">RH阴性</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\"><input type=\"radio\" name=\"rhType\" value=\"否\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.rhType == '否' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      <label for=\"radio10\">否\r\n");
      out.write("        <input type=\"radio\" name=\"rhType\" value=\"是\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.rhType == '是' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        是\r\n");
      out.write("        ");
      if (_jspx_meth_c_choose_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      不详</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>文化程度</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"radio\" name=\"degree\" value=\"文盲及半文盲\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '文盲及半文盲' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      <label for=\"radio13\">文盲及半文盲\r\n");
      out.write("        <input type=\"radio\" type=\"radio\" name=\"degree\" value=\"小学\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '小学' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        小学\r\n");
      out.write("        <input type=\"radio\" type=\"radio\" name=\"degree\" value=\"初中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '初中' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        初中\r\n");
      out.write("        <input type=\"radio\" type=\"radio\" name=\"degree\" value=\"高中/技校/中专\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '高中/技校/中专' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        高中/技校/中专\r\n");
      out.write("        <input type=\"radio\" type=\"radio\" name=\"degree\" value=\"大学专科及以上\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '大学专科及以上' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        大学专科及以上\r\n");
      out.write("        <input type=\"radio\" type=\"radio\" name=\"degree\" value=\"不详\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.degree == '不详' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("        不详</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>职业</td>\r\n");
      out.write("      <td colspan=\"5\" align=\"left\" valign=\"middle\"><p>\r\n");
      out.write("        <label>\r\n");
      out.write("          <input type=\"checkbox\" name=\"profession\" value=\"国家机关、党群组织、企业、事业单位负责人\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '国家机关、党群组织、企业、事业单位负责人') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          国家机关、党群组织、企业、事业单位负责人</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"专业技术人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '专业技术人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          专业技术人员</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"办事人员和有关人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '办事人员和有关人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          办事人员和有关人员</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"商业、服务业人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '商业、服务业人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          商业、服务业人员</label>\r\n");
      out.write("        <br />\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"农、林、牧、渔、水利业生产人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '农、林、牧、渔、水利业生产人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          农、林、牧、渔、水利业生产人员</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"生产、运输设备操作人员及有关人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '生产、运输设备操作人员及有关人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          生产、运输设备操作人员及有关人员</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"军人\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '军人') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          军人</label>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"profession\" value=\"不便分类的其他从业人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.profession, '不便分类的其他从业人员') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          不便分类的其他从业人员</label>\r\n");
      out.write("      </p></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>婚姻状况</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"radio\" name=\"maritalStatus\" value=\"未婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.maritalStatus == '未婚' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      <label for=\"radio19\">未婚\r\n");
      out.write("<input type=\"radio\" name=\"maritalStatus\" value=\"已婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.maritalStatus == '已婚' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("已婚\r\n");
      out.write("<input type=\"radio\" name=\"maritalStatus\" value=\"丧偶\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.maritalStatus == '丧偶' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("丧偶\r\n");
      out.write("<input type=\"radio\" name=\"maritalStatus\" value=\"离婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.maritalStatus == '离婚' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("离婚\r\n");
      out.write("<input type=\"radio\" name=\"maritalStatus\" value=\"未说明的婚姻状况\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.maritalStatus == '未说明的婚姻状况' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("未说明的婚姻状况</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"50\" colspan=\"2\" align=\"center\" valign=\"middle\"><p align=\"center\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>医疗费用</p>\r\n");
      out.write("      <p align=\"center\">支付方式</p></td>\r\n");
      out.write("      <td height=\"50\" colspan=\"5\" align=\"left\" valign=\"middle\"><p>\r\n");
      out.write("        <input type=\"checkbox\" name=\"payType\" value=\"城镇职工基本医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '城镇职工基本医疗保险') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">城镇职工基本医疗保险</label>\r\n");
      out.write("          <input type=\"checkbox\" name=\"payType\" value=\"城镇居民基本医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '城镇居民基本医疗保险') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">城镇居民基本医疗保险</label>\r\n");
      out.write("          <input type=\"checkbox\" name=\"payType\" value=\"新型农村合作医疗\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '新型农村合作医疗') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">新型农村合作医疗</label>    <br />       \r\n");
      out.write("        <input type=\"checkbox\" name=\"payType\" value=\"贫困救助\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '贫困救助') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">贫困救助</label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"payType\" value=\"商业医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '商业医疗保险') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("           <label for=\"checkbox\">商业医疗保险</label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"payType\" value=\"全公费\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '全公费') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">全公费</label>\r\n");
      out.write("          <input type=\"checkbox\" name=\"payType\" value=\"全自费\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '全自费') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">全自费</label>\r\n");
      out.write("            <input type=\"checkbox\" name=\"payType\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.payType, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("          <label for=\"checkbox\">其他</label>\r\n");
      out.write("          <input type=\"text\" id=\"payTypeOther\" name=\"payTypeOther\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.payTypeOther }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("      </p></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>药物过敏史</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"ywgms\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.ywgms, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox9\">无 \r\n");
      out.write("        <input type=\"checkbox\" name=\"ywgms\" value=\"青霉素 \" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.ywgms, '青霉素') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      青霉素 \r\n");
      out.write("      <input type=\"checkbox\" name=\"ywgms\" value=\"磺胺\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.ywgms, '磺胺') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      磺胺</label>\r\n");
      out.write("      <input type=\"checkbox\" name=\"ywgms\" value=\"链霉素\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.ywgms, '链霉素') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox12\">链霉素\r\n");
      out.write("        <input type=\"checkbox\" name=\"ywgms\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.ywgms, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      其他</label>\r\n");
      out.write("      <input type=\"text\" id=\"ywgmsName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.ywgmsName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>暴 露 史</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"bls\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.bls, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox14\">无\r\n");
      out.write("        <input type=\"checkbox\" name=\"bls\" value=\"化学品\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.bls, '化学品') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        化学品\r\n");
      out.write("        <input type=\"checkbox\" name=\"bls\" value=\"毒物\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.bls, '毒物') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        毒物\r\n");
      out.write("        <input type=\"checkbox\" name=\"bls\" value=\"射线\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.bls, '射线') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        射线</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" rowspan=\"4\" align=\"center\" valign=\"middle\"><p>既</p>\r\n");
      out.write("      <p>往</p>\r\n");
      out.write("      <p>史</p></td>\r\n");
      out.write("      <td height=\"40\" align=\"center\" valign=\"middle\">疾病</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><table width=\"596\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr disp=\"hidden\">\r\n");
      out.write("            <td width=\"244\"><label for=\"select\">疾病名称:</label>\r\n");
      out.write("              <select id=\"jbType\" name=\"jbType\">\r\n");
      out.write("                <option value=\"无\">无</option>\r\n");
      out.write("\t\t\t\t<option value=\"高血压\">高血压</option>\r\n");
      out.write("\t\t\t\t<option value=\"糖尿病\">糖尿病</option>\r\n");
      out.write("\t\t\t\t<option value=\"冠心病\">冠心病</option>\r\n");
      out.write("\t\t\t\t<option value=\"慢性阻塞性肺疾病\">慢性阻塞性肺疾病</option>\r\n");
      out.write("\t\t\t\t<option value=\"恶性肿瘤\">恶性肿瘤</option>\r\n");
      out.write("\t\t\t\t<option value=\"脑卒中\">脑卒中</option>\r\n");
      out.write("\t\t\t\t<option value=\"重性精神疾病\">重性精神疾病</option>\r\n");
      out.write("\t\t\t\t<option value=\"结核病\">结核病</option>\r\n");
      out.write("\t\t\t\t<option value=\"肝炎\">肝炎</option>\r\n");
      out.write("\t\t\t\t<option value=\"其他法定传染病\">其他法定传染病</option>\r\n");
      out.write("\t\t\t\t<option value=\"职业病\">职业病</option>\r\n");
      out.write("\t\t\t\t<option value=\"其他\">其他</option>\r\n");
      out.write("              </select></td>\r\n");
      out.write("            <td width=\"317\"><label for=\"input\">确诊时间：</label>\r\n");
      out.write("              <input type=\"text\" name=\"jbSj\" id=\"jbSj\"></td>\r\n");
      out.write("            <td width=\"35\"><input type=\"button\" value=\"+\" class=\"btn-primary\" id=\"jb_btn\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <!-- 疾病回显 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"center\" valign=\"middle\">手 术</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><table width=\"596\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr disp=\"hidden\">\r\n");
      out.write("            <td width=\"244\"><label for=\"input\">手术名称:</label>\r\n");
      out.write("              <input type=\"text\" value=\"无\" id=\"shType\"></td>\r\n");
      out.write("            <td width=\"317\"><label for=\"input\">手术时间：</label>\r\n");
      out.write("              <input type=\"text\" id=\"shSj\"></td>\r\n");
      out.write("            <td width=\"35\"><input type=\"button\" value=\"+\" class=\"btn-primary\" id=\"sh_btn\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("           <!-- 手术回显 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"center\" valign=\"middle\">外 伤</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      <table width=\"596\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr disp=\"hidden\">\r\n");
      out.write("            <td width=\"244\"><label for=\"input\">外伤名称:</label>\r\n");
      out.write("              <input type=\"text\" value=\"无\" id=\"wsType\"></td>\r\n");
      out.write("            <td width=\"317\"><label for=\"input\">外伤时间：</label>\r\n");
      out.write("              <input type=\"text\" id=\"wsSj\"></td>\r\n");
      out.write("            <td width=\"35\"><input type=\"button\" value=\"+\" class=\"btn-primary\" id=\"ws_btn\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("           <!-- 外伤回显 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"center\" valign=\"middle\">输 血</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><table width=\"596\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr disp=\"hidden\">\r\n");
      out.write("            <td width=\"244\"><label for=\"input\">输血名称:</label>\r\n");
      out.write("              <input type=\"text\" value=\"无\" id=\"sxType\"></td>\r\n");
      out.write("            <td width=\"317\"><label for=\"input\">输血时间：</label>\r\n");
      out.write("              <input type=\"text\" id=\"sxSj\"></td>\r\n");
      out.write("            <td width=\"35\"><input type=\"button\" value=\"+\" class=\"btn-primary\" id=\"sx_btn\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <!-- 输血回显 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">家 族 史</td>\r\n");
      out.write("      <td colspan=\"5\" align=\"left\" valign=\"middle\"><table width=\"596\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr disp=\"hidden\">\r\n");
      out.write("            <td width=\"244\"><label for=\"select2\">亲属:</label>\r\n");
      out.write("              <select id=\"jzsType\" name=\"jzsType\">\r\n");
      out.write("                <option value=\"父亲\">父亲</option>\r\n");
      out.write("                <option value=\"母亲\">母亲</option>\r\n");
      out.write("                <option value=\"兄弟姐妹\">兄弟姐妹</option>\r\n");
      out.write("                <option value=\"子女\">子女</option>\r\n");
      out.write("              </select></td>\r\n");
      out.write("            <td width=\"317\"><label for=\"input\">疾病：</label>\r\n");
      out.write("             <select id=\"jzsSj\" name=\"jzsSj\">\r\n");
      out.write("                <option value=\"无\">无</option>\r\n");
      out.write("                <option value=\"高血压\">高血压</option>\r\n");
      out.write("                <option value=\"糖尿病\">糖尿病</option>\r\n");
      out.write("                <option value=\"冠心病\">冠心病</option>\r\n");
      out.write("                <option value=\"慢性阻塞性肺疾病\">慢性阻塞性肺疾病</option>\r\n");
      out.write("                <option value=\"恶性肿瘤\">恶性肿瘤</option>\r\n");
      out.write("                <option value=\"脑卒中\">脑卒中</option>\r\n");
      out.write("                <option value=\"重性精神疾病\">重性精神疾病</option>\r\n");
      out.write("                <option value=\"结核病\">结核病</option>\r\n");
      out.write("                <option value=\"肝炎\">肝炎</option>\r\n");
      out.write("                <option value=\"先天畸形\">先天畸形</option>\r\n");
      out.write("                <option value=\"其他\">其他</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td width=\"35\"><input type=\"button\" value=\"+\" class=\"btn-primary\" id=\"jzs_btn\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" align=\"center\" valign=\"middle\">遗传病史</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"radio\" name=\"ycbs\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.ycbs == '无' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("      <label for=\"radio24\">无</label>\r\n");
      out.write("        <input type=\"radio\" name=\"ycbs\" value=\"有\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.ycbs == '有' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("     <label for=\"radio24\">有\r\n");
      out.write("      ：疾病名称</label>       <input type=\"text\" id=\"ycbsName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.ycbsName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"ycbsName\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"50\" colspan=\"2\" align=\"center\" valign=\"middle\">残疾情况</td>\r\n");
      out.write("      <td height=\"50\" colspan=\"5\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"cjqk\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      \t<label for=\"checkbox\">无残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"视力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '视力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">视力残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"听力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '听力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("       \t<label for=\"checkbox\">听力残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"言语残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '言语残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      \t<label for=\"checkbox\">言语残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"肢体残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '肢体残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">肢体残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"智力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '智力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">智力残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"精神残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '精神残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">精神残疾</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"cjqk\" value=\"其他残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.cjqk, '其他残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">其他残疾</label>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" colspan=\"2\" rowspan=\"5\" align=\"center\" valign=\"middle\">生活环境</td>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">厨房排风设施</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"4\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"shhjCfpfss\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCfpfss, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" value=\"无\">\r\n");
      out.write("      <label for=\"checkbox26\">无\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCfpfss\" value=\"油烟机\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCfpfss, '油烟机') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        油烟机\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCfpfss\" value=\"换气扇\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCfpfss, '换气扇') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        换气扇\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCfpfss\" value=\"烟囱\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCfpfss, '烟囱') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        烟囱</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">燃料类型</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"4\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"shhjRllx\" value=\"液化气\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '液化气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox30\">液化气\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjRllx\" value=\"煤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '煤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        煤\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjRllx\" value=\"天然气\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '天然气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        天然气\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjRllx\" value=\"沼气\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '沼气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        沼气\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjRllx\" value=\"柴火\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '柴火') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        柴火\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjRllx\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjRllx, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        其他</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">饮水</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"4\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"shhjYs\" value=\"自来水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '自来水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox36\">自来水\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjYs\" value=\"经净化过滤的水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '经净化过滤的水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        经净化过滤的水\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjYs\" value=\"井水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '井水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        井水\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjYs\" value=\"河湖水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '河湖水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        河湖水\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjYs\" value=\"塘水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '塘水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        塘水\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjYs\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjYs, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        其他</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">厕所</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"4\" align=\"left\" valign=\"middle\"><input type=\"checkbox\" name=\"shhjCs\" value=\"卫生厕所\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCs, '卫生厕所') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox42\">卫生厕所\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCs\" value=\"一格或二格粪池式\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCs, '一格或二格粪池式') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        一格或二格粪池式\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCs\" value=\"马桶\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCs, '马桶') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        马桶\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCs\" value=\"露天粪坑\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCs, '露天粪坑') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        露天粪坑\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjCs\" value=\"简易棚厕\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjCs, '简易棚厕') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        简易棚厕</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"40\" align=\"left\" valign=\"middle\">禽畜栏</td>\r\n");
      out.write("      <td height=\"40\" colspan=\"4\" align=\"left\" valign=\"middle\">\r\n");
      out.write("      <input type=\"checkbox\" name=\"shhjQcl\" value=\"单设\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjQcl, '单设') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">单设</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjQcl\" value=\"室内\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjQcl, '室内') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("      <label for=\"checkbox\">室内</label>\r\n");
      out.write("        <input type=\"checkbox\" name=\"shhjQcl\" value=\"室外\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(model.shhjQcl, '室外') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(">\r\n");
      out.write("        <label for=\"checkbox\">室外</label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<!--print end-->\r\n");
      out.write("<script src=\"/third-party/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//初始化患者的id\r\n");
      out.write("function initPatientInfo(id) {\r\n");
      out.write("\t$.post(\"/phr/doctor/getPatient/\" + id, {}, function(rsp) {\r\n");
      out.write("\t\tif (rsp.success) {\r\n");
      out.write("\t\t\tvar data = rsp.patient;\r\n");
      out.write("\t\t\tif (data) {\r\n");
      out.write("\t\t\t\t$(\"#patientId\").val(data.id);\r\n");
      out.write("\t\t\t\t$('#name').val(data.realName);\r\n");
      out.write("\t\t\t\t$(\"#sex\").val(data.sex == 1 ? '男' : '女');\r\n");
      out.write("\t\t\t\t$(\"#idCardNo\").val(data.idcardNum);\r\n");
      out.write("\t\t\t\t$(\"#birthday\").val(\r\n");
      out.write("\t\t\t\t\t\tdata.birthday ? data.birthday.toDate()\r\n");
      out.write("\t\t\t\t\t\t\t\t.fmt('yyyy-MM-dd') : '');\r\n");
      out.write("\t\t\t\t$(\"#tel\").val(data.phone);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\ttop.layer.alert(rsp.msg);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, \"json\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tbindDateField(\"#birthday, input[id$='Sj']\");\r\n");
      out.write("\t\r\n");
      out.write("\t//var frontAdd = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frontAdd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tvar frontAdd = true;\r\n");
      out.write("\t\r\n");
      out.write("\tif(frontAdd){\r\n");
      out.write("\t$(\"#name\").dblclick(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\tvar index = top.layer.open({\r\n");
      out.write("\t\t\t\t\ttype : 2,\r\n");
      out.write("\t\t\t\t\tarea : [ '550px', '580px' ],\r\n");
      out.write("\t\t\t\t\tbtn : [ '选择', '关闭' ],\r\n");
      out.write("\t\t\t\t\tcontent : '/patientLibrary4Select',\r\n");
      out.write("\t\t\t\t\tyes : function() {\r\n");
      out.write("\t\t\t\t\t\tvar chk = top.layer.getChildFrame(\r\n");
      out.write("\t\t\t\t\t\t\t\t'[name=\"patientRadio\"]:radio:checked', index);\r\n");
      out.write("\t\t\t\t\t\tif (chk.length == 1) {\r\n");
      out.write("\t\t\t\t\t\t\tinitPatientInfo(chk.val());\r\n");
      out.write("\t\t\t\t\t\t\ttop.layer.close(index);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbtn2 : function() {\r\n");
      out.write("\t\t\t\t\t\ttop.layer.close(index);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t//绑定事件\r\n");
      out.write("\t$(\"input[id$='_btn']\").click(function(){\r\n");
      out.write("\r\n");
      out.write("\t\tvar type = this.id.split(\"_\")[0];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tname = $(\"#\" + type + \"Type\").val(), time = $(\"#\" + type + \"Sj\").val();\r\n");
      out.write("\t\tif(!name || name == '无')\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\tif(!time){\r\n");
      out.write("\t\t\talert('日期输入错误.');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(time == '无')\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\taddItem(type, name, time);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addItem(type, name, time){\r\n");
      out.write("\t\tvar tpl = '<tr type=dynamic_gen_'+type+'>\\\r\n");
      out.write("\t\t    <td>'+name+'</td>\\\r\n");
      out.write("\t\t    <td>'+time+'</td>\\\r\n");
      out.write("\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\\\r\n");
      out.write("\t  \t</tr>';\r\n");
      out.write("\t\t$(\"#\" + type + \"_btn\").parent().parent().after(tpl);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar openType = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${openType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\tif(openType == 'detail'){//查看详情的时候隐藏掉该隐藏的。\r\n");
      out.write("\t\t$(\"input[type=checkbox], input[type=radio]\").attr('disabled', true);\r\n");
      out.write("\t\t$(\"input[type=text]\").attr('readonly', true);\r\n");
      out.write("\t\t$(\"input[type=button]\").css('display', 'none');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"tr[disp=hidden]\").css('display', 'none');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"input\").css('border-style', 'none');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function bindDateField(selector){\r\n");
      out.write("\t$(selector).datetimepicker({\r\n");
      out.write("\t\tbootcssVer:3,\r\n");
      out.write("        format:'yyyy-mm-dd',\r\n");
      out.write("        todayBtn:true,\r\n");
      out.write("        language: 'zh-CN',\r\n");
      out.write("        startView:2,\r\n");
      out.write("        viewSelect:'year',\r\n");
      out.write("        minView: 2, //选择日期后，不会再跳转去选择时分秒 \r\n");
      out.write("        autoclose:true //选择日期后自动关闭 \r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fnCheckUserNo(input) {\r\n");
      out.write("\r\n");
      out.write("\tvar userNo = $.trim($(input).val());\r\n");
      out.write("\tvar id = $(\"#id\").val();\r\n");
      out.write("\r\n");
      out.write("\tif (!userNo)\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\r\n");
      out.write("\tvar o = {};\r\n");
      out.write("\to.userNo = userNo;\r\n");
      out.write("\tif (id) {\r\n");
      out.write("\t\to.id = id;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$.post(\"/phr/checkUserNo\", o, function(json) {\r\n");
      out.write("\t\tif(json && json.success && json.map.isRepeat){\r\n");
      out.write("\t\t\ttop.layer.alert(\"该档案号已被占用，请重新输入。\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, \"json\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t<input type=\"radio\" name=\"sex\" value=\"男\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.sex == '男' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("         \t<input type=\"radio\" name=\"sex\" value=\"男\" checked>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.birthday }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"residentType\" value=\"户籍\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.residentType == '户籍' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"residentType\" value=\"户籍\" checked>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"nation\" value=\"汉族\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.nation == '汉族' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"nation\" value=\"汉族\" checked>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"bloodType\" value=\"不详\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.bloodType == '不详' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"bloodType\" value=\"不详\" checked>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_choose_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent(null);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_otherwise_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"rhType\" value=\"不详\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.rhType == '不详' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_4.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
    if (_jspx_eval_c_otherwise_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <input type=\"radio\" name=\"rhType\" value=\"不详\" checked>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_otherwise_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jwsDiseaseDes != '无' && fn:length(model.jwsDiseaseDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("one");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jwsDiseaseDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_jb'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jwsOperationDes != '无' && fn:length(model.jwsOperationDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_1.setVar("one");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jwsOperationDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_sh'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jwsTraumaDes != '无' && fn:length(model.jwsTraumaDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_forEach_2.setVar("one");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jwsTraumaDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_ws'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jwsTransfusionDes != '无' && fn:length(model.jwsTransfusionDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_3.setVar("one");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jwsTransfusionDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_sx'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jzsFq != '无' && fn:length(model.jzsFq) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_4.setVar("one");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jzsFq, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_jzs'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jzsMq != '无' && fn:length(model.jzsMq) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_forEach_5.setVar("one");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jzsMq, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_jzs'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jzsXdjm != '无' && fn:length(model.jzsXdjm) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_6.setVar("one");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jzsXdjm, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_jzs'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jzsZn != '无' && fn:length(model.jzsZn) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_forEach_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_7.setVar("one");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(model.jzsZn, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr type='dynamic_gen_jzs'>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("</td>\r\n");
          out.write("\t\t\t\t    <td><input type=\"button\" value=\"x\" class=\"btn-danger\" onclick=\"$(this).parent().parent().remove();\"></td>\r\n");
          out.write("\t\t\t  \t</tr>\t\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
