package aula08.generics.exemplo02;

public class Brinquedo {

	protected String nome;

	public Brinquedo(String nome) {

		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
