package aula05.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = input.nextInt();

			double resultado = numerador / denominador;
			System.out.println(numerador + " / " + denominador + " = " + resultado);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException ime) {

			System.out.println("Os valores devem ser inteiros.");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			System.out.println("Executando o bloco finally.");
			input.close();
		}
	}
}
