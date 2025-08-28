package aula02.polimorfismo.sobreposicao.exercicio02;

public class Quadrado extends Quadrilatero {

	private double lado;

	public Quadrado(String cor, double lado) {
	
		super(cor);
		this.lado = lado;
	}

	public double calcularArea() {
		
		return Math.pow(lado, 2);
	}
	
	public void desenhar() {
		
		char quadrado = '\u25A0';
		System.out.println(quadrado + " de área " + this.calcularArea() + "cm2.");
	}
}








