package aula06.excecoespersonalizadas;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Número não natural informado.");
	}
}
