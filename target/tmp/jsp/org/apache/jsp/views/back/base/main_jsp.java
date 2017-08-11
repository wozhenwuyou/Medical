package org.apache.jsp.views.back.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/easyui/themes/default/easyui.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/easyui/themes/icon.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\"\r\n");
      out.write("\thref=\"/third-party/buttons/buttons.css\" />\r\n");
      out.write("<link rel=\"STYLESHEET\" type=\"text/css\" href=\"/css/common.css\" title=\"v\" />");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/back/back.css\"\r\n");
      out.write("\ttitle=\"v\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"main_layout\" class=\"easyui-layout\"\r\n");
      out.write("\tstyle=\"overflow: hidden; width: 100%;\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"userId\">\r\n");
      out.write("\t<div data-options=\"region:'north'\" style=\"height: 60px;\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<span style=\"float: left;\"> <img\r\n");
      out.write("\t\t\t\tsrc=\"/images/front/main23.png\" alt=\"logo\" height=\"55\"\r\n");
      out.write("\t\t\t\tstyle=\"margin-left: 60px; margin-top: 2px;\" />\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tstyle=\"color: #D4D4D4; float: left; margin: 10px 8px 16px 8px; padding: 5px;\">\r\n");
      out.write("\t\t\t\t<span style=\"font-size: 24px;\">沃诊无忧医疗信息管理平台</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"head_icons\">\r\n");
      out.write("\t\t\t\t<div id=\"head_logout\" onclick=\"logout()\" class=\"head_icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/back/bg14.png\" title=\"安全退出\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"head_refresh\" onclick=\"refresh()\" class=\"head_icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/back/bg13.png\" title=\"更新缓存\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"head_password\" onclick=\"openUpdatePassword()\"\r\n");
      out.write("\t\t\t\t\tclass=\"head_icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/back/bg12.png\" title=\"修改密码\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"head_index\" onclick=\"login()\" class=\"head_icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/images/back/bg08.png\" title=\"网站首页\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tstyle=\"color: #D4D4D4; float: right; margin: 16px 8px; padding: 5px;\">\r\n");
      out.write("\t\t\t\t\t<span style=\"font-size: 14px;\">欢迎您：</span><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: white; font-size: 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- <div data-options=\"region:'south'\" style=\"height:30px;\">\r\n");
      out.write("    \t<div class=\"footer\">\r\n");
      out.write("    \t\t<div id=\"foot_items\" class=\"foot_items\">快速通道==>：\r\n");
      out.write("    \t\t\t<span class=\"foot_item\" onclick=\"showMain('文章管理','/back/article')\">文章管理</span>\r\n");
      out.write("    \t\t\t<span class=\"foot_item\" onclick=\"showMain('用户管理','/back/user')\">用户管理</span>\r\n");
      out.write("    \t\t\t<span class=\"foot_item\" onclick=\"showMain('会员申请','/back/application')\">会员申请</span>\r\n");
      out.write("    \t\t\t<span class=\"foot_item\" onclick=\"showMain('公告管理','/back/announcement')\">公告管理</span>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div> -->\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tdata-options=\"region:'west',split:true,collapsible:true,title:'菜单',width:200\"\r\n");
      out.write("\t\tstyle=\"width: 200px;\">\r\n");
      out.write("\t\t<div id=\"firstpane\" class=\"menu_list\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center'\"\r\n");
      out.write("\t\tstyle=\"padding: 0px; background: #eee; overflow: hidden; max-width: 100%\">\r\n");
      out.write("\t\t<!--  id=\"main\" class=\"easyui-tabs\" -->\r\n");
      out.write("\t\t<div id=\"main\" class=\"easyui-tabs\" fit=\"true\" border=\"false\"\r\n");
      out.write("\t\t\tplain=\"true\" style=\"width: 100%; height: 100%;\"></div>\r\n");
      out.write("\t\t<!--<div id=\"main\" class=\"easyui-tabs\" style=\"width:500px;height:250px;\"></div>-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"display: none;\" id=\"updatePasswordWin\" title=\"修改密码\">\r\n");
      out.write("\t\t<div style=\"margin: 8px 8px 8px 35px;\">\r\n");
      out.write("\t\t\t<div id=\"updatePsdTip\" style=\"color: red;\"></div>\r\n");
      out.write("\t\t\t旧密码：<input type=\"text\" id=\"oldPsd\"></input><br />\r\n");
      out.write("\t\t\t<br /> 新密码：<input type=\"text\" id=\"newPsd1\"></input><br />\r\n");
      out.write("\t\t\t<br /> 新密码：<input type=\"text\" id=\"newPsd2\"></input><br />\r\n");
      out.write("\t\t\t<br /> <a id=\"submitUptPsd\" onclick=\"updatePassword()\"\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton\">确认</a>&nbsp; <a id=\"returnUptPsd\"\r\n");
      out.write("\t\t\t\tonclick=\"closeUpdatePwdWin()\" class=\"easyui-linkbutton\">返回</a>\r\n");
      out.write("\t\t</div>\r\n");
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
      out.write("\tsrc=\"/third-party/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_back.js\" title=\"v\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/back/base/main.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/third-party/layer/layer.js\" title=\"v\"></script>\r\n");
      out.write("\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty admin.roleId && admin.roleId != 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div id=\"head_message\" onclick=\"showMain('消息通知管理','/back/notice')\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"head_icon\">\r\n");
        out.write("\t\t\t\t\t\t<img src=\"/images/back/bg09.png\" title=\"站内短信\" />\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
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
}
