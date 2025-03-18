package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {

    Customers findByEmailAddress(String emailAddress);
}