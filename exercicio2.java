class Empresa{
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int i=0;	

	void adiciona(Funcionario f){
		this.funcionarios[i] = f;
		i=i+1;
	}

}

class TestaEmpresa{
	public static void main(String[] args){
		

		Funcionario f1 = new Funcionario();
		f1.nome = "Teste";
		f1.departamento ="Financeiro";

		Empresa e1 = new Empresa();
		e1.nome = "Empresa X";
		e1.funcionarios = new Funcionario[10];
		e1.adiciona(f1);
		System.out.println(e1.funcionarios[0].nome);

	}

}

//Classe Funcionário
//Uma Classe é uma receita de bolo
//O objeto instanciado é o bolo feito a partir da classe
class Funcionario{
	//atributos da classe
	String nome;
	String departamento;
	double salario;
	String rg;
	
	//metodo recebeAumento sem retorno "void"
	//recebe como parametro o percetual de aumento	
	void recebeAumento (double percentual){
		this.salario += this.salario*percentual;

	}
	//metodo calculaGanhoAnual com retorno double
	double calculaGanhoAnual(){
		double ganhoAnual = this.salario*12;
		return ganhoAnual;		
	}
	//metodo para mostrar todos os atributos
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("RG: "+this.rg);
	}
}
