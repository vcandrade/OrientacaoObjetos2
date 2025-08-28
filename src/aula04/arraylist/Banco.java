package aula04.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<Conta> contas;
	
	public Banco(int cnpj, String nomeBanco) {
	
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarNovaConta(int numeroConta, String nomeTitular) {
		
		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contas.add(conta);
		
		System.out.println("Conta " + numeroConta + " criada com sucesso.\n");
	}
	
	public void verificarSaldoConta(int numeroConta) {
		
		System.out.println("CNPJ: " + this.cnpj + "\t\tBanco: " + this.nomeBanco);
		
		for (Conta conta : contas) {
			
			if(conta.getNumeroConta() == numeroConta) {
				
				conta.verificarSaldo();
				return;
			}
		}
		
		System.out.println("Conta " + numeroConta + " não encontrada.\n");
	}
	
	public void realizarSaqueConta(int numeroConta, double valor) {
		
		for (Conta conta : contas) {
			
			if (conta.getNumeroConta() == numeroConta) {
				
				conta.realizarSaque(valor);
				return;
			}
		}
		
		System.out.println("Conta " + numeroConta + " não encontrada.\n");
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		
		for (Conta conta : contas) {
			
			if(conta.getNumeroConta() == numeroConta) {
				
				conta.realizarDeposito(valor);
				return;
			}
		}
		
		System.out.println("Conta " + numeroConta + " não encontrada.\n");
	}
}
