package aula18.manipulacaoarquivos.seletorarquivos;

import javax.swing.JFileChooser;

public class Exemplo02SalvarArquivo {

	public static void main(String[] args) {

		JFileChooser seletor = new JFileChooser("");

		int valorRetorno = seletor.showSaveDialog(null);

		if (valorRetorno == JFileChooser.APPROVE_OPTION) {

			System.out.println("Nome do novo arquivo: " + seletor.getSelectedFile().getName());
			System.out.println("Caminho em que será salvo: " + seletor.getSelectedFile().getAbsolutePath());
		}
	}
}
