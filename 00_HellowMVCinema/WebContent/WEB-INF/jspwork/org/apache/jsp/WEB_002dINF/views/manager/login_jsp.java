/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-05-10 12:42:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cinema.admin.model.vo.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.cinema.admin.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	Manager managerSession = (Manager)session.getAttribute("managerSession");
	System.out.println("유저 로긴 세션 확인 "+managerSession);
	String path = request.getContextPath();

	
	String MovieListPath = path+"/movie/showMovieList.do";
	String LocaManaging = path+"/manager/local?type=list";
	
	
	String movie = path+"/manager/movie";
	String manager = path+"/manager/manager";
	String local = path+"/manager/local";
	String theater = path+"/manager/theater";
	String seat = path+"/manager/seat";
	String room = path+"/manager/room";
	String schedule = path+"/manager/schedule";
	String ticket = path+"/manager/ticket";
	String price = path+"/manager/price";

	
	
	
	Cookie[] cookies = request.getCookies();
	
	boolean saveId = false;
	String managerIdSaved = "";
	
   	if(cookies !=null){
   		System.out.println("--------------------------------");
   		System.out.println("브라우져가 전송한 쿠키목록");
   		System.out.println("--------------------------------");
		for(Cookie c : cookies ){
			String key = c.getName();
			String value = c.getValue();
	   		System.out.println("쿠키가요 ===> " + key + " : " + value );
	   		
	   		//아이디저장 쿠키검사
	   		if("saveId".equals(key)){
	   			saveId = true;
	   			managerIdSaved = value;
	   		}else{
	   			
	   		}
		}   		
   		System.out.println("--------------------------------");
   	}
   	

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputer {\r\n");
      out.write("\tpadding: 13px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tfont-size: 28px;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tbox-shadow: none;\r\n");
      out.write("\t-webkit-box-shadow: none;\r\n");
      out.write("\t-webkit-appearance: none;\r\n");
      out.write("\tborder:1px solid #ececec;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".inputer:focus {\r\n");
      out.write("\tbox-shadow: none;\r\n");
      out.write("\t-webkit-box-shadow: none;\r\n");
      out.write("\toutline:none;\r\n");
      out.write("\tborder-color:#ff1969;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap {\r\n");
      out.write("\twidth: 980px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form {\r\n");
      out.write("\twidth: 440px;\r\n");
      out.write("\tborder: 1px solid #ececec;\r\n");
      out.write("\tpadding: 30px 60px 30px 60px;\r\n");
      out.write("\tmargin-top: 100px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tborder-top: 3px solid #ff1969\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form h2 {\r\n");
      out.write("\tfont-weight: normal\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("\tbackground: #ff1969;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tfont-size: 26px;\r\n");
      out.write("\tpadding: 20px 10px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#saveIdWrap{\r\n");
      out.write("padding:10 0 20 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("input[type=\"checkbox\"]{\r\n");
      out.write("display:none;}\r\n");
      out.write("input[type=\"checkbox\"] + label span {\r\n");
      out.write("    display:inline-block;\r\n");
      out.write("    width:19px;\r\n");
      out.write("    height:19px;\r\n");
      out.write("    margin:-2px 5px 0 0;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    background:url(https://s3-us-west-2.amazonaws.com/s.cdpn.io/210284/check_radio_sheet.png) left top no-repeat;\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"checkbox\"]:checked + label span {\r\n");
      out.write("    background:url(https://s3-us-west-2.amazonaws.com/s.cdpn.io/210284/check_radio_sheet.png) -19px top no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t<form action=\"/cinema/managerLoginEnd\" method=\"POST\">\r\n");
      out.write("\t\t\t\t<h2>관리자 로그인</h2>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" class=\"inputer\" value = '");
      out.print( saveId ? managerIdSaved : "" );
      out.write("' /> <input type=\"password\" name=\"pw\" class=\"inputer\"/>\r\n");
      out.write("\t\t\t\t<div id=\"saveIdWrap\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"saveId\" name=\"saveId\" ");
      out.print(saveId ? "checked":"" );
      out.write("/>\r\n");
      out.write("\t\t\t    <label for=\"saveId\"><span></span>아이디저장</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<button type=\"submit\">접속</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
