package aula09_designPatterns_builder;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNasc;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, LocalDate dataNasc, Endereco endereco) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}