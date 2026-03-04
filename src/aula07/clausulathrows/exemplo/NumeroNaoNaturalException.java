package aula07.clausulathrows.exemplo;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Número não natural informado.");
	}
}
