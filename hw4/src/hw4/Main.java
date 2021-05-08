package hw4;

import hw4.abstracts.CustomerService;
import hw4.abstracts.GameService;
import hw4.abstracts.NotificationService;
import hw4.adaptor.DiscountServiceAdaptor;
import hw4.adaptor.MerniseServiceAdaptor;
import hw4.concretes.CustomerManager;
import hw4.concretes.DiscountManager;
import hw4.concretes.GameManager;
import hw4.concretes.NotificationManager;
import hw4.entities.Customer;
import hw4.entities.Game;
import hw4.entities.Notification;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"4562532542","Özgürhan","Polat","12/05/2000");
		Game game = new Game(0,2,"ETS2","Truck Game",11.99);
		Notification notification = new Notification(1,2,"Update available","There is new Update on the system");
		
		CustomerService customerManager = new CustomerManager(new MerniseServiceAdaptor());
		customerManager.save(customer);
		
		GameService gameManager = new GameManager();
		gameManager.buyGame(customer, game);
		
		NotificationService notificationService = new NotificationManager();
		notificationService.add(notification);
		
		DiscountManager discountManager = new DiscountManager(new DiscountServiceAdaptor());
		discountManager.makeDiscount(game);
		
	}

}
