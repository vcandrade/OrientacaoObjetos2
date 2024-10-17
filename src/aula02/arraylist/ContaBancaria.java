package aula02.arraylist;

public class ContaBancaria {

	private int numeroConta;
	private double saldo;
	private String nomeTitular;

	public ContaBancaria(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.nomeTitular = nomeTitular;
	}

	public void verificarSaldo() {

		System.out.println("====================================");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("====================================");
	}

	public void realizarSaque(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void realizarDeposito(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
