package com.supermarket.supermarket.Repository;

import com.supermarket.supermarket.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {
    Customer update(Customer customer);


    //List<Customer> getAll();
}

