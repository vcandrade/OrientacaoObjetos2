package aula03.realizacao;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {
		
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra(500.00, 100, new Correios());
		carrinhoCompra.realizarCompra();
	}
}
