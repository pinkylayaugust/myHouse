<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet" type="text/css" href="/myHouse/pages/style.css"/>
  <div id="wrapper">
 <div class="header"><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>
<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee>
</div>
<div class="menu"><a href="/myHouse/pages/Welcome.jsp">Home</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/aboutus.jsp">About</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/contactus.jsp">Contact Us</a>&nbsp;|&nbsp;
    <a href="/myHouse/pages/Welcome.jsp">Logout</a></div>
<div class="footer">
<br>
<form action="/myHouse/jsp/insertprocess.jsp" name="ip" method="get" accept-charset="UTF-8" enctype="multipart/form-data">
<table border=1>
<tr><td>Input Date</td><td><input type="text" name="ipdate"></td></tr>
<% request.setCharacterEncoding("UTF-8"); %>
<tr><td>Name</td><td><input type="text" name="nn" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Phone Number</td><td><input type="text" name="ph" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Township</td><td><input type="text" name="ts" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Home Number</td><td><input type="text" name="hn" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Address</td><td><input type="text" name="ad" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Type</td><td><input type="text" name="ty" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Floor</td><td><input type="text" name="fl" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Land Area</td><td><input type="text" name="la" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Build Area</td><td><input type="text" name="ba" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Sale Price</td><td><input type="text" name="sp" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Rent Price</td><td><input type="text" name="rp" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Particular</td><td><input type="text" name="pa" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Photo</td><td><input type="file" name="pto" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Remark</td><td><input type="text" name="rm" style='font-family:Zawgyi-one;'></td></tr>
<tr><td>Output Date</td><td><input type="text" name="opdate" style='font-family:Zawgyi-one;'></td></tr>
<tr><td><input type="submit" value="insert"></td><td><input type="reset" value="Clear"></td></tr>
</table>
</form>
</div>
<div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
</div>
</body>
</html>