
package poli;

public class Main {
    public static void main(String[] args) {
        
        Notificacion not1 = new NotificacionEmail("gato@gmail.com", "que tal");
        Notificacion not2 = new NotificacionSMS("6121482594", "molto");
        Notificacion not3 = new NotificacionPush("Alerta", "Tienes un nuevo mensaje.");

        ProcesadorDeNotificaciones.procesarNotificacion(not1);
        ProcesadorDeNotificaciones.procesarNotificacion(not2);
        ProcesadorDeNotificaciones.procesarNotificacion(not3);
    }
}
