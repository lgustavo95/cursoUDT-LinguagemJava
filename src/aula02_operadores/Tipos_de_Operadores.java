package aula02_operadores;

public class Tipos_de_Operadores {
	/* autor: luiz gustavo
	 * -operadores unário/binário, pre/pos fixp, logicos, 
	 * relacional, igualdade, relacional.
	 */

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 7;
		
		int result1 = num1 + num2;
		
		//op. aritmeticos
		System.out.println("op. aritmeticos");
		System.out.println(result1);
		
		int result2 = num1 - num2;
		System.out.println(result2);
		
		int result3 = num1 * num2;
		System.out.println(result3);
		
		double result4 = (double)num1 / num2;
		System.out.println(result4);
		
		int result5 = num1 % num2;
		System.out.println(result5);
		
		//op.pós/pré fixo, atribuição
		System.out.println("op. pos/pre fixo");
		System.out.println(num1++);//linha d codigo dpois incrementa
		System.out.println(num1);
		System.out.println(++num1);//incrementa dpois linha d codigo
		System.out.println(num1+=10);
		System.out.println(num1*=3);
		System.out.println(num1/=2);
		System.out.println(num1);
		
		//op.igualdade, relacional
		System.out.println(num1 != num2);
		System.out.println(num1 = num2);
		System.out.println(num1 == num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		
		//op.lógicos
		System.out.println("op. lógicos");
		System.out.println("AND");
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(true&&true);
		System.out.println("OR");
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);

	}

}