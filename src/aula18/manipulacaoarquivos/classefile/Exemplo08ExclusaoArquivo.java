package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo08ExclusaoArquivo {

	public static void main(String[] args) {

		File file = new File("resources/manipulacaoarquivo/Log Sistema.txt");

		if (file.delete()) {
			
			System.out.println("Arquivo excluído com sucesso.");
		
		} else {
			
			System.out.println("Erro ao excluir o arquivo.");
		}
	}
}
