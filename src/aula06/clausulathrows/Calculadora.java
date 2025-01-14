package aula06.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		double resultado = numerador / denominador;
		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}

	public void calcularRaizQuadrada() throws NumeroNaoNaturalException {		

			Scanner input = new Scanner(System.in);

			System.out.print("Informe o valor de X: ");
			int x = input.nextInt();

			if (x < 0) {
				throw new NumeroNaoNaturalException();
			}

			double resultado = Math.sqrt(x);
			System.out.println("Raiz Quadrada = " + resultado);
	}
}
