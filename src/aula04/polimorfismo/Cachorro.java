package aula04.polimorfismo;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca) {
		
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " da raça " + this.raca + " está latindo.");
	}
}
