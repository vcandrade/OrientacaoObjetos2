package aula19.thread.exercicio;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PainelDownload extends JPanel {

    private JLabel lblArquivo;
    private JLabel lblPorcentagem;

    private JProgressBar barraProgresso;

    public PainelDownload(String nomeArquivo) {

        setLayout(new FlowLayout(FlowLayout.LEFT));

        setMaximumSize(new Dimension(650, 50));

        lblArquivo = new JLabel(nomeArquivo);

        barraProgresso = new JProgressBar(0, 100);
        barraProgresso.setPreferredSize(new Dimension(300, 25));

        lblPorcentagem = new JLabel("0%");

        add(lblArquivo);
        add(barraProgresso);
        add(lblPorcentagem);
    }

    public void atualizarProgresso(int valor) {

        barraProgresso.setValue(valor);

        if (valor < 100) {

            lblPorcentagem.setText(valor + "%");

        } else {

            lblPorcentagem.setText("Download concluído");
        }
    }

}
