package m11.view;

import javax.swing.JFrame;

public class Marco extends JFrame {

	public Marco() {
		Lamina marco = new Lamina();
		
		// Posición marco en el centro de la pantalla
		setLocationRelativeTo(null);
		
		// Cambiar tamaño del marco
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 465, 328);

		setTitle("FLORISTERIA");
		
		getContentPane().add(marco);
		
	}
}
