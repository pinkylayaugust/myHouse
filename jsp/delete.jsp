<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Housing Information</title>
</head>
<body text="blue">
<link rel="stylesheet" type="text/css" href="/myHouse/pages/style.css"/>
  <div id="wrapper">
<div class="header"><center><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>
<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee></center>
</div>
<div class="menu"><a href="/myHouse/pages/Welcome.jsp">Home</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/aboutus.jsp">About</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/contactus.jsp">Contact Us</a>&nbsp;|&nbsp;
    <a href="/myHouse/pages/Welcome.jsp">Logout</a></div>
<div class="footer">
<br>
<%
String pno=request.getParameter("id");
System.out.println("ID Number is"+pno);
String url="jdbc:mysql://localhost/housedb?useUnicode=true&characterEncoding=UTF-8&user=root&password=root"; 
Statement stmt=null;
int quan=0;
String brand=null;
  try{
	  System.out.println("Try");
	  Class.forName("com.mysql.jdbc.Driver"); 
   Connection con=(Connection) DriverManager.getConnection(url);
   stmt=(Statement) ((java.sql.Connection) con).createStatement();  
   int RowCount=stmt.executeUpdate("DELETE FROM house WHERE id='"+pno+"'"); 
   System.out.println("DB connection succeed"); 
   RequestDispatcher rd=request.getRequestDispatcher("../jsp/admin.jsp");
	rd.forward(request,response);
  
  }
  catch(Exception ex){
	   ex.printStackTrace();
	   }
%>
</div>
</div>
</body>
</html>