package model;

import dao.LoginDAO;
import vo.Login;

public class LoginModel {

	private LoginDAO logindao;
	
	public LoginModel() {
		this.logindao = new LoginDAO();
	}
	
	public Login buscaLogin(Login login) {
		
		return this.logindao.buscaLogin(login);
	}
	
	public void createUser(Login login) {
		this.logindao.createUser(login);
	}
	
}
