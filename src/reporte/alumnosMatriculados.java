package reporte;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class alumnosMatriculados extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabelCodigo;
	private JTextField textFieldCodigo;
	private JLabel lblNewLabelNombre;
	private JTextField textFieldNombre;
	private JLabel lblNewLabelApellido;
	private JTextField textField;
	private JLabel lblNewLabelEstado;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButtonMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alumnosMatriculados dialog = new alumnosMatriculados();
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
	public alumnosMatriculados() {
		setBackground(new Color(152, 251, 152));
		setTitle("ALUMNOS MATRICULADOS");
		setBounds(100, 100, 490, 398);
//		getContentPane().setLayout(null);
		contentPane = new JPanel();
		//centrar ventanas
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		lblNewLabelCodigo = new JLabel("Codigo:");
		lblNewLabelCodigo.setBounds(27, 50, 61, 16);
		getContentPane().add(lblNewLabelCodigo);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(98, 45, 130, 26);
		getContentPane().add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		lblNewLabelNombre = new JLabel("Nombre:");
		lblNewLabelNombre.setBounds(27, 18, 61, 16);
		getContentPane().add(lblNewLabelNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(98, 13, 130, 26);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		lblNewLabelApellido = new JLabel("Apellidos:");
		lblNewLabelApellido.setBounds(240, 18, 82, 16);
		getContentPane().add(lblNewLabelApellido);
		
		textField = new JTextField();
		textField.setBounds(317, 13, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabelEstado = new JLabel("Estado:");
		lblNewLabelEstado.setBounds(240, 50, 61, 16);
		getContentPane().add(lblNewLabelEstado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONAR", "PENDIENTE", "VIGENTE", "MATRICULADO"}));
		comboBox.setBounds(317, 46, 140, 27);
		getContentPane().add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 112, 418, 213);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButtonMostrar = new JButton("Mostrar");
		btnNewButtonMostrar.setBounds(164, 83, 117, 29);
		getContentPane().add(btnNewButtonMostrar);

	}
}
