package cc3s2.ActividadRefactorizacion;

public class Ejercicio2Original {
    public class NotificationManager {
        private String user;
        private String message;

        public NotificationManager(String user, String message) {
            this.user = user;
            this.message = message;
        }

        public void sendNotification(String type) {
            if ("email".equals(type)) {
                System.out.println("Enviando email a " + user + " con mensaje: " + message);
            } else if ("sms".equals(type)) {
                System.out.println("Enviando sms a " + user + " con mensaje: " + message);
            } else if ("app".equals(type)) {
                System.out.println("Enviando notificación de app a " + user + " con mensaje: " + message);
            }
        }
    }

}
