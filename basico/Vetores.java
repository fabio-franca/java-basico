package cursoJava.basico;

import java.util.ArrayList;

/*
 * Classe que especifica a cria��o e manipula��o de Arrays
 * 
 * Vers�o: 1.0
 * 
 * Autor: F�bio Fran�a
 * 
 */
public class Vetores {

	public static void main(String[] args) {
		
		int numeros[] = new int [5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println(numeros[2]);
		
		char consoantes[] = {'b', 'c', 'd', 'e', 'f', 'g'};
		
		System.out.println(consoantes[4]);
		
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(6);
		pares.add(1, 4);
		pares.add(24);
		pares.add(10);
		pares.add(8);
		pares.sort(null);
		pares.remove(4);
		
		System.out.println(pares.get(2));
		
	}

}




