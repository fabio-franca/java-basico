package cursoJava.basico.AulaOnline4;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Exemplo 1
		int divisor=1,somador=0;
		
		ArrayList<Integer> multiplos = new ArrayList<>();
		
		while(divisor<1000) {
			
			if(divisor%3==0 || divisor%5==0) {
				
				multiplos.add(divisor);
				
				somador+=divisor;
				
			}
				divisor++;
			
		}
			for(int numero: multiplos) {
				System.out.println(numero);
			
		}
			System.out.println(somador); */

		int multiplo=1,somador=0;
		
		
		while(multiplo<1000) {
			
			if(multiplo%3==0 || multiplo%5==0) {
				
				somador+=multiplo;
				
			}
			multiplo++;
			
		}
			
			System.out.println(somador);
		
	}

}
