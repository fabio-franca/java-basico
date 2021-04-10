package cursoJava.AulaOnline5.Questao3;

public class TesteCaderno extends CadernoDeEnderecos{

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Yuri","yuri@email.com");
		
		Contato c2 = new Contato("Ingrid","ingrid@email.com");
		
		Contato c3 = new Contato("Atila","atila@email.com");
		
		Contato c4 = new Contato("Vitoria","vitoria@email.com");

		CadernoDeEnderecos.addContato(c1);
		CadernoDeEnderecos.addContato(c2);
		CadernoDeEnderecos.addContato(c3);
		
		CadernoDeEnderecos.ListarContato();
		
		CadernoDeEnderecos.editarContato(2, c4);
		
		CadernoDeEnderecos.removeContato(1);
		

		
	}

}
