package aula07.clausulathrows.exercicio;

public class Reserva {

	private Quarto quarto;
	private Hospede hospede;
	private int dias;
	private double valorTotal;

	public Reserva() {

	}

	public void realizarReserva(Quarto quarto, Hospede hospede, int dias) throws QuartoIndisponivelException, HospedeInvalidoException, TotalDiasInvalidosException {

		if (!quarto.isDisponivel()) {

			throw new QuartoIndisponivelException();
		}

		if (hospede == null) {

			throw new HospedeInvalidoException();
		}

		if (dias <= 0 || dias > 30) {

			throw new TotalDiasInvalidosException();
		}

		quarto.setDisponivel(false);

		this.quarto = quarto;
		this.hospede = hospede;
		this.dias = dias;
		this.valorTotal = this.calcularValor(quarto, dias);

		System.out.println("Quarto " + this.quarto.getNumero() + " reservado com sucesso.");
		System.out.println("Hóspede: " + this.hospede.getNome());
		System.out.println("Total de Dias: " + this.dias);
		System.out.println("Valor Total: R$" + this.valorTotal);
	}

	private double calcularValor(Quarto quarto, int dias) {

		return quarto.getValorDiaria() * dias;
	}
}
