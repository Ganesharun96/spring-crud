package com.example.demo.service;

import java.util.List;

import org.springframework.ui.Model;

import com.example.demo.model.CustomerModel;

public interface CustomerServiceInterface {
	
public List<CustomerModel> disp();
public void method(CustomerModel customermodel);


}
