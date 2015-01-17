class Turma{
	Aluno[] alunos;
	
	void imprimeNotas(){
		for(int i=0; i<this.alunos.length;i++){
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue; //continue o laço ignorando esse aluno
			System.out.println(aluno.nota);
		}	
	}
}

class Aluno{
	String nome;
	int nota;
}

class TesteDaTurma {
	public static void main(String[] args){
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10]; //array é um objeto
		
		//tem que criar os alunos, pois o valor padrão de
		//uma int é zero. Porém de um objeto é nulo.
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Mauricio"; 		
		fj11.alunos[0].nota = 9;
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 5;
		
		fj11.imprimeNotas();
	}
} 
		
		
