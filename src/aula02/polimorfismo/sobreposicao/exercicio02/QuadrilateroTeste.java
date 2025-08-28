package aula02.polimorfismo.sobreposicao.exercicio02;

public class QuadrilateroTeste {

	public static void main(String[] args) {
		
		ObraArte obra = new ObraArte("João da Silva");
		
		obra.desenhar(new Quadrado("Vermelho", 4));
		obra.desenhar(new Quadrado("Verde", 6));
		obra.desenhar(new Retangulo("Azul", 4, 8));
		obra.desenhar(new Losango("Marrom", 5, 10));
		
		obra.exibirObra();
	}
}
