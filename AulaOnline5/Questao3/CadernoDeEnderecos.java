package cursoJava.AulaOnline5.Questao3;

import java.util.ArrayList;
import java.util.List;

public abstract class CadernoDeEnderecos {
	
	int index;
	
	public static List<Contato> contatos = new ArrayList<>(); 
	
	
	public static void addContato(Contato contato) {
		contatos.add(contato);
	}
	
	public static void editarContato(int index, Contato contato) {
		contatos.set(index, contato);
	}
	
	public static void listarContato() {
		for(Contato con: contatos) {
			System.out.println(con.toString());
		}
	}
	
	
	public static void removeContato(int index) {
		contatos.remove(index);
	}
		
}
