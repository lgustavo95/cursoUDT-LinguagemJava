package aula09_designPatterns_strategy;

public interface Pagamento {
	
	public String efetuarPagamento(double total);
	public String calcularParcela(double total);

}
