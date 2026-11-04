package aula01.revisao.enumeracoes;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(111, "10/03/2026");
		pedido1.exibirRelatorio();
		
		pedido1.atualizarStatus(Status.PROCESSANDO);
		pedido1.exibirRelatorio();
		
		pedido1.atualizarStatus(Status.ENVIADO);
		pedido1.exibirRelatorio();
		
		pedido1.atualizarStatus(Status.ENTREGUE);
		pedido1.exibirRelatorio();
	}
}
