package aula03.heranca;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, int idade, Endereco endereco) {
		
		super(nome, idade, endereco);
	}
	
	public void realizarMatricula(String curso) {
		
		this.curso = curso;
		System.out.println(this.nome + " realizou matricula no curso " + this.curso);
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Curso: " + this.curso);
	}
}
