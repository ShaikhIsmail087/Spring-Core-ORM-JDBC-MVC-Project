package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) 
	{
		m.addAttribute("Header", "LearnCodeWith Durgesh");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) 
	{
		System.out.println("Creating form");
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		if(user.getUserName().isBlank()) 
		{
			return "redirect:/contact";
		}
		//process
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createUser);
		return "success";
	}

}

/*public String handleForm(@RequestParam(name = "email",required = true) String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,Model model)
	{
//		String email = request.getParameter("email");
		System.out.println("user email "+userEmail);
		System.out.println("user name "+userName);
		System.out.println("user password "+userPassword);
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		//process
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user", user);
		
		return "success";
	}*/
