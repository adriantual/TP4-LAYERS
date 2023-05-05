package ejercicio3.main;

import javax.swing.SwingUtilities;

import ejemplo.RadioCompetition;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new Main().start();
				} catch (Exception e) {
					// log exception...
					System.out.println(e);
				}
			}
		});
	}

	private void start() {
		new RadioCompetition();
	}

}
