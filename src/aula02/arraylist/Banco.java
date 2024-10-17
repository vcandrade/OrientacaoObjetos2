package aula02.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contasBancarias;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		this.contasBancarias.add(contaBancaria);

		System.out.println("Conta Bancária " + numeroConta + " criada com sucesso!");
	}

	public void verificarSaldoConta(int numeroConta) {

		boolean encontrada = false;

		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.verificarSaldo();
				encontrada = true;
				break;
			}
		}

		if (!encontrada) {

			System.out.println("Conta não encontrada.");
		}
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.realizarSaque(valor);
				return;
			}
		}

		System.out.println("Conta não encontrada.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.realizarDeposito(valor);
				return;
			}
		}

		System.out.println("Conta não encontrada.");
	}
}
