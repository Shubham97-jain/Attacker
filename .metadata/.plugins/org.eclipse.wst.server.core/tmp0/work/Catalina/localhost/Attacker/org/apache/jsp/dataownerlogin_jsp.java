/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.14
 * Generated at: 2018-12-18 06:23:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataownerlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Data Owner Login</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Shadow Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"login/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- //Custom Theme files --> \r\n");
      out.write("<!-- web font --> \r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //web font -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- main --> \r\n");
      out.write("\t<div class=\"main-agileinfo slider \">\r\n");
      out.write("\t\t<div class=\"items-group\">\r\n");
      out.write("\t\t\t<div class=\"item agileits-w3layouts\">\r\n");
      out.write("\t\t\t\t<div class=\"block text main-agileits\"> \r\n");
      out.write("\t\t\t\t\t<span class=\"circleLight\"></span> \r\n");
      out.write("\t\t\t\t\t<!-- login form -->\r\n");
      out.write("\t\t\t\t\t<div class=\"login-form loginw3-agile\"> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"agile-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Data Owner Login Form</h1> \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-top\"> \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"DataOwnerLogin\" method=\"post\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>User Name </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"email\" required=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Password</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"password\" name=\"password\" required=\"\"/>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"anim\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Login\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t</form> \t\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-bottom wthree\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<h6><a href=\"dataownerforgotpassword.jsp\">Forgot password?</a></h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-bottom wthree\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<h6><a href=\"dataownerregistration.jsp\">Registration</a></h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-bottom wthree\"> \r\n");
      out.write("\t\t\t\t\t\t\t<h6><a href=\"index.jsp\">Back To Home</a></h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t <div><font color=\"red\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></font></div>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t</div>  \r\n");
      out.write("\t\t\t\t\t</div>   \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"w3lsfooteragileits\">\r\n");
      out.write("\t\t\t\t\t<p>Attack prevention and detection using Access Control Encrypted Cloud Storage</p>\t\t\t\t</div> \r\n");
      out.write("\t\t\t</div>   \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t \r\n");
      out.write("\t<!-- //main --> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
