package vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO_TABLE")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_sequence")
	@SequenceGenerator(name = "generator_sequence", sequenceName="USUARIO_SEQUENCE_TEMP")
	private Integer id;
	
	@Column(name="LOGIN", length = 20, nullable = false)
	private String login;
	
	@Column(name="SENHA", length = 20, nullable = false)
	private String senha;
	
	public Login() {
		
	}
	public Login(Integer id, String login, String senha) {
		this.id = getId();
		this.login = getLogin();
		this.senha = getSenha();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
