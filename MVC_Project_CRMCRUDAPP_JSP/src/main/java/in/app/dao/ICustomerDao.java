package in.app.dao;

import org.springframework.data.repository.CrudRepository;

import in.app.model.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Integer> {

}
