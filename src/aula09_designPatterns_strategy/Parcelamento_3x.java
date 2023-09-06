package aula09_designPatterns_strategy;

import java.text.DecimalFormat;

public class Parcelamento_3x implements Pagamento{
		DecimalFormat numeroFormatado = new DecimalFormat("#.00");

		@Override
		public String efetuarPagamento(double total) {
			
			total += total*0.2;
			
			return numeroFormatado.format(total);
		}

		@Override
		public String calcularParcela(double total) {
			
			total+=total*0.2;
			
			return numeroFormatado.format(total/3);
		}
	}