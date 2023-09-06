package aula09_designPatterns_builder;

import java.time.LocalDate;

public class PessoaBuilder {
	
	private Pessoa instancia;
	
	public PessoaBuilder() {
		this.instancia = new Pessoa();
	}
	
	public PessoaBuilder setPessoa(String nome, LocalDate dataNasc) {
		instancia.setNome(nome);
		instancia.setDataNasc(dataNasc);
		return this;
	}
	
	public PessoaBuilder setEndereco(String logradouro, String numero, String bairro, 
			String cidade, String UF) {
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setUF(UF);
		
		instancia.setEndereco(endereco);
		
		return this;
	}
	
	public Pessoa build() {
		return instancia;
	}
}