package org.apache.jsp.views.back.domain.phr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.lhfeiyu.po.User;
import com.lhfeiyu.po.Admin;
import com.lhfeiyu.tools.ActionUtil;
import com.lhfeiyu.po.Doctor;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.service.DoctorService;
import com.lhfeiyu.service.HospitalService;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.lhfeiyu.po.PhrCover;
import com.lhfeiyu.service.PhrBasicInfoService;
import com.lhfeiyu.po.PhrBasicInfo;
import java.util.List;
import com.lhfeiyu.service.PhrHealthCheckService;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;

public final class phrCover_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/third-party/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/third-party/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css\" />\r\n");

	
	String openType = request.getParameter("openType");
	if("add".equals(openType)){
		ServletContext context = request.getSession().getServletContext();
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(context);  
		//得到档案信息id
		Integer basicInfoId = Integer.valueOf(request.getParameter("basicInfoId"));
		//找到档案基本信息
		PhrBasicInfoService service = ctx.getBean(PhrBasicInfoService.class);
		PhrBasicInfo basicInfo = service.findById(basicInfoId);
		//找到医生和诊所
		HospitalService hs = ctx.getBean(HospitalService.class);
		Hospital hospital = hs.selectByPrimaryKey(basicInfo.getHospitalId());
		DoctorService ds = ctx.getBean(DoctorService.class);
		Doctor doctor = ds.selectByPrimaryKey(basicInfo.getDoctorId());
		
		PhrCover model = new PhrCover();
		model.setName(basicInfo.getName());//姓名
		model.setJdrq(new Date());//建档日期
		model.setLxdh(basicInfo.getTel());//联系电话
		if(hospital != null){
			model.setJddw(hospital.getAddress() + hospital.getWholeName());//建档单位
		}
		if(doctor != null){
			model.setZrys(doctor.getRealname());//责任医生
		}
		//建档人
		User currentUser = ActionUtil.checkSession4User(session);
		if(currentUser != null){
			model.setJdr(currentUser.getRealName());
		}
		Admin currentAdmin = ActionUtil.checkSession4Admin(session);
		if(currentAdmin != null){
			model.setJdr(currentAdmin.getUsername());
		}
		Doctor currentDoctor = ActionUtil.checkSession4Doctor(session);
		if(currentDoctor != null){
			model.setJdr(currentDoctor.getRealname());
		}
		request.setAttribute("model", model);
	}
	
	request.setAttribute("openType", openType);

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--print start-->\r\n");
      out.write("<form action=\"/back/phr/phrCover/save\" method=\"POST\" id=\"phrCoverForm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<table width=\"900\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"> \r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"104\" colspan=\"2\" align=\"center\"><h1>居民健康档案</h1></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">姓名：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"name\" id=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">现住址：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"xzz\" id=\"xzz\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.xzz }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">户籍地址：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"hjdz\" id=\"hjdz\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.hjdz }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">联系电话：</td> \r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"lxdh\" id=\"lxdh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.lxdh }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">乡镇（街道）名称：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"xzmc\" id=\"xzmc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.xzmc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">村（居）委会名称：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"cwhmc\" id=\"cwhmc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.cwhmc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">建档单位：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"jddw\" id=\"jddw\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jddw }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">建档人：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"jdr\" id=\"jdr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jdr }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">责任医生：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"zrys\" id=\"zrys\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.zrys }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"40\" align=\"right\">建档日期：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"jdrq\" id=\"jdrq\" value='");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("'></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("<!--print end-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/third-party/z.js\" title=\"v\"></script>\r\n");
      out.write("\t<script src=\"/third-party/jquery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/third-party/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction bindDateField(selector) {\r\n");
      out.write("\t\t\t$(selector).datetimepicker({\r\n");
      out.write("\t\t\t\tbootcssVer : 3,\r\n");
      out.write("\t\t\t\tformat : 'yyyy-mm-dd',\r\n");
      out.write("\t\t\t\ttodayBtn : true,\r\n");
      out.write("\t\t\t\tlanguage : 'zh-CN',\r\n");
      out.write("\t\t\t\tstartView : 2,\r\n");
      out.write("\t\t\t\tviewSelect : 'year',\r\n");
      out.write("\t\t\t\tminView : 2, //选择日期后，不会再跳转去选择时分秒\r\n");
      out.write("\t\t\t\tautoclose : true//选择日期后自动关闭\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tbindDateField(\"#jdrq\");//绑定日期字段\r\n");
      out.write("\t\t\tvar openType = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${openType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\t\tif('detail' == openType){\r\n");
      out.write("\t\t\t\t$(\"input[type=checkbox], input[type=radio]\").attr('disabled', true);\r\n");
      out.write("\t\t\t\t$(\"input[type=text]\").attr('readonly', true);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${model.jdrq }", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
