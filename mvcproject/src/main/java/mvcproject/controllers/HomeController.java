package mvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	 @RequestMapping("/")
	    public String hello() {
	       // model.addAttribute("message", "Hello, Spring MVC!");
	        return "welcome";
	    }
	 @RequestMapping("/index")
	    public String hello1() {
	       // model.addAttribute("message", "Hello, Spring MVC!");
	        return "index";
	    }
}
