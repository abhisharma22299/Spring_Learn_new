package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		model.addAttribute("name", "Abhishek Sharma IMSec ");
		return "index";
	}


	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView model = new ModelAndView();
		
		System.out.println("Help is jsp controller ");
// 
		int marks[]= {1,2,3,4,5,6,7,78};
		
		model.addObject("name", "ram");
		
//		model.addObject("mark", marks);
		model.addObject("as", marks);
		model.setViewName("help");
		
		return model;
	}

}
