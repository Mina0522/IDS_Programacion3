package poli;

public abstract class Notificacion {
	
	public String destinatario;
	public String mensaje;
	
	public Notificacion(String destinatario, String mensaje) {
		this.destinatario = destinatario;
		this.mensaje = mensaje; 
	}
	
	public abstract void enviar();
}
