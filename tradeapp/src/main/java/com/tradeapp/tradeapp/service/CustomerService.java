package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.repository.CustomerRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository cr;

    public int addNewCustomer(@Valid Customer customer){
        if(customer.getCustomerId() != null && cr.findById(customer.getCustomerId()).isPresent()){
            String errMsg = String.format("Customer with ID number %d already exist use PUT to update", customer.getCustomerId());
            throw new EntityExistsException(errMsg);
        }
        return cr.save(customer).getCustomerId();
    }

    public List<Customer> getAllCustomer(){
        return cr.findAll();
    }

    public void deleteCustomerById(Integer id){
        cr.deleteById(id);
    }

    public Customer updateCustomerByID(@Valid Customer customer){
        if(customer.getCustomerId() == null)
            throw new BodyMissingRequiredPropertiesException("To update customer you must include the ID in the body.");
        if(cr.findById(customer.getCustomerId()).isEmpty())
            throw new NoSuchElementException(String.format("A Customer with ID %d does not exist so it cant be updated.", customer.getCustomerId()));
        return cr.save(customer);
    }

    public Customer getCustomerById(Integer id){
        return cr.findById(id).orElseThrow(() -> new NoSuchElementException("Customer not found"));
    }


}
