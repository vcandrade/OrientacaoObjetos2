package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo02RenomearArquivo {

	public static void main(String[] args) {

		File sourceFile = new File("/mnt/Pessoal/Eclipse-Workspace/OrientacaoObjetos2/resources/manipulacaoarquivo/Anotacoes Aula.txt");
		File destinationFile = new File("/mnt/Pessoal/Eclipse-Workspace/OrientacaoObjetos2/resources/manipulacaoarquivo/Aula OO.txt");
		
		if (sourceFile.renameTo(destinationFile)) {
			
			System.out.println("Arquivo renomeado com sucesso.");
		
		} else {
			
			System.out.println("Erro ao renomear arquivo.");
		}
	}
}
