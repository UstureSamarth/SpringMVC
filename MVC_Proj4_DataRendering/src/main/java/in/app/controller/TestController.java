package in.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.app.model.Employee;

@Controller
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		/*
		 * map.put("name", "Virat"); map.put("age", 37); map.put("team", "RCB");
		 * 
		 * String[] countryNames = new String[] { "IND", "USA", "Russia", "UK" };
		 * map.put("countryNames", countryNames);
		 * 
		 * List<String>
		 * subjectList=List.of("java","jee","hibernate","spring","springboot");
		 * map.put("subjectList", subjectList);
		 * 
		 * 
		 * Set<Long> mobileSet = Set.of(9999777888L, 6665554443L, 888777654L);
		 * map.put("mobileSet", mobileSet);
		 * 
		 * Map<String, Number> idsMap = Map.of("adhar", 456783, "voterId",
		 * 543456L,"panNo", 4534524L); map.put("idsMap", idsMap);
		 */

		List<Employee> empList = List.of(new Employee(10, "Sachin", "Batsman", 123.5),
				new Employee(7, "Dhoni", "Batsman", 113.5), new Employee(18, "Kohli", "Batsman", 103.5));
		map.put("empList", empList);
		return "show_report";

	}
}
