package Tarefa_ControleDeFluxo;

public class media {

	public static void main(String args[]) {
		System.out.println("*** Médias do Aluno ***");
		
		// leitura das notas
		double materia1 = 10;
		double materia2 = 5;
		double materia3 = 7.5;
		double materia4 = 8;
		
		System.out.println("Portugues: " + materia1);
		System.out.println("Ingles: " + materia2);	
		System.out.println("Matematica: " + materia3);
		System.out.println("Fisica: " + materia4);
				
		// calcular a media
		System.out.println("***********************");
		
		double mediaFinal = (materia1 + materia2 + materia3 + materia4) / 4;
		System.out.println("Media Final: " + mediaFinal);
		
		// classificação 
		if (mediaFinal >= 7.0) {
			System.out.print("Parabéns! Você foi aprovado!");
		} else if (mediaFinal >= 5.0 && mediaFinal < 7.0) {
			System.out.print("Xiii! Você ficou de recuperação!");
		} else {
			System.out.print("Eh, não deu! Você foi reprovado!");
			
		}
	}
	
}
