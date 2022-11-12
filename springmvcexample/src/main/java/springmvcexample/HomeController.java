package springmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() 
	{
		return "home";
	}
	//handling for request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name,Model m) 
	{
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}
}
