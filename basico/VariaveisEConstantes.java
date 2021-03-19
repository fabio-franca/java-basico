package cursoJava.basico;

/*
 * 
 * Classe demonstrativa de vari�veis e constantes
 * 
 * Vers�o 1.0
 * 
 * Autor: Fabio Fran�a
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Cria��o de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Cria��o de vari�veis
		String nome= "Jose";
		
		int idade= 48;
		
		double peso= 73.4, altura= 1.73;
		
		char sexo= 'm', cnh= 'a';
		
		boolean doadorOrgaos= true;
		
		System.out.println("Nome: " + nome);
		
		System.out.println("Idade: " + idade);
		
		System.out.println("Peso: " + peso);
		
		System.out.println("Altura: " + altura);
		
		System.out.println("Sexo: " + sexo);
		
		System.out.println("Cnh: " + cnh);
		
		System.out.println("Doador de org�os? " + doadorOrgaos);
		
		System.out.println("Gravidade na terra �: " + ACELERACAO_GRAVIDADE_TERRA + "m/s2");
	}

}
