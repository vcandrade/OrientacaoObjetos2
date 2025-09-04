package aula07.excecoespersonalizadas.exemplo01;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		try {
			
			calc.dividir();
			
		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("Informe apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
