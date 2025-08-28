package aula02.polimorfismo.sobreposicao.exercicio01;

public class MamiferoTeste {

	public static void main(String[] args) {

		Clinica clinica = new Clinica("123456", "Clinica Pet");
		
		clinica.cadastrar(new Gato("Garfield", "Amarelo"));
		clinica.cadastrar(new Cachorro("Totó", "Caramelo"));
		clinica.cadastrar(new Cavalo("Pé de Pano", "Marchadão"));
		clinica.cadastrar(new Cachorro("Spike", "Fila"));
		
		clinica.listarAnimais();
	}
}
