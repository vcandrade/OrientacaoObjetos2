package aula19.thread.exercicio;

public class CronometroThread extends Thread {

	private CronometroWindow cronometroWindow;
	
	public CronometroThread(CronometroWindow cronometroWindow) {
		
		this.cronometroWindow = cronometroWindow;
	}

	@Override
	public void run() {

		try {
			while (true) {

				this.cronometroWindow.setContador(this.cronometroWindow.getContador() + 1);
				this.cronometroWindow.getLblContador().setText(String.valueOf(this.cronometroWindow.getContador()));

				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			
			System.out.println("Thread interrompida.");
		}
	}
}
