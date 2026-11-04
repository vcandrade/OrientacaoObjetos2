package aula18.manipulacaoarquivos.gravacaoleitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {

		try {

			BufferedReader documento = new BufferedReader(new FileReader("resources/manipulacaoarquivo/Teste.txt"));
			String linha = documento.readLine();
			
			while (linha != null) {
				
				System.out.println(linha);
				linha = documento.readLine();
			}

			documento.close();

		} catch (IOException e) {

			System.out.println("Erro: " + e.getMessage());
		}
	}
}
