package aula07.clausulathrows;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
		
		super("Numero não natural informado.");
	}
}
