package aula04.polimorfismo;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {
		
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " da raça " + this.raca + " está relinchando.");
	}
}
