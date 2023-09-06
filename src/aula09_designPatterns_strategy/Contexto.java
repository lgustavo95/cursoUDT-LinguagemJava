package aula09_designPatterns_strategy;

public class Contexto {
	
	private Pagamento pagamento;
	
	public Contexto(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public String calculaPagamento(double total) {
		return pagamento.efetuarPagamento(total);
	}
	
	public String calculaParcela(double total) {
		return pagamento.calcularParcela(total);
	}

}