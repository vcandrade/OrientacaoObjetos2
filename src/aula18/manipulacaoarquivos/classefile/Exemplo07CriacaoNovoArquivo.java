package aula18.manipulacaoarquivos.classefile;

import java.io.File;
import java.io.IOException;

public class Exemplo07CriacaoNovoArquivo {

	public static void main(String[] args) {

		try {

			File file = new File("resources/manipulacaoarquivo/Log Sistema.txt");

			file.createNewFile();

			System.out.println("Arquivo criado com sucesso.");
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
