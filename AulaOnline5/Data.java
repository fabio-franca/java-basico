package cursoJava.AulaOnline5;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		if(dia> 0  && dia<32) this.dia = dia;
		if(mes> 0  && dia<13) this.mes = mes;
		this.mes = mes;
		this.ano = ano;
		
	}

	public void displayData() {
		System.out.print("\n"+dia+"/");
		System.out.print(mes+"/");
		System.out.print(ano);
		
	}
	
}
