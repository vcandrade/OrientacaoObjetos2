package aula19.thread.exercicio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DownloadWindow extends JFrame {

	private JTextField txtArquivo;
    private JButton btnAdicionar;

    private JPanel painelDownloads;

    public DownloadWindow() {

        initComponents();
    }

    private void initComponents() {

        setTitle("Gerenciador de Downloads");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Painel superior
        JPanel painelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel lblArquivo = new JLabel("Nome do Arquivo:");

        txtArquivo = new JTextField(25);

        btnAdicionar = new JButton("Adicionar Download");

        painelSuperior.add(lblArquivo);
        painelSuperior.add(txtArquivo);
        painelSuperior.add(btnAdicionar);

        add(painelSuperior, BorderLayout.NORTH);

        // Painel central
        painelDownloads = new JPanel();
        painelDownloads.setLayout(new BoxLayout(painelDownloads, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(painelDownloads);

        add(scrollPane, BorderLayout.CENTER);

        // Evento do botão
        btnAdicionar.addActionListener(e -> adicionarDownload());
    }

    private void adicionarDownload() {

        String nomeArquivo = txtArquivo.getText().trim();

        if (nomeArquivo.isEmpty()) {
            return;
        }

        PainelDownload painel = new PainelDownload(nomeArquivo);

        painelDownloads.add(painel);

        painelDownloads.revalidate();
        painelDownloads.repaint();

        txtArquivo.setText("");

        // Criando e iniciando a thread
        Thread thread = new Thread(new DownloadTask(painel));
        thread.start();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new DownloadWindow().setVisible(true);
        });
    }

}
