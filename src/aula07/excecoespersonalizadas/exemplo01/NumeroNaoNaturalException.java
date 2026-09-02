package aula07.excecoespersonalizadas.exemplo01;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
		
		super("Numero não natural informado.");
	}
}
