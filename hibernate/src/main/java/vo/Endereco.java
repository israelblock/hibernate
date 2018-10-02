package vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_sequence")
	@SequenceGenerator(name = "generator_sequence", sequenceName="ENDERECO_SEQUENCE_TEMP")
	private int id_endereco;
	
	@Column(name="LOGRADOURO", length = 20, nullable = false)
	private String logradouro;
	
	public Endereco() {
		super();
	}
	public Endereco(int id_endereco, String logradouro) {
		super();
		setId_endereco(id_endereco);
		setLogradouro(logradouro);
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
}
