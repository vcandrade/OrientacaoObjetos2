package aula06.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void dividir() throws ArithmeticException, InputMismatchException {

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		System.out.println(numerador + " / " + denominador + " = " + (numerador / denominador));
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
	
	public void finalizarInput() {
		
		this.input.close();
	}
}
