package com.project.couriers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.project.couriers.model.User;

public interface CustomerRepository extends JpaRepository<customer, Long> {

}