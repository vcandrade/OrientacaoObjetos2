package aula06.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
			
			Calculadora calc = new Calculadora();
			calc.calcularRaizQuadrada();
		
		} catch (NumeroNaoNaturalException e) {

			System.out.println(e.getMessage());
		}
	}
}
