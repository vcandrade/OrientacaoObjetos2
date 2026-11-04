package aula03.lambda;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = (a, b) -> {
				
				double resultado = a + b;
				System.out.println("Resultado: " + resultado);
		};
		
		calc.calcular(100, 215);
	}
}
