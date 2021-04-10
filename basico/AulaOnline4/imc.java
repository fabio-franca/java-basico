package cursoJava.basico.AulaOnline4;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		
		String nome="";
		
		double altura=0, peso=0;

		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		nome = leitor.nextLine();
		
		System.out.println("Digite a sua altura: ");
		
		altura = leitor.nextDouble();
		
		System.out.println("Digite o seu peso: ");
		
		peso = leitor.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println(nome+", o seu IMC é: "+imc);

	}

}
