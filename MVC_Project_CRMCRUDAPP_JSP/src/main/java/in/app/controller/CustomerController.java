package in.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.app.model.Customer;
import in.app.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping("/list")
	public String listCustomers(Map<String, Object> model) {
		List<Customer> customers = service.getCustomers();
		model.put("customers", customers);
		return "list-customers";
	}

	@GetMapping("/showform")
	public String showFormForAdditon(Map<String, Object> model) {

		Customer customer = new Customer();
		model.put("customer", customer);
		return "customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service.saveCustomer(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/showformupdate")
	public String showFormUpdate(@RequestParam Integer customerId, Map<String, Object> model) {
		Customer customer=service.getCustomer(customerId);
		model.put("customer", customer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam Integer customerId, Map<String, Object> model) {
		service.deleteCustomer(customerId);
		return "redirect:/customer/list";
	}

}
