package org.apache.jsp.views.front.base.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(9);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
    _jspx_dependants.add("/views/front/common/top.htm");
    _jspx_dependants.add("/views/front/common/menuTop.htm");
    _jspx_dependants.add("/views/front/common/passwordReset.htm");
    _jspx_dependants.add("/views/front/common/menuBottom.htm");
    _jspx_dependants.add("/views/front/common/bottom.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_front_js.htm");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t<div class=\"w_1000\">\r\n");
      out.write("\t\t\t<div class=\"c_1100_10\">\r\n");
      out.write("\t\t\t\t当前位置：<a href=\"/\">首页</a> - <a href=\"/doctorLogin\">医生入口</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"c_1100_12\">\r\n");
      out.write("\t\t\t\t<div class=\"l_720\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/front/ysrk.png\" width=\"685\" height=\"407\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"r_378\">\r\n");
      out.write("\t\t\t\t\t<div class=\"r_change\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"t_345\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>医生入口</span>\r\n");
      out.write("\t\t\t\t\t\t\t<button style=\"margin-left: 172px; margin-top: 3px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"button\" onclick=\"loginQuickly();\" class=\"btn btn-success\">快速登陆</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d_345\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d_change\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"345\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"42\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\" align=\"right\">手机号：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\"><input id=\"phone\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"input10\" placeholder=\"请输入手机号码\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"22\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\" id=\"phoneTip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"color: #fc0000; font-size: 12px; display: none;\">请填写手机号码！</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"53\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\" align=\"right\">密码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\"><input id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"input10\" placeholder=\"请输入密码\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"22\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\" id=\"passwordTip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"color: #fc0000; font-size: 12px; display: none;\">请填写密码！</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"70\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\" align=\"right\" style=\"line-height: 42px;\">验证码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"116\"><input id=\"verificationCode\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"input13\" placeholder=\"请输入验证码\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"134\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: left; width: 96px; height: 42px;\"> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref='javascript:loadRandomCode();'> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsrc='/login/loadVerificationCode' id='imgcode'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 96px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a> <a href=\"javascript:loadRandomCode();\">重新加载</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</i></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"22\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\" id=\"verificationCodeTip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"color: #fc0000; font-size: 12px; display: none;\">请填写验证码！</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"65\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"doMobileLogin()\" class=\"input12\" value=\"医生登录\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" id=\"remember\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin: 10px 0px 0px 30px\" /><label for=\"remember-me\">记住我</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"65\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"83\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"247\" colspan=\"2\"><a href=\"javascript:;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#exampleModal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"float: left; margin-left: 57px; color: #818181; line-height: 35px;\">忘记密码？</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"h_40\">&nbsp;</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\">\r\n");
      out.write("\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\" id=\"exampleModalLabel\">登陆密码重置<span style=\"font-size:14px;color:gray;\">（您也可以直接联系沃诊无忧客服进行密码重置）</span></h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t手机号:<input id=\"loginAccount1\" type=\"text\" class=\"form-control\" style=\"width:200px;display:inline;margin-left:10px;\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t新密码:<input id=\"newPassword1\" type=\"password\" class=\"form-control\" style=\"width:200px;display:inline;margin-left:10px;\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t验证码:<input id=\"emailVerifyCode1\" type=\"text\" class=\"form-control\" style=\"width:200px;display:inline;margin-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"emailVerifyCodeBtn\" onclick=\"sendEmailVerifyCode();\" type=\"button\" class=\"btn btn-info\">获取验证码</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"pswd_set_tip\" class=\"form-group\" style=\"color: black;margin-left: 50px;\">\r\n");
      out.write("\t\t\t\t\t\t点击获取验证码，我们将会把验证码发送到您绑定的邮箱。\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"passwordReset();\" class=\"btn btn-primary\">确定</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\tsrc=\"/js/front/base/login/passwordReset.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/base/login/doctorLogin.js\" title=\"v\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
