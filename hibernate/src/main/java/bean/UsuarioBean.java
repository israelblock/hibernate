package bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.UsuarioModel;
import vo.Usuario;

@SuppressWarnings("deprecation")
@ManagedBean(name = "loginBean")
@SessionScoped
public class UsuarioBean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6491642606878359116L;
	private UsuarioModel loginModel;
	private Usuario login;

	public UsuarioBean() {
		this.setLogin(new Usuario());
		
		this.loginModel = new UsuarioModel();
		
	}

	public Usuario getLogin() {
		return login;
	}

	public void setLogin(Usuario login) {
		this.login = login;
	}
	
	public String createLogin() {
		
		if(this.login != null) {
			FacesContext contexto = FacesContext.getCurrentInstance();
			
			this.loginModel.createUser(this.login);
			
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN VÁLIDO!", null));
			
			setLogin(null);
		}else {
			setLogin(new Usuario());
			
			FacesContext contexto = FacesContext.getCurrentInstance();
			
			this.loginModel.createUser(this.login);
			
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN VÁLIDO!", null));
			
			setLogin(null);
			
		}
		
		
		
		return "/index";
		
		
	}

	public String efetuarLogin() {

		FacesContext contexto = FacesContext.getCurrentInstance();
		
		this.login = this.loginModel.buscaLogin(login);
		
		if(this.login ==  null) {
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "LOGIN INVÁLIDO!", null));
			return "/index";
		}else {
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "LOGIN EFETUADO!", null));
			return "/index";
		}
	}

}
