package aula08.generics.exemplo02;

public class CaixaTeste {

	public static void main(String[] args) {

		Bola bola = new Bola();
		Carrinho carrinho = new Carrinho();
		Camiseta camiseta = new Camiseta();
		Calca calca = new Calca();
		Prato prato = new Prato();
		Copo copo = new Copo();

		Caixa<Brinquedo> caixa1 = new Caixa<>();
		caixa1.guardar(bola);
		caixa1.guardar(carrinho);

		Caixa<Roupa> caixa2 = new Caixa<>();
		caixa2.guardar(camiseta);
		caixa2.guardar(calca);

		Caixa<Louca> caixa3 = new Caixa<>();
		caixa3.guardar(prato);
		caixa3.guardar(copo);

		caixa1.verificarConteudo();
		caixa2.verificarConteudo();
		caixa3.verificarConteudo();
	}
}
