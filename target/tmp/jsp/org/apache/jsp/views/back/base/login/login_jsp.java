package org.apache.jsp.views.back.base.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_back_css.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_back_js.htm");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/easyui/themes/default/easyui.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/easyui/themes/icon.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/buttons/buttons.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"/css/common.css\" title=\"v\" />");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/third-party/reset/reset.css\" />\r\n");
      out.write("<!-- CSS reset -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/back/login.css\" title=\"v\" />\r\n");
      out.write("<!-- Gem style -->\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"min-width: 1000px;\">\r\n");
      out.write("\t<header role=\"banner\">\r\n");
      out.write("\t\t<!-- <div id=\"cd-logo\"><a href=\"#0\"><img src=\"/images/back/login/cd-logo.svg\" alt=\"Logo\"></a></div> -->\r\n");
      out.write("\t\t<div id=\"cd-logo\" style=\"margin: 5px 20px 5px 50px;\">\r\n");
      out.write("\t\t\t<a href=\"#0\"><img src=\"/images/front/main23.png\" height=\"72px\"\r\n");
      out.write("\t\t\t\talt=\"Logo\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tstyle=\"color: #D4D4D4; float: left; margin: 20px 8px 16px 0px; padding: 5px;\">\r\n");
      out.write("\t\t\t<span style=\"font-size: 24px;\">沃诊无忧医疗信息管理平台</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<nav class=\"main-nav\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<!-- inser more links here -->\r\n");
      out.write("\t\t\t\t<!-- <li><a class=\"cd-signin\" href=\"#0\">登 陆</a></li> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"cd-user-modal is-visible\" style=\"background: none;\">\r\n");
      out.write("\t\t<!-- this is the entire modal form, including the background -->\r\n");
      out.write("\t\t<div class=\"cd-user-modal-container\"\r\n");
      out.write("\t\t\tstyle=\"background: #EAE9E9; top: 10%;\">\r\n");
      out.write("\t\t\t<!-- this is the container wrapper -->\r\n");
      out.write("\t\t\t<!-- <ul class=\"cd-switcher\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#0\">登 陆</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#0\">登 陆</a></li>\r\n");
      out.write("\t\t\t</ul> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"cd-login\" class=\"is-selected\" style=\"background: none;\">\r\n");
      out.write("\t\t\t\t<!-- log in form -->\r\n");
      out.write("\t\t\t\t<form class=\"cd-form\">\r\n");
      out.write("\t\t\t\t\t<p class=\"fieldset\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"image-replace cd-username\" for=\"signin-username\">账号</label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"full-width has-padding has-border\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"signin-username\" type=\"text\" placeholder=\"账号\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"cd-error-message\">请输入您的账号</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"fieldset\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"image-replace cd-password\" for=\"signin-password\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"full-width has-padding has-border\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"signin-password\" type=\"password\" placeholder=\"密码\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"cd-error-message\">请输入您的密码</span>\r\n");
      out.write("\t\t\t\t\t\t<!-- <a href=\"#0\" class=\"hide-password\">隐藏</a> -->\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"fieldset\" style=\"position: relative; top: -19px;\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"image-replace cd-close\"\r\n");
      out.write("\t\t\t\t\t\t\tfor=\"signin-verificationCode\">验证码</label> <input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"full-width has-padding has-border\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"signin-verificationCode\" type=\"text\" placeholder=\"验证码\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"min-width: 200px; width: 55%\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"cd-error-message\">请输入验证码</span> <a\r\n");
      out.write("\t\t\t\t\t\t\thref='javascript:loadRandomCode();'> <img\r\n");
      out.write("\t\t\t\t\t\t\tsrc='/login/loadVerificationCode' id='imgcode'\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 50px; position: relative; top: 19px;\" />\r\n");
      out.write("\t\t\t\t\t\t</a> <a href=\"javascript:loadRandomCode();\">重新加载</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"fieldset\" style=\"position: relative; top: -19px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"remember\" checked /> <label\r\n");
      out.write("\t\t\t\t\t\t\tfor=\"remember-me\">记住我</label>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"fieldset\" style=\"position: relative; top: -19px;\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"login_submit\" class=\"full-width\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"登 陆\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"cd-form-bottom-message\" onclick=\"forgetPassword();\">\r\n");
      out.write("\t\t\t\t\t<a style=\"cursor: pointer; color: #2f889a;\">忘记密码?</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- cd-login -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- cd-user-modal-container -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- cd-user-modal -->\r\n");
      out.write("\t<footer class=\"login_foot\" style=\"visibility: hidden;\">成都蓝海飞鱼科技有限公司提供技术支持</footer>\r\n");
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
      out.write("\tsrc=\"/third-party/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_back.js\" title=\"v\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/compatible/modernizr.js\"></script>\r\n");
      out.write("\t<!-- Modernizr -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/back/base/login/main.js\"\r\n");
      out.write("\t\ttitle=\"v\"></script>\r\n");
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
}
