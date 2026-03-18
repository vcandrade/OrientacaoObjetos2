package aula04.listas.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;

	private List<ContaBancaria> contas;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;

		this.contas = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		if (this.buscarConta(numeroConta) != null) {

			System.out.println("A conta " + numeroConta + " já existe.");
			return;
		}

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		this.contas.add(contaBancaria);

		System.out.println("Conta " + numeroConta + " criada com sucesso.");
	}
	
	private ContaBancaria buscarConta(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (numeroConta == contaBancaria.getNumeroConta()) {

				return contaBancaria;
			}
		}
		return null;
	}

	public void excluirConta(int numeroConta) {

		ContaBancaria contaBancaria = this.buscarConta(numeroConta);

		if (contaBancaria == null) {

			System.out.println("Conta " + numeroConta + " não encontrada.");
			return;
		}

		contas.remove(contaBancaria);
		System.out.println("Conta " + numeroConta + " removida com sucesso.");
	}

	public void verificarSaldoConta(int numeroConta) {

		ContaBancaria contaBancaria = this.buscarConta(numeroConta);

		if (contaBancaria == null) {

			System.out.println("Conta " + numeroConta + " não encontrada.");
			return;
		}

		System.out.println(this.nomeBanco + " - CNPJ: " + this.cnpj);
		contaBancaria.verificarSaldo();
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		ContaBancaria contaBancaria = this.buscarConta(numeroConta);

		if (contaBancaria == null) {

			System.out.println("Conta " + numeroConta + " não encontrada.");
			return;
		}

		contaBancaria.realizarSaque(valor);
	}

	public void realizarDeposito(int numeroConta, double valor) {

		ContaBancaria contaBancaria = this.buscarConta(numeroConta);

		if (contaBancaria == null) {

			System.out.println("Conta " + numeroConta + " não encontrada.");
			return;
		}

		contaBancaria.realizarDeposito(valor);
	}

	public void listarContas() {

		for (ContaBancaria contaBancaria : this.contas) {

			contaBancaria.verificarSaldo();
		}
	}
}
