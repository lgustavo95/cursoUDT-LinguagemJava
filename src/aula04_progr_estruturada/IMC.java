package aula04_progr_estruturada;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type your height");
		double height = scan.nextDouble();
		
		System.out.println("type your weight");
		double weight = scan.nextDouble();
		
		double imc = weight / Math.pow(height, 2);
		
		if(imc < 18.5) {
			System.out.println("your IMC is " + imc + ", underweight");
		} else if(imc >= 18.5 && imc < 25) {
			System.out.println("your IMC is " + imc + ", normal weight");
		} else if(imc >=25 && imc < 29.9) {
			System.out.println("your IMC is " + imc + ", slightly overweight");
		} else if(imc >=30 && imc < 34.9) {
			System.out.println("your IMC is " + imc + ", obesity I");
		} else if(imc >= 35 && imc < 39.9) {
			System.out.println("your IMC is " + imc + ", obesity II/several");
		} else if (imc >=40) {
			System.out.println("your IMC is " + imc + ", obesity III/morbid");
		}
		scan.close();
	}
}