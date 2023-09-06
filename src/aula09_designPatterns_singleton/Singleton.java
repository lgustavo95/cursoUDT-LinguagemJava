package aula09_designPatterns_singleton;

public class Singleton {
	//verifica se o objeto ja foi instanciado
	
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
