package aula08.generics.exemplo01;

public class CaixaTeste {

	public static void main(String[] args) {

		Bola bola = new Bola();
		Carrinho carrinho = new Carrinho();
		Camiseta camiseta = new Camiseta();

		Caixa<Bola> caixa1 = new Caixa<>();
		caixa1.guardar(bola);

		Caixa<Carrinho> caixa2 = new Caixa<>();
		caixa2.guardar(carrinho);

		Caixa<Camiseta> caixa3 = new Caixa<>();
		caixa3.guardar(camiseta);

		System.out.println("Caixa 1: " + caixa1.verificar());
		System.out.println("Caixa 2: " + caixa2.verificar());
		System.out.println("Caixa 3: " + caixa3.verificar());
	}
}
