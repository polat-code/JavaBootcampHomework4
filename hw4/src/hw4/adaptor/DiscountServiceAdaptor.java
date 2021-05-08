package hw4.adaptor;

import hw4.abstracts.DiscountCheckService;

public class DiscountServiceAdaptor implements DiscountCheckService{

	@Override
	public int getDiscountPercent() {
		return 10;
	}

	

}
