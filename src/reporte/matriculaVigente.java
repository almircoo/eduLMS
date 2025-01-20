package reporte;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class matriculaVigente extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNewLabelFecha;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matriculaVigente dialog = new matriculaVigente();
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
	public matriculaVigente() {
		setBackground(new Color(152, 251, 152));
		setTitle("MATRICULA VIGENTE");
		setBounds(100, 100, 500, 381);
//		getContentPane().setLayout(null);
		contentPane = new JPanel();
		//centrar ventanas
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("MOSTRAR");
		btnNewButton.setBounds(377, 16, 117, 29);
		getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("Estado:");
		lblNewLabel.setBounds(19, 21, 61, 16);
		getContentPane().add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Pendiente", "Vigente"}));
		comboBox.setBounds(67, 17, 137, 27);
		getContentPane().add(comboBox);
		
		lblNewLabelFecha = new JLabel("Fecha:");
		lblNewLabelFecha.setBounds(214, 21, 51, 16);
		getContentPane().add(lblNewLabelFecha);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 95, 452, 236);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(263, 16, 92, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}
