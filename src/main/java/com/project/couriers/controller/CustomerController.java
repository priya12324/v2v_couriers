package com.project.couriers.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.project.couriers.model.Customer;
@RestController
public class CustomerController {


	private Customer customer;
	@RequestMapping("/customer")
	public String userpage(String name, String pasd,HttpServletRequest request, HttpSession session,HttpServletResponse response) {
			
		String username=name;
		String password=pasd;
			try {
				
				//usr.setUsrPasswrod(hashPassword(usr.getUsrPasswrod()));
				Customer loginUsr=Customer.findByName(username, password);
				if(loginUsr==null) {
					System.out.println("Invalid User name / password");
					map.addAttribute("error", "Invalid User name / password");
					return "logincustomer";
				}			
				else
				{
		           return "customerfrontpage";
	
			}
			}
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
	@RequestMapping("/billing")
	public String billing(){
		return "billing";
	}
	@RequestMapping("/customerdetails")
	public String customerdetails(){
		logger.debug("customerdetails()");
		model.addAttribute("customers",customerrService.findAll());
		return "customerdetails";
	} 
	
}
