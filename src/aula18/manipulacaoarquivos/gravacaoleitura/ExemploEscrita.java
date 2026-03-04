package aula18.manipulacaoarquivos.gravacaoleitura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscrita {

	public static void main(String[] args) {
		
		try {
			
			BufferedWriter documento = new BufferedWriter(new FileWriter("resources/manipulacaoarquivo/Teste.txt"));
			
			for (int i = 0; i < 10; i++) {
				
				documento.write("Linha " + i + "\t Teste");
				documento.newLine();
			}
			
			documento.close();
		
		} catch (IOException e) {
			
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
