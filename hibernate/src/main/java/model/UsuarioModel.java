package model;

import dao.UsuarioDAO;
import vo.Usuario;

public class UsuarioModel {

	private UsuarioDAO logindao;
	
	public UsuarioModel() {
		this.logindao = new UsuarioDAO();
	}
	
	public Usuario buscaLogin(Usuario login) {
		
		return this.logindao.buscaLogin(login);
	}
	
	public void createUser(Usuario login) {
		this.logindao.createUser(login);
	}
	
}
