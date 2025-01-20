package reporte;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
public class matriculaPendiente extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabelEstado;
	private JComboBox comboBox;
	private JButton btnNewButtonMostrar;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriculaPendiente dialog = new matriculaPendiente();
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
	public matriculaPendiente() {
		setBackground(new Color(152, 251, 152));
		setTitle("MATRICULA PENDIENTE");
		setBounds(100, 100, 450, 410);
//		getContentPane().setLayout(null);
		contentPane = new JPanel();
		//centrar ventanas
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabelEstado = new JLabel("Estado");
		lblNewLabelEstado.setBounds(24, 6, 61, 16);
		contentPane.add(lblNewLabelEstado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Pendiente", "Vigente"}));
		comboBox.setBounds(82, 2, 127, 27);
		contentPane.add(comboBox);
		
		btnNewButtonMostrar = new JButton("Mostrar");
		btnNewButtonMostrar.setBounds(288, 6, 117, 29);
		contentPane.add(btnNewButtonMostrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 70, 398, 294);
		contentPane.add(scrollPane);

	}

}
