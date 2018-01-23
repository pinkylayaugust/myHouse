package action;

import org.apache.struts.action.ActionForm;

public class adminform extends ActionForm {	
	String email;
	String psw;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
}
