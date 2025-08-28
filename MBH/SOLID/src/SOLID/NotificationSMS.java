package SOLID;

public class NotificationSMS implements NotificationManager{
	@Override
	public void send(String menssage) {
		System.out.println("Enviando SMS: "+menssage);
	}
}
