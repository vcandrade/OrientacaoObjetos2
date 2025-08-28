package aula02.polimorfismo.sobreposicao.exercicio01;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println(this.nome + " está latindo.");
	}
}
