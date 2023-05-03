package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Admin;
import com.tradeapp.tradeapp.model.Job;
import com.tradeapp.tradeapp.model.Services;
import com.tradeapp.tradeapp.service.AdminService;
import com.tradeapp.tradeapp.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ServiceController {

    @Autowired
    private ServicesService ss;

    @GetMapping("/services")
    public ResponseEntity<List<Services>> getAllServices(){
        return ResponseEntity.status(HttpStatus.OK).body(ss.getAllServices());
    }

    @GetMapping("/services/{id}")
    public ResponseEntity<Services> getServicesById(@PathVariable Integer id){
        return new ResponseEntity<>(ss.getServiceById(id), HttpStatus.OK);
    }


    @PostMapping("/services")
    public ResponseEntity<Services> addNewService(@RequestBody Services services){
        Integer serviceId = ss.addNewService(services);
        return new ResponseEntity<>(ss.getServiceById(serviceId), HttpStatus.CREATED);
    }

    @DeleteMapping("/services/{id}")
    public ResponseEntity<Void> deleteServiceById(@PathVariable Integer id){
        ss.deleteServiceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/services")
    public ResponseEntity<Services> updateServiceById(@RequestBody Services services){
        Services updatedService = ss.updateServiceById(services);
        return new ResponseEntity<>(updatedService, HttpStatus.CREATED);
    }
}
