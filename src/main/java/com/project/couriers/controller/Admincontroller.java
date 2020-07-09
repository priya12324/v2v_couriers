package com.project.couriers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.project.couriers.model.Admin;

@RestController
public class Admincontroller {
	@RequestMapping("/adminpage")
	public String adminpage(){
		return "adminfrontpage";
	}  
	@RequestMapping("/admin")
	public String admin(){
		return "loginadmin";
		
	}   
	@RequestMapping("/parceldistribution")
	public String parceldistribution(){
		return "parceldistribution";
	} 
	@RequestMapping("/history")
	public String history(){
		return "history";
	} 
	@RequestMapping("/optimumroute")
	public String optimumroute(){
		return "route";
	} 
	@RequestMapping("/report")
	public String report(){
		return "report";
	} 
}
