package aula03.heranca;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Endereco end2 = new Endereco("Monteiro Lobato", 2048, "Jd. Carvalho", "Ponta Grossa", "PR");
		
		Professor professor = new Professor("João da Silva", 35, end1, 5000.00, 3000.00);
		
		Aluno aluno = new Aluno("Maria de Oliveira", 18, end2);
		aluno.realizarMatricula("Tecnologia em Análise e Desenvolvimento de Sistemas");
		
		professor.imprimirDados();
		aluno.imprimirDados();
	}
}
