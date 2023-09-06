package aula03_componentes_basicos;

/* aula III-elementos basicos da programação java
 * classe explicativa sobre expressões aritmeticas
 * classe Math
 * */

public class Elementos_Basicos {

	public static void main(String[] args) {
		
		int result = (15 + 5) - 10 * 5 / 2;
		System.out.println(result);
		
		//boolean resultado = 20 + 50 > 100 - 1;
		//System.out.println(resultado);
		
		//resultado = 30 == 3 * 10 && 50 < 75;
		
		double answer = Math.pow(3, 3);
		System.out.println(answer);
		
		System.out.println(Math.ceil(6.7));
		
	}

}
