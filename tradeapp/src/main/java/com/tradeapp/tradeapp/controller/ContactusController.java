package com.tradeapp.tradeapp.controller;

import com.tradeapp.tradeapp.model.Contactus;
import com.tradeapp.tradeapp.service.ContactusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContactusController {

    @Autowired
    private ContactusService cs;

    @GetMapping("/contactus")
    public ResponseEntity<List<Contactus>> getAllContactus(){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getAllContactus());
    }

    @DeleteMapping("/contactus/{id}")
    public ResponseEntity<Void> deleteContactusById(@PathVariable Integer id){
        cs.deleteContactusById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/contactus")
    public ResponseEntity<Contactus> addNewContactus(@RequestBody Contactus contactus){
        Integer contactusId = cs.addNewContactus(contactus);
        return new ResponseEntity<>(cs.getContactusById(contactusId), HttpStatus.CREATED);
    }
}
