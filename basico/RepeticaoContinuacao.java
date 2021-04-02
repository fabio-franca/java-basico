package cursoJava.basico;

public class RepeticaoContinuacao {

	public static void main(String[] args) {

		String frutas[] = {"maca","abacaxi","abacate","laranja","uva"};
		
		//Estrutura de repetição for.
		for(int x=0; x<5; x++) {
			System.out.println(frutas[x]);
		} 
		
		//Estrutura for melhorada
		for(String fruta: frutas) {
			System.out.println(fruta);
		} 
		
	}

}
