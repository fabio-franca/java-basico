package cursoJava.basico.AulaOnline4;

import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		int num1=0, num2=0, num3=0;

		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		
		num2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		
		num3 = leitor.nextInt();
		
		boolean igual = num1 == num2 && num2==num3;
		
		boolean um = num1> num2 && num1>num3;
		
		boolean dois = num2 > num3;
		
		if(igual) 
			System.out.println("Todos os n�meros s�o iguais");
		else if(um) {
			System.out.println("O maior n�mero �: "+num1);
		} else if(dois) {
			System.out.println("O maior n�mero �: "+num2);
		} else {
			System.out.println("O maior n�mero �: "+num3);
		}
	}

}
