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

		Empresa e = new Empresa();
		e.nome = "Empresa X";
		e.funcionarios = new Funcionario[10];
		

		for(int i=0 ; i<5 ; i++){
			Funcionario f = new Funcionario();
			f.nome = "Teste";
			f.departamento ="Financeiro";
			f.salario = 1000 + i * 100;
			e.adiciona(f);
			System.out.println(e.funcionarios[i].salario);
		}		
				
		

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
