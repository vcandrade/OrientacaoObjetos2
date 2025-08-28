package aula04.arraylist;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numeroConta, String nomeTitular) {
	
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}
	
	public void verificarSaldo() {
		
		System.out.println("Número Conta: " + this.numeroConta + "\tTitular: " + this.nomeTitular + "\n"
				         + "Saldo: " + this.saldo + "\n");
	}
	
	public void realizarSaque(double valor) {
		
		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			
			System.out.println("Número Conta: " + this.numeroConta +"\n"
			                 + "Saque de R$" + valor + " realizado com sucesso.\n");
			
		} else {
			
			System.out.println("Número Conta: " + this.numeroConta +"\n"
					         + "Saldo insuficiente.\n");
		}
	}
	
	public void realizarDeposito(double valor) {
		
		this.saldo += valor;
		
		System.out.println("Número Conta: " + this.numeroConta +"\n"
                         + "Depósito de R$" + valor + " realizado com sucesso.\n");
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
}
