package cursoJava.AulaOnline5.Calculadora;


public class TesteCalculadora {

	public static void main(String[] args) {


		CalculadoraCientifica c1 = new CalculadoraCientifica();

		c1.num1 = 10;
		c1.num2 = 30;
		
		System.out.println(c1.calculo(3));
	}

}
