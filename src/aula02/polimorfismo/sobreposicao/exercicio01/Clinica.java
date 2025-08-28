package aula02.polimorfismo.sobreposicao.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

	private String cnpj;
	private String razaoSocial;
	private List<Mamifero> listaAnimais;
	
	public Clinica(String cnpj, String razaoSocial) {
		
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.listaAnimais = new ArrayList<>();
	}
	
	public void cadastrar(Mamifero mamifero) {
		
		this.listaAnimais.add(mamifero);
	}
	
	public void listarAnimais() {
		
		System.out.println(this.cnpj + " - " + this.razaoSocial);
		System.out.println();
		
		for (Mamifero mamifero : listaAnimais) {
			
			System.out.println("Nome: " + mamifero.getNome());
			System.out.println("Raça: " + mamifero.getRaca());
			mamifero.emitirSom();
			System.out.println("===========================");
		}
	}
}
