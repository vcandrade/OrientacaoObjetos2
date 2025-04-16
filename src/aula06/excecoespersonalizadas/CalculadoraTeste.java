package aula06.excecoespersonalizadas;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		try {
			
			calc.dividir();
			calc.calcularRaizQuadrada();
		
		} catch (NumeroNaoNaturalException | ArithmeticException | InputMismatchException e) {
			
			System.out.println(e.getMessage());
		
		} finally {
			
			calc.finalizarInput();
		}

		System.out.println("continuando a execução do sistema...");
	}
}
