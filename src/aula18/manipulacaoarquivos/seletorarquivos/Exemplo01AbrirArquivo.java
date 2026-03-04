package aula18.manipulacaoarquivos.seletorarquivos;

import javax.swing.JFileChooser;

public class Exemplo01AbrirArquivo {

	public static void main(String[] args) {
		
		JFileChooser seletor = new JFileChooser("");
		
		int valorRetorno = seletor.showOpenDialog(null);
		
		if (valorRetorno == JFileChooser.APPROVE_OPTION) {
			
			System.out.println("Nome do arquivo selecionado: " + seletor.getSelectedFile().getName());
			System.out.println("Caminho absoluto do arquivo selecionado: " + seletor.getSelectedFile().getAbsolutePath());
		}
	}
}
