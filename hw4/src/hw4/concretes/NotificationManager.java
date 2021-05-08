package hw4.concretes;

import hw4.abstracts.NotificationService;
import hw4.entities.Notification;

public class NotificationManager implements NotificationService{

	@Override
	public void add(Notification notification) {
		System.out.println(notification.getName()  +" added to the system");
		
	}

	@Override
	public void delete(Notification notification) {
		System.out.println(notification.getName() + " deleted from the system");
		
	}

	@Override
	public void update(Notification notification, String newMessage) {
		String oldMessage = notification.getMessage();
		notification.setMessage(newMessage);
		System.out.println(oldMessage +  " was changed to " + notification.getMessage());
	}

}
