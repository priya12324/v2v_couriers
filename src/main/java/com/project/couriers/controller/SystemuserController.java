package com.project.couriers.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import  com.project.couriers.model.User;
@RestController
public class SystemuserController {
	@Autowired
	private User User;
	@RequestMapping("/userpage")
	public String userpage(String name, String pasd,HttpServletRequest request, HttpSession session,HttpServletResponse response) {
			
		String username=name;
		String password=pasd;
			try {
				
				//usr.setUsrPasswrod(hashPassword(usr.getUsrPasswrod()));
				User loginUsr=User.findByName (username, password);
				if(loginUsr==null) {
					System.out.println("Invalid User name / password");
					map.addAttribute("error", "Invalid User name / password");
					return "login";
				}			
				else
				{
		           return "userfrontpage";
	
			}
			}
			
	}
	@RequestMapping("/user")
	public String user(){
		return "login";
	}  
	@RequestMapping("/courierlist")
	public String courierlist(){
		
	
		return "list";
	}  
	@RequestMapping("/edit")
	public String edit(){
		return "edits";
	}  
	@RequestMapping("/tracking")
	public String tracking(){
		return "tracking";
	}  
	@RequestMapping("/payment")
	public String payment(){
		return "payment";
	} 
	@RequestMapping("/history")
	public String history(){
		return "history";
	} 
	
	@RequestMapping("/userdetails")
	public String userdetails(){
		logger.debug("userdetails()");
		model.addAttribute("users", userService.findAll());
		return "userdetails";
	} 
	
}
