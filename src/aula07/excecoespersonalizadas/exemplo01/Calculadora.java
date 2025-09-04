package aula07.excecoespersonalizadas.exemplo01;

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
}
