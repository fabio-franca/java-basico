package cursoJava.basico.AulaOnline4;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		
		num2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		
		num3 = leitor.nextInt();
		
		float resultado = (float)(num1+num2+num3)/3;
		
		System.out.println("A média é: "+resultado);

	}

}
