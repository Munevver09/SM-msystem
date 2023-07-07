package com.supermarket.supermarket.Controller;

import com.supermarket.supermarket.Repository.CustomerRepo;
import com.supermarket.supermarket.Service.CustomerService;
import com.supermarket.supermarket.Service.UserService;
import com.supermarket.supermarket.model.Customer;
import com.supermarket.supermarket.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        try {
            Customer customer1 = customerService.save(customer);
            return new ResponseEntity<>("Added", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>("Not Added", HttpStatus.NOT_MODIFIED);
        }
    }

    @GetMapping("/customer")
    public ResponseEntity<?> getAllCustomer() {
        try {
            List<Customer> customerList = customerService.getAll();
            if (customerList.isEmpty()) {
                return new ResponseEntity<>("No data found", HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(customerList, HttpStatus.OK);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @DeleteMapping("/customer/{custID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("custID") Long custID){
        CustomerService.deleteCustomer(custID);
        return new ResponseEntity<String>("Successfully deleted",HttpStatus.OK);
    }
    @PutMapping("/customer/{custID}")
    public ResponseEntity<String> updateCustomer(@PathVariable("custID") long custID,@RequestBody  Customer customer){
        customer.setCustID(custID);
        Customer updatecustomer= CustomerService.Updatecustomer(customer);
        return new ResponseEntity<>("updated",HttpStatus.OK);
    }
}