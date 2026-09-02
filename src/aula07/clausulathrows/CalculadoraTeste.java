package aula07.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();

		try {
			
			calc.dividir();
			calc.calcularRaizQuadrada(-9);
		
		} catch (ArithmeticException e) {

			System.out.println("ERRO: Impossível dividir por 0.");

		} catch (InputMismatchException e) {

			System.out.println("ERRO: Apenas valores inteiros são admitidos.");

		} catch (NumeroNaoNaturalException e) {

			System.out.println("ERRO: " + e.getMessage());

		} catch (Exception e) {

			System.out.println("ERRO: " + e.getMessage());

		}

		System.out.println("Finalizando o programa...");
	}
}
