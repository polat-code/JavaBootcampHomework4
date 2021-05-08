package hw4.abstracts;

import hw4.entities.Customer;
import hw4.entities.Game;

public interface GameService {
	void buyGame(Customer customer,Game game);
	void showGame(Customer customer, Game game);
}
