package aula03.expressaolambda.exemplo01;

public class ExemploLambda {

	public static void main(String[] args) {

		Calculadora calc = (double a, double b) -> {

				double resultado = a + b;
				System.out.println("Resultado: " + resultado);
			
		};

		calc.calcular(10, 100);
	}
}
