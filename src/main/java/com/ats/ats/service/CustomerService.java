package com.ats.ats.service;

import com.ats.ats.dao.CustomerRepository;
import com.ats.ats.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository cs;

    Customer c;

    public String signup(Customer  customer) {
        try {
            c = cs.save(customer);
            return  "Create Succesfully";
        }catch (Exception e) {
            e.printStackTrace();
            return  e.getMessage();
        }
    }

    public Customer login(Customer customer) {
        Customer c = null;
        try {
            c = cs.findByUsernameAndPassword(customer.getUsername(), customer.getPassword());
            c.setPassword("");
            return c;
        }catch (Exception e){
            e.printStackTrace();
            return c;
        }
    }
}
