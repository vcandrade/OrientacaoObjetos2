package aula07.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o numerador:");
		int numerador = input.nextInt();

		System.out.println("Informe o denominador:");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;

		System.out.println(numerador + " / " + denominador + " = " + resultado);

		input.close();
	}

	public void calcularRaizQuadrada() throws NumeroNaoNaturalException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor para calcular a raiz quadrada:");
		int valor = input.nextInt();

		if (valor < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(valor);

		System.out.println("Raiz de " + valor + " = " + resultado);

		input.close();
	}
}
