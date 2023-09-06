package aula07_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Progr_Funcional {

	public static void main(String[] args) {
		//Java->POO ; JavaScript->PF
		//programacaoFuncional ou lambdaExpressions no java
		//métodos funcionais -> map, filter, forEach, reduce
		
		/*
		List<Integer> numeros = new ArrayList<>(Arrays.asList(0,2,4,6,8));
		numeros.add(10);
		
		//map -> percorre lista, aplica mudança e retorna valor
		List<Double> novaPontuacao = numeros.stream().map(numero -> Math.pow(numero, 2))
				.collect(Collectors.toList());
		
		//forEach -> percorre lista e não retorna, só mostra ou modifica algum valor
		numeros.stream().map(pontuacao -> pontuacao * 2).forEach(pontuacao -> System.out.print(pontuacao + " "));
		
		System.out.println(" ");
		
		for(Double numero : novaPontuacao) {
			System.out.print(numero + " ");
		} */
		
		//filter-> aplica predicado e retorna V
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		//numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
		
		//reduce
		//abaixo, 2 modos de n dar erro no reduce
		Integer somaPontuacoes = numbers.stream().reduce((total, pontuacao) -> total+=pontuacao).get();
		
		Integer somaPontuacoesRe = numbers.stream().reduce(0,(total, pontuacao) -> total+=pontuacao);
		
		System.out.println(somaPontuacoes);
		
	}

}
