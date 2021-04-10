package cursoJava.orientacaoObjeto;

//Classe que pega as informa��es da classe Funcionario
public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Aqui definimos que f1 receber� o construtor da classe funcion�rio(Instanciado)
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "Jo�o", "auxiliar administrativo", 2000.0, "administrativo");
		
		@SuppressWarnings("unused")
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		
		/*Aqui � definido(setado) a atribui��o ao objeto(no caso de n�o ter um construtor)
		f1.setCadastro((long) 1112);
		f1.setNome("Jo�o");
		f1.setOcupacao("auxiliar administrativo");
		f1.setSalario(2000.0); */

		//Sa�da de informa��es no console
		//Nesse caso o "get" pega a informa��o que foi atribuida anteriormente
		System.out.println(f1.getCadastro());
		System.out.println(f1.getNome());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getSetor());
		
		//f1.verFuncionarios();
		//ou se inserirmos static no atributo verFuncionarios
		FuncionarioOperacional.verFuncionarios();
	}

}
