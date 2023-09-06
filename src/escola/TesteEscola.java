package escola;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TesteEscola {

	public static void main(String[] args) {
		
		Pessoa p1 = new Aluno ("13579-1113","Ludwig von Hausen",
				LocalDate.of(1986, Month.JULY, 10),"Av B/Cj Ceara", "Redes", "Noite");
		
		System.out.println(p1.toString());
		
		LocalDate today = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(p1.getDataNascimento(), today));

	}

}
