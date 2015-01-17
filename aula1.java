class Turma{
	int[] notas;
}

class TesteDaTurma {
	public static void main(String[] args){
		Turma fj11 = new Turma();
		fj11.notas = new int[10]; //array é um objeto
		
		fj11.notas[0] = 9;
		fj11.notas[1] = 5;
		
		System.out.println(fj11.notas[0]);
	}
} 
		
		
