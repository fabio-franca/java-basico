package cursoJava.orientacaoObjeto;

//Classe que pega as informações da classe Funcionario
public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Aqui definimos que f1 receberá o construtor da classe funcionário(Instanciado)
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "João", "auxiliar administrativo", 2000.0, "administrativo");
		
		@SuppressWarnings("unused")
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		
		/*Aqui é definido(setado) a atribuição ao objeto(no caso de não ter um construtor)
		f1.setCadastro((long) 1112);
		f1.setNome("João");
		f1.setOcupacao("auxiliar administrativo");
		f1.setSalario(2000.0); */

		//Saída de informações no console
		//Nesse caso o "get" pega a informação que foi atribuida anteriormente
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
