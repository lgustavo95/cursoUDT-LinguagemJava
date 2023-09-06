package aula04_progr_estruturada;

/*AULA 4-ESTRUTURAS DE REPETIÇÃO EM JAVA
 * WHILE
 * DO-WHILE
 * FOR
 * */

import java.util.Scanner;

public class Estrutura_repeticao01 {

	public static void main(String[] args) {
		
	/*	boolean verde = true;
		boolean red = true;
		Scanner scan = new Scanner (System.in);
		
		while(verde) {
			String resposta = scan.nextLine();
			
			if(resposta.equals("v")) {
				System.out.println("continue dirigindo");
			} else if (resposta.equals("r")){
				System.out.println("pare");
			}
			}
		
		scan.close(); */
		
		
		int contador = 1, somador = 0;
		while(contador <= 100) {
			somador += contador;
			contador++;
		}
		System.out.println(contador);
		System.out.println(somador);
		
		do {
			System.out.println(contador);
			contador++;
		} while(contador<=100);
		
		
		}

	}