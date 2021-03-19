package cursoJava.basico;

/*
 * 
 * Classe demonstrativa de variáveis e constantes
 * 
 * Versão 1.0
 * 
 * Autor: Fabio França
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variáveis
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
		
		System.out.println("Doador de orgãos? " + doadorOrgaos);
		
		System.out.println("Gravidade na terra é: " + ACELERACAO_GRAVIDADE_TERRA + "m/s2");
	}

}
