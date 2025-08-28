package aula02.polimorfismo.sobreposicao.exercicio02;

public abstract class Quadrilatero {

	protected String cor;

	public Quadrilatero(String cor) {
		
		this.cor = cor;
	}
	
	public abstract double calcularArea();
	
	public abstract void desenhar();
}
