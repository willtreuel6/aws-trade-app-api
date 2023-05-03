package com.tradeapp.tradeapp.controller;

import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.model.Employee;
import com.tradeapp.tradeapp.service.CustomerService;
import com.tradeapp.tradeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        return ResponseEntity.status(HttpStatus.OK).body(es.getAllEmployee());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        return new ResponseEntity<>(es.getEmployeeById(id), HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable Integer id) {
        es.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee) {
        Integer employeeId = es.addNewEmployee(employee);
        return new ResponseEntity<>(es.getEmployeeById(employeeId), HttpStatus.CREATED);
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee) {
        Employee updatedEmployee = es.updateEmployeeById(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.CREATED);
    }
}