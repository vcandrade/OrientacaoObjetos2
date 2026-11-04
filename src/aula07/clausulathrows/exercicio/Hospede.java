package aula07.clausulathrows.exercicio;

public class Hospede {

	private int cpf;
	private String nome;
	
	public Hospede(int cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
}
