package aula03_componentes_basicos;
/*
 * funções-blocos de codigo que fazem determinada tarefa
 * método-aplicado a um objeto
 * operador ternário
 * 
 * */

public class Funcoes_OpTernario {

	public static void main(String[] args) {
		
		int result = soma(15,10);
		System.out.println(result);
		
		quadrado(8);
		
		String text = mensagem();
		System.out.println(mensagem());
		
		hallowelt();
		
		//operador ternário
		int nota  = 6;
		String resulta = nota>=7?"aprovado":"reprovado";
		System.out.println(resulta);
		
	}
	
	//função com retorno, tipo int, recebe 2 parametros
	static int soma(int a, int b) {
		return a + b;
	}
	
	//não retorna, só imprime
	static void quadrado(int number) {
		System.out.println(number*number);
	}
	
	//não recebe parametro e retorna algo
	static String mensagem() {
		return "System message";
	}
	
	//n tem parametro e n retorna nada
	static void hallowelt() {
		System.out.println("Hallo Welt!");
	}

}
