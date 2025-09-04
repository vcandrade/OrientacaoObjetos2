package aula07.clausulathrows.exemplo01;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Número não natural informado.");
	}
}
