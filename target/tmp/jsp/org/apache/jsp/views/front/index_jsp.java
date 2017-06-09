package org.apache.jsp.views.front;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(9);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
    _jspx_dependants.add("/views/front/common/top.htm");
    _jspx_dependants.add("/views/front/common/menuTop.htm");
    _jspx_dependants.add("/views/front/common/menuBottom.htm");
    _jspx_dependants.add("/views/front/common/bottom.htm");
    _jspx_dependants.add("/views/front/common/nav.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_front_js.htm");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
    _jspx_tagPool_c_forEach_var_items_begin.release();
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
      out.write("<style>\r\n");
      out.write(".quote_text {\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\ttext-overflow: ellipsis;\r\n");
      out.write("\t-o-text-overflow: ellipsis;\r\n");
      out.write("\t-webkit-text-overflow: ellipsis;\r\n");
      out.write("\t-moz-text-overflow: ellipsis;\r\n");
      out.write("\tword-break: break-all;\r\n");
      out.write("\tword-wrap: break-word;\r\n");
      out.write("\tdisplay: -webkit-box;\r\n");
      out.write("\t-webkit-line-clamp: 2;\r\n");
      out.write("\t-webkit-box-orient: vertical;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text2 {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\tword-break: break-all;\r\n");
      out.write("\tdisplay: -webkit-box;\r\n");
      out.write("\t-webkit-line-clamp: 2;\r\n");
      out.write("\t-webkit-box-orient: vertical;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"pz_top\">\r\n");
      out.write("\t\t");
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
      out.write("\t\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t-->\r\n");
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
      out.write("\t\t");
      out.write("<div class=\"w_1000\">\r\n");
      out.write("\t<div class=\"c_1100_1\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"/\"> \r\n");
      out.write("\t\t\t\t<img src=\"/images/front/logo.jpg\" width=\"134\" height=\"104\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right_1\">\r\n");
      out.write("\t\t\t<div class=\"so\">\r\n");
      out.write("\t\t\t\t<div class=\"l_346\">\r\n");
      out.write("\t\t\t\t\t<div class=\"searchbox\" pzdatatype=\"select\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" />\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class='serul' pzdatatype=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t<li onclick=\"getTypeId(1)\">找诊所</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li onclick=\"getTypeId(2)\">找医生</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"input1\" id=\"searchName\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"image\" src=\"/images/front/top4.jpg\" onclick=\"searchDoctorOrHospital()\" width=\"48\" height=\"48\" class=\"input2\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"consult\">\r\n");
      out.write("\t\t\t\t<a href=\"/consultDoctorList\" target=\"_blank\"> \r\n");
      out.write("\t\t\t\t\t<span>我要咨询</span> \r\n");
      out.write("\t\t\t\t\t<br />医生将为您在线解答\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"c_1100_2\">\r\n");
      out.write("\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"nli_1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/\"> \r\n");
      out.write("\t\t\t\t\t\t<img src=\"/images/front/menu1.png\" width=\"24\" height=\"20\" />\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nli\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" style=\"width:95px;background:none;text-decoration: none;cursor: default;border:none;margin:-1px;\">我要预约：</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nli\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/bespeakChoose/1\" >远程诊疗</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nli\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/bespeakChoose/2\" >上门服务</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nli\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/hospital/hospitalBloodTest\" >血液检测</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t<li class=\"nli\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">基因检测</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"special\">\r\n");
      out.write("\t\t\t<a href=\"/articleList/42\" style=\"width: 128px;\">健康资讯</a>\r\n");
      out.write("\t\t\t<a href=\"http://www.wozhenwuyou.cn/page442\" style=\"width: 128px\">药品信息</a>\r\n");
      out.write("\t\t\t<a onclick=\"userAddLocache(4,'/userReportList')\" href=\"javascript:;\" style=\"width: 128px\">健康管理</a>\r\n");
      out.write("            <div class=\"aboutus\">\r\n");
      out.write("                <!--<a href=\"javascript:\" style=\"width:126px;\">关于我们</a>-->\r\n");
      out.write("                <a href=\"http://www.wozhenwuyou.cn/page442\" style=\"width:126px;\">关于我们</a>\r\n");
      out.write("                <div class=\"aboutnav\" style=\"position: absolute\">\r\n");
      out.write("                    <a href=\"/sysArticle/sa2\">公司简介</a>\r\n");
      out.write("                    <!--<a href=\"/article/56/25\">公司愿景</a>-->\r\n");
      out.write("                    <a href=\"/sysArticle/sa3\">项目简介</a>\r\n");
      out.write("                    <a href=\"javascript:;\" onclick=\"lh.alert('电话：010-80880421  传真：010-80881641 E-mail：service@wonature.com');\">联系我们</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pz_banner\">\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t<div class=\"pz_slides_3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"_btn\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"_pic\">\r\n");
      out.write("\t\t\t\t\t\t<ul style='height: 331px;'>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"r_344\">\r\n");
      out.write("\t\t\t\t<div class=\"t_344\" style='margin-top: 10px;'>\r\n");
      out.write("\t\t\t\t\t<a href=\"/doctorLogin\"><img src=\"/images/front/main1-1.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 110px; width: 344px;\" /></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"pf_280\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tit tit-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>会员入口</strong><br /> <span>member entrance</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:\" onclick=\"checkLogin(1);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more-1\">登录</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"/register\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more-2\">注册</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"t_344\" style='margin-top: 2px;'>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:\" onclick=\"checkLogin(2);\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/images/front/main10-10.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 110px; width: 344px;\" /></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"pf_280\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:\" onclick=\"checkLogin(2);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>医生入口</strong><br /> <span>Doctor entrance</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"t_344\" style='margin-top: 2px;'>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:\" onclick=\"checkLogin(3);\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"/images/front/main4-4.jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 110px; width: 344px;\" /></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"pf_280\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:\" onclick=\"checkLogin(3);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>医疗机构入口</strong><br /> <span>Medical institution\r\n");
      out.write("\t\t\t\t\t\t\t\t\tentrance</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"more\">进入</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t<div class=\"c_1100_4\">\r\n");
      out.write("\t\t\t\t<div class=\"l_746\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tit_0100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"work\">\r\n");
      out.write("\t\t\t\t\t\t\t优医在线 &nbsp;<span>Good doctor online</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"more_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/searchDoctorOrHospitalList/2\" style=\"background: none;\">更多</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"h_1\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"d_746\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"r_344_1 pz_tab\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 10px; max-height: 289px; overflow: hidden;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"t_344_1 hd\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"slideBox_li_1\" onclick=\"switchIndexArticle(1);\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonmouseover=\"switchIndexArticle(1);\" class=\"left1 on\">公告</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"slideBox_li_2\" onclick=\"switchIndexArticle(2);\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonmouseover=\"switchIndexArticle(2);\">活动</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"slideBox_li_3\" onclick=\"switchIndexArticle(3);\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonmouseover=\"switchIndexArticle(3);\">调查</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"d_344\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slideBox_1\" class=\"topMarqueeDiv\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slideBox_2\" class=\"topMarqueeDiv\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slideBox_3\" class=\"topMarqueeDiv\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"c_1100_3\">\r\n");
      out.write("\t\t\t\t<div class=\"l_368\" style=\"background-color: #ededed\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tit_0100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"work\">\r\n");
      out.write("\t\t\t\t\t\t\t热点讨论 &nbsp;<span>Hot discussion</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"more_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/articleList/43\" target=\"_blank\">更多</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"list1\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"l_368\" style=\"background-color: #ededed\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tit_0100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"work\">\r\n");
      out.write("\t\t\t\t\t\t\t健康资讯 &nbsp;<span>Health information</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"more_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/articleList/42\" target=\"_blank\">更多</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"list1\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"r_344_2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tit_0100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"work\">\r\n");
      out.write("\t\t\t\t\t\t\t名医观点 &nbsp;<span>Medical opinion</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"more_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/articleList/44\" target=\"_blank\">更多</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"d_344_1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top_314 slideBox\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>1</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>2</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>3</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d_list\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"r_344_2\" style=\"margin-top: 5px; height: 268px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"d_344_1\" style=\"width: 344px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top_314 slideBox\" style=\"width: 344px; height: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bd\" style=\"width: 344px; height: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul style=\"width: 344px; height: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"c_1100_5\" style=\"height: 320px;\">\r\n");
      out.write("\t\t\t\t<!-- 350 -->\r\n");
      out.write("\t\t\t\t<div class=\"tit_0100\">\r\n");
      out.write("\t\t\t\t\t<div class=\"work\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: 0 0 0 10px; background-position: 0 center;\">发生在身边的那些事</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"more_1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/articleList/48\" target=\"_blank\">更多</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"d_1100\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pz_down\">\r\n");
      out.write("\t\t<!-- include file=\"/views/front/common/otherlink.htm\"-->\r\n");
      out.write("\t\t<div id=\"link\"></div>\r\n");
      out.write("\t\t<div id='otherlink' style=\"height: auto;\">\r\n");
      out.write("\t\t\t<ul id=\"link-ul\">\r\n");
      out.write("\t\t\t\t<li class=\"link1\">友情链接</li>\r\n");
      out.write("\t\t\t\t<li>名站导航</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"link-part linkpart1\"\r\n");
      out.write("\t\t\t\tstyle=\"height: auto; min-height: 80px; position: initial; margin-bottom: 15px;\">\r\n");
      out.write("\t\t\t\t<ul id=\"baseLinkUl\" style=\"display: inline-block;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"link-part linkpart3\"\r\n");
      out.write("\t\t\t\tstyle=\"height: auto; min-height: 80px; position: initial; margin-bottom: 15px; overflow: visiable;\">\r\n");
      out.write("\t\t\t\t<div id=\"linkFamousDiv\"\r\n");
      out.write("\t\t\t\t\tstyle=\"display: inline-block; color: #666; text-decoration: none; margin-left: 22px; line-height: 28px; font-size: 14px;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"linkFamousTable\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\t\tborder=\"0\" width=\"1100\"></table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("<div class=\"w_0100 back2\">\r\n");
      out.write("\t<div class=\"w_1000\">\r\n");
      out.write("\t\t<div class=\"c_1100_6\">\r\n");
      out.write("\t\t\t<div class=\"l_167\">\r\n");
      out.write("\t\t\t\t<div class=\"t_167\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"text-decoration: none;cursor: default;\">我要预约</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"d_167\">\r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/bespeakChoose/1\" target=\"_blank\">远程诊疗</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/bespeakChoose/2\" target=\"_blank\">上门服务</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/hospital/hospitalBloodTest\" target=\"_blank\">血液检测</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<!--<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">基因检测</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"l_167\">\r\n");
      out.write("\t\t\t\t<div class=\"t_167\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" style=\"text-decoration: none;cursor: default;\">公司动态</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"d_167\">\r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/annoArticleList\" target=\"_blank\">公告</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/baseArticleList/46\" target=\"_blank\">活动</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"/baseArticleList/47\" target=\"_blank\">调查</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"l_167\">\r\n");
      out.write("\t\t\t\t<div class=\"t_167\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" style=\"text-decoration: none;cursor: default;\">关于我们</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"d_167\">\r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<!--<a href=\"/article/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${introduction.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${introduction.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"_blank\">公司简介</a>-->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/sysArticle/sa2\" target=\"_blank\">公司简介</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<!--<a href=\"/article/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vision.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vision.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"_blank\">公司愿景</a>-->\r\n");
      out.write("\t\t\t\t\t\t<!--<a href=\"/article/56/25\" target=\"_blank\">公司愿景</a>-->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/sysArticle/sa3\" target=\"_blank\">项目简介</a>\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<span> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\" onclick=\"lh.alert('电话：010-80880421  传真：010-80881641 E-mail：service@wonature.com');\">联系我们</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"l_120\">\r\n");
      out.write("\t\t\t\t<img src=\"/images/front/down1.jpg\" width=\"110\" height=\"110\" /> \r\n");
      out.write("\t\t\t\t<br /> 微信公众平台\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"r_240\">\r\n");
      out.write("\t\t\t\t<strong>您身边的家庭医生</strong> \r\n");
      out.write("\t\t\t\t<br /> \r\n");
      out.write("\t\t\t\t<span>4000-968-767</span> \r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t地址：北京市通州区滨惠南三街38号2109室 <br />电话：010-80880421 \r\n");
      out.write("\t\t\t\t\t<br />传真：010-80881641 \r\n");
      out.write("\t\t\t\t\t<br />E-mail：service@wonature.com\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("<div class=\"fixed\" id=\"pf\" style=\"top:245px;right:25px;margin-right:auto;height:370px;\">\r\n");
      out.write("\t<span id=\"nav1\"> <a onclick=\"userAddLocache(4,'/userReportList')\" href=\"javascript:;\"> <i> <br />\r\n");
      out.write("\t\t</i>检测报告\r\n");
      out.write("\t</a>\r\n");
      out.write("\t</span> \r\n");
      out.write("\t<span id=\"nav2\"> <a onclick=\"userAddLocache(6,'/userDiagnoseList')\" href=\"javascript:;\"> <i> <br />\r\n");
      out.write("\t\t</i>就诊记录\r\n");
      out.write("\t</a>\r\n");
      out.write("\t</span> \r\n");
      out.write("\t<span id=\"nav3\" class=\"hover\"> \r\n");
      out.write("\t\t<i id=\"nav_center\" style=\"position: absolute;margin-top:40px;right: 80px;width: 30px;color:#6AA744;cursor:pointer;\" onclick=\"toggleNav();\">折叠</i>\r\n");
      out.write("\t\t<a onclick=\"userAddLocache(1,'/userBaseInformation')\" href=\"javascript:;\"> <i> <img src=\"/images/front/main20.png\" width=\"24\" height=\"24\" /> <br />\r\n");
      out.write("\t\t个人中心\r\n");
      out.write("\t\t</i>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t</span> \r\n");
      out.write("\t<span id=\"nav4\"> <a onclick=\"userAddLocache(3,'/userNotice')\" href=\"javascript:;\"> <i> <br />\r\n");
      out.write("\t\t</i>我的消息\r\n");
      out.write("\t</a>\r\n");
      out.write("\t</span> \r\n");
      out.write("\t<span id=\"nav5\"> <a onclick=\"userAddLocache(8,'/myDoctor')\" href=\"javascript:;\"> <i> <br />\r\n");
      out.write("\t\t</i>我的医生\r\n");
      out.write("\t</a>\r\n");
      out.write("\t</span>\r\n");
      out.write("</div>");
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
      out.write("\t\tsrc=\"/js/front/domain/user/userCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/front/link.js\" title=\"v\"></script>\r\n");
      out.write("\t<!-- <script type=\"text/javascript\" src=\"/js/front/jquerydotdotdot.js\" title=\"v\"></script> -->\r\n");
      out.write("\t<!-- <script type=\"text/javascript\">\r\n");
      out.write("\t\tlh.paramJson = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramJson}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("  \t</script> -->\r\n");
      out.write("\t<!-- <script type=\"text/javascript\">\r\n");
      out.write("\t  \t$(function () {\r\n");
      out.write("\t\t  \t $(\".quote_text\").dotdotdot({\r\n");
      out.write("\t\t         // configuration goes here\r\n");
      out.write("\t\t         height:50\r\n");
      out.write("\t\t     });\r\n");
      out.write("\t  \t});\r\n");
      out.write("  \t</script> -->\r\n");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchTypeId == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"titcon tw\" pzdatatype=\"title\">找医生</div>\r\n");
        out.write("\t\t\t\t\t\t");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchTypeId == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"titcon tw\" pzdatatype=\"title\">找诊所</div>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty searchTypeId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"titcon tw\" pzdatatype=\"title\">找医生</div>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty advertisementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_forEach_0.setVar("advertisement");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisementList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement.linkUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/banner.jpg'\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement.picPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"746\" height=\"321\" /></a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty advertisementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<li><a href=\"javascript:;\"><img\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"/images/front/banner.jpg\" width=\"746\" height=\"331\" /></a></li>\r\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctorList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("doctor");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"t_img\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/doctor/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.attrStr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"img-circle\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main13.png'\" /></a>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"tit1\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"/doctor/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.attrStr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.departmentName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.titleNames}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"con\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a target=\"_blank\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/consult?doctorId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&hospitalId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.hospitalId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">在线咨询</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</li>\r\n");
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

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty announcementList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; text-align: center;\">暂无公告</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_309\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"max-height: 120px; overflow: hidden;\"></div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("anno");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${announcementList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"l_55\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</strong><br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer quote_text\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"lh.jumpToUrl('/anno/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"max-height: 44px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a style=\"float: none;\" href=\"/anno/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_309 quote_text\" style=\"max-height: 120px;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"lh.jumpToUrl('/anno/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${anno.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setPattern("YYYY/MM");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty activityList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; text-align: center;\">暂无活动</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_309\" style=\"max-height: 120px;\"></div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("activity");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activityList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"l_55\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
          if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</strong><br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer quote_text\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"max-height: 44px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a style=\"float: none;\" href=\"/baseArticle/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_309 quote_text\" style=\"max-height: 120px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setPattern("dd");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activity.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_3.setPattern("YYYY/MM");
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty investigationList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 100%; text-align: center;\">暂无调查</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_309\" style=\"max-height: 120px;\"></div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("investigation");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${investigationList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_309\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"l_55\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
          if (_jspx_meth_fmt_formatDate_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</strong><br />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"r_242 pointer quote_text\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"max-height: 44px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a style=\"float: none;\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"/baseArticle/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${investigation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${investigation.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div> ");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_fmt_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${investigation.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_4.setPattern("dd");
    int _jspx_eval_fmt_formatDate_4 = _jspx_th_fmt_formatDate_4.doStartTag();
    if (_jspx_th_fmt_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_fmt_formatDate_5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${investigation.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_5.setPattern("YYYY/MM");
    int _jspx_eval_fmt_formatDate_5 = _jspx_th_fmt_formatDate_5.doStartTag();
    if (_jspx_th_fmt_formatDate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussionList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("hotDiscussion");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li class=\"l1\" style=\"height: 84px;\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\thref=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussion.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"l_80\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussion.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main8.jpg'\" width=\"80\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\theight=\"60\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"r_256\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_tit quote_text\" style=\"max-height: 40px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussion.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_time\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_fmt_formatDate_6.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hotDiscussion.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_6.setPattern("YYYY-MM-dd");
    int _jspx_eval_fmt_formatDate_6 = _jspx_th_fmt_formatDate_6.doStartTag();
    if (_jspx_th_fmt_formatDate_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_6);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformationList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("healthInformation");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<li class=\"l1\" style=\"height: 84px;\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\thref=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformation.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"l_80\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformation.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main10.jpg'\" width=\"80\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\theight=\"60\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"r_256\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"t_tit quote_text\" style=\"max-height: 40px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformation.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"d_time\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_formatDate_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_fmt_formatDate_7.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${healthInformation.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_7.setPattern("YYYY-MM-dd");
    int _jspx_eval_fmt_formatDate_7 = _jspx_th_fmt_formatDate_7.doStartTag();
    if (_jspx_th_fmt_formatDate_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_7);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinionList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setVar("medicalOpinion");
    _jspx_th_c_forEach_7.setBegin(0);
    _jspx_th_c_forEach_7.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main14.jpg'\" width=\"314\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\theight=\"100\" /></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"pf_314\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><nobr>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</nobr></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent(null);
    _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinionList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_8.setVar("medicalOpinion");
    _jspx_th_c_forEach_8.setBegin(3);
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\thref=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><nobr>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${medicalOpinion.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</nobr></a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_var_items_begin.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent(null);
    _jspx_th_c_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisementList2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_9.setVar("advertisement2");
    _jspx_th_c_forEach_9.setVarStatus("v");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_10.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_10.setParent(null);
    _jspx_th_c_forEach_10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisementList2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_10.setVar("advertisement2");
    int[] _jspx_push_body_count_c_forEach_10 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_10 = _jspx_th_c_forEach_10.doStartTag();
      if (_jspx_eval_c_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"width: 344px; height: 268px;\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement2.linkUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"_blank\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 344px;\"> <img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/banner.jpg'\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${advertisement2.picPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"344\" height=\"268\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_10.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_10);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_11.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_11.setParent(null);
    _jspx_th_c_forEach_11.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sideList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_11.setVar("side");
    int[] _jspx_push_body_count_c_forEach_11 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_11 = _jspx_th_c_forEach_11.doStartTag();
      if (_jspx_eval_c_forEach_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"t_260\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tonerror=\"this.src='/images/front/main16.jpg'\" width=\"260\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\theight=\"175\" /></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"tit_260\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"/article/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.typeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><nobr>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</nobr></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"time_260\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_11, _jspx_page_context, _jspx_push_body_count_c_forEach_11))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</div> ");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_11.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_11);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_11);
    _jspx_th_fmt_formatDate_8.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${side.createdAt}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_8.setPattern("YYYY-MM-dd");
    int _jspx_eval_fmt_formatDate_8 = _jspx_th_fmt_formatDate_8.doStartTag();
    if (_jspx_th_fmt_formatDate_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_8);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_8);
    return false;
  }
}
