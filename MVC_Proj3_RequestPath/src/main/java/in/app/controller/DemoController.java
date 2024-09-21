package in.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	
	@Autowired
	private ServletContext sc;
	
	@Autowired
	private ServletConfig scfg;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value = "/report",method = RequestMethod.GET)
	public String showReport1(Map<String,Object> model) {
		model.put("msg", "This is from /report from get demo controller");
		model.put("wname", sc.getContextPath());
		model.put("lname", scfg.getServletName());
		model.put("sid", session.getId());
		return "display2";
	}
	
	@RequestMapping(value = "/report1",method = RequestMethod.GET)
	public String showReport2(Map<String,Object> model,HttpSession ses) {
		model.put("sid", ses.getId());
		return "display3";
	}
	
	
}
