package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model model) 
	{
		System.out.println("this is home url");
		
		model.addAttribute("name", "Mohammad Ismail Shaikh");
		model.addAttribute("id",1421);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Naseem Shaikh");
		friends.add("Rashid Ali");
		friends.add("Farhan Shaikh");
		friends.add("Ahmed Shaikh");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() 
	{
		System.out.println("this is service controller");
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() 
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//setting tha data
		modelAndView.addObject("name", "Abdul Kalam");
		modelAndView.addObject("rollNumber", 123414);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);
		list.add(900909);
		
		modelAndView.addObject("marks", list);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
/*
 * You need to add the "Maven Dependency" in the Deployment Assembly
 * 
 * right click on your project and choose properties. 
 * click on Deployment Assembly.
 * click add click on "Java Build Path Entries" select Maven
 * Dependencies" 
 * click Finish.
 */