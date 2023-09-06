package aula06_gui;

public class Aula08_Contato {
	//entidade
	
	private long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String telefone;
	
	public Aula08_Contato() {};

	public Aula08_Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//toString p/ referenciar o objeto
	@Override
	public String toString() {
		return "Aula08_JAVASQL_Contato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", telefone="
				+ telefone + "]";
	}

}