package aula02.polimorfismo.sobreposicao.exercicio02;

public class Retangulo extends Quadrilatero {

	private double base;
	private double altura;

	public Retangulo(String cor, double base, double altura) {

		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {

		return this.base * this.altura;
	}

	public void desenhar() {

		char retangulo = '\u25AC';
		System.out.println(retangulo + " de área " + this.calcularArea() + "cm2.");
	}
}
