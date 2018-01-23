package action;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Adminaction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Admin Action");
	String url="jdbc:mysql://localhost/housedb?user=root&password=root"; 
	Statement stmt=null;
	String SUC=null;
	String stremail=null;
	String strpsw=null;
	String uc=null;
	String up=null;
	  try{ 
		  Class.forName("com.mysql.jdbc.Driver"); 
	   Connection con=(Connection) DriverManager.getConnection(url);
	   stmt=(Statement) ((java.sql.Connection) con).createStatement(); 
	   stremail=request.getParameter("email");
	   strpsw=request.getParameter("psw");
	   System.out.println("Name From Textbhox "+stremail);
	   System.out.println("Psw From Textbox "+strpsw);
	   String strdata="SELECT * FROM adminlogin where email='"+stremail+"'And password='"+strpsw+"'"; 
	   ResultSet rs=stmt.executeQuery(strdata); 	   
	   while (rs.next()) 
	      { 
	       uc=rs.getString(2); 
	       up=rs.getString(3);
	       System.out.println("Email form Db "+uc);
	       System.out.println("Password form Db "+up);	      
	    			   
	      }	   
	   HttpSession session = request.getSession(true);
		
	   session.setAttribute("username",uc);
	   System.out.println("UserName is"+String.valueOf(session.getAttribute("username")));
	  }
	              catch(Exception ex)
	              {
	            	  ex.printStackTrace();
	              }
	              if((stremail.equals(uc)) && (strpsw.equals(up)))
	            		  {
	            	  SUC="success";
	            		  }
	              else
	              {
	            	  SUC="error";
	              }
	              System.out.println("SUC is "+SUC);
	
	             return mapping.findForward(SUC);
}
}

	

