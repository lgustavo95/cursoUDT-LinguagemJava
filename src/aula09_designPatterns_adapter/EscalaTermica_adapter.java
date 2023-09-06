package aula09_designPatterns_adapter;

public class EscalaTermica_adapter extends EscalaTermicaCelsius {
	//se tiver conversão, usa-se adapter p/ converter valores
	
	@Override
	public double getTemp() {
		return super.getTemp();
	}
	
	@Override
	public void setTemp(double temp) {
		super.setTemp(temp);
	}
	
	public double getTempKelvin() {
		return (super.getTemp()+273);
	}
	
	public double getTempFahrenheit() {
		return 1.8*(super.getTemp())+32;
	}
}