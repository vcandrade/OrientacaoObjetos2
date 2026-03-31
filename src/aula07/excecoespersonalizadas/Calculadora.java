package aula07.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.println("Informe o numerador:");
			int numerador = input.nextInt();

			System.out.println("Informe o denominador:");
			int denominador = input.nextInt();

			int resultado = numerador / denominador;

			System.out.println(numerador + " / " + denominador + " = " + resultado);

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por 0.");

		} catch (InputMismatchException e) {

			System.out.println("Informe apenas números inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		} finally {

			input.close();
			System.out.println("Bloco finally executado.");
		}
	}

	public void calcularRaizQuadrada() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.println("Informe o valor para calcular a raiz quadrada:");
			int valor = input.nextInt();

			if (valor < 0) {

				throw new NumeroNaoNaturalException();
			}

			double resultado = Math.sqrt(valor);

			System.out.println("Raiz de " + valor + " = " + resultado);

		} catch (NumeroNaoNaturalException e) {

			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {

			System.out.println("Valor incorreto.");

		} finally {

			input.close();
			System.out.println("Bloco finally executado.");
		}
	}
}
