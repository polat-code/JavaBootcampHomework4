package hw4.concretes;

import hw4.abstracts.DiscountCheckService;
import hw4.abstracts.DiscountService;
import hw4.entities.Game;

public class DiscountManager implements DiscountService {
	
	DiscountCheckService discountCheckService;
	
	public DiscountManager(DiscountCheckService discountCheckService) {
		super();
		this.discountCheckService = discountCheckService;
	}

	@Override
	public void makeDiscount(Game game) {
		double newPrice = calculateNewPrice(game.getPrice(),game);
		
		System.out.println(game.getName()  + " is " + newPrice + " now!");
	}

	@Override
	public int getDiscountPercent(Game game) {
		// TODO Auto-generated method stub
		return discountCheckService.getDiscountPercent();
	}

	@Override
	public double calculateNewPrice(double price,Game game) {
		return (price - ((price  * getDiscountPercent(game) / 100)));
		
	}
	
	

}
