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
	boolean contem(Funcionario f){
		for(int i=0;i<livre;i++){
			if(f==this.funcionarios[i]){
				return true;			
			}
		
		}		
		return false;
	}
}

class TestaEmpresa{
	public static void main(String[] args){

		Empresa e = new Empresa();
		e.nome = "Empresa X";
		e.funcionarios = new Funcionario[10];
		
		
		Funcionario f1 = new Funcionario();
		f1.nome = "NomeF1";
		f1.departamento ="FinanceiroF1";
		f1.salario = 1001;
		f1.rg="234";
		e.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "NomeF2";
		f2.departamento ="FinanceiroF2";
		f2.salario = 1002;
		f2.rg="234";
		e.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		f3.nome = "NomeF3";
		f3.departamento ="FinanceiroF3";
		f3.salario = 1003;
		f3.rg="2345";

		e.mostraTodasAsInformações();
		
		if(e.contem(f2)){
			System.out.println("Contem o funcionário");
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
