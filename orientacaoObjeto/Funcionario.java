package cursoJava.orientacaoObjeto;

//Definição do modelo da classe
public abstract class Funcionario {
	
	//Atributos da classe funcionario
	private Long cadastro;
	private String nome;
	private String ocupacao;
	private double salario;
	private static int numFuncionarios;
	
	
	//Construtor que implementa número de funcionarios
	@SuppressWarnings("static-access")
	public Funcionario() {
		this.numFuncionarios++;
	}
	
	//Construtor não vazio
	@SuppressWarnings("static-access")
	public Funcionario(long cadastro, String nome, String ocupacao, double salario) {
		this.cadastro = cadastro;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.salario = salario;
		
		this.numFuncionarios++;
	}
	
	
	//Métodos getters e setters
	public long getCadastro() {
		return this.cadastro;
	}
	
	public void setCadastro(Long cadastro) {
		this.cadastro = cadastro;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getOcupacao() {
		return this.ocupacao;
	}
	
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static void verFuncionarios() {
		System.out.println(numFuncionarios);
	}
	
}
