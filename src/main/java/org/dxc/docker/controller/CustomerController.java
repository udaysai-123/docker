package org.dxc.docker.controller;

import org.dxc.docker.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
	@RequestMapping("/customer")
	public Customer displayCustomer() {
		Customer c=new Customer("uday","uday@gamil.com","7036013450");
		return c;
	}
}
