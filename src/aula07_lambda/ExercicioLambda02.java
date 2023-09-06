package aula07_lambda;

import java.util.Arrays;
import java.util.List;

public class ExercicioLambda02 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("maçã",10,8.0);
		
		List<Produto> produtos = Arrays
				.asList(new Produto("maçã",10,8.0),
						new Produto("banana",3,3.40),
						new Produto("mamão papaya",2,2.70),
						new Produto("yogurte natural",7, 2.79));
		
		//antes desconto
		for(Produto compras:produtos) {
			System.out.println(compras);
		}
		
		//aplicar desconto 10%
		produtos.stream().forEach(fruta -> {
			double desconto  = fruta.getPreco() * 0.1;
			fruta.setPreco(fruta.getPreco() - desconto);
			System.out.println(fruta.getPreco());
		});
		
		//aplicar desconto 10% somente p/ + d 10unidades
			/*	produtos.stream().filter(produto -> produto.getQuantidade() >=10).forEach(fruta -> {
					double desconto  = fruta.getPreco() * 0.1;
					fruta.setPreco(fruta.getPreco() - desconto);
					System.out.println(fruta.getPreco());
				}); */
		
		//depois desconto
		for(Produto compras:produtos) {
			System.out.println(compras);
		}
		
	}

}