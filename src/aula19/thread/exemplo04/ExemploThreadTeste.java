package aula19.thread.exemplo04;

public class ExemploThreadTeste {

	public static void main(String[] args) throws InterruptedException {

		String[] docs1 = { "OO2. 1", "OO2. 2", "OO2. 3", "OO2. 4" };
		String[] docs2 = { "Banco de Dados. A", "Banco de Dados. B", "Banco de Dados. C", "Banco de Dados. D" };

		ExemploThread usuario1 = new ExemploThread("João", docs1);
		ExemploThread usuario2 = new ExemploThread("Maria", docs2);

		usuario1.start();
		usuario2.start();
	}
}
