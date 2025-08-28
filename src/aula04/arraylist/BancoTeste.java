package aula04.arraylist;

public class BancoTeste {

	public static void main(String[] args) {
		
		Banco b1 = new Banco(159357, "NewBank S.A.");
		
		b1.adicionarNovaConta(123, "José da Silva");
		b1.adicionarNovaConta(987, "Maria de Oliveira");
		
		b1.verificarSaldoConta(123);
		b1.realizarDeposito(123, 1000.00);
		b1.realizarSaqueConta(123, 700.00);
		b1.verificarSaldoConta(123);
		
		b1.verificarSaldoConta(987);
		b1.realizarSaqueConta(987, 100.00);
		
		b1.verificarSaldoConta(456);
	}
}
