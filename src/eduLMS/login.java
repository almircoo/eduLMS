package eduLMS;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textFieldUsuario;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JButton btnNewButtonIngresar;
	private JButton btnNewButtonSalir;
	
	//variables globales
		public static String usuario, contrasena;
		public static int error = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login dialog = new login();
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
	public login() {
		setBackground(new Color(152, 251, 152));
		setTitle("LOGIN");
		setBounds(100, 100, 300, 350);
//		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		//centrar ventanas
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ingresar usuario y contrasena");
		lblNewLabel.setBounds(54, 6, 196, 16);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(108, 68, 68, 16);
		getContentPane().add(lblNewLabel_1);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(70, 96, 130, 26);
		getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Contrasena");
		lblNewLabel_2.setBounds(91, 145, 85, 16);
		getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(70, 164, 130, 26);
		getContentPane().add(passwordField);
		
		btnNewButtonIngresar = new JButton("Ingresar");
		btnNewButtonIngresar.addActionListener(this);
		btnNewButtonIngresar.setBounds(80, 214, 117, 29);
		getContentPane().add(btnNewButtonIngresar);
		
		btnNewButtonSalir = new JButton("Salir");
		btnNewButtonSalir.addActionListener(this);
		btnNewButtonSalir.setBounds(83, 274, 117, 29);
		getContentPane().add(btnNewButtonSalir);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonSalir) {
			actionPerformedBtnNewButtonSalir(e);
		}
		if (e.getSource() == btnNewButtonIngresar) {
			actionPerformedBtnNewButtonIngresar(e);
		}
	}
	protected void actionPerformedBtnNewButtonIngresar(ActionEvent e) {
		//variabls local
				usuario = textFieldUsuario.getText();
				contrasena = passwordField.getText();
				// proceso
				if (usuario.equals("Admin") && contrasena.equals("12345j")) {
					login.this.dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al  sistema", "Ingreso Correcto", JOptionPane.ERROR_MESSAGE);
					
					principal abrir = new principal();
					abrir.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(this, "Error: Asegúrese de ingresar valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
					
					textFieldUsuario.setText("");
					passwordField.setText("");
					textFieldUsuario.requestFocus();
					
					error = error + 1;
					 if (error==3) {
						 JOptionPane.showMessageDialog(this, "Comuniquese con servicio tecnico.", "Usuario Bloqueado", JOptionPane.ERROR_MESSAGE);
						 
						 login.this.dispose();
						 
						 
					 }
				}
	}
	protected void actionPerformedBtnNewButtonSalir(ActionEvent e) {
		dispose();
		textFieldUsuario.setText("");
		passwordField.setText("");
		textFieldUsuario.requestFocus();
	}
}
