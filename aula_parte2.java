class Turma{
	int[] notas;
}

class TesteDaTurma {
	public static void main(String[] args){
		Turma fj11 = new Turma();
		fj11.notas = new int[10]; //array é um objeto
		
		fj11.notas[0] = 9;
		fj11.notas[1] = 5;
		
		//for(int i = 0; i < 10; i++){
		for(int i = 0; i < fj11.notas.length; i++){
			System.out.println(fj11.notas[i]);
		}
	}
} 
		
		
