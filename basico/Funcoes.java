package cursoJava.basico;
/*
 * Classe que exemplifica fun��es.
 * 
 * Vers�o: 1.0
 * 
 * Autor: F�bio Fran�a	
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
		
		//Operador tern�rio
		String resultado = nota >= 7? "Aprovado":"Voc� ficou de recupera��o";
		
		
		System.out.println();
		
		frase();
		
		frase();
	}
	

	//Fun��o com retorno do tipo int e recebe dois par�metros
	static int soma(int a, int b ) {
		return a + b;
		
		
	}
	//Fun��o sem retorno com um par�metro
	static void quadrado(int numero) {
		System.out.println(numero*numero);
		
		
	}
	//Fun��o sem par�metro com retorno do tipo String
	public static String mensagem() {
		return ("Mensagem do sistema");
		
		
	
	}
	
	//Fun��o n�o recebe nenhum par�metro e imprime mensagem
	static void olamundo() {
		System.out.println("Ol� mundo!");
		
	}
	
	public static void frase() {
		System.out.println(" ");
		 olamundo();
		 quadrado(2);
		
	}
	
	
}
