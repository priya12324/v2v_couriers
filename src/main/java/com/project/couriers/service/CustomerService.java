
package com.project.couriers.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.couriers.dao.Customerdao;
import com.project.couriers.model.Customer;

@Service("customerService")
public class CustomerService {

	Customerdao customerdao;

	@Autowired
	public void setCustomerDao(Customerdao customerdao) {
		this.customerdao = customerdao;
	}

   @override
	public Customer findByName(String name) {
		return customerdao.findByName(name);
	}
  
   @Override
	public List<customers> findAll() {
		return this.CustomerRepository.findAll();
	}

}
