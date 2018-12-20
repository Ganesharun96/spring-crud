package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;



@Controller
public class CustomerController {
	@Autowired
	
	private CustomerService customerservice;
	
//	@RequestMapping(value="/list",method=RequestMethod.GET)
//	public String CustomerModel(Model model) {
//		List<CustomerModel> cmodels= customerService.disp();
//		model.addAttribute("lists",cmodels);
//				
//		return "Full";
//		
//	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String read(Model model) {
		
		model.addAttribute("show", new CustomerModel());
		return "Display";
	}
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String printRepaymentSchedule(@Valid @ModelAttribute("show")CustomerModel customermodel,BindingResult result)	{
		
		if(result.hasErrors()) {
			
			            return  "Display";
			            
			            }
		customerservice.method(customermodel);
		
		
//		CustomerModel	curmodel=new CustomerModel();
//		curmodel.setCreatedBy(customermodel.getCreatedBy());
//		curmodel.setCustomerAddress(customermodel.getCustomerAddress());
//		curmodel.setCustomerPincode(customermodel.getCustomerPincode());
//		curmodel.setCustomerEmail(customermodel.getCustomerEmail());
//		curmodel.setCustomerName(customermodel.getCustomerName());
//		curmodel.setCustomerNumber(customermodel.getCustomerNumber());
//		curmodel.setModifiedDate(customermodel.getModifiedDate());
//		curmodel.setRegistrationDate(customermodel.getRegistrationDate());
//		curmodel.setCustomerCode(customermodel.getCustomerCode());
//		customerrepository.save(curmodel);
		return "Print";
			    }

       
		
}
