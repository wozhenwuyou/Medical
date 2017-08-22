package org.apache.jsp.views.front.domain.doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phrEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(8);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
    _jspx_dependants.add("/views/front/common/doctor/top.htm");
    _jspx_dependants.add("/views/front/common/doctor/doctorTop.htm");
    _jspx_dependants.add("/views/front/common/doctor/doctorLeft.htm");
    _jspx_dependants.add("/views/front/common/bottom.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_front_js.htm");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"author\" content=\"www.lhfeiyu.com\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\" />\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\" />\r\n");
      out.write("<!--<meta name=\"viewport\" content=\"target-densitydpi=medium-dpi,width=device-width,height=device-height,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />-->\r\n");
      out.write("<meta name=\"keywords\" content=\"成都蓝海飞鱼,软件定制开发,网站建设,微信公众号开发,APP开发\" />\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"成都蓝海飞鱼-集软件定制开发,网站建设,微信公众号开发,APP开发于一身的软件公司\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<title>沃诊无忧</title>\r\n");
      out.write("<!-- Powered by 成都蓝海飞鱼科技有限公司 -->");
      out.write('\r');
      out.write('\n');
      out.write("<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/third-party/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<!-- <link type=\"text/css\" rel=\"stylesheet\" href=\"/third-party/weui/weui.min.css\"/> -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/common.css\" title=\"v\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/bootstrap-select-1.10.0/css/bootstrap-select.min.css\" />\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"/third-party/compatible/html5shiv.min.js\"></script>\r\n");
      out.write("\t<script src=\"/third-party/compatible/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]\r\n");
      out.write("-->");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/front/style.css\"\r\n");
      out.write("\ttitle=\"v\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<div class=\"pz_top\">\r\n");
      out.write("\t<div class=\"w_0100 back4\">\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t<div class=\"c_1100_8\">\r\n");
      out.write("\t\t\t\t<div class=\"left_wel\">沃诊无忧，您身边的家庭医生</div>\r\n");
      out.write("\t\t\t\t<div class=\"link\">\r\n");
      out.write("\t\t\t\t\t<span><a href=\"/\">官网</a> &nbsp;&nbsp;/&nbsp;&nbsp; <a\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"lh.alert('电话：010-80880421  传真：010-80881641 E-mail：service@wonature.com');\">联系客服</a>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;/&nbsp;&nbsp; <a href=\"javascript:;\">网站地图</a></span>\r\n");
      out.write("\t\t\t\t\t<div class=\"doctor\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t");
      out.write("<div class=\"w_0100 back5\">\r\n");
      out.write("\t<div class=\"w_1000\">\r\n");
      out.write("\t\t<div class=\"c_1100_9\">\r\n");
      out.write("\t\t\t<div class=\"l_name\" style=\"width: 320px\">\r\n");
      out.write("\t\t\t\t<div class=\"l_102\" style=\"height: 112px; margin-top: 10px;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tonerror=\"this.src='/images/front/default_doctor.jpg'\" width=\"102\"\r\n");
      out.write("\t\t\t\t\t\theight=\"112\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--height:126-->\r\n");
      out.write("\t\t\t\t<div class=\"r_245\" style=\"width: 205px\">\r\n");
      out.write("\t\t\t\t\t<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong> &nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.titleNames}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.departmentName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"l_370\" style=\"width: 500px; margin-left: 2px;\">\r\n");
      out.write("\t\t\t\t<div onclick=\"lh.open('/hospitalLogin');\"\r\n");
      out.write("\t\t\t\t\tstyle=\"cursor: pointer; display: inline-block; height: 98px; float: left;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalLogo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"98\" height=\"98\" />\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"display: inline-block; height: 98px; float: left; width: 380px; line-height: 30px; font-weight: bolder; margin-top: 30px;\">\r\n");
      out.write("\t\t\t\t\t<span onclick=\"lh.open('/hospitalLogin');\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer; word-wrap: break-word; word-break: break-all;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalProvinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"phone\" style=\"width: 265px; margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t<span>电话：</span>\r\n");
      out.write("\t\t\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write("\t\t\t\t<div style=\"float: left; width: 48px;\">\r\n");
      out.write("\t\t\t\t\t<span>地址：</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"float: left; width: 210px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<!-- 顶部菜单栏 -->\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<div class=\"w_229\">\r\n");
      out.write("\t<div class=\"t_229 pointer\" onclick=\"location.href='/doctorHome'\">我的首页</div>\r\n");
      out.write("\t<div id=\"leftMenuList\" class=\"pz_SideLayer\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li id=\"lm_hospitalHome\" class=\"l1\"><a\r\n");
      out.write("\t\t\t\thref=\"/doctor/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.attrStr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"_blank\">医生介绍页</a></li>\r\n");
      out.write("\t\t\t<!--<li id=\"lm_announcement\" class=\"l1\"><a href=\"/doctor/announcement\">诊所公告</a></li>-->\r\n");
      out.write("\t\t\t<li id=\"lm_baseInformation\" class=\"l1\"><a\r\n");
      out.write("\t\t\t\tid=\"doctorBaseInformation\" href=\"/doctorBaseInformation\">基本信息</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_diagnose\" class=\"l1\"><a id=\"diagnoseList\"\r\n");
      out.write("\t\t\t\thref=\"/diagnoseList\">病历夹</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_diagnoseTemplate\" class=\"l1\"><a\r\n");
      out.write("\t\t\t\tid=\"diagnoseTemplateList\" href=\"/diagnoseTemplateList\">病历模版</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_report\" class=\"l1\"><a id=\"doctorUserReportList\"\r\n");
      out.write("\t\t\t\thref=\"/doctor/doctorUserReportList\">检测档案</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_patient\" class=\"l1\"><a id=\"patientLibrary\"\r\n");
      out.write("\t\t\t\thref=\"/patientLibrary\">患者库</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"lm_phr\" class=\"l1\"><a id=\"phrList\"\r\n");
      out.write("\t\t\t\thref=\"/phr/doctor/phrList\">社区居民健康档案</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_bespeak\" class=\"l1\"><a id=\"doctorBespeak\"\r\n");
      out.write("\t\t\t\thref=\"/doctorBespeak\">预约</a></li>\r\n");
      out.write("\t\t\t<!--<li class=\"l1\"><a id=\"doctorChat\" href=\"/doctorChat\">消息</a></li>-->\r\n");
      out.write("\t\t\t<li id=\"lm_information\" class=\"l1\"><a id=\"doctorInformation\"\r\n");
      out.write("\t\t\t\thref=\"/doctorInformation\">文章管理</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_consult\" class=\"l1\"><a id=\"consult\"\r\n");
      out.write("\t\t\t\thref=\"/doctorConsult\">咨询</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_message\" class=\"l1\"><a id=\"doctorMessage\"\r\n");
      out.write("\t\t\t\thref=\"/doctorMessage\">留言</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_articlePrivate\" class=\"l1\"><a id=\"doctorArticle\"\r\n");
      out.write("\t\t\t\thref=\"/doctorArticlePrivate\">随手记</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_diagnoseApply\" class=\"l1\"><a id=\"doctorDiagnoseApply\"\r\n");
      out.write("\t\t\t\thref=\"/doctorDiagnoseApply\">授权记录</a></li>\r\n");
      out.write("\t\t\t<li id=\"lm_internalMessage\" class=\"l1\"><a id=\"internalMessage\"\r\n");
      out.write("\t\t\t\thref=\"/doctor/internalMessage\">站内信</a></li>\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("\t        <li class=\"l1\"><a id=\"analysis\" href=\"/analysis\">统计分析</a></li>\r\n");
      out.write("\t        <li class=\"l1\"><a id=\"medicalUtils\" href=\"/medicalUtils\">医学资料及工具</a></li>\r\n");
      out.write("\t        -->\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"c_299\">\r\n");
      out.write("\t\t<div class=\"tit_h_47\">我的圈子</div>\r\n");
      out.write("\t\t<div class=\"list_229\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"Search\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"input3\" id=\"searchDoctorName\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchDoctorName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"查找医生\" /> <input\r\n");
      out.write("\t\t\ttype=\"image\" onclick=\"searchDoctor()\" src=\"/images/front/main26.jpg\"\r\n");
      out.write("\t\t\twidth=\"43\" height=\"35\" class=\"input4\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"slideBox\" class=\"Box\">\r\n");
      out.write("\t\t<div class=\"hd\" id=\"doctorAdvertisement\"></div>\r\n");
      out.write("\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("<!-- 左边菜单栏 -->\r\n");
      out.write("\t\t\t<div class=\"w_851\">\r\n");
      out.write("\t\t\t\t<div class=\"c_851\">\r\n");
      out.write("\t\t\t\t\t<div class=\"t_851_2\">编辑社区居民健康档案</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"mainDiv\" class=\"l_849\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"patientId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.patientId }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"phrId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"50\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder='双击可关联患者' /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>编号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"userNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.userNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>性别</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"sex\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"未说明的性别\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.sex == '未说明的性别' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--未说明的性别--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"男\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.sex == '男' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"女\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.sex == '女' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">女</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"未知的性别\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.sex == '未知的性别' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">未知的性别</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>出生日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"birthday\" value='");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("' /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>身份证号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"idCardNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.idCardNo }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"不写，默认是‘无’\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>工作单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"workUnit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.workUnit }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"不写，默认是‘无’\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">本人电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.tel }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"tel\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">联系人</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.linkman }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"linkman\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">联系人电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.linkmanTel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"linkmanTel\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>常住类型</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"residentType\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"户籍\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.residentType == '户籍' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">户籍</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"非户籍\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.residentType == '非户籍' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">非户籍</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">民族</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.nation }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\"  name=\"nation\" value=\"汉族\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.nation == '汉族' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" /> 汉族\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"nation\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.nation == '其他' ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" /> 其他\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"nationName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.nationName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">血型</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"bloodType\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"不详\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.bloodType == '不详' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--不详--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"A型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.bloodType == 'A型' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">A型</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"B型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.bloodType == 'B型' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">B型</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"O型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.bloodType == 'O型' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">O型</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"AB型\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.bloodType == 'AB型' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">AB型</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">RH阴性</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"rhType\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"不详\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.rhType == '不详' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--不详--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"否\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.rhType == '否' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">否</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"是\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.rhType == '是' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">是</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">文化程度</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"degree\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"不详\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '不详' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--不详--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"文盲及半文盲\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '文盲及半文盲' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">文盲及半文盲</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"小学\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '小学' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">小学</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"初中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '初中' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">初中</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"高中/技校/中专\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '高中/技校/中专' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">高中/技校/中专</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"大学专科及以上\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.degree == '大学专科及以上' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">大学专科及以上</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">职业</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"profession\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"不便分类的其他从业人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '不便分类的其他从业人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--不便分类的其他从业人员--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"国家机关、党群组织、企业、事业单位负责人\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '国家机关、党群组织、企业、事业单位负责人' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">国家机关、党群组织、企业、事业单位负责人</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"专业技术人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '专业技术人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">专业技术人员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"办事人员和有关人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '办事人员和有关人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">办事人员和有关人员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"商业、服务业人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '商业、服务业人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">商业、服务业人员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"农、林、牧、渔、水利业生产人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '农、林、牧、渔、水利业生产人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">农、林、牧、渔、水利业生产人员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"生产、运输设备操作人员及有关人员\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.profession == '生产、运输设备操作人员及有关人员' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">生产、运输设备操作人员及有关人员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"军人\">军人</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">婚姻状况</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"maritalStatus\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"未说明的婚姻状况\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.maritalStatus == '未说明的婚姻状况' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">--未说明的婚姻状况--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"未婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.maritalStatus == '未婚' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">未婚</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"已婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.maritalStatus == '已婚' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">已婚</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"丧偶\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.maritalStatus == '丧偶' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">丧偶</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"离婚\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.maritalStatus == '离婚' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">离婚</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">医疗费用支付方式</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"payType\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"城镇职工基本医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '城镇职工基本医疗保险' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">城镇职工基本医疗保险</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"城镇居民基本医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '城镇居民基本医疗保险' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">城镇居民基本医疗保险</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"新型农村合作医疗\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '新型农村合作医疗' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">新型农村合作医疗</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"贫困救助\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '贫困救助' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">贫困救助</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"商业医疗保险\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '商业医疗保险' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">商业医疗保险</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"全公费\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '全公费' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">全公费</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"全自费\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.payType == '全自费' ? 'selected' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">全自费</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">遗传病史</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"ycbs\" class=\"input14\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.ycbs }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"多个用，号分割，默认为无\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">暴露史</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"bls\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.bls, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"bls\" value=\"化学品\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.bls, '化学品') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>化学品\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"bls\" value=\"毒物\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.bls, '毒物') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>毒物\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"bls\" value=\"射线\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.bls, '射线') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>射线\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">药物过敏史</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ywgms\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.ywgms, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ywgms\" value=\"青霉素\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.ywgms, '青霉素') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />青霉素\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ywgms\" value=\"磺胺\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.ywgms, '磺胺') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>磺胺\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ywgms\" value=\"链霉素\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.ywgms, '链霉素') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>链霉素\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"ywgmsName\" style=\"display:none\" placeholder=\"其他，多个用，号分割\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">父亲</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"高血压\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '高血压') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />高血压\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"糖尿病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '糖尿病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>糖尿病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"冠心病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '冠心病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>冠心病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"慢性阻塞性肺疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '慢性阻塞性肺疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>慢性阻塞性肺疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"恶性肿瘤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '恶性肿瘤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>恶性肿瘤\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"脑卒中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '脑卒中') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>脑卒中\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"重性精神疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '重性精神疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>重性精神疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"结核病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '结核病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>结核病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"肝炎\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '肝炎') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>肝炎\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsFq\" value=\"先天畸形\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsFq, '先天畸形') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>先天畸形\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">母亲</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"高血压\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '高血压') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />高血压\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"糖尿病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '糖尿病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />糖尿病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"冠心病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '冠心病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>冠心病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"慢性阻塞性肺疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '慢性阻塞性肺疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>慢性阻塞性肺疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"恶性肿瘤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '恶性肿瘤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>恶性肿瘤\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"脑卒中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '脑卒中') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>脑卒中\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"重性精神疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '重性精神疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>重性精神疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"结核病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '结核病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>结核病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"肝炎\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '肝炎') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>肝炎\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsMq\" value=\"先天畸形\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsMq, '先天畸形') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>先天畸形\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">兄弟姐妹</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"高血压\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '高血压') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />高血压\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"糖尿病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '糖尿病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />糖尿病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"冠心病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '冠心病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>冠心病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"慢性阻塞性肺疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '慢性阻塞性肺疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>慢性阻塞性肺疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"恶性肿瘤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '恶性肿瘤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>恶性肿瘤\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"脑卒中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '脑卒中') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>脑卒中\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"重性精神疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '重性精神疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>重性精神疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"结核病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '结核病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>结核病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"肝炎\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '肝炎') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>肝炎\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsXdjm\" value=\"先天畸形\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsXdjm, '先天畸形') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>先天畸形\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">子女</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"高血压\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '高血压') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />高血压\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"糖尿病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '糖尿病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />糖尿病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"冠心病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '冠心病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>冠心病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"慢性阻塞性肺疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '慢性阻塞性肺疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>慢性阻塞性肺疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"恶性肿瘤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '恶性肿瘤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>恶性肿瘤\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"脑卒中\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '脑卒中') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>脑卒中\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"重性精神疾病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '重性精神疾病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>重性精神疾病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"结核病\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '结核病') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>结核病\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"肝炎\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '肝炎') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>肝炎\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"jzsZn\" value=\"先天畸形\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.jzsZn, '先天畸形') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>先天畸形\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">残疾情况</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"视力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '视力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />视力残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"听力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '听力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>听力残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"言语残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '言语残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>言语残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"肢体残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '肢体残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>肢体残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"智力残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '智力残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>智力残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"精神残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '精神残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>精神残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"cjqk\" value=\"其他残疾\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.cjqk, '其他残疾') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>其他残疾\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">厨房排风</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCfpfss\" value=\"无\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCfpfss, '无') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />无\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCfpfss\" value=\"油烟机\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCfpfss, '油烟机') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />油烟机\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCfpfss\" value=\"换气扇\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCfpfss, '换气扇') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />换气扇\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCfpfss\" value=\"烟囱\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCfpfss, '烟囱') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>烟囱\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">禽畜栏</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjQcl\" value=\"单设\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjQcl, '单设') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />单设\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjQcl\" value=\"室内\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjQcl, '室内') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>室内\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjQcl\" value=\"室外\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjQcl, '室外') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>室外\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">燃料类型</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"液化气\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '液化气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />液化气\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"煤\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '煤') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>煤\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"天然气\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '天然气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>天然气\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"沼气 \" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '沼气') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>沼气\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"柴火\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '柴火') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>柴火\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjRllx\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjRllx, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>其他\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">饮水</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"自来水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '自来水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />自来水\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"经净化过滤的水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '经净化过滤的水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>经净化过滤的水\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"井水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '井水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>井水\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"河湖水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '河湖水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>河湖水\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"塘水\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '塘水') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>塘水\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjYs\" value=\"其他\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjYs, '其他') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>其他\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">厕所</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"329\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCs\" value=\"卫生厕所\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCs, '卫生厕所') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write(" />卫生厕所\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCs\" value=\"一格或二格粪池式\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCs, '一格或二格粪池式') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>一格或二格粪池式\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCs\" value=\"马桶\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCs, '马桶') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>马桶\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCs\" value=\"露天粪坑\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCs, '露天粪坑') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>露天粪坑\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"shhjCs\" value=\"简易棚厕\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(phrBasicInfo.shhjCs, '简易棚厕') ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("/>简易棚厕\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"758\" colspan=\"4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-bottom: 1px solid #f2f2f2; line-height: 36px; font-size: 14px; color: #333333\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>既往史</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  style=\"line-height: 20px; word-wrap: break-word; word-break: break-all; overflow: auto;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 疾病 -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">疾病类型：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"jbType\" class=\"pre_text\" style=\"width: 150px; float: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"无\">无</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"高血压\">高血压</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"糖尿病\">糖尿病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"冠心病\">冠心病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"慢性阻塞性肺疾病\">慢性阻塞性肺疾病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"恶性肿瘤\">恶性肿瘤</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"脑卒中\">脑卒中</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"重性精神疾病\">重性精神疾病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"结核病\">结核病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"肝炎\">肝炎</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"其他法定传染病\">其他法定传染病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"职业病\">职业病</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"其他\">其他</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> <span style=\"margin-top: 7px;\">确诊时间：</span>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"pre_text\" id=\"jbSj\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"sub_but\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"fnAddUI(this, 'jb');\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\">+</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 疾病回显 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 手术 -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">手术名称：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"无\" class=\"pre_text\" id=\"shType\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">手术时间：</span>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"pre_text\" id=\"shSj\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"sub_but\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"fnAddUI(this, 'sh');\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\">+</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 手术回显 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 外伤 -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">外伤名称：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"无\" class=\"pre_text\" id=\"wsType\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">外伤时间：</span>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"pre_text\" id=\"wsSj\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"sub_but\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"fnAddUI(this, 'ws');\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\">+</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 外伤回显 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 输血 -->\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">输血名称：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"无\" class=\"pre_text\" id=\"sxType\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">输血时间：</span>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"pre_text\" id=\"sxSj\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 150px; float: none;\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"sub_but\" href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"fnAddUI(this, 'sx');\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\">+</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 输血回显 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"92\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\" width=\"706\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"sub_fil hover\" value=\"编辑\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"margin-left: 165px;\" onclick=\"fnEditPhr(this);\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" style=\"margin-left: 240px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"sub_fil\" value=\"取消\" onclick=\"lh.back();\" />\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pz_down\">\r\n");
      out.write("\t\t");
      out.write("<div class=\"w_0100 back3\">\r\n");
      out.write("\t<div class=\"w_1000\">\r\n");
      out.write("\t\t<div class=\"c_1100_7\">\r\n");
      out.write("\t\t\t<div class=\"coy\">Copyright © 2015 北京沃诊无忧健康科技有限公司 版权所有 京ICP备16028449号-1  互联网药品信息服务资格证书 (京)-非经营性-2017-0022</div>\r\n");
      out.write("\t\t\t<div class=\"r_fx\">\r\n");
      out.write("\t\t\t\t<div class=\"bshare-custom\">\r\n");
      out.write("\t\t\t\t\t<a title=\"分享到\" href=\"http://www.bShare.cn/\" id=\"bshare-shareto\" style=\"color: #fff;\">分享本站：</a> <a title=\"分享到QQ空间\" class=\"bshare-qzone\"></a> <a\r\n");
      out.write("\t\t\t\t\t\ttitle=\"分享到新浪微博\" class=\"bshare-sinaminiblog\"></a> <a title=\"分享到人人网\" class=\"bshare-renren\"></a> <a title=\"分享到腾讯微博\" class=\"bshare-qqmb\"></a> <a\r\n");
      out.write("\t\t\t\t\t\ttitle=\"分享到网易微博\" class=\"bshare-neteasemb\"></a> <a title=\"更多平台\" class=\"bshare-more bshare-more-icon more-style-addthis\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"http://static.bshare.cn/b/bshareC0.js\"></script>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("<!-- 底部栏 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<!--\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://apps.bdimg.com/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">window.jQuery || document.write('<script src=\"/third-party/jquery/jquery-1.11.3.min.js\"><\\/script>');</script>\r\n");
      out.write("-->\r\n");
      out.write("<script src=\"/third-party/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/lodash/lodash.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/json2/json2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/jquery.event.drag/jquery.event.drag-2.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/jquery.event.drag/jquery.event.drag.live-2.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/clipboard/clipboard.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/mustache/mustache.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/is/is.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/moment/moment.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/moment/locale/zh-cn.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_base.js\" title=\"v\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_tools.js\"\r\n");
      out.write("\ttitle=\"v\"></script>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"http://res.wx.qq.com/open/js/jweixin-1.0.0.js\"></script>-->\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"/third-party/qrcode/utf.js\"></script>-->\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"/third-party/qrcode/jquery.qrcode.js\"></script>-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/pagination/query.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/third-party/pagination/paging.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/jquery.SuperSlide/jquery.SuperSlide.2.1.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/pzselect/pzselect.1.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/jquery-ajax-cache/locache.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/bootstrap-select-1.10.0/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_front.js\"\r\n");
      out.write("\ttitle=\"v\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/js/common/common_front_ui_bootstrap.js\" title=\"v\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/front/index.js\" title=\"v\"></script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/doctor/doctorCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/layer/layer.js\" title=\"v\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/z.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/doctor/phrEdit.js\" title=\"v\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty doctor}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    \t欢迎<a href=\"/doctorHome\"> <font>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font></a> 大夫 &nbsp;&nbsp;&nbsp;<a\r\n");
        out.write("\t\t\t\t\t\t\t\thref=\"/logout\" onclick=\"logout()\">退出登录</a>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fansList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("fans");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<li><a href=\"/doctor/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fans.fansAttrStr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"><nobr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fans.fansName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<!-- <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fans.provinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fans.hospitalName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("诊所</span>-->\r\n");
          out.write("\t\t\t\t\t\t\t</nobr></a></li>\r\n");
          out.write("\t\t\t\t");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty advertisementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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
    _jspx_th_c_forEach_1.setVar("advertisement");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisementList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement.linkUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"> <img\r\n");
          out.write("\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main27.jpg'\"\r\n");
          out.write("\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement.picPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"229\" height=\"131\" />\r\n");
          out.write("\t\t\t\t\t\t</a></li>\r\n");
          out.write("\t\t\t\t\t");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty advertisementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li><a href=\"javascript:;\" target=\"_blank\"><img\r\n");
        out.write("\t\t\t\t\t\t\tsrc='/images/front/main27.jpg' width=\"229\" height=\"131\" /></a></li>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.birthday }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.jwsDiseaseDes != '无' && fn:length(phrBasicInfo.jwsDiseaseDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_2.setVar("one");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(phrBasicInfo.jwsDiseaseDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\" type=\"dynamic_gen_jb\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<a class=\"sub_but\" href=\"javascript:;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"$(this).parent().parent().remove();\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\"><font color=red>x</font></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.jwsOperationDes != '无' && fn:length(phrBasicInfo.jwsOperationDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_3.setVar("one");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(phrBasicInfo.jwsOperationDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\" type=\"dynamic_gen_sh\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<a class=\"sub_but\" href=\"javascript:;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"$(this).parent().parent().remove();\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\"><font color=red>x</font></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.jwsTraumaDes != '无' && fn:length(phrBasicInfo.jwsTraumaDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_forEach_4.setVar("one");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(phrBasicInfo.jwsTraumaDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\" type=\"dynamic_gen_ws\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<a class=\"sub_but\" href=\"javascript:;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"$(this).parent().parent().remove();\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\"><font color=red>x</font></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phrBasicInfo.jwsTransfusionDes != '无' && fn:length(phrBasicInfo.jwsTransfusionDes) > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_5.setVar("one");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(phrBasicInfo.jwsTransfusionDes, ',') }", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\" type=\"dynamic_gen_sx\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[0] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <span style=\"margin-top: 7px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:split(one, ';')[1] }", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
          out.write("\" type=\"text\" class=\"pre_text\" readonly=\"readonly\" style=\"width: 150px; float: none;border:none;\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<a class=\"sub_but\" href=\"javascript:;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"$(this).parent().parent().remove();\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: none; padding: 5px 20px;\"><font color=red>x</font></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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
}
