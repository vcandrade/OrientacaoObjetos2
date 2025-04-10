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

			System.out.println(numerador + " / " + denominador + " = " + (numerador / denominador));

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por 0.");

		} catch (InputMismatchException e) {

			System.out.println("Apenas valores inteiros são possíveis");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			input.close();
			System.out.println("finalizando o input");
		}
	}
}
