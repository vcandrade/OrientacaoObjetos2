package aula02.polimorfismo.sobreposicao.exercicio02;

public class Losango extends Quadrilatero {

	private double diagonalMaior;
	private double diagonalMenor;

	public Losango(String cor, double diagonalMaior, double diagonalMenor) {

		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double calcularArea() {

		return this.diagonalMaior * this.diagonalMenor / 2;
	}

	@Override
	public void desenhar() {

		char losango = '\u25C6';
		System.out.println(losango + " de área " + this.calcularArea() + "cm2.");
	}
}
