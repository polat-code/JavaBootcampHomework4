package hw4.abstracts;

import hw4.entities.Customer;

public interface CustomerService {
	void save(Customer customer);
	void delete(Customer customer);
	void update(Customer customer,String newName);
}
