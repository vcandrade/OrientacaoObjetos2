package aula02.polimorfismo.sobreposicao.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class ObraArte {

	private String autor;
	private List<Quadrilatero> obra;

	public ObraArte(String autor) {
		
		this.autor = autor;
		this.obra = new ArrayList<>();
	}
	
	public void desenhar(Quadrilatero quadrilatero) {
		
		this.obra.add(quadrilatero);
	}
	
	public void exibirObra() {
		
		System.out.println("Obra de " + this.autor);
		
		for (Quadrilatero quadrilatero : obra) {
			
			quadrilatero.desenhar();
		}
	}
}








