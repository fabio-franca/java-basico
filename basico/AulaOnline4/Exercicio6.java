package cursoJava.basico.AulaOnline4;

public class Exercicio6 {

	public static void main(String[] args) {

			System.out.println("Imprime n�meros primos entre 2 � 200 ");

			for(int i=2; i < 200; i++){

			boolean Primo = true;

			for(int divisor=2; divisor< i ; divisor++){

			if(i % divisor == 0){
				Primo = false;
			break;
			}
			}
			// print the number
			if(Primo)
			System.out.print(i + " ");
			}
			}
			}
		/*
		int numeroprimo=1;
		int numeroDivisores = 0;
		
		
		for(int x=1; x <= numeroprimo; x++) {
				if(numeroprimo % x == 0) {
					numeroDivisores++;
				}
		}
		
		if(numeroDivisores == 2) {
			System.out.println("O n�mero digitado � primo.");
		} else {
			System.out.println("O n�mero digitado n�o � primo");
		} */
		
		/*
		System.out.println("Digite um numero: ");
	    @SuppressWarnings("resource")
		int num = new Scanner(System.in).nextInt();
	    
	    boolean primo = false;
	    
	    for(int i = 2; i < num;i++){
	        if(num%i==0){ // <<< De um foco nisto aqui
	            primo = true;
	        }
	    }
	    System.out.println((primo)? "� primo":"N�o � primo");
	    */



