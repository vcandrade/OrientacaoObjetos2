package aula07.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;
		System.out.println(numerador + " / " + denominador + " = " + resultado);

		input.close();
	}

	public void calcularRaizQuadrada(double x) throws NumeroNaoNaturalException, Exception {

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		double result = Math.sqrt(x);

		System.out.println("\u221A" + x + " = " + result);

	}
}
