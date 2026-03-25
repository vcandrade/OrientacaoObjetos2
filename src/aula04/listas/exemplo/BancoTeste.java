package aula04.listas.exemplo;

public class BancoTeste {

	public static void main(String[] args) {
		
		Banco banco = new Banco(123456789, "UTF Bank");
		
		banco.adicionarNovaConta(111, "João da Silva");
		banco.adicionarNovaConta(222, "Maria de Oliveira");
		banco.adicionarNovaConta(333, "Ricardo Carvalho");
		
		banco.realizarDepositoConta(222, 100.00);
		banco.realizarSaqueConta(222, 80.00);
		
		banco.listarContas();
	}
}
