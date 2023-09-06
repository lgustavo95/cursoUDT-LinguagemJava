package aula09_designPatterns_strategy;

public class Pagamento_Pix implements Pagamento{

	@Override
	public String efetuarPagamento(double total) {
		
		return String.valueOf(total);
	}

	@Override
	public String calcularParcela(double total) {
		
		return String.valueOf(total/1);
	}

}