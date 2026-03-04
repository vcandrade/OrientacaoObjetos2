package aula07.clausulathrows.exercicio;

public class ReservaTeste {

	public static void main(String[] args) {

		try {
		
			Hospede hospede1 = new Hospede(111111, "João da Silva");
			Hospede hospede2 = new Hospede(222222, "Maria de Oliveira");

			Quarto quarto214 = new Quarto(214, TipoQuarto.CASAL, 150.00);

			Reserva reserva = new Reserva();

			reserva.realizarReserva(quarto214, hospede1, 10);
			reserva.realizarReserva(quarto214, hospede2, 10);

		} catch (QuartoIndisponivelException | HospedeInvalidoException | TotalDiasInvalidosException e) {

			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
