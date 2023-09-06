package aula04_progr_estruturada;

public class Estrutura_decisao02 {

	public static void main(String[] args) {
		
		System.out.println("type a language:");
		int choice = 6;
		
		switch(choice) {
		case 1: 
			System.out.println("english"); 
			break;
		case 2: 
			System.out.println("español"); 
			break;
		case 3: 
			System.out.println("russkyii"); 
			break;
		case 4: 
			System.out.println("français"); 
			break;
		case 5: 
			System.out.println("hanyu"); 
			break;
		case 6: 
			System.out.println("earabiun"); 
			break;
		case 7: 
			System.out.println("deutsch"); 
			break;
		default: 
			System.out.println("invalid option");
		}
		
		//FOR
		for(int x=1; x<=20; x+=2) {
			System.out.println(x);
		}
		
		//FOR melhorado
		int pares[] = {0,2,4,6,8};
		for(int number: pares) {
			System.out.println(number+" ");
		}

	}
}