<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<script language="javascript"></script>
</head>
<body>
<link rel="stylesheet" type="text/css" href="/myHouse/pages/style.css"/>
  <div id="wrapper">
 <div class="header"><center><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>
<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee></center>
</div>
<div class="menu"><a href="/myHouse/pages/Welcome.jsp">Home</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/aboutus.jsp">About</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/contactus.jsp">Contact Us</a></div>
<div class="footer">
<br><br>
<div style="height:450px;width:960px;overflow-x:scroll;overflow-y:scroll;border:1px solid black;font-size:20px;font-family:Zawgyi-One;">
<pre>
<%
request.getCharacterEncoding();
String spr=new String(request.getParameter("sp").getBytes("ISO-8859-1"),"UTF-8");
System.out.println("Sale Price is"+spr);
String url="jdbc:mysql://localhost/housedb?useUnicode=true&characterEncoding=UTF-8&user=root&password=root"; 
Statement stmt=null;
  try{
	  Class.forName("com.mysql.jdbc.Driver"); 
   Connection con=(Connection) DriverManager.getConnection(url);
   stmt=(Statement) ((java.sql.Connection) con).createStatement(); 
   String strname="SELECT * FROM house where saleprice='"+spr+"'"; 
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
%>
</div>
<div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
</div>
</body>
</html>