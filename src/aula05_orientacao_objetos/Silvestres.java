package aula05_orientacao_objetos;

public class Silvestres extends Animal{
	
		public Silvestres (String tipoAlimento, String habitat, String nome, int patas, 
				double tamanho,boolean domesticado, String paisOrigem) {
			
			super(tipoAlimento,habitat,nome,patas,tamanho,domesticado,paisOrigem);
					}

		@Override
		public String som() {
			return "rugidoo";
		}
		
		

}
