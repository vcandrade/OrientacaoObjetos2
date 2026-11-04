package aula19.thread.exercicio;

import java.util.Random;

import javax.swing.SwingUtilities;

public class DownloadTask implements Runnable {

    private PainelDownload painel;

    public DownloadTask(PainelDownload painel) {

        this.painel = painel;
    }

    @Override
    public void run() {

        Random random = new Random();

        for (int i = 0; i <= 100; i++) {

            int progresso = i;

            // Atualizar interface gráfica
            SwingUtilities.invokeLater(() -> {

                painel.atualizarProgresso(progresso);
            });

            try {

                Thread.sleep(random.nextInt(150) + 50);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
