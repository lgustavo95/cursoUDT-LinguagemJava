package aula09_designPatterns_strategy;

public class StrategyTeste {

	public static void main(String[] args) {
		
		Double total = 1500.0;
		
		Contexto contexto = new Contexto(new Parcelamento_3x());
		
		contexto = new Contexto(new Parcelamento_5x());
		
		contexto = new Contexto(new Pagamento_Pix());
		
		System.out.println(contexto.calculaParcela(total));
		System.out.println(contexto.calculaPagamento(total));
		
	}
}