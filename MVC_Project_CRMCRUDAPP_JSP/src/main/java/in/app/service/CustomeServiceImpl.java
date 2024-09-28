package in.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.app.dao.ICustomerDao;
import in.app.model.Customer;

@Service
public class CustomeServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao dao;

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) dao.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		dao.save(customer);
	}

	@Override
	public Customer getCustomer(Integer id) {
		Optional<Customer> optional = dao.findById(id);
		return optional.get();
	}

	@Override
	public void deleteCustomer(Integer id) {
		dao.deleteById(id);
	}

}
