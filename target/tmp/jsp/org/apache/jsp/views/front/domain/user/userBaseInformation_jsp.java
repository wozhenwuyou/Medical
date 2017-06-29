package org.apache.jsp.views.front.domain.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userBaseInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
    _jspx_dependants.add("/views/front/common/top.htm");
    _jspx_dependants.add("/views/front/common/menuTop.htm");
    _jspx_dependants.add("/views/front/common/user/userLeft.htm");
    _jspx_dependants.add("/views/front/common/menuBottom.htm");
    _jspx_dependants.add("/views/front/common/bottom.htm");
    _jspx_dependants.add("/views/front/common/nav.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_front_js.htm");
    _jspx_dependants.add("/views/common/common_upload_js.htm");
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
      out.write("\t\t\t\t\t -->\r\n");
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
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t<div class=\"c_1100_10\">\r\n");
      out.write("\t\t\t\t当前位置：<a href=\"/\">首页</a> - <a href=\"/userBaseInformation\">基本信息</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<div class=\"w_229\" style=\"padding-top: 0;\">\r\n");
      out.write("\t<div class=\"t_229 pointer\">我的中心</div>\r\n");
      out.write("\t<div class=\"pz_SideLayer2\">\r\n");
      out.write("\t\t<li class=\"l4\"><a href=\"javascript:;\">信息管理</a>\r\n");
      out.write("\t\t\t<ul class=\"down_ul\">\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_1\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(1,'/userBaseInformation')\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">基本信息</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_2\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(2,'/relationPatientList')\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">关联用户</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_3\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(3,'/userNotice')\" href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t我的消息 ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"l4\"><a href=\"javascript:;\">健康管理</a>\r\n");
      out.write("\t\t\t<ul class=\"down_ul\">\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_4\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(4,'/userReportList')\" href=\"javascript:;\">我的检测报告</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_5\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(5,'/regularRemindList')\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">定期检查提醒</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"l4\"><a href=\"javascript:;\">疾病管理</a>\r\n");
      out.write("\t\t\t<ul class=\"down_ul\">\r\n");
      out.write("\t\t\t\t<!--<li class=\"l5 first\"><a href=\"/consult\">咨询医生</a></li>-->\r\n");
      out.write("\t\t\t\t<li class=\"l5\"><a id=\"user_li_6\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(6,'/userDiagnoseList')\" href=\"javascript:;\">我的病历</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_7\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(7,'/consultRecord')\" href=\"javascript:;\">咨询记录</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"l4\"><a href=\"javascript:;\">医疗服务</a>\r\n");
      out.write("\t\t\t<ul class=\"down_ul\">\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_8\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(8,'/myDoctor')\" href=\"javascript:;\">我的医生</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"l5\"><a id=\"user_li_9\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(9,'/bespeakRecord')\" href=\"javascript:;\">我的预约</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li class=\"l4\"><a href=\"javascript:;\">通知中心</a>\r\n");
      out.write("\t\t\t<ul class=\"down_ul\">\r\n");
      out.write("\t\t\t\t<li class=\"l5 first\"><a id=\"user_li_10\"\r\n");
      out.write("\t\t\t\t\tonclick=\"userAddLocache(10,'/userInternalMessage')\"\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\">站内信</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w_824\" style=\"padding-top: 0;\">\r\n");
      out.write("\t\t\t\t<div class=\"c_824\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-color: #FFFFFF; padding: 0 0 0 20px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"t_851_4 pointer\" id=\"remindNewMsg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"display: none; color: red; background: url(/images/front/main28.jpg) no-repeat 0 center;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp; 您有<u id=\"remindCount\">0</u>个新的定期提醒\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"t_851_4\">\r\n");
      out.write("\t\t\t\t\t\t用户基本信息\r\n");
      out.write("\t\t\t\t\t\t<button class=\"fr btn btn-success\" onclick=\"reset();\">重置密码</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"color: red;\">带红色*的为必填</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" id=\"cityId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\"\r\n");
      out.write("\t\t\t\t\t\tid=\"baseInformation\">\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>电话号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>身份证号码</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"idcardNum\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.idcardNum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"50\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>用户昵称</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>真实姓名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"realName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.realName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">职业</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><select class=\"input8\" id=\"job\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">邮箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>出生日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input id=\"datetimepicker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonchange=\"freshAge();\" class=\"input14\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">年龄</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input type=\"number\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"48\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"88\" style=\"color: #333333; line-height: 33px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>所在省份</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"1\" width=\"299\"><select class=\"input8\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"province\" onChange=\"provinceChange()\" style=\"width: 268px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"88\" style=\"color: #333333; line-height: 33px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>所在城市</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"1\" width=\"299\" id=\"cityDiv\" style=\"width: 268px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>性别</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"310\"><select id=\"sex\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"height: 30px; width: 268px; border: 1px solid #e4e4e3;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\" valign=\"middle\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red;\">*</span>用户头像</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"top: 10px;\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"display: inline-block; float: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"picurl\" id=\"userAvatar\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"height: 60px; max-width: 100px; overflow: hidden; padding: 5px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"filePaths\" id=\"filePaths\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"fileDBIds\" id=\"fileDBIds\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"browse\" type=\"button\" class=\"sub_fil hover\">选择图片</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"upload_outer_div\" style=\"margin-top: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 上传文件进度展示 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"92\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\" width=\"706\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button style=\"margin-right: 80px;\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"upDatePatientInformation();\" class=\"btn btn-success\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button style=\"margin-right: 80px;\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"lh.back();\" class=\"btn btn-success\">返回</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"display: none;\" id=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">新密码</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"329\"><input type=\"password\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"password\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"92\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"67\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\" width=\"706\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button style=\"margin-right: 80px;\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"upDateUserPassword();\" class=\"btn btn-success\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button style=\"margin-right: 80px;\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"reset('cancel');\" class=\"btn btn-success\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"pz_down\">\r\n");
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
      out.write("\t");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/plupload/js/plupload.full.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_upload.js\"\r\n");
      out.write("\ttitle=\"v\"></script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/user/userCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/user/userBaseInformation.js\" title=\"v\"></script>\r\n");
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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty notReadCount}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<span id=\"notReadMsgCount\" style=\"color: red;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notReadCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("job");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.codeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.id == user.jobId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.birthday}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
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
    _jspx_th_c_forEach_1.setVar("province");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provinceCityAreaList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.areaName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${province.id == user.province}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
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

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty user.sex}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">女</option>\r\n");
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

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty user.sex}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.sex == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">男</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">女</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.sex == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\" selected=\"selected\">女</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }
}
