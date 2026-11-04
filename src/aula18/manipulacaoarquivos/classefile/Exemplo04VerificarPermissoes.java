package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo04VerificarPermissoes {

	public static void main(String[] args) {

		File file = new File("resources/manipulacaoarquivo/Anotacoes Aula.txt");

		// verifica se possui permissão de leitura no arquivo
		if (file.canRead()) {
			
			System.out.println("Possui permissão de leitura.");
		
		} else {
		
			System.out.println("Não possui permissão de leitura.");
		}
		
		// verifica se possui permissão de escrita no arquivo
		if (file.canWrite()) {
		
			System.out.println("Possui permissão de escrita.");
		
		} else {
		
			System.out.println("Não possui permissão de escrita.");
		}		
	}
}
