package aula05_interfaces;

/*interfaces:
 * é uma maneira de amarrar metodos q são necessarios em uma classe;
 * obriga uma classe a ter um comportamento.
 * */

public interface Descontos {
	
	double fgts(double salario);
	double valeAlime(double salario);
	double valeTrans(double salario);

}
