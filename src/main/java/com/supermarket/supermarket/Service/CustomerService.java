package com.supermarket.supermarket.Service;

import com.supermarket.supermarket.Repository.CustomerRepo;
import com.supermarket.supermarket.Repository.UserRepo;
import com.supermarket.supermarket.model.Customer;
import com.supermarket.supermarket.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private static CustomerRepo customerRepo;

    public static void deleteCustomer(Long custID) {

    }

    public static Customer Updatecustomer(Customer customer) {
        return null;
    }

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
    public List<Customer> getAll() {
        return null;
    }
}
