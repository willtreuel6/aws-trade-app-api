package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getAllCustomer());
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id){
        return new ResponseEntity<>(cs.getCustomerById(id), HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable Integer id){
        cs.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> addNewCustomer(@RequestBody Customer customer){
        Integer customerId = cs.addNewCustomer(customer);
        return new ResponseEntity<>(cs.getCustomerById(customerId), HttpStatus.CREATED);
    }

    @PutMapping("/customer")
    public ResponseEntity<Customer> updateCustomerById(@RequestBody Customer customer){
        Customer updatedCustomer = cs.updateCustomerByID(customer);
        return new ResponseEntity<>(updatedCustomer, HttpStatus.CREATED);
    }

}
