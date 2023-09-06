package aula04_progr_estruturada;

/*
 * estruturas de decisão em java
 * OPERADOR TERNARIO (visto na aula 03)
 * IF, IF/ELSE
 * FOR/FOR MELHORADO
 * SWITCH CASE
 */

public class Estrutura_decisao01 {

	public static void main(String[] args) {
		
		//if
		/*int dividendo = 16;
		if(dividendo % 2 == 0) {
			System.out.printf("%d é divisível por 2!", dividendo);
		}*/
		
		//if-else
	/*	int divid = 19;
		if(divid%2==0) {
			System.out.printf("%d é par", divid);
		}else {
			System.out.printf("%d não é par, é impar",divid);
		} */
		
		
		int age = 15, timeBetweenDonation = 5;
		double width = 59;
		boolean healthy = true;
		
		boolean fitDonateBlood = age > 16 && timeBetweenDonation > 2 && healthy && width > 60;
		
		if(fitDonateBlood) {
			System.out.println("fit to donate blood");
		} else {
			System.out.println("not fit to donate blood");
		}
		
		//op.ternário
	//	String answer = fitDonateBlood ? "fit to donate blood" : "not fit to donate blood";
		
		
		double nota = 3;
		boolean notaValida = nota >= 0 && nota <=10;
		
		if(notaValida && nota >=7) {
			System.out.println("aprovado");
		} else if (notaValida && nota >=4){
			System.out.println("Avaliação Final");
			
			//if aninhado
			nota = 4;
			if(notaValida && nota >=5) {
				System.out.println("aprovado conceito B");
			} else {
				System.out.println("reprovado direto após AF");
			}
			//op.ternario
		//	String resposta = (notaValida&&nota>=5) ? "aprovado conceito B" : "reprovado direto após AF";
			
		} else if (notaValida && nota < 4) {
			System.out.println("reprovado");
		} else {
			System.out.println("nota invalida");
		}
				
	}

}