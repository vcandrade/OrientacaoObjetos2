package aula08.generics.exemplo02;

public class Roupa {

	protected String nome;

	public Roupa(String nome) {

		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
