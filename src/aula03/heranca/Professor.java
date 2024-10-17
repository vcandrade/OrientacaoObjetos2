package aula03.heranca;

public class Professor extends Pessoa {

	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, Endereco endereco, double salarioBase, double salarioTitulacao) {
		
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario() {
		
		return this.salarioBase + this.salarioTitulacao;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Salário Base: R$" + this.salarioBase);
		System.out.println("Salário Titulacao: R$" + this.salarioTitulacao);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}
}
