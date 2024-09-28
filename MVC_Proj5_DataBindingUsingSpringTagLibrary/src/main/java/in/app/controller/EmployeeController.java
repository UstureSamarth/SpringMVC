package in.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.app.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String showHome(@ModelAttribute("emp") Employee employee) {
		return "home";
	}

	@PostMapping("/register")
	public String registerEmployee(Map<String,Object> map,@ModelAttribute("emp") Employee employee) {
		map.put("employee", employee);
		return "result";
	}
}
