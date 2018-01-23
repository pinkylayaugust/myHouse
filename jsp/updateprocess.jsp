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
 <div class="header"><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>
<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee>
</div>
<div class="menu"><a href="/myHouse/pages/Welcome.jsp">Home</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/aboutus.jsp">About</a>&nbsp;|&nbsp;
    <a href="/myHouse/jsp/contactus.jsp">Contact Us</a>&nbsp;|&nbsp;
    <a href="/myHouse/pages/Welcome.jsp">Logout</a></div>
<div class="footer">
<br><br>
<div style="height:450px;width:960px;overflow-x:scroll;overflow-y:scroll;border:1px solid black;font-size:20px;">
<pre>
<%
HttpSession b=request.getSession();
String id=String.valueOf(b.getAttribute("ID"));
int uid=Integer.parseInt(id);
System.out.println("ID No in updateprocess page:"+uid);
request.getCharacterEncoding();
String ipd=new String(request.getParameter("ii").getBytes("ISO-8859-1"),"UTF-8");
String na=new String(request.getParameter("nn").getBytes("ISO-8859-1"),"UTF-8");
String pno=new String(request.getParameter("pnn").getBytes("ISO-8859-1"),"UTF-8");
String ts=new String(request.getParameter("tt").getBytes("ISO-8859-1"),"UTF-8");
String hn=new String(request.getParameter("hh").getBytes("ISO-8859-1"),"UTF-8");
String ad=new String(request.getParameter("aa").getBytes("ISO-8859-1"),"UTF-8");
String ty=new String(request.getParameter("typ").getBytes("ISO-8859-1"),"UTF-8");
String fl=new String(request.getParameter("ff").getBytes("ISO-8859-1"),"UTF-8");
String la=new String(request.getParameter("ll").getBytes("ISO-8859-1"),"UTF-8");
String ba=new String(request.getParameter("bb").getBytes("ISO-8859-1"),"UTF-8");
String sp=new String(request.getParameter("ss").getBytes("ISO-8859-1"),"UTF-8");
String rp=new String(request.getParameter("rr").getBytes("ISO-8859-1"),"UTF-8");
String pa=new String(request.getParameter("par").getBytes("ISO-8859-1"),"UTF-8");
String pht=new String(request.getParameter("pt").getBytes("ISO-8859-1"),"UTF-8");
String re=new String(request.getParameter("rem").getBytes("ISO-8859-1"),"UTF-8");
String od=new String(request.getParameter("odt").getBytes("ISO-8859-1"),"UTF-8");
String url="jdbc:mysql://localhost/housedb?useUnicode=true&characterEncoding=UTF-8&user=root&password=root"; 
Statement stmt=null;
  try{
	  Class.forName("com.mysql.jdbc.Driver"); 
   Connection con=(Connection) DriverManager.getConnection(url);
   stmt=(Statement) ((java.sql.Connection) con).createStatement(); 
   String strmycar="update house set inputdate='"+ipd+"',name='"+na+"',phoneno='"+pno+"',township='"+ts+"',homeno='"+hn+"',address='"+ad+"',type='"+ty+"',floor='"+fl+"',landarea='"+la+"',buildarea='"+ba+"',saleprice='"+sp+"',rentprice='"+rp+"',particular='"+pa+"',photo='"+pht+"',remark='"+re+"',outputdate='"+od+"' where id='"+uid+"'";
   int RowCount=stmt.executeUpdate(strmycar);   
   System.out.println("Update Success");
   String strbrand="SELECT * FROM house where id='"+uid+"'"; 
   ResultSet rs=stmt.executeQuery(strbrand); 
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
	   String upno=rs.getString(4);
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
	   out.println("<td style='font-family:Zawgyi-one;'>"+upno+"</td>");
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
	   out.println("<td style='font-family:Zawgyi-one;'><img src='/myHouse/image/"+photo+"' width=70px height=70px></td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+remark+"</td>");
	   out.println("<td style='font-family:Zawgyi-one;'>"+odate+"</td>"); out.println("</tr>");
   }
   out.println("</table>");
   out.println("</pre>");
   out.println("<a href='/myHouse/jsp/admin.jsp'>Go To Admin Page</a>");
   out.println("</div>"); 
  }  catch(Exception ex){
	   ex.printStackTrace();
	   }
%>
</div>
<div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
		 </div>  
</body>
</html>