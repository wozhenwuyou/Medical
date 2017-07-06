package org.apache.jsp.views.back.domain.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prdPrint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/views/common/meta_info.htm");
    _jspx_dependants.add("/views/common/common_css.htm");
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
      out.write("<title>&nbsp;</title>\r\n");
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
      out.write("<body style=\"min-width: 1000px;\">\r\n");
      out.write("\t<div class=\"pz_main\">\r\n");
      out.write("\t\t<div class=\"w_1000\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<div class=\"w_851\"\r\n");
      out.write("\t\t\t\tstyle=\"float: none; text-align: center; margin: 0 auto;\">\r\n");
      out.write("\t\t\t\t<div class=\"c_851\">\r\n");
      out.write("\t\t\t\t\t<div class=\"t_851_2\">检测报告单</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"reportId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"l_849\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"baseInformation\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><strong>基本信息</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">姓&nbsp;&nbsp;&nbsp;&nbsp;名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.patientName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">条&nbsp;形&nbsp;码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.adiconBarcode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">身份证号</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"310\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.idcardNum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">电&nbsp;&nbsp;&nbsp;&nbsp;话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.patientPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">年&nbsp;&nbsp;&nbsp;&nbsp;龄</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("岁\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.sexName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">检测项目</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.itemName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">采血日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue='");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("' /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">样本种类</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.sampleType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">标本性状</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.sampleChar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"left\"><strong>数据报告</strong>（");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.attrStr2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("）</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"baseInformation\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"border-bottom: 1px solid; font-weight: bolder;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"80\" style=\"line-height: 30px;\">简称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"120\" style=\"line-height: 30px;\">项目</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"80\" style=\"line-height: 30px;\">结果</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"80\" style=\"line-height: 30px;\">提示</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"160\" style=\"line-height: 30px;\">参考值</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"80\" style=\"line-height: 30px;\">单位</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"773\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"otherInformation\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=\"3\" width=\"67\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"line-height: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t注：本结果仅对检测标本负责，供临床参考，如有疑问请在标本保存期内提出</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">检测诊所</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><input type=\"text\" class=\"input14\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 660px;\" readonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.hospitalName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"10\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"67\" style=\"line-height: 30px;\">检测结果</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"329\"><textarea id=\"doctorResult\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"border: 1px solid #e4e4e3; width: 660px; height: 200px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.doctorResult}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\twindow.print();\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${patientReport.attrDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("YYYY-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prdList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("prd");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr height=\"40\" valign=\"bottom\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"80\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.itemName_EN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"120\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.itemName_CN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"80\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"80\">");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(' ');
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"160\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.resultReference}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td width=\"80\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.resultUnit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.resultHint == 'z'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('正');
        out.write('常');
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.resultHint == 'd'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('低');
        out.write('↓');
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prd.resultHint == 'g'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('高');
        out.write('↑');
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
