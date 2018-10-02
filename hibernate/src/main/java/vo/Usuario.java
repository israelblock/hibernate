package vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO_TABLE")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_sequence")
	@SequenceGenerator(name = "generator_sequence", sequenceName="USUARIO_SEQUENCE_TEMP")
	private Integer id;
	
	@Column(name="LOGIN", length = 20, nullable = false)
	private String login;
	
	@Column(name="SENHA", length = 20, nullable = false)
	private String senha;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;
	
	public Usuario() {
		super();
	}
	public Usuario(Integer id, String login, String senha, Endereco endereco) {
		super();
		setId(id);
		setLogin(login);
		setSenha(senha);
		setEndereco(endereco);
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
