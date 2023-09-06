package aula05_interfaces;

interface Desconto{
	double calcula(double salario);
}

public class Trabalhador {
	
	private String nome;
	private double salario;
	
	public Trabalhador(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	Desconto fgts = salario -> salario * 11/100;
	Desconto valeAlim = salario -> salario * 6/100;
	Desconto valeTran = salario -> salario * 4/100;

}