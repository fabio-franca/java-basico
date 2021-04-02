package cursoJava.basico.AulaOnline3;

public class Aula3 {

	public static void main(String[] args) {
		
		/*
		int numero = 10, numero2 = 3;
		boolean expressao = !(numero2< (8 /4 + (2*7) - numero/2));
		
		System.out.println(expressao);
		
		int x = 1, y=5, z=10;
		
		double numeroestranho = 9.8;
		
		double arredonda = Math.round(numeroestranho);
		
		boolean resultado = ((x+y-z)+(z/2)+(x*10) >= numeroestranho);
		
		System.out.println(resultado);
		
		
		
		System.out.println(arredonda);
		
		*/

		//Se atentar a linhas e colunas!
		
		
		
				 /*
				String javax[][] = {{"Eu","te","amo"},{"Não","Esquece","disso!"}};
				
				System.out.println(javax[0][0]);
				System.out.println(javax[0][1]);
				System.out.println(javax[0][2]);
				System.out.println();
				System.out.println(javax[1][0]);
				System.out.println(javax[1][1]);
				System.out.println(javax[1][2]);
				
				int a=14,b=5,c= a%b;
				
				System.out.println(c);
				
				double teste = 5.2;
				
				System.out.println(Math.floor(teste));
				
				System.out.println(Math.ceil(teste));
				
				System.out.println(Math.round(teste));
				
				double resultado = Math.pow(5,2);
				
				System.out.println(resultado);
				
				char vogais[] = {'a', 'e', 'i', 'o', 'u'};
				
				System.out.println(vogais[3]);
				
				int numeros[] = new int[7];
				
				System.out.println(numeros[0]);
				*/
				
		int matriz[][] = new int[2][3];
		
		
		for(int linhas[] : matriz) {   //Quebra a matriz em linhas
			for(int colunas : linhas) {   //Organiza as colunas e linhas
				System.out.print(colunas+ " ");
			}
			
			System.out.println();  //Pula uma linha
		}
		
		String resultado = 19>6?"verdadeiro":"falso";
		
		System.out.println(resultado);
		
		
/*
		String java[] = {"Jose", "Maria", "João"};
		
		java[1] = "Moises";
		
		System.out.println(java[0]);
		System.out.println(java[1]);
		System.out.println(java[2]);
		System.out.println(java.length);
		
		int matriz_1[][] = new int[5][3];
		
		int matrix_2[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
		matriz_1 = matrix_2;
		
		matriz_1[2][2] = 200;
		
		for(int linhas[] : matriz_1) {   //Quebra a matriz em linhas
			for(int colunas : linhas) {   //Organiza as colunas e linhas
				System.out.print(colunas+ " ");
			}
			
			System.out.println();  //Pula uma linha
		}
		
		//System.out.println(matriz_1[2][1]);
	
		*/
		
	}		
		
}
