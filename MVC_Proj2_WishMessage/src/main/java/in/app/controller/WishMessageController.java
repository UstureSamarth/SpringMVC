package in.app.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.app.service.IWishMessageService;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class WishMessageController {

	@Autowired
	IWishMessageService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}

	/*
	 * @RequestMapping(value = "/wish",method = RequestMethod.GET) public
	 * ModelAndView showWishMessage() { String msg=service.wishMessage();
	 * ModelAndView mav=new ModelAndView(); mav.addObject("msg",msg);
	 * mav.setViewName("display"); return mav; }
	 */

	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public String
	 * showWishMessage(Model model) {
	 * System.out.println("Model implementation class is " +
	 * model.getClass().getName()); String msg = service.wishMessage();
	 * model.addAttribute("msg", msg); return "display"; }
	 */

	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public String
	 * showWishMessage(Map<String, Object> model) {
	 * System.out.println("Model implementation class is " +
	 * model.getClass().getName()); String msg = service.wishMessage();
	 * model.put("msg", msg); return "display"; }
	 */
	
	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public void
	 * showWishMessage(Map<String, Object> model) {
	 * System.out.println("Model implementation class is " +
	 * model.getClass().getName()); String msg = service.wishMessage();
	 * model.put("msg", msg); }
	 */
	
	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public void
	 * showWishMessage(HttpServletResponse response) throws Exception { String msg =
	 * service.wishMessage(); response.setContentType("text/html"); PrintWriter out
	 * =response.getWriter();
	 * out.println("<h1 style='color: blue;text-align: center;'> "
	 * +msg+" form httpresponse</h1>");
	 * 
	 * }
	 * 
	 */
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public Map<String,Object> showWishMessage(HttpServletResponse response) throws Exception {
		String msg = service.wishMessage();
		Map<String,Object> map=new HashMap<>();
		map.put("msg", msg);
		return map;
		
	}
}
