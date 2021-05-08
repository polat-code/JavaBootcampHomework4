package hw4.abstracts;

import hw4.entities.Notification;

public interface NotificationService {
	void add(Notification notification);
	void delete(Notification notification);
	void update(Notification notification,String newMessage);
}
