package aula07.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		try {
			
			calc.dividir();
			calc.calcularRaizQuadrada();
		
		} catch (ArithmeticException e) {
			
			System.out.println("Impossível dividir por 0.");
			
		} catch (InputMismatchException e) {
			
			System.out.println("Valor incorreto digitado.");
			
		} catch (NumeroNaoNaturalException e) {
			
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Finalizando a aplicação...");
	}
}
