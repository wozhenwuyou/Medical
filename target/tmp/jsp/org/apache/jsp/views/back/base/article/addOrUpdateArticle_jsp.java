package org.apache.jsp.views.back.base.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addOrUpdateArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_back_css.htm");
    _jspx_dependants.add("/views/common/common_js.htm");
    _jspx_dependants.add("/views/common/common_ueditor_js.htm");
    _jspx_dependants.add("/views/common/common_back_js.htm");
    _jspx_dependants.add("/views/common/common_upload_js.htm");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/back/back.css\"\r\n");
      out.write("\ttitle=\"v\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"min-width: 1000px;\">\r\n");
      out.write("\t<form class=\"margin-5-5-10-15\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"articleId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t<table class=\"padL5\">\r\n");
      out.write("\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>栏目：</span><input\r\n");
      out.write("\t\t\t\t\trole=\"combobox\" id=\"f_typeId\"\r\n");
      out.write("\t\t\t\t\tclass=\"domain-input easyui-combobox width140\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>标题：</span><input\r\n");
      out.write("\t\t\t\t\trole=\"textbox\" id=\"f_title\"\r\n");
      out.write("\t\t\t\t\tclass=\"domain-input easyui-textbox width140\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>状态：</span><input\r\n");
      out.write("\t\t\t\t\trole=\"combobox\" id=\"f_mainStatus\"\r\n");
      out.write("\t\t\t\t\tclass=\"domain-input easyui-combobox width140\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>医生：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"f_userId\" class=\"domain-input easyui-combobox width140\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>置顶：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"f_isTop\" class=\"domain-input easyui-combobox width140\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\">文章图片</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: inline-block; float: left;\">\r\n");
      out.write("\t\t\t\t\t\t<img id=\"pic\" class=\"picurl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 60px; max-width: 100px; overflow: hidden; padding: 5px;\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"filePaths\" id=\"filePaths\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.picPaths}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"fileDBIds\" id=\"fileDBIds\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button id=\"browse\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button button-primary button-rounded button-small mgV10\">选择图片</button>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<div id=\"upload_outer_div\" style=\"margin-top: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 上传文件进度展示 -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div class=\"fl-margin-5-0-1-20\">\r\n");
      out.write("\t\t<!-- <span>描述：</span>\r\n");
      out.write("    \t<input role=\"textbox\" id=\"f_description\" class=\"domain-input easyui-textbox width140\" data-options=\"required:false,multiline:true,height:50,width:900,prompt:'请输入描述'\"/>\r\n");
      out.write("\t     -->\r\n");
      out.write("\t\t<br /> <span><span style=\"color: red; font-weight: bolder;\">*</span>内容:</span>\r\n");
      out.write("\t\t<script id=\"editor\" type=\"text/plain\"\r\n");
      out.write("\t\t\tstyle=\"width: 1000px; height: 450px;\"></script>\r\n");
      out.write("\t\t<div class=\"inline-center fl mgV10\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<button id=\"mainObjSave\" onclick=\"saveMainObj()\"\r\n");
      out.write("\t\t\t\tclass=\"button button-primary button-rounded button-small mgV10\">保存</button>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<button id=\"mainObjBack\" onclick=\"lh.jumpToUrl('/back/article')\"\r\n");
      out.write("\t\t\t\tclass=\"button button-primary button-rounded button-small mgV10\">返回</button>\r\n");
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
      out.write("<script type=\"text/javascript\" charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"/third-party/ueditor/ueditor.config.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"/third-party/ueditor/ueditor.all.min.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_back.js\" title=\"v\"></script>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/third-party/plupload/js/plupload.full.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common/common_upload.js\"\r\n");
      out.write("\ttitle=\"v\"></script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"> lh.param = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramJson}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("; </script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/back/base/article/addOrUpdateArticle.js\" title=\"v\"></script>\r\n");
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
