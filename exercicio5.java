class Empresa{
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre=0;	

	void adiciona(Funcionario f){
		this.funcionarios[livre] = f;
		livre=livre+1;
	}
	void mostraFuncionarios(){
		for(int i=0;i<livre;i++){
			System.out.println("Funcionário na posição: " + i);
			System.out.println(this.funcionarios[i].nome);
			System.out.println(this.funcionarios[i].departamento);
			System.out.println(this.funcionarios[i].salario);			
					
		}	
	
	}
	void mostraTodasAsInformações(){
		for(int i=0;i<livre;i++){			
			System.out.println("Funcionário na posição: " + i);
			System.out.println("Nome: "+this.funcionarios[i].nome);
			System.out.println("Departamento: "+this.funcionarios[i].departamento);
			System.out.println("Salario: R$"+this.funcionarios[i].salario);
			System.out.println("RG: "+this.funcionarios[i].rg);
		}	
	}
}

class TestaEmpresa{
	public static void main(String[] args){

		Empresa e = new Empresa();
		e.nome = "Empresa X";
		e.funcionarios = new Funcionario[10];
		

		for(int i=0 ; i<5 ; i++){
			Funcionario f = new Funcionario();
			f.nome = "Nome"+i;
			f.departamento ="Financeiro"+i;
			f.salario = 1000 + i * 100;
			f.rg=i+"234";
			e.adiciona(f);
			System.out.println("Adiconando Funcionario"+e.funcionarios[i].nome);
		}
		e.mostraTodasAsInformações();
		

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
