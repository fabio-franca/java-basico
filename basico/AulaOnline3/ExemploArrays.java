package cursoJava.basico.AulaOnline3;

import java.util.ArrayList;

public class ExemploArrays {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<>();
		
		frutas.add("Caju");
		frutas.add("Maracuja");
		frutas.add("Acerola");
		frutas.add("Melancia");
		frutas.add(2, "Tomate");
		frutas.sort(null);
		frutas.add(0, "Abacate");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		

	}

}
