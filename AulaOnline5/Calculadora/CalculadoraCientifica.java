package cursoJava.AulaOnline5.Calculadora;

public class CalculadoraCientifica extends Calculadora {

	int op;
	
	public double raiz(int num1) {
		return Math.sqrt(num1);
	}
	
	public double pot(int num1,int num2) {
		return Math.pow(num1, num2);
	}

	
	
	public double calculo(int op) {
		double resultado = 0;
		
		switch(op) {
		
		case 1: resultado = soma(num1, num2); break;
		case 2: resultado = subtracao(num1, num2); break; 
		case 3: resultado = multiplicacao(num1, num2); break;
		case 4: resultado = divisao(num1, num2); break;
		case 5: resultado = raiz(num1); break;
		case 6: resultado = pot(num1, num2); break;
		
		}
		
		return resultado;
	}
}
