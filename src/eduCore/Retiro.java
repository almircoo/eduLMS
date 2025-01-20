package eduCore;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Retiro {
	//VARIABLES
	private int numRetiro;
    private int numMatricula;
    private String fecha;
    private String hora;
    // CONSTRUCTOR
	public Retiro(int numRetiro, int numMatricula) {
		this.numRetiro = numRetiro;
		this.numMatricula = numMatricula;
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.fecha = now.format(dateFormatter);
        this.hora = now.format(timeFormatter);
	}
	// START GETTERS AND SETTERS
	public int getNumRetiro() {
		return numRetiro;
	}
	public void setNumRetiro(int numRetiro) {
		this.numRetiro = numRetiro;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	//END GETTERS AND SETTERS
    
    
}
