package hw4.concretes;

import hw4.abstracts.CustomerCheckService;
import hw4.abstracts.CustomerService;
import hw4.entities.Customer;

public class CustomerManager implements CustomerService {
	CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson()) {
			System.out.println("Saved to database " + customer.getName());
		}else {
			System.out.println("There is no like that person");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Deleted from database " + customer.getName());
	}

	@Override
	public void update(Customer customer, String newName) {
		// TODO Auto-generated method stub
		customer.setName(newName);
		System.out.println("Updated the database " + customer.getName());
	}

}
