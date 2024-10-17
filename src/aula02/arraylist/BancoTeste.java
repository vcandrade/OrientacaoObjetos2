package aula02.arraylist;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco = new Banco(123456, "New Bank");

		banco.adicionarNovaConta(111, "João da Silva");
		banco.adicionarNovaConta(222, "Maria de Oliveira");
		banco.adicionarNovaConta(333, "Ricardo Antunes");

		banco.realizarDepositoConta(222, 100.00);
		banco.realizarSaqueConta(222, 60.00);
		banco.verificarSaldoConta(222);
	}
}
