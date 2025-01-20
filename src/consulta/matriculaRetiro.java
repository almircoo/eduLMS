package consulta;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class matriculaRetiro extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriculaRetiro dialog = new matriculaRetiro();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public matriculaRetiro() {
		setBounds(100, 100, 450, 300);

	}

}
