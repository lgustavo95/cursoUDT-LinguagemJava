package aula03_componentes_basicos;

import java.util.ArrayList;

/* criação e manipulação de arrays
 *
 */

public class Arrays {

	public static void main(String[] args) {
		
		//declaração de vetor vazio
		int number[] = new int[5];
		
		number[0]=10;
		number[1]=15;
		number[2]=20;
		number[3]=25;
		number[4]=30;
		
		System.out.println(number[2]);
		
		char consoantes[] = {'b','c', 'd', 'e', 'f'};
		char vogais[] = {'a','e','i','o','u'};
		
		System.out.println(vogais[0]);
		System.out.println(consoantes[3]);
		
		ArrayList<Integer> pares = new ArrayList<>();
		pares.add(2);
		pares.add(6);
		pares.add(1, 4);//add 4 no indice 1
		pares.add(8);
		pares.add(0, 0);// add 0 no indice 0
		pares.sort(null); //organizar arraylist
		pares.remove(0); //remover
		
		System.out.println(pares.get(1));
		System.out.println(pares);
		
	}

}
