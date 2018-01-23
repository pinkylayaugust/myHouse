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
	   %>
	   <form method="get" action="/myHouse/jsp/updateprocess.jsp" accept-charset="UTF-8" enctype="multipart/form-data">
       <table border=1 width="40%" height="80%" align="center">
       <% request.setCharacterEncoding("UTF-8"); %>
      <caption><u>Housing Form</u></caption>
      <tr>
            <td>
              <table border=1 color=pink>
              <tr>
                 <td>User ID</td>
                 <td>:<%=ii%></td>
              </tr>  
              <tr>
                 <td>Input Date</td>
                 <td>:<input name="ii" type="text" value="<%=ipd %>" style='font-family:Zawgyi-one;'></td>
              </tr>            
              <tr>
                 <td>Name</td>
                 <td>:<input name="nn" type="text" value="<%=myuser%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Phone Number</td>
                 <td>:<input name="pnn" type="text" value="<%=pno%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Town Ship</td>
                 <td>:<input name="tt" type="text" value="<%=tsh%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Home Number</td>
                 <td>:<input name="hh" type="text" value="<%=hno%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Address</td>
                 <td>:<input name="aa" type="text"  value="<%=addr%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Type</td>
                 <td>:<input name="typ" type="text"   value="<%=ty%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Floor</td>
                 <td>:<input name="ff" type="text" value="<%=fl%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Land Area</td>
                 <td>:<input name="ll" type="text" value="<%=la%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Building Area</td>
                 <td>:<input name="bb" type="text" value="<%=ba%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Sale Price</td>
                 <td>:<input name="ss" type="text" value="<%=sp%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
               <tr>
                 <td>Rent Price</td>
                 <td>:<input name="rr" type="text" value="<%=rp%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
                 <td>Particular</td>
                 <td>:<input name="par" type="text" value="<%=pa%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
               <tr>
                 <td>Photo</td>
                 <td>:<input type="text" name="pt" style='font-family:Zawgyi-one;' value="<%=ph%>"></td>
              </tr>
			 <tr>
                 <td>Remark</td>
                 <td>:<input name="rem" type="text" value="<%=re%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
               <tr>
                 <td>Output Date</td>
                 <td>:<input name="odt" type="text" value="<%=od%>" style='font-family:Zawgyi-one;'></td>
              </tr> 
              <tr>
              <td colspan=2 align=center>
                  <input type="submit" value="Update">&nbsp;&nbsp;&nbsp;
                  <input type="reset" value="Clear">
              </table>
            </td>
      </tr>
      </table>
      </form> 
	    <%
	    HttpSession a=request.getSession();
		 a.setAttribute("ID",ii);  
		 System.out.println("ID no in edit page:"+ii);
   }
  }
  catch(Exception ex){
	   ex.printStackTrace();
	   }
%>
<br><br>
               </div>	
              <div class="bottom"><h2><center>Thank you for visiting my website</center></h2></div>
		 </div> 		 
</body>
</html>