package aula18.manipulacaoarquivos.seletorarquivos;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Exemplo03Filtros {

	public static void main(String[] args) {

		JFileChooser seletor = new JFileChooser("");
		
		FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Arquivo de Texto (*.txt)", "txt");
		FileNameExtensionFilter filtroOdt = new FileNameExtensionFilter("Documento de Texto (*.odt)", "odt");
		FileNameExtensionFilter filtroOds = new FileNameExtensionFilter("Planilha de Cálculo (*.ods)", "ods");
		
		seletor.setFileFilter(filtroTxt);
		seletor.setFileFilter(filtroOdt);
		seletor.setFileFilter(filtroOds);

		int valorRetorno = seletor.showOpenDialog(null);

		if (valorRetorno == JFileChooser.APPROVE_OPTION) {

			System.out.println("Nome do arquivo selecionado: " + seletor.getSelectedFile().getName());
			System.out.println("Caminho absoluto do arquivo selecionado: " + seletor.getSelectedFile().getAbsolutePath());
		}
	}
}
