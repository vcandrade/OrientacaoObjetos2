package aula18.manipulacaoarquivos.classefile;

import java.io.File;

public class Exemplo10ListarArquivos {

	public static void main(String[] args) {
		
		File file = new File("/home/vinicius");
		
		String [] tree = file.list();
		
		for (String arquivo : tree) {
			
			System.out.println(arquivo);			
		}
	}
}
