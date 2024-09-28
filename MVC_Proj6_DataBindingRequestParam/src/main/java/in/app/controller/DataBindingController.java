package in.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {

	@GetMapping("/data")
	public String bindData(Map<String,Object> map,@RequestParam("sno")Integer sno,@RequestParam("sname")String sname) {
		
		return "show_result";
	}
	
	@GetMapping("/data1")
	public String bindData1(Map<String,Object> map,@RequestParam Integer sno,@RequestParam(required = false,defaultValue = "Sachin")String sname) {
		
		return "show_result";
	}
	
	@GetMapping("/data2")
	public String bindData2(Map<String,Object> map,@RequestParam Integer sno,@RequestParam(defaultValue = "Sachin")String sname) {
		
		return "show_result";
	}
	
}
