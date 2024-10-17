package aula04.polimorfismo;

public class ClinicaTeste {

	public static void main(String[] args) {
		
		Clinica clinica = new Clinica("123456", "Pet Clinica");
		
		clinica.cadastrar(new Gato("Garfield", "Persa"));
		clinica.cadastrar(new Cachorro("Spike", "Pastor Alemão"));
		clinica.cadastrar(new Cavalo("Pé de Pano", "Frísio"));
		
		clinica.listarAnimais();
	}
}
