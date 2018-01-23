package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <a href=\"/myHouse/jsp/contactus.jsp\">Contact Us</a>&nbsp;|&nbsp;\r\n");
      out.write("    <a href=\"/myHouse/pages/Welcome.jsp\">Logout</a></div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br>\r\n");
      out.write("<br><center><img src='../image/logo.jpeg' width=300px height=300px></center><br>\r\n");
      out.write("<br>\r\n");
      out.write(" <p>က်ြန္ေတာ္မ်ားကုမၸဏီမွ လူၾကီးမင္းလိုအပ္ေသာ ရန္ကုန္ျမိဳ ့နယ္စံု အိမ္ျခံေျမႏွင့္ပတ္သတ္ေသာတိုက္ခန္း၊ကြန္ဒို၊လံုးခ်င္း၊ ေျမကြက္၊စက္မွုဇံုဂိုေဒါင္ ေရာင္း၀ယ္ငွားရမ္းျခင္းမ်ားကို စိတ္ေက်နပ္မွဳရရွိေစရန္ ၀န္ေဆာင္ေပးေနပါသည္။</p>\r\n");
      out.write(" <p>၀န္ေဆာင္မွုေပးေသာျမိဳ ့နယ္မ်ား <br>\r\n");
      out.write(" ၁။လမ္းမေတာ္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၂။လသာ&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ၃။ပန္းဘဲတန္း &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၄။ေက်ာက္တံတား &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၅။ဗိုလ္တေထာင္ <br>\r\n");
      out.write(" ၆။ပုဇြန္ေတာင္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၇။အလံု&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ၈။ၾကည့္ျမင္တိုင္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၉။စမ္းေခ်ာင္း &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;၁၀။ဒဂံု <br>\r\n");
      out.write("  ၁၁။ဗဟန္း &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;၇။ရန္ကင္း&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  ၁၃။ကမာရြတ္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; ၁၄။လိွုင္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;၁၅။မရမ္းကုန္း <br>\r\n");
      out.write("  ၁၆။တာေမြ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;၁၇။မဂၤလာေတာင္ညႊန္႕ &nbsp;&nbsp; ၁၈။သဃၤန္းက်ြန္း &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ၁၉။လိွုင္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;၂၀။ေတာင္ဥကၠလာ <br>\r\n");
      out.write(" ၂၁။အင္းစိန္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;၂၂။ေျမာက္ဒဂံု &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ၂၃။လိွဳင္သာယာ &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; ၂၄။လိွုင္ &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;၂၅။ေရႊျပည္သာ <br>\r\n");
      out.write(" ၂၆။ဒဂံုဆိပ္ကမ္း &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  ၂၇။ေတာင္ဒဂံု &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ၂၈။အေရွ ႕ဒဂံု &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; ၂၉။ေရႊလင္ဗန္း &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;၃၀။မဂၤလာဒံု <br>\r\n");
      out.write(" </p> \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bottom\"><h2><center>Thank you for visiting my website</center></h2></div>\r\n");
      out.write("\t\t </div>  \r\n");
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
