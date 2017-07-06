package org.apache.jsp.views.front.domain.hospital;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hospitalHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
    _jspx_dependants.add("/views/front/common/top.htm");
    _jspx_dependants.add("/views/front/common/hospital/hospitalTop.htm");
    _jspx_dependants.add("/views/front/common/bottom.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_front_js.htm");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\thref=\"/css/front/hospital/hospital.css\" title=\"v\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/pagination/paging.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<div class=\"w_0100 back1\">\r\n");
      out.write("\t<div class=\"w_1000\">\r\n");
      out.write("\t\t<div class=\"c_1100\">\r\n");
      out.write("\t\t\t<div class=\"left\">沃诊无忧，您身边的家庭医生!</div>\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<div class=\"hover_l\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/\" target=\"_blank\">官网</a> &nbsp;&nbsp;/&nbsp;&nbsp;<a href=\"javascript:;\" onclick=\"lh.alert('电话：010-80880421  传真：010-80881641 E-mail：service@wonature.com');\">联系客服</a> &nbsp;&nbsp;/&nbsp;&nbsp; <a href=\"/\">网站地图</a>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;/&nbsp;&nbsp; <a onclick=\"topToIndex(true);\" href=\"javascript:;\">返回主页</a><!--userAddLocache(1,'/goHome')-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"land\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<span id=\"top_login_1\"> <a href=\"/login\" class=\"lan_one\" style=\"width: initial;\">登录</a></span>\r\n");
      out.write("\t\t\t\t\t<span id=\"top_login_2\"> <a href=\"/register\" target=\"_blank\" class=\"lan_two\" style=\"width: initial;\">注册</a></span>\r\n");
      out.write("\t\t\t\t\t<span id=\"top_login_3\" style=\"display:none;width: initial;\"> <a id=\"top_login_name\" href=\"/userBaseInformation\" style=\"width: initial;\" class=\"lan_one\"></a></span> \r\n");
      out.write("\t\t\t\t\t<span id=\"top_login_4\" style=\"display:none;width: initial;\"> <a style=\"width: initial;padding-left:17px;\" onclick=\"logout()\">退出</a></span><!--  href=\"/logout\" onclick=\"logout()\"-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t");
      out.write("<div class=\"w_0100 back5\">\r\n");
      out.write("\t<div class=\"w_1000\">\r\n");
      out.write("\t\t<div class=\"c_1100_9\">\r\n");
      out.write("\t\t\t<!-- <div class=\"l_name\">\r\n");
      out.write("            \t<div class=\"l_102\"><img src=\"/images/front/main22.jpg\" width=\"102\" height=\"126\" /></div>\r\n");
      out.write("                <div class=\"r_245\">\r\n");
      out.write("                \t<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.provinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.wholeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("诊所 </strong><br />\r\n");
      out.write("                    \t诊所负责人：李医生\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("\t\t\t<!--<div class=\"l_370\">\r\n");
      out.write("            \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.logo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"98\" height=\"98\" onerror=\"this.src='/images/front/main13.png'\" /> &nbsp;&nbsp;<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.wholeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("            </div>-->\r\n");
      out.write("\t\t\t<div class=\"l_370\" style=\"width: 700px;\">\r\n");
      out.write("\t\t\t\t<div style=\"display: inline-block; height: 98px; float: left;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.logo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tonerror=\"this.src='/images/front/default_hospital.jpg'\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"111\" height=\"111\" /> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"display: inline-block; height: 98px; float: left; width: 560px; line-height: 30px; font-weight: bolder; margin-top: 30px;\">\r\n");
      out.write("\t\t\t\t\t<span style=\"word-wrap: break-word; word-break: break-all;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.wholeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalProvinceName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--<div class=\"phone\" style=\"width:240px;\">\r\n");
      out.write("            \t<span>电话：</span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br /><span>地址：</span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            </div>-->\r\n");
      out.write("\t\t\t<div class=\"phone\" style=\"width: 365px; margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t<span>电话：</span>\r\n");
      out.write("\t\t\t\t<!--");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("-->\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write("\t\t\t\t<div style=\"float: left; width: 48px;\">\r\n");
      out.write("\t\t\t\t\t<span>地址：</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"float: left; width: 310px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<!-- 顶部菜单栏 -->\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t<div id=\"geren\"\r\n");
      out.write("\t\t\tstyle=\"height: auto; overflow: hidden; zoom: 1; margin-bottom: 20px; padding-bottom: 60px;\">\r\n");
      out.write("\t\t\t<div class=\"ge-fl\"\r\n");
      out.write("\t\t\t\tstyle=\"height: auto; margin-bottom: -10000px; padding-bottom: 10000px;\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"hospitalId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospitalId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t<div class=\"flbt\" id=\"flbt1\">\r\n");
      out.write("\t\t\t\t\t<h2>诊所信息</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"neirong1\">\r\n");
      out.write("\t\t\t\t\t<span class=\"span1\">诊所介绍</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"neirong2\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: auto; margin-top: 5px; width: 225px;\">\r\n");
      out.write("\t\t\t\t\t<p style=\"letter-spacing: normal;\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"neirong3 ys-nr3\" style=\"margin-top: 55px;\">\r\n");
      out.write("\t\t\t\t\t<span class=\"span2\">联系方式</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"neirong4\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: auto; margin-top: 5px; width: 225px;\">\r\n");
      out.write("\t\t\t\t\t<p style=\"letter-spacing: normal;\">\r\n");
      out.write("\t\t\t\t\t\t<b>地址：</b><br /> <br /> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br /> <br /> <b>诊所电话：</b><br />\r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br /> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.tel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"flbt\" id=\"flbt2\" style=\"margin-top: 80px;\">\r\n");
      out.write("\t\t\t\t\t<h2>网站统计</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"neirong5\" style=\"height: auto;\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t上次在线：<br> <i>");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</i>\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t开通时间：<br> <i>");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("</i>\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"ge-fr\"\r\n");
      out.write("\t\t\t\tstyle=\"height: auto; margin-bottom: -10000px; padding-bottom: 10000px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ys-zixun\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ge-fr-tit2\" style=\"margin-bottom: 0;\">\r\n");
      out.write("\t\t\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.wholeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("诊所可咨询专家</h2>\r\n");
      out.write("\t\t\t\t\t\t<i style=\"font-size: 16px; color: #fff; font-style: normal;\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"doctorList\">\r\n");
      out.write("\t\t\t\t\t\t<!--  <div class=\"zixun-box\">\r\n");
      out.write("\t\t                    <img src=\"images/ys-zixun.png\" style=\"padding-top:4px;\">\r\n");
      out.write("\t\t                    <h4>马艳</h4>\r\n");
      out.write("\t\t                    <b>副主任医师</b>\r\n");
      out.write("\t\t                    <span>血液科  皮肤病科  儿科</span>\r\n");
      out.write("\t\t                    <a href=\"#\"><input type=\"button\" value=\"咨询\" class=\"zx-btn1\"/></a>\r\n");
      out.write("\t\t                    <a href=\"#\"><input type=\"button\" value=\"预约\" class=\"zx-btn2\"/></a>\r\n");
      out.write("\t\t                </div> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fy_new\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"float: none; width: 853px; padding-top: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"page\" class=\"inline-center\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ge-fr-tit\" style=\"margin-top: 0px;\">\r\n");
      out.write("\t\t\t\t\t<h2>诊所公告</h2>\r\n");
      out.write("\t\t\t\t\t<span> <!-- （已帮助43782位患者） -->\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"wzswitch pz_tab\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 100%; float: none; max-height: 800px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t<!-- <button id=\"annoBtn\" style=\"float: right;\" type=\"button\" onclick=\"toggleAnno();\" class=\"btn btn-success\">折叠</button> -->\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ge-fr-tit2\" style=\"margin-top: 0px;\">\r\n");
      out.write("\t\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.wholeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("诊所的最新文章</h2>\r\n");
      out.write("\t\t\t\t\t<span> <!-- <a href=\"#\">More></a> -->\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ge-ul ys-zy\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
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
      out.write("\t\tsrc=\"/js/front/domain/hospital/hospitalCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/user/userCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/hospital/hospitalHome.js\" title=\"v\"></script>\r\n");
      out.write("\t<script id=\"template\" type=\"x-tmpl-mustache\"><!-- -->\r\n");
      out.write("\t\t{{#rows}}\r\n");
      out.write("\t\t\t<div class=\"zixun-box\" style=\"width:184px;\">\r\n");
      out.write("\t           <img src=\"{{avatar}}\" onclick=\"javascript:window.open('/doctor/{{attrStr}}')\" class=\"pointer img-circle\"  style=\"padding-top:4px;width:130px;height:130px;\" onerror=\"this.src='/images/front/main13.png'\" onclick=\"location.href='/doctor/{{id}}'\">\r\n");
      out.write("\t            <div style=\"margin:10px;\">\r\n");
      out.write("\t\t\t\t\t<span onclick=\"javascript:window.open('/doctor/{{attrStr}}')\" class=\"pointer\" style=\"color: rgb(101,153,70);font-size: 18px;\">{{username}}</span>\r\n");
      out.write("\t            \t<span style=\"font-size: 14px;font-weight: 700;\">{{titleNames}}</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin:10px;\">\r\n");
      out.write("\t            \t<span>{{departmentName}}</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t            <a href=\"/consult?doctorId={{id}}&hospitalId={{hospitalId}}\"><input type=\"button\" value=\"咨询\" class=\"zx-btn1\"/></a>\r\n");
      out.write("\t            <a href=\"#\"><input type=\"button\" value=\"预约\" onclick=\"selectBespeak('{{id}}','{{hospitalId}}')\" class=\"zx-btn2\"/></a>\r\n");
      out.write("\t         </div>\r\n");
      out.write("\t\t{{/rows}}\t\t \t\t \r\n");
      out.write("\t</script>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<span> <a href=\"/login\" class=\"lan_one\" style=\"width: initial;\">登录</a></span>\r\n");
        out.write("\t\t\t\t\t\t<span> <a href=\"/register\" target=\"_blank\" class=\"lan_two\" style=\"width: initial;\">注册</a></span>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<span style=\"width: initial;\"> <a href=\"/userBaseInformation\" style=\"width: initial;\" class=\"lan_one\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></span> \r\n");
        out.write("\t\t\t\t\t\t<span style=\"width: initial;\"> <a style=\"width: initial;padding-left:17px;\" onclick=\"logout()\">退出</a></span>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty hospital.introduction}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.introduction}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty hospital.introduction}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("暂无介绍");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.lastLoginTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("YYYY-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent(null);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hospital.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setPattern("YYYY-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty announcementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div id=\"annoContainer\"\r\n");
        out.write("\t\t\t\t\t\t\tstyle=\"word-wrap: break-word; word-break: break-all;\">\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_0.setVar("announcement");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcementList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"annoItem g_811 bd\" style=\"\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"box_811\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_771\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span><strong>");
          if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</strong><br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_600\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span><br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_771 pointer\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"max-height: 200px; overflow: auto;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"showContent_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"showContent(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setPattern("dd");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_3.setPattern("YYYY/MM");
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcement.gradeId == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color: orange;\">系统公告：</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty announcementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div>\r\n");
        out.write("\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"box_811\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"d_771\">暂无数据</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty articleList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_1.setVar("article");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<i>");
          if (_jspx_meth_fmt_formatDate_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</i> <img src=\"/images/front/yanj.jpg\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.scans}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t<hr />\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_4.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_4 = _jspx_th_fmt_formatDate_4.doStartTag();
    if (_jspx_th_fmt_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty articleList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li><span>暂无数据</span></li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}
