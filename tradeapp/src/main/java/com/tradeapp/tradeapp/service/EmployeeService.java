package com.tradeapp.tradeapp.service;

import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.model.Employee;
import com.tradeapp.tradeapp.repository.CustomerRepository;
import com.tradeapp.tradeapp.repository.EmployeeRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository er;

    public int addNewEmployee(@Valid Employee employee){
        if(employee.getEmployeeId() != null && er.findById(employee.getEmployeeId()).isPresent()){
            String errMsg = String.format("Employee with ID number %d already exist use PUT to update", employee.getEmployeeId());
            throw new EntityExistsException(errMsg);
        }
        return er.save(employee).getEmployeeId();
    }

    public List<Employee> getAllEmployee(){
        return er.findAll();
    }

    public void deleteEmployeeById(Integer id){
        er.deleteById(id);
    }

    public Employee updateEmployeeById(@Valid Employee employee){
        if(employee.getEmployeeId() == null)
            throw new BodyMissingRequiredPropertiesException("To update employee you must include the ID in the body.");
        if(er.findById(employee.getEmployeeId()).isEmpty())
            throw new NoSuchElementException(String.format("A Employee with ID %d does not exist so it cant be updated.", employee.getEmployeeId()));
        return er.save(employee);
    }

    public Employee getEmployeeById(Integer id){
        return er.findById(id).orElseThrow(() -> new NoSuchElementException("Employee not found"));
    }
}
