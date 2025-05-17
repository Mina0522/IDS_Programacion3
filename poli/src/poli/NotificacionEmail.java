package poli;

public abstract class NotificacionEmail extends Notificacion{

	public NotificacionEmail(String destinatario, String mensaje) {
		super(destinatario, mensaje);
		// TODO Auto-generated constructor stub
	}
	
    public void enviar() {
        System.out.println("Enviando correo electrónico a: " + destinatario + " con el mensaje: " + mensaje);
    }

}
