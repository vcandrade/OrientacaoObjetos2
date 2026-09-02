package aula06.tratamentoexcecoes;

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
			
			int resultado = numerador / denominador;		
			System.out.println(numerador + " / " + denominador + " = " + resultado);
		
		}  catch (ArithmeticException e) {
			
			System.out.println("ERRO: Impossível dividir por 0.");
		
		} catch (InputMismatchException e) {
			
			System.out.println("ERRO: Apenas valores inteiros são admitidos.");
		
		} catch (Exception e) {
			
			System.out.println("ERRO: " + e.getMessage());
		
		} finally {
			
			input.close();
			System.out.println("Executando o bloco finally.");
		}
	}
}




