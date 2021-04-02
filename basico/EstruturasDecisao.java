package cursoJava.basico;

public class EstruturasDecisao {

	public static void main(String[] args) {
		//Operador ternário exemplo
		//String texto = 10==7? "Dez é igual a sete" : "Dez é diferente de sete";

		//if
		/*
		int idade = 19;
		
		if(idade >= 18) {
			System.out.println("Já pode tirar a CNH");
		}*/
		
		//if-else
		/*
		int idade = 17;
		
		if(idade >= 18) {
			System.out.println("Já pode tirar a CNH");
		} else {
			System.out.println("Não tem idade para dirigir");
		}*/
		
		//if-else if-else
		/*
		String semaforo = "";
		
		if (semaforo == "verde") {
			System.out.println("Siga em frente");
		} else if (semaforo == "amarelo") {
			System.out.println("tenha atenção");
		} else if (semaforo == "vermelho") {
			System.out.println("PARE!");
		} else {
			System.out.println("Sinal quebrado. Chame a autarquia de trânsito.");
		}*/
			
		//SWITCH
		
		char opcao = 'b';
		
		switch(opcao) {
		
		case 'a': System.out.println("Cadastrar produto"); break;
		
		case 'b': System.out.println("Visualizar detalhes"); break;
		
		case 'c': System.out.println("Editar produto"); break;
		
		case 'd': System.out.println("Apagar produto"); break;
		
		default: System.out.println("Opção inválida");;
		}
		
	}

}
