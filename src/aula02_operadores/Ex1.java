package aula02_operadores;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
        Scanner dig = new Scanner(System.in);
		
		String nome;
		int id;
		double alt;
		String pais;
		
		System.out.println("digite o seu nome");
		nome = dig.nextLine();
		
		System.out.println("digite o seu país");
		pais = dig.nextLine();
		
		System.out.println("digite a sua idade");
		id = dig.nextInt();
		
		System.out.println("digite a sua altura");
		alt = dig.nextDouble();
		
		System.out.println(nome);
		System.out.println(pais);
		System.out.println(id);
		System.out.println(alt);
		
		System.out.printf("Nome: %s \nPaís: %s \nIdade: %d \nAltura: %.2f",nome,pais,id,alt);
		
		dig.close();

	}

}
