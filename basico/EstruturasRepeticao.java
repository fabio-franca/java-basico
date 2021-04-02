package cursoJava.basico;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		//Estrutura repeticao com Flag.
		/*
		boolean flag = true;
		
		Scanner leitor = new Scanner(System.in);
		
		while(flag) {
			
			System.out.println("true");
			
			flag = leitor.nextBoolean();
		}  */
		
		//Estrutura controlada com contador(implemento antes e depois duplica)
		/*
		int contador = 0;
		
		while(contador<10) {
			System.out.println(contador);
			++contador; 
			contador++;
			
		}*/
		
		//Estrutura do(faça)-while(enquanto). Primeiro executa e dps testa. 
		boolean flag = false;
		
		do {
			System.out.println("Testando o do-while");
		} while (flag);

	}

}
