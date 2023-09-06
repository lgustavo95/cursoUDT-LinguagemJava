package aula05_orientacao_objetos;

public abstract class Animal { //abstract=impedir criação de objeto genérico d msm nome
	
	//atributos-propriedades de objetos
	private String tipoAlimento;
	
	private String habitat;
	
	private String nome;
	
	private int patas;
	
	private double tamanho;
	
	private boolean domesticado;
	
	private String paisOrigem;
	
	private static int numeroAnimais;

	
	//metodo construtor-parametros 
	//this para identificar atributo em vez do parametro
	public Animal(String tipoAlimento, String habitat, String nome, int patas, double tamanho, boolean domesticado,
			String paisOrigem) {
		this.tipoAlimento = tipoAlimento;
		this.habitat = habitat;
		this.nome = nome;
		this.patas = patas;
		this.tamanho = tamanho;
		this.domesticado = domesticado;
		this.paisOrigem = paisOrigem;
		this.numeroAnimais++;
	}
	
	//metodos acessores-get(retorna)&set(muda)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isDomesticado() {
		return domesticado;
	}

	public void setDomesticado(boolean domesticado) {
		this.domesticado = domesticado;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public static int getnumeroAnimais() { //metodo da classe n do objeto
		return numeroAnimais;
	}

	
		//metodos-açoes do objeto
		/*public void comer() {
			System.out.println("não comeu nada"); //imprime
		}*/
	public String comer() {
		return "ração";
	}

	public String caminhar() { //retorna
		return "caminhou ao ar livre";
	}
	
	public abstract String som(); 

	@Override
	public String toString() {
		return "Animal [tipoAlimento=" + tipoAlimento + ", habitat=" + habitat + ", nome=" + nome + ", patas=" + patas
				+ ", tamanho=" + tamanho + ", domesticado=" + domesticado + ", paisOrigem=" + paisOrigem
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}