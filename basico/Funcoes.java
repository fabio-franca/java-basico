package cursoJava.basico;
/*
 * Classe que exemplifica funções.
 * 
 * Versão: 1.0
 * 
 * Autor: Fábio França	
 * 
 */
public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma(10,60);
		
		System.out.println(result);
		
		quadrado(8);
		
		String texto = mensagem();
		
		System.out.println(texto);
		
		olamundo();
		
		
		int nota = 5;
		
		//Operador ternário
		String resultado = nota >= 7? "Aprovado":"Você ficou de recuperação";
		
		
		System.out.println();
		
		frase();
		
		frase();
	}
	

	//Função com retorno do tipo int e recebe dois parâmetros
	static int soma(int a, int b ) {
		return a + b;
		
		
	}
	//Função sem retorno com um parâmetro
	static void quadrado(int numero) {
		System.out.println(numero*numero);
		
		
	}
	//Função sem parâmetro com retorno do tipo String
	public static String mensagem() {
		return ("Mensagem do sistema");
		
		
	
	}
	
	//Função não recebe nenhum parâmetro e imprime mensagem
	static void olamundo() {
		System.out.println("Olá mundo!");
		
	}
	
	public static void frase() {
		System.out.println(" ");
		 olamundo();
		 quadrado(2);
		
	}
	
	
}
