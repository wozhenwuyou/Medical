package org.apache.jsp.views.back.domain.hospital;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class diagnose_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/back/back.css\"\r\n");
      out.write("\ttitle=\"v\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"min-width: 1100px;\">\r\n");
      out.write("\t<!-- 查询条件  开始 -->\r\n");
      out.write("\t<table id=\"mainQueryTable\" style=\"min-width: 1000px;\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>诊所：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_hospitalId\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>科室：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_departmentId\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>医生：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_doctorId\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>就诊日期：</span><input role=\"datetimebox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_diagnoseTime\"\r\n");
      out.write("\t\t\t\t\tclass=\"domain-input easyui-datetimebox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>状态：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_mainStatus\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><button id=\"searchYes\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"doSearch();return false;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">查\r\n");
      out.write("\t\t\t\t\t\t询</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>过敏历史：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_allergyHistory\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>基本病情：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_baseCondition\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>诊断结果：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_diagnoseTags\" class=\"domain-input easyui-textbox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><span>排序：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\tid=\"sc_ascOrdesc\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"></td>\r\n");
      out.write("\t\t\t\t<td class=\"td_pad\"><button id=\"searchClear\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"clearSearch();return false;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">重\r\n");
      out.write("\t\t\t\t\t\t置</button></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"clear-both height10\"></div>\r\n");
      out.write("\t<!-- 查询条件 结束 -->\r\n");
      out.write("\t<div id=\"opt_outer_div\">\r\n");
      out.write("\t\t<div class=\"fl_opt_div\">\r\n");
      out.write("\t\t\t<button role=\"opt_1\" id=\"btn_batchDelete\"\r\n");
      out.write("\t\t\t\tonclick=\"lh.commonBatchDelete()\"\r\n");
      out.write("\t\t\t\tclass=\"button button-primary button-rounded button-small\">批量删除</button>\r\n");
      out.write("\t\t\t<!-- <button role=\"opt_1\" onclick=\"addMainObj()\" class=\"button button-primary button-rounded button-small\">添加</button> -->\r\n");
      out.write("\t\t\t<button onclick=\"exportDiagnose()\"\r\n");
      out.write("\t\t\t\tclass=\"button button-primary button-rounded button-small\">导出病历信息</button>\r\n");
      out.write("\t\t\t<button role=\"opt_2\" id=\"btn_batchRecover\"\r\n");
      out.write("\t\t\t\tonclick=\"lh.commonBatchRecover()\"\r\n");
      out.write("\t\t\t\tclass=\"hide button button-primary button-rounded button-small\">批量恢复</button>\r\n");
      out.write("\t\t\t<button role=\"opt_2\" id=\"btn_throughDelete\"\r\n");
      out.write("\t\t\t\tonclick=\"lh.commonBatchThoroughDelete()\"\r\n");
      out.write("\t\t\t\tclass=\"hide button button-primary button-rounded button-small\">彻底删除</button>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fr_opt_div\">\r\n");
      out.write("\t\t\t<button role=\"opt_1\" id=\"btn_trash\" onclick=\"lh.commonShowTrash()\"\r\n");
      out.write("\t\t\t\tclass=\"button button-primary button-rounded button-small\">回收站</button>\r\n");
      out.write("\t\t\t<button role=\"opt_2\" id=\"btn_trashBack\"\r\n");
      out.write("\t\t\t\tonclick=\"lh.commonReturnBack()\"\r\n");
      out.write("\t\t\t\tclass=\"hide button button-primary button-rounded button-small\">返回</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 表格  开始 -->\r\n");
      out.write("\t<div id='datagrid_div'>\r\n");
      out.write("\t\t<table id=\"datagrid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 表格  结束 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"mainObjWindiv\" style=\"display: none; margin: 20px;\">\r\n");
      out.write("\t\t<div id='mainObjWin' class=\"easyui-window\" title=\"病历信息\"\r\n");
      out.write("\t\t\tstyle=\"width: 760px;\"\r\n");
      out.write("\t\t\tdata-options=\"modal:true,closed:true,maximizable:false,collapsible:false,minimizable:false\">\r\n");
      out.write("\t\t\t<div id=\"mainObjTip\"></div>\r\n");
      out.write("\t\t\t<form id=\"mainObjForm\">\r\n");
      out.write("\t\t\t\t<table id=\"mainObjTable\" class=\"padL5\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>诊所：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"combobox\" id=\"f_hospitalId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-combobox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>科室：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"combobox\" id=\"f_departmentId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-combobox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>医生：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"combobox\" id=\"f_doctorId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-combobox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>就诊日期：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"datebox\" id=\"f_diagnoseTime\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-datebox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>用户姓名：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_patientName\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>用户年龄：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_patientAge\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>用户性别：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"combobox\" id=\"f_patientSex\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-combobox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>出生日期：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_patientBirthday\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>身份证号：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_patientIdcardNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: red; font-weight: bolder;\">*</span>联系电话：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_patientPhone\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span>用户职业：</span><input role=\"textbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"f_patientJob\" class=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:false\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\"><span>状态：</span><input role=\"combobox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"f_mainStatus\" class=\"domain-input easyui-combobox width100\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\" colspan=\"4\"><span>过敏历史：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_allergyHistory\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:false,multiline:true,height:80,width:660\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\" colspan=\"4\"><span>基本病情：</span><input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" id=\"f_baseCondition\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:false,multiline:true,height:80,width:660\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"tr_ht\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_pad\" colspan=\"4\"><span>诊断结果：</span> <input\r\n");
      out.write("\t\t\t\t\t\t\t\trole=\"textbox\" readonly=\"readonly\" id=\"diagnoseTagsReadOnly\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"domain-input easyui-textbox width100\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-options=\"required:false,multiline:true,height:80,width:660\" />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"inline-center mgV5\" style=\"margin-right: 100px;\">\r\n");
      out.write("\t\t\t\t<span style=\"color: gray;\">诊断结果以英文逗号进行分隔</span>\r\n");
      out.write("\t\t\t\t<button id=\"mainObjSave\" onclick=\"saveMainObj()\"\r\n");
      out.write("\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">保存</button>\r\n");
      out.write("\t\t\t\t<button id=\"mainObjBack\" onclick=\"closeMainObjWin()\"\r\n");
      out.write("\t\t\t\t\tclass=\"button button-primary button-rounded button-small\">返回</button>\r\n");
      out.write("\t\t\t</div>\r\n");
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
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  \t\tlh.paramJsonStr = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paramJson}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("  \t</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/common/back_template.js\"\r\n");
      out.write("\t\ttitle=\"v\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/js/back/domain/hospital/diagnose.js\" title=\"v\"></script>\r\n");
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