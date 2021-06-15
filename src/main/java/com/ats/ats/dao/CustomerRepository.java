package com.ats.ats.dao;


import com.ats.ats.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByUsernameAndPassword(String username, String password);
}
