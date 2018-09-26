package bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.LoginModel;
import vo.Login;

@SuppressWarnings("deprecation")
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6491642606878359116L;
	private LoginModel loginModel;
	private Login login;

	public LoginBean() {
		this.setLogin(new Login());
		
		this.loginModel = new LoginModel();
		
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	public String createLogin() {
		
		if(this.login != null) {
			FacesContext contexto = FacesContext.getCurrentInstance();
			
			this.loginModel.createUser(this.login);
			
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN V�LIDO!", null));
			
			setLogin(null);
		}else {
			setLogin(new Login());
			
			FacesContext contexto = FacesContext.getCurrentInstance();
			
			this.loginModel.createUser(this.login);
			
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN V�LIDO!", null));
			
			setLogin(null);
			
		}
		
		
		
		return "/index";
		
		
	}

	public String efetuarLogin() {

		FacesContext contexto = FacesContext.getCurrentInstance();
		
		this.login = this.loginModel.buscaLogin(login);
		
		if(this.login ==  null) {
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "LOGIN INV�LIDO!", null));
			return "/index";
		}else {
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "LOGIN EFETUADO!", null));
			return "/index";
		}
	}

}
