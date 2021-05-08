package hw4.concretes;

import hw4.abstracts.GameService;
import hw4.entities.Customer;
import hw4.entities.Game;

public class GameManager implements GameService{

	@Override
	public void buyGame(Customer customer, Game game) {
		System.out.println(customer.getName() + " bougth " + game.getName());
	}

	@Override
	public void showGame(Customer customer, Game game) {
		System.out.println(customer.getName() + " looks at " + game.getName() );
		
	}

}
