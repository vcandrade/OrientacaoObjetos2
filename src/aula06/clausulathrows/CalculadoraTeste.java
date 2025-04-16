package aula06.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();
			calc.dividir();
		
		} catch (ArithmeticException e) {
		
			System.out.println("Impossível dividir por 0.");
		
		} catch (InputMismatchException e) {
		
			System.out.println("Apenas valores inteiros são possíveis");
		
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("continuando a execução do sistema...");
	}
}
