package aula07.clausulathrows.exercicio;

public class QuartoIndisponivelException extends Exception {

	public QuartoIndisponivelException() {

		super("Quarto encontra-se indisponível para reserva.");
	}
}
