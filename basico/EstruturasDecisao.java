package cursoJava.basico;

public class EstruturasDecisao {

	public static void main(String[] args) {
		//Operador tern�rio exemplo
		//String texto = 10==7? "Dez � igual a sete" : "Dez � diferente de sete";

		//if
		/*
		int idade = 19;
		
		if(idade >= 18) {
			System.out.println("J� pode tirar a CNH");
		}*/
		
		//if-else
		/*
		int idade = 17;
		
		if(idade >= 18) {
			System.out.println("J� pode tirar a CNH");
		} else {
			System.out.println("N�o tem idade para dirigir");
		}*/
		
		//if-else if-else
		/*
		String semaforo = "";
		
		if (semaforo == "verde") {
			System.out.println("Siga em frente");
		} else if (semaforo == "amarelo") {
			System.out.println("tenha aten��o");
		} else if (semaforo == "vermelho") {
			System.out.println("PARE!");
		} else {
			System.out.println("Sinal quebrado. Chame a autarquia de tr�nsito.");
		}*/
			
		//SWITCH
		
		char opcao = 'b';
		
		switch(opcao) {
		
		case 'a': System.out.println("Cadastrar produto"); break;
		
		case 'b': System.out.println("Visualizar detalhes"); break;
		
		case 'c': System.out.println("Editar produto"); break;
		
		case 'd': System.out.println("Apagar produto"); break;
		
		default: System.out.println("Op��o inv�lida");;
		}
		
	}

}
