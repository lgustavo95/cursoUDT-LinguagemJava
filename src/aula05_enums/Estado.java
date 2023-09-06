package aula05_enums;

/*usa-se enums quando se tem uma lista de constantes q n mudam
 * */

public enum Estado {
	
	CEARA("CE"), BAHIA("BA"), PIAUI("PI"), ALAGOAS("AL"), PERNAMBUCO("PE"), SERGIPE("SE");
	
	public final String sigla;
	private Estado (String sigla) {
		this.sigla = sigla;
	}

}
