package hw4.abstracts;

import hw4.entities.Game;

public interface DiscountService {
	void makeDiscount(Game game);
	int getDiscountPercent(Game game);
	double calculateNewPrice(double price, Game game);
	
}