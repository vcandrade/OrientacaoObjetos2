package aula18.manipulacaoarquivos.classefile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo06DadosModificacaoArquivo {

	public static void main(String[] args) {
		
		File file = new File("resources/manipulacaoarquivo/Anotacoes Aula.txt");
		
		long hora = file.lastModified();
		Date data = new Date(hora);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(df.format(data));
	}
}
