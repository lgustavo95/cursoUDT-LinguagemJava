package aula04_progr_estruturada;

public class Soma_divisores {

	public static void main(String[] args) {
		
		//1 + 1/2 + 1/3 + 1/4 + ... 1/100
		double resposta = 0;
		for(int divisor  = 1; divisor < 100; divisor++) {
			resposta+= (double) 1/divisor; 
		}
		System.out.println(resposta);
	}

}
