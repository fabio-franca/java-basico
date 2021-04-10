package cursoJava.AulaOnline5.Questao3;

public class TesteCaderno extends CadernoDeEnderecos{

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Yuri","yuri@email.com");
		
		Contato c2 = new Contato("Ingrid","ingrid@email.com");
		
		Contato c3 = new Contato("Atila","atila@email.com");
		
		Contato c4 = new Contato("Vitoria","vitoria@email.com");

		Contato c5 = new Contato("Fabio","fabio@email.com");
		
		Contato c6 = new Contato("Dorothy","Doroteia@email.com");
		
		CadernoDeEnderecos.addContato(c1);
		CadernoDeEnderecos.addContato(c2);
		CadernoDeEnderecos.addContato(c3);
		CadernoDeEnderecos.addContato(c4);
		CadernoDeEnderecos.addContato(c5);
		CadernoDeEnderecos.addContato(c6);
		
		//Exibe a lista de contatos
		CadernoDeEnderecos.listarContato();
		System.out.println("");
		
		//Edita um contato da lista de contato
		CadernoDeEnderecos.editarContato(1, c3);
		
		CadernoDeEnderecos.listarContato();
		System.out.println("");
		
		//Remove um contato
		CadernoDeEnderecos.removeContato(0);
		System.out.println("");
	
		CadernoDeEnderecos.listarContato();

		
	}

}
