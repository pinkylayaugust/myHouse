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
<br>
<h2>လူၾကိီးမင္းရွာေဖြလိုေသာParticularကိုရိုက္နွိပ္ျပီးရွာေဖြနုိင္ပါသည္။</h2>
<form action="/myHouse/jsp/particularSearch.jsp"  name="ss" method="get" accept-charset="UTF-8" enctype="multipart/form-data">
<% request.setCharacterEncoding("UTF-8"); %>
<input style='font-family:Zawgyi-one;' type="text" name="pc"><br>
<input type="submit" value="Search">
</form>

</div>
<div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
</div>
</body>
</html>