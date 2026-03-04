package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo05VerificarArquivoOuDiretorio {

	public static void main(String[] args) {

		File file = new File("resources/manipulacaoarquivo/Anotacoes Aula.txt");

		// verifica se é um diretório
		if (file.isDirectory()) {

			System.out.println("É um diretório.");
		} 

		// verifica se é um arquivo
		if (file.isFile()) {

			System.out.println("É um arquivo.");
		}
	}
}
