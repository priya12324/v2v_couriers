package com.project.couriers.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.couriers.dao.Userdao;
import com.project.couriers.model.User;

@Service("userService")
public class UserService {

	Userdao userdao;

	@Autowired
	public void setUserDao(Userdao userdao) {
		this.userdao = userdao;
	}

   @override
	public User findByName(String name) {
		return userdao.findByName(name);
	}
  
   @Override
	public List<customers> findAll() {
		return this.CustomerRepository.findAll();
	}

}
