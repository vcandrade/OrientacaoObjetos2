package aula04.polimorfismo.sobreposicao;

public abstract class Mamifero {

	protected String nome;
	protected String raca;
	
	public Mamifero(String nome, String raca) {
	
		this.nome = nome;
		this.raca = raca;
	}
	
	public abstract void emitirSom();
	
	public void alimentar() {
		
		System.out.println(this.nome + " está se alimentando.");
	}
}
