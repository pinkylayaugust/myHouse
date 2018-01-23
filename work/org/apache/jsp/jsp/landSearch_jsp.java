package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class landSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script language=\"javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/myHouse/pages/style.css\"/>\r\n");
      out.write("  <div id=\"wrapper\">\r\n");
      out.write(" <div class=\"header\"><center><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>\r\n");
      out.write("<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee></center>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"menu\"><a href=\"/myHouse/pages/Welcome.jsp\">Home</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/aboutus.jsp\">About</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/contactus.jsp\">Contact Us</a></div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<div style=\"height:450px;width:960px;overflow-x:scroll;overflow-y:scroll;border:1px solid black;font-size:20px;font-family:Zawgyi-One;\">\r\n");
      out.write("<pre>\r\n");

request.getCharacterEncoding();
String ls=new String(request.getParameter("l").getBytes("ISO-8859-1"),"UTF-8");
System.out.println("Land is"+ls);
String url="jdbc:mysql://localhost/housedb?useUnicode=true&characterEncoding=UTF-8&user=root&password=root"; 
Statement stmt=null;
  try{
	  Class.forName("com.mysql.jdbc.Driver"); 
   Connection con=(Connection) DriverManager.getConnection(url);
   stmt=(Statement) ((java.sql.Connection) con).createStatement(); 
   String strname="SELECT * FROM house where landarea='"+ls+"'"; 
   ResultSet rs=stmt.executeQuery(strname); 
   System.out.println("DB connection succeed");
   out.println("<table border=1>");
   out.println("<tr>");
   out.println("<th>Input Date</th>");
   out.println("<th>Name</th>");
   out.println("<th>PhoneNo</th>");
   out.println("<th>Township</th>");
   out.println("<th>HomeNo</th>");
   out.println("<th>Address</th>");
   out.println("<th>Type</th>");
   out.println("<th>Floor</th>");
   out.println("<th>Land Area</th>");
   out.println("<th>Building Area</th>");
   out.println("<th>Sale Price</th>");
   out.println("<th>Rent Price</th>");
   out.println("<th>Particular</th>");
   out.println("<th>Photo</th>");  
   out.println("<th>Remark</th>");
   out.println("<th>Output Date</th>");
   out.println("</tr>");
   
   while (rs.next()) 
   {
	   String ipdate=rs.getString(2);
	   String name=rs.getString(3);
	   String pno=rs.getString(4);
	   String townsh=rs.getString(5);
	   String hno=rs.getString(6);
	   String address=rs.getString(7);
	   String type=rs.getString(8);
	   String floor=rs.getString(9);
	   String larea=rs.getString(10);
	   String barea=rs.getString(11);
	   String sprice=rs.getString(12);
	   String rprice=rs.getString(13);
	   String pc=rs.getString(14);
	   String photo=rs.getString(15);
	   String remark=rs.getString(16);
	   String odate=rs.getString(17);
	   out.println("<tr>");	  
	   out.println("<td style='font-family:Zawgyi-one;'>"+ipdate+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+name+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+pno+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+townsh+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+hno+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+address+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+type+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+floor+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+larea+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+barea+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+sprice+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+rprice+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+pc+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'><img src=/myHouse/image/"+photo+" width=70px height=70px></td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+remark+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+odate+"</td>");
	   out.println("</tr>");
   }
   out.println("</table>");
   out.println("</pre>");
   out.println("<a href='/myHouse/jsp/search.jsp'>Go To Search Page</a>");
   out.println("</div>"); 
  }
  catch(Exception ex){
	   ex.printStackTrace();
	   }

      out.write("\r\n");
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
