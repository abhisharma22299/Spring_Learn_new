package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.service.UserService;

import springmvc.model.User;

@Controller
public class ContactController {

	@Autowired
	private UserService userServie;

	@RequestMapping("/contact")
	public String contact() {

		return "contact";
	}

	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * process(HttpServletRequest request) { String
	 * email=request.getParameter("email"); String
	 * pass=request.getParameter("password"); System.out.println(email+" "+ pass );
	 * 
	 * return "index"; }
	 */
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String process(@RequestParam("email") String email, @RequestParam("password") String password,Model model) {
	public String process(@ModelAttribute User user, Model model) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
//	model.addAttribute("user",user);
this.userServie.createUser(user);
		return "sucess";
	}
}
