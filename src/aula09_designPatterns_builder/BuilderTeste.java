package aula09_designPatterns_builder;

import java.time.LocalDate;

public class BuilderTeste {

	public static void main(String[] args) {
		
		//forma padrão
		Endereco e1 = new Endereco("Av Joao Pessoa","1000","Damas","Fortaleza","CE");
		
		LocalDate dataNasc = LocalDate.of(2002, 01, 10);
		
		Pessoa p1 = new Pessoa("Paulo",dataNasc,e1);
		
		//forma builder
		Pessoa pb = new PessoaBuilder()
				.setPessoa("Maria", dataNasc)
				.setEndereco("Av Paulista", "200", "Centro", "São Paulo", "SP")
				.build();

	}
}