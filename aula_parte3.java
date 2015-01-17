class Turma{
	int[] notas;
	
	void imprimeNotas(){
		for(int i=0; i<this.notas.length;i++){
			System.out.println(this.notas[i]);
		}	
	}
}

class TesteDaTurma {
	public static void main(String[] args){
		Turma fj11 = new Turma();
		fj11.notas = new int[10]; //array é um objeto
		
		fj11.notas[0] = 9;
		fj11.notas[1] = 5;
		
		fj11.imprimeNotas();
	}
} 
		
		
