package poli;

public abstract class NotificacionSMS extends Notificacion{

	public NotificacionSMS(String destinatario, String mensaje) {
		super(destinatario, mensaje);
		// TODO Auto-generated constructor stub
	}
	
    public void enviar() {
        System.out.println("Enviando SMS al número: " + destinatario + " con el mensaje: " + mensaje);
    }

}
