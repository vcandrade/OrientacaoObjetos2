package aula07.clausulathrows.exercicio;

public class Quarto {

	private int numero;
	private TipoQuarto tipoQuarto;
	private double valorDiaria;
	private boolean disponivel;

	public Quarto(int numero, TipoQuarto tipoQuarto, double valorDiaria) {
		
		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
		this.valorDiaria = valorDiaria;
		this.disponivel = true;
	}

	public int getNumero() {
		return numero;
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
