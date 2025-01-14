package aula06.clausulathrows;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Número não natural informado.");
	}
}
