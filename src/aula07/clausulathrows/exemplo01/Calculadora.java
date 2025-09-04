package aula07.clausulathrows.exemplo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		double resultado = numerador / denominador;
		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}

	public void calcularRaizQuadrada() throws NumeroNaoNaturalException {

		System.out.print("Informe o valor de x: ");
		int x = input.nextInt();

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(x);
		System.out.println("Raiz Quadrada de " + x + " = " + resultado);
	}
}
