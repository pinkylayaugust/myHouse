package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/myHouse/pages/style.css\"/>\r\n");
      out.write("  <div id=\"wrapper\">\r\n");
      out.write(" <div class=\"header\"><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>\r\n");
      out.write("<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"menu\"><a href=\"/myHouse/pages/Welcome.jsp\">Home</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/aboutus.jsp\">About</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/contactus.jsp\">Contact Us</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/pages/Welcome.jsp\">Logout</a></div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"/myHouse/jsp/insertprocess.jsp\" name=\"ip\" method=\"get\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\">\r\n");
      out.write("<table border=1>\r\n");
      out.write("<tr><td>Input Date</td><td><input type=\"text\" name=\"ipdate\"></td></tr>\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<tr><td>Name</td><td><input type=\"text\" name=\"nn\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Phone Number</td><td><input type=\"text\" name=\"ph\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Township</td><td><input type=\"text\" name=\"ts\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Home Number</td><td><input type=\"text\" name=\"hn\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Address</td><td><input type=\"text\" name=\"ad\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Type</td><td><input type=\"text\" name=\"ty\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Floor</td><td><input type=\"text\" name=\"fl\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Land Area</td><td><input type=\"text\" name=\"la\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Build Area</td><td><input type=\"text\" name=\"ba\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Sale Price</td><td><input type=\"text\" name=\"sp\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Rent Price</td><td><input type=\"text\" name=\"rp\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Particular</td><td><input type=\"text\" name=\"pa\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Photo</td><td><input type=\"file\" name=\"pto\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Remark</td><td><input type=\"text\" name=\"rm\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td>Output Date</td><td><input type=\"text\" name=\"opdate\" style='font-family:Zawgyi-one;'></td></tr>\r\n");
      out.write("<tr><td><input type=\"submit\" value=\"insert\"></td><td><input type=\"reset\" value=\"Clear\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bottom\"><h2><center>Thank you for visiting my website</center></h2></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
