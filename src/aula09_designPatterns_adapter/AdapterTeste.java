package aula09_designPatterns_adapter;

public class AdapterTeste {

	public static void main(String[] args) {
		
		EscalaTermica_adapter escala = new EscalaTermica_adapter();
		
		escala.setTemp(30);
		
		System.out.println("celsius: "+escala.getTemp());
		System.out.println("kelvin: "+escala.getTempKelvin());
		System.out.println("fahrenheit: "+escala.getTempFahrenheit());

	}

}
