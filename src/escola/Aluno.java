package escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa{
	
	private String turma;
	private String turno;
	
	public Aluno(String rg, String nome, LocalDate dataNascimento, String endereco,
			String turma,String turno) {
		super(rg,nome,dataNascimento,endereco); //chama o construtor da classe principal
		this.turma = turma;
		this.turno = turno;
	}
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Aluno [rg: " +getRg()+ " nome: " +getNome()+ " dataNascimento: " 
	        +getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/YYYY"))+
				" endereco:" +getEndereco()+ " turma:" + turma + " turno: " + turno + "]";
	}
}
