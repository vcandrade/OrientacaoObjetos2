package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo09CriacaoDiretorio {

	public static void main(String[] args) {

		File file = new File("resources/manipulacaoarquivo/Linguagem Java/");

		if (file.mkdir()) {

			System.out.println("Diretório criado com sucesso.");

		} else {

			System.out.println("Erro ao criar o diretório.");
		}
	}
}
