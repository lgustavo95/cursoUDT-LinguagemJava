package escola;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String rg;
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	private String endereco;

	public Pessoa(String rg, String nome, LocalDate dataNascimento, String endereco) {
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public abstract String toString();

}
