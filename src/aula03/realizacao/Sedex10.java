package aula03.realizacao;

public class Sedex10 implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 18.00 + (distancia * 0.60);
	}

}
