package com.ats.ats.controller;

import com.ats.ats.model.Customer;
import com.ats.ats.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService s ;

    @PostMapping("/register")
    public String customerRegister(@RequestBody Customer customer) {
        return s.signup(customer);
    }

    @PostMapping("/login")
    public Customer customerLogin(@RequestBody Customer customer) {
        return s.login(customer);
    }
}
