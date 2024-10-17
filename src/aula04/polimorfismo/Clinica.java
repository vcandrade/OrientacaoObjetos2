package aula04.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

	private String cnpj;
	private String razaoSocial;
	private List<Mamifero> animais;
	
	public Clinica(String cnpj, String razaoSocial) {
	
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.animais = new ArrayList<Mamifero>();
	}
	
	public void cadastrar(Mamifero mamifero) {
		
		this.animais.add(mamifero);
		System.out.println(mamifero.getNome() + " da raça " + mamifero.getRaca() + " cadastrado com sucesso.");
	}
	
	public void listarAnimais() {
		
		System.out.println("\n====== Lista de Animais ======");
		
		for (Mamifero mamifero : animais) {
			
			System.out.println("Nome: " + mamifero.getNome() + "\tRaça: " + mamifero.getRaca());
		}
	}
}
