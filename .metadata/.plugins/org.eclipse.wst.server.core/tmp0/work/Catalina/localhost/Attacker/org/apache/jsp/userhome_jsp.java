/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.14
 * Generated at: 2018-12-17 08:52:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Bike Race Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\"/>\r\n");
      out.write("<!-- fonts -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Michroma\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Comfortaa:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("<!-- /fonts -->\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href='css/aos.css' rel='stylesheet prefetch' type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/pogo-slider.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- /css -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("onload=function()\r\n");
      out.write("{\r\n");
      out.write("\t \r\n");
      out.write("\tvar e=document.getElementById(\"refreshed\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(e.value==\"no\")\r\n");
      out.write("\t\te.value=\"yes\";\r\n");
      out.write("\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\te.value=\"no\";\r\n");
      out.write("\t\tlocation.reload(); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- navigation -->\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" data-aos=\"flip-up\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><h1>Attacker System</h1></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav slide-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active current\"><a href=\"userhome.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active current\"><a href=\"userprofile.jsp\">Profile</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active current\"><a href=\"filedetails.jsp\">File details</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"datausersearch.jsp\">Search File</a></li>  \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("             \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("\t<!-- \t\t\t<li class=\"active current\"><a href=\"datausersearch.jsp\">Search File</a></li> -->\r\n");
      out.write("\t\t        <li class=\"active current\"><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\t\r\n");
      out.write("        \r\n");
      out.write("        \t\t <ul align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"refreshed\" value=\"no\"/>\r\n");
      out.write("                 ");

                 if(session.getAttribute("Name")!=null) 

                         {
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("                             <li style=\"color:white\">Welcome   ");
 out.print(session.getAttribute("Name"));
      out.write("\r\n");
      out.write("</li> \r\n");
      out.write("</ul>\t\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- /navigation --> \r\n");
      out.write("<!-- Page Content -->\r\n");
      out.write("<!-- header section -->\r\n");
      out.write("<section class=\"inner-w3ls\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\t<h3 class=\"text-center\" data-aos=\"zoom-in\">User</h3>\r\n");
      out.write("        <!-- Page Heading/Breadcrumbs -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <ol class=\"breadcrumb\" data-aos=\"zoom-in\">\r\n");
      out.write("                    <li><a href=\"#\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"active\">User</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\t\r\n");
      out.write("<!-- /header section -->\r\n");
      out.write("<section class=\"about-w3layouts\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("        <!-- Intro Content -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6\" data-aos=\"flip-left\">\r\n");
      out.write("                 <div class=\"pogoSlider\" id=\"js-main-slider\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pogoSlider-slide\" data-transition=\"blocksReveal\" data-duration=\"1000\"  style=\"background-image:url(images/u1.png);background-position:center;\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pogoSlider-slide \" data-transition=\"blocksReveal\" data-duration=\"1000\"  style=\"background-image:url(images/u2.jpg);background-position:center;\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pogoSlider-slide \" data-transition=\"blocksReveal\" data-duration=\"1000\"  style=\"background-image:url(images/u3.jpg);background-position:center;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\" data-aos=\"flip-right\">\r\n");
      out.write("                <h3>User </h3>\r\n");
      out.write("   <h2>  When user can search any file then after checking authentication user get file.If user want to download that file then data user request to data owner.After getting the request user can send the key for download the file.If user enter is is match then user can download that file.user can search file from a perticular location only.We also show the ranked keyword search by the user.Finally we show the count of user search file  and actually file downloaded by the user.\r\n");
      out.write("      \r\n");
      out.write("        .</h2> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
}

else
{
      out.write("\r\n");
      out.write("\r\n");
response.sendRedirect("userlogin.jsp");
      out.write("\r\n");
      out.write("\r\n");
 }
      out.write("\r\n");
      out.write("<!-- last section -->\r\n");
      out.write("<section class=\"last-w3layouts\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<a href=\"index.html\" class=\"bottom-agile\"><h2 class=\"text-center\">Attacker System</h2></a>\r\n");
      out.write("\t\t<div class=\"copyright\">\r\n");
      out.write("<p>Attack prevention and detection using Access Control Encrypted Cloud Storage</p>\r\n");
      out.write("</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</section>\r\n");
      out.write("<!-- last section -->\r\n");
      out.write("<!-- back to top -->\r\n");
      out.write("<a href=\"#0\" class=\"cd-top\">Top</a>\r\n");
      out.write("<!-- /back to top -->\t\r\n");
      out.write("<!-- js files -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/SmoothScroll.min.js\"></script>\r\n");
      out.write("<script src=\"js/top.js\"></script> \r\n");
      out.write("<script src=\"js/modernizr.min.js\"></script>\r\n");
      out.write("<script src=\"js/index.js\"></script>\r\n");
      out.write("<script src='js/aos.js'></script>\r\n");
      out.write("<script src=\"js/aos2.js\"></script>\r\n");
      out.write("<!-- js for team section -->\r\n");
      out.write("<script src=\"js/toucheffects.js\"></script>\r\n");
      out.write("<!-- /js for team section -->\r\n");
      out.write("<!-- js for about section -->\r\n");
      out.write("<script src=\"js/jquery.pogo-slider.min.js\"></script>\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<!-- /js for about section -->\r\n");
      out.write("<!-- /js files -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t");
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
