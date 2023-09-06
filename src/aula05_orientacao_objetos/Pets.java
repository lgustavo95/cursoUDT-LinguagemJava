package aula05_orientacao_objetos;

public class Pets extends Animal{
	
	public String raca;
	
	public Pets(String tipoAlimento, String habitat, String nome, int patas, double tamanho, 
			boolean domesticado, String paisOrigem, String raca) {
	
			super(tipoAlimento,habitat,nome,patas,tamanho,domesticado,paisOrigem);
			this.raca = raca;
			}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String comer() {
		return "ração";
	}

    public String caminhar() {
    	return "caminhou ao ar livre";
    }
    
    public String latir() {
    	return "auauauau";
    }
    
    public String dormir() {
    	return "zzzzz";
    }

	@Override
	public String toString() {
		return "Pets [raca=" + raca + ", getNome()=" + getNome() + ", getTipoAlimento()=" + getTipoAlimento()
				+ ", getHabitat()=" + getHabitat() + ", getPatas()=" + getPatas() + ", getTamanho()=" + getTamanho()
				+ ", isDomesticado()=" + isDomesticado() + ", getPaisOrigem()=" + getPaisOrigem() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public String som() {
		return "au au";
	}
    
	
}
