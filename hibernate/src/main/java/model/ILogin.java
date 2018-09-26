package model;

import vo.Login;

public interface ILogin {
	
	public abstract Login buscaLogin(Login login);
	
	public abstract void createUser(Login login);
	
	public abstract boolean createLogin(Login login);

}
