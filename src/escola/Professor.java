package escola;

import java.time.LocalDate;

public class Professor extends Pessoa{
	
	private double salario;
	private String materia;
	private int qtdeTurmas;
	
	public Professor(String rg, String nome, LocalDate dataNascimento, String endereco,
			double salario, String materia, int qtdeTurmas) {
		super(rg, nome, dataNascimento, endereco);
		this.salario = salario;
		this.materia = materia;
		this.qtdeTurmas = qtdeTurmas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getQtdeTurmas() {
		return qtdeTurmas;
	}

	public void setQtdeTurmas(int qtdeTurmas) {
		this.qtdeTurmas = qtdeTurmas;
	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", materia=" + materia + ", "
				+ "qtdeTurmas=" + qtdeTurmas + ", getRg()="
				+ getRg() + ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getEndereco()=" + getEndereco() + "]";
	}
	
}
