package org.apache.jsp.views.back.domain.phr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class count_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/back/back.css\" title=\"v\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"min-width: 1000px;\">\r\n");
      out.write("\t<!-- 查询条件  开始 -->\r\n");
      out.write("\t<table id=\"mainQueryTable\" style=\"min-width: 1000px;\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>省份：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\tid=\"provinceId\" name=\"provinceId\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>城市：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\tid=\"cityId\" name=\"cityId\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>诊所：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\tid=\"hospitalId\" name=\"hospitalId\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><button id=\"searchYes\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"doSearch();return false;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">查\r\n");
      out.write("\t\t\t\t\t\t询</button></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><button id=\"resetBtn\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"fnReset();return false;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">重置</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"clear-both height10\"></div>\r\n");
      out.write("\t<!-- 查询条件 结束 -->\r\n");
      out.write("\t<div id='datagrid_div'>\r\n");
      out.write("\t\t<table id=\"datagrid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
      out.write("\t<script type=\"text/javascript\" src=\"/third-party/z.js\" title=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/back/domain/phr/count.js?!1111\" title=\"v\"></script>\r\n");
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
}
