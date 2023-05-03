package com.tradeapp.tradeapp.controller;

import com.tradeapp.tradeapp.model.Admin;
import com.tradeapp.tradeapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService as;

    @GetMapping("/admin")
    public ResponseEntity<List<Admin>> getAllAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body(as.getAllAdmin());
    }


    @PostMapping("/admin")
    public ResponseEntity<Admin> addNewAdmin(@RequestBody Admin admin){
        Integer adminId = as.addNewAdmin(admin);
        return new ResponseEntity<>(as.getAdminById(adminId), HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<Void> deleteAdminById(@PathVariable Integer id){
        as.deleteAdminById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/admin")
    public ResponseEntity<Admin> updateAdminById(@RequestBody Admin admin){
        Admin updatedAdmin = as.updateAdminById(admin);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.CREATED);
    }
}
