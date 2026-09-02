package aula07.excecoespersonalizadas.exercicio01;

public class SistemaUniversidade {

	public void verificarAprovacao(String aluno, double mediaFinal, double frequencia) {
		
		try {
			
			if (mediaFinal < 6.0) {
				
				throw new MediaFinalException();
			}
			
			if (frequencia < 75) {
				
				throw new FrequenciaException();
			}
			
			System.out.println(aluno + " aprovado.");
		
		} catch (MediaFinalException | FrequenciaException e) {
			
			System.out.println(aluno + " reprovado: " + e.getMessage());
		
		}
	}
}
