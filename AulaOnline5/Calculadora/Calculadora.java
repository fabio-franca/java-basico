package cursoJava.AulaOnline5.Calculadora;

public abstract class Calculadora {

	int num1;
	int num2;
	
	
	public static double soma(int num1, int num2) {
		return num1+num2;
	}
	
	public static double subtracao(int num1, int num2) {
		return num1-num2;
	}
	
	public static double multiplicacao(int num1, int num2) {
		return num1*num2;
	}
	
	public static double divisao(int num1, int num2) {
		return (double) num1/num2;
	}
}
