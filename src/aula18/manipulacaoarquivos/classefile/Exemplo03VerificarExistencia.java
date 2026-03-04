package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo03VerificarExistencia {

	public static void main(String[] args) {
		
		File file = new File("resources/manipulacaoarquivo/Anotacoes Aula.txt");
		
		if (file.exists()) {
			
			System.out.println("Arquivo encontrado.");
			
		} else {
			
			System.out.println("Arquivo não encontrado.");
		}
	}
}
