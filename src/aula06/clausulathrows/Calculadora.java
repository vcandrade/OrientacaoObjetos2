package aula06.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		try {
			
			System.out.print("Informe o numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = input.nextInt();

			System.out.println(numerador + " / " + denominador + " = " + (numerador / denominador));

		} finally {

			System.out.println("Finalizando o input");
			input.close();
		}
	}
}
