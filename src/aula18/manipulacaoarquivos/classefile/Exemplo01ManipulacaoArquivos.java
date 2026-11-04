package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo01ManipulacaoArquivos {

	public static void main(String[] args) {

		File file = new File("resources/manipulacaoarquivo/Anotacoes Aula.txt");

		String nomeArquivo = file.getName();
		String caminhorelativo = file.getPath();
		String caminhoAbsoluto = file.getAbsolutePath();
		String pastaArquivo = file.getParent();
		long tamanhoArquivo = file.length();

		System.out.println("Nome do Arquivo: " + nomeArquivo);
		System.out.println("Caminho Relativo: " + caminhorelativo);
		System.out.println("Caminho Absoluto: " + caminhoAbsoluto);
		System.out.println("Diretório Pai: " + pastaArquivo);
		System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " bytes");
	}
}
