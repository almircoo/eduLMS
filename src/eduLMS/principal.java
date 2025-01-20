package eduLMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import reporte.alumnosMatriculados;
import reporte.matriculaPendiente;
import reporte.matriculaVigente;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBarProject;
	private JMenu mnNewMenuArchivo;
	private JMenu mnNewMenuManteni;
	private JMenu mnNewMenuRegistro;
	private JMenu mnNewMenuConsultarAlumMatri;
	private JMenu mnNewMenuAyuda;
	private JMenuItem mntmNewMenuItemSalir;
	private JMenuItem mntmCurso;
	private JMenuItem mnListarAlumno;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiroCurso;
	private JMenuItem mntmAlumnoCursos;
	private JMenuItem mntmNewMenuMatriRetiro;
	private JMenuItem mntmNewMenuItem_3;
	private JLabel lblNewLabel;
	private JMenu mnReporte;
	private JMenuItem mntmMatriculaPendiente;
	private JMenuItem mntmMatriculaVigente;
	private JMenuItem mntmMatriculadosPorCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setBackground(new Color(152, 251, 152));
		setTitle("REGISTRO Y MATRICULA ALUMNOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 600);
		
		menuBarProject = new JMenuBar();
		setJMenuBar(menuBarProject);
		
		this.setLocationRelativeTo(null);
		
		mnNewMenuArchivo = new JMenu("Archivo");
		menuBarProject.add(mnNewMenuArchivo);
		
		mntmNewMenuItemSalir = new JMenuItem("Salir");
		mntmNewMenuItemSalir.addActionListener(this);
		mnNewMenuArchivo.add(mntmNewMenuItemSalir);
		
		mnNewMenuManteni = new JMenu("Mantenimiento");
		menuBarProject.add(mnNewMenuManteni);
		
		mnListarAlumno = new JMenuItem("Alumno");
		mnListarAlumno.addActionListener(this);
		mnNewMenuManteni.add(mnListarAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(this);
		mnNewMenuManteni.add(mntmCurso);
		
		mnNewMenuRegistro = new JMenu("Registro");
		menuBarProject.add(mnNewMenuRegistro);
		
		mntmMatricula = new JMenuItem("Matricula");
		mntmMatricula.addActionListener(this);
		mnNewMenuRegistro.add(mntmMatricula);
		
		mntmRetiroCurso = new JMenuItem("Retiro");
		mntmRetiroCurso.addActionListener(this);
		mnNewMenuRegistro.add(mntmRetiroCurso);
		
		mnNewMenuConsultarAlumMatri = new JMenu("Consulta");
		menuBarProject.add(mnNewMenuConsultarAlumMatri);
		
		mntmAlumnoCursos = new JMenuItem("Alumnos Cursos");
		mntmAlumnoCursos.addActionListener(this);
		mnNewMenuConsultarAlumMatri.add(mntmAlumnoCursos);
		
		mntmNewMenuMatriRetiro = new JMenuItem("Matricula Retiro");
		mntmNewMenuMatriRetiro.addActionListener(this);
		mnNewMenuConsultarAlumMatri.add(mntmNewMenuMatriRetiro);
		
		mnReporte = new JMenu("Reporte");
		menuBarProject.add(mnReporte);
		
		mntmMatriculaPendiente = new JMenuItem("Matricula Pendiente");
		mntmMatriculaPendiente.addActionListener(this);
		mnReporte.add(mntmMatriculaPendiente);
		
		mntmMatriculaVigente = new JMenuItem("Matricula Vigente");
		mntmMatriculaVigente.addActionListener(this);
		mnReporte.add(mntmMatriculaVigente);
		
		mntmMatriculadosPorCurso = new JMenuItem("Matriculados por Curso");
		mntmMatriculadosPorCurso.addActionListener(this);
		mnReporte.add(mntmMatriculadosPorCurso);
		
		mnNewMenuAyuda = new JMenu("Ayuda");
		menuBarProject.add(mnNewMenuAyuda);
		
		mntmNewMenuItem_3 = new JMenuItem("Acerca del sistema");
		mntmNewMenuItem_3.addActionListener(this);
		mnNewMenuAyuda.add(mntmNewMenuItem_3);
		
		lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/principal.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmMatriculadosPorCurso) {
			actionPerformedMntmMatriculadosPorCurso(e);
		}
		if (e.getSource() == mntmMatriculaVigente) {
			actionPerformedMntmMatriculaVigente(e);
		}
		if (e.getSource() == mntmMatriculaPendiente) {
			actionPerformedMntmMatriculaPendiente(e);
		}
		
		if (e.getSource() == mntmNewMenuItemSalir) {
			actionPerformedMntmNewMenuItemSalir(e);
		}
	}
	//button salir
	protected void actionPerformedMntmNewMenuItemSalir(ActionEvent e) {
		System.exit(0);
	}
	// alumnos con matricula pendiente
	protected void actionPerformedMntmMatriculaPendiente(ActionEvent e) {
		matriculaPendiente mp = new matriculaPendiente();
		mp.setVisible(true);
	}
	// alumnos con matricula vigente
	protected void actionPerformedMntmMatriculaVigente(ActionEvent e) {
		matriculaVigente mv = new matriculaVigente();
		mv.setVisible(true);
	}
	// alumnos matriculados por curso
	protected void actionPerformedMntmMatriculadosPorCurso(ActionEvent e) {
		alumnosMatriculados mp = new alumnosMatriculados();
		mp.setVisible(true);
		
	}
}
