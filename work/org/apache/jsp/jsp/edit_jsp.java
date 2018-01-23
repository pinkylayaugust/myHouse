package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
      out.write("<title>Housing Information</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body text=\"blue\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/myHouse/pages/style.css\"/>\r\n");
      out.write("  <div id=\"wrapper\">\r\n");
      out.write(" <div class=\"header\"><center><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>\r\n");
      out.write("<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee></center>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"menu\"><a href=\"/myHouse/pages/Welcome.jsp\">Home</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/aboutus.jsp\">About</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/jsp/contactus.jsp\">Contact Us</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/pages/Welcome.jsp\">Logout</a></div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br>\r\n");

String un=request.getParameter("id");
System.out.println("User ID is"+un);
//String uh=request.getParameter("hn");
//System.out.println("User Home No is"+uh);
//String ua=request.getParameter("addr");
//System.out.println("User Address is"+ua);
String url="jdbc:mysql://localhost/housedb?user=root&password=root"; 
Statement stmt=null;
  try{
	  Class.forName("com.mysql.jdbc.Driver"); 
   Connection con=(Connection) DriverManager.getConnection(url);
   stmt=(Statement) ((java.sql.Connection) con).createStatement(); 
   String strhouse="SELECT * FROM house where id='"+un+"'"; 
   ResultSet rs=stmt.executeQuery(strhouse); 
   System.out.println("DB connection succeed");
   while (rs.next()) 
   {
	   int ii=rs.getInt(1);
	   String ipd=rs.getString(2);	  
	   String myuser=rs.getString(3); 
	   System.out.println("Username in jsp is"+myuser);
	   String pno=rs.getString(4);
	   String tsh=rs.getString(5);
	   String hno=rs.getString(6);
	   String addr=rs.getString(7);
	   String ty=rs.getString(8);
	   String fl=rs.getString(9);
	   String la=rs.getString(10);
	   String ba=rs.getString(11);
	   String sp=rs.getString(12);
	   String rp=rs.getString(13);
	   String pa=rs.getString(14);
	   String ph=rs.getString(15);
	   System.out.println("Photo in Edit.jsp is "+ph);
	   String re=rs.getString(16);
	   String od=rs.getString(17);
	   
      out.write("\r\n");
      out.write("\t   <form method=\"get\" action=\"/myHouse/jsp/updateprocess.jsp\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\">\r\n");
      out.write("       <table border=1 width=\"40%\" height=\"80%\" align=\"center\">\r\n");
      out.write("       ");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("      <caption><u>Housing Form</u></caption>\r\n");
      out.write("      <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("              <table border=1 color=pink>\r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>User ID</td>\r\n");
      out.write("                 <td>:");
      out.print(ii);
      out.write("</td>\r\n");
      out.write("              </tr>  \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Input Date</td>\r\n");
      out.write("                 <td>:<input name=\"ii\" type=\"text\" value=\"");
      out.print(ipd );
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr>            \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Name</td>\r\n");
      out.write("                 <td>:<input name=\"nn\" type=\"text\" value=\"");
      out.print(myuser);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Phone Number</td>\r\n");
      out.write("                 <td>:<input name=\"pnn\" type=\"text\" value=\"");
      out.print(pno);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Town Ship</td>\r\n");
      out.write("                 <td>:<input name=\"tt\" type=\"text\" value=\"");
      out.print(tsh);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Home Number</td>\r\n");
      out.write("                 <td>:<input name=\"hh\" type=\"text\" value=\"");
      out.print(hno);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Address</td>\r\n");
      out.write("                 <td>:<input name=\"aa\" type=\"text\"  value=\"");
      out.print(addr);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Type</td>\r\n");
      out.write("                 <td>:<input name=\"typ\" type=\"text\"   value=\"");
      out.print(ty);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Floor</td>\r\n");
      out.write("                 <td>:<input name=\"ff\" type=\"text\" value=\"");
      out.print(fl);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Land Area</td>\r\n");
      out.write("                 <td>:<input name=\"ll\" type=\"text\" value=\"");
      out.print(la);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Building Area</td>\r\n");
      out.write("                 <td>:<input name=\"bb\" type=\"text\" value=\"");
      out.print(ba);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Sale Price</td>\r\n");
      out.write("                 <td>:<input name=\"ss\" type=\"text\" value=\"");
      out.print(sp);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>Rent Price</td>\r\n");
      out.write("                 <td>:<input name=\"rr\" type=\"text\" value=\"");
      out.print(rp);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>Particular</td>\r\n");
      out.write("                 <td>:<input name=\"par\" type=\"text\" value=\"");
      out.print(pa);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>Photo</td>\r\n");
      out.write("                 <td>:<input type=\"text\" name=\"pt\" style='font-family:Zawgyi-one;' value=\"");
      out.print(ph);
      out.write("\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t <tr>\r\n");
      out.write("                 <td>Remark</td>\r\n");
      out.write("                 <td>:<input name=\"rem\" type=\"text\" value=\"");
      out.print(re);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td>Output Date</td>\r\n");
      out.write("                 <td>:<input name=\"odt\" type=\"text\" value=\"");
      out.print(od);
      out.write("\" style='font-family:Zawgyi-one;'></td>\r\n");
      out.write("              </tr> \r\n");
      out.write("              <tr>\r\n");
      out.write("              <td colspan=2 align=center>\r\n");
      out.write("                  <input type=\"submit\" value=\"Update\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                  <input type=\"reset\" value=\"Clear\">\r\n");
      out.write("              </table>\r\n");
      out.write("            </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      </form> \r\n");
      out.write("\t    ");

	    HttpSession a=request.getSession();
		 a.setAttribute("ID",ii);  
		 System.out.println("ID no in edit page:"+ii);
   }
  }
  catch(Exception ex){
	   ex.printStackTrace();
	   }

      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("               </div>\t\r\n");
      out.write("              <div class=\"bottom\"><h2><center>Thank you for visiting my website</center></h2></div>\r\n");
      out.write("\t\t </div> \t\t \r\n");
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
