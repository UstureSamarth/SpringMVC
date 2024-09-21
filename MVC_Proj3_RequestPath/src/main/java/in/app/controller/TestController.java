package in.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	
	/*
	 * @RequestMapping(value = "/",method = RequestMethod.GET) public String
	 * homePage() { return "home"; }
	 */
	
	@RequestMapping
	public String homePage() {
		return "home2";
	}
	
	@RequestMapping(value = "/REPORT",method = RequestMethod.GET)
	public String showReport(Map<String,Object> model) {
		model.put("msg", "This is from /REPORT");
		return "display";
	}
	
	@RequestMapping(value = "/report",method = RequestMethod.GET)
	public String showReport1(Map<String,Object> model) {
		model.put("msg", "This is from /report from get test controller");
		return "display";
	}
	
	@RequestMapping(value = "/report",method = RequestMethod.POST)
	public String showReport2(Map<String,Object> model) {
		model.put("msg", "This is from /report from post");
		return "display";
	}
	
	@GetMapping(value = {"/report1","/report2","/report3"})
	public String showReport3(Map <String,Object> model) {
		model.put("msg", "This is from /report1,/report2,/report3 from get");
		return "display";
	}
	
}
