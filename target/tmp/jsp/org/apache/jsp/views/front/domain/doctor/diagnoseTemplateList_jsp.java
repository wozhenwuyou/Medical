package org.apache.jsp.views.front.domain.doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class diagnoseTemplateList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\thref=\"/third-party/pagination/paging.css\" />\r\n");
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
      out.write("\t\t\t\t\t<div class=\"t_851_2\">\r\n");
      out.write("\t\t\t\t\t\t病历模板\r\n");
      out.write("\t\t\t\t\t\t<button class=\"fr pointer btn btn-success\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"javascript:location.href='/addDiagnoseTemplate'\">添加模板</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"t_851_3\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"44\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"75\">模板名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"199\"><input type=\"text\" class=\"text_input2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"name\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"64\"><input type=\"submit\" class=\"sub_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"搜索\" onclick=\"loadGridData()\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"64\"><input type=\"submit\" class=\"sub_1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"重置\" onclick=\"resetQuery()\" style=\"margin-left: 10px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"d_851_1\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"849\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody id=\"dataListContainer\">\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fy_new\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"page\" class=\"inline-center\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
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
      out.write("\t\tsrc=\"/js/front/domain/doctor/doctorCommon.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/front/domain/doctor/diagnoseTemplateList.js\" title=\"v\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script id=\"template\" type=\"x-tmpl-mustache\"><!-- -->\r\n");
      out.write("\t\t<tr height=\"53\" align=\"center\" style=\"font-size:14px; color:#63a13f\">\r\n");
      out.write("\t\t\t<td width=\"200\">建立人</td>\r\n");
      out.write("        \t<td width=\"300\">模板名称</td>\r\n");
      out.write("\t\t\t<td width=\"95\">创建日期</td>\r\n");
      out.write("            <td width=\"15\">&nbsp;</td>\r\n");
      out.write("            <td width=\"130\">操作</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t{{#rows}}\r\n");
      out.write("\t\t<tr height=\"58\" align=\"center\" style=\"color:#666666\">\r\n");
      out.write("\t\t\t<td width=\"200\">{{createdBy}}</td>\r\n");
      out.write("\t    \t<td width=\"300\">{{templateName}}</td>\r\n");
      out.write("\t        <td width=\"155\">{{createDate}}</td>\r\n");
      out.write("\t        <td width=\"15\">&nbsp;</td>\r\n");
      out.write("\t        <td width=\"150\">\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"applyToReadDiagnose({{id}});\" class=\"btn btn-info\">申请授权查看</button>\r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"lh.confirm({content: '是否确定删除该病历模板？', clickYes:deleteDiagnoseTemplate, clickYesParam:{{id}}});\" class=\"btn btn-danger\">删除</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"editDiagnoseTemplate({{id}});\" class=\"btn btn-success\">编辑</button>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t    </tr>\r\n");
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
}
