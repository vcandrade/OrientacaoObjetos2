package aula07.clausulathrows.exercicio;

public class HospedeInvalidoException extends Exception {

	public HospedeInvalidoException() {
	
		super("Dados inválidos do hóspede");
	}
}
