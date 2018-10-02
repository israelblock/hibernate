package model;

import vo.Usuario;

public interface IUsuario {
	
	public abstract Usuario buscaLogin(Usuario login);
	
	public abstract void createUser(Usuario login);
	
	public abstract boolean createLogin(Usuario login);

}
