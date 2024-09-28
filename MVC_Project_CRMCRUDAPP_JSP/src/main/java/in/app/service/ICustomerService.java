package in.app.service;

import java.util.List;

import in.app.model.Customer;

public interface ICustomerService {
	List<Customer> getCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomer(Integer id);
	void deleteCustomer(Integer id);

}
