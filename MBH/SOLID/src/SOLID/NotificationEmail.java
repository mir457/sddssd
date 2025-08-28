package SOLID;

public class NotificationEmail implements NotificationManager{
	@Override
	public void send(String menssage) {
		System.out.println("Enviando correo: "+menssage);
	}
}
