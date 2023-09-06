package aula05_interfaces;

public class TesteSalario {

	public static void main(String[] args) {
		
		Trabalhador man1 = new Trabalhador("João", 1500);
		
		System.out.println(man1.valeAlim.calcula(man1.getSalario()));
		System.out.println(man1.valeTran.calcula(man1.getSalario()));
		System.out.println(man1.fgts.calcula(man1.getSalario()));
	}

}
