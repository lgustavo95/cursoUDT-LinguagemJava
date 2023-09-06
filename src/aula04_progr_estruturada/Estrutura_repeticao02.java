package aula04_progr_estruturada;

import java.util.Arrays;
import java.util.List;

public class Estrutura_repeticao02 {

	public static void main(String[] args) {
		
	/*	String listaPais[] = {"EUA","China","Alemanha","Japao"};
		
		for (int contador = 0; contador < listaPais.length; contador++) {
			System.out.println(listaPais[contador]);
		} */
		
		List<String> listaPais = Arrays.asList("EUA","China","Alemanha","Japao");
		
		for(int contador = 0; contador < listaPais.size(); contador++) {
               System.out.println(listaPais.get(contador));
        }
		
        for(String pedaco : listaPais) {
        	System.out.println("FOR melhorado " + pedaco);
        }
        
        listaPais.stream().forEach(System.out::println);

	}

}
