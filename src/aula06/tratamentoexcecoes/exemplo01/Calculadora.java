package aula06.tratamentoexcecoes.exemplo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void dividir() {

		try {

			System.out.println("Conexão com o bd");

			System.out.print("Informe o numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = input.nextInt();

			double resultado = numerador / denominador;
			System.out.println(numerador + " / " + denominador + " = " + resultado);

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("Informe apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			System.out.println("Desconexão com o bd");
		}
	}
}
