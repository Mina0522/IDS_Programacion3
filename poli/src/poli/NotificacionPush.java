package poli;

public abstract class NotificacionPush extends Notificacion{

	public NotificacionPush(String destinatario, String mensaje) {
		super(destinatario, mensaje);
		// TODO Auto-generated constructor stub
	}
	
    public void enviar() {
        System.out.println("Enviando notificación push al dispositivo: " + destinatario + " con el mensaje: " + mensaje);
    }

}
