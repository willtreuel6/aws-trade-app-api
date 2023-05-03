package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Contact;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.service.ContactService;
import com.tradeapp.tradeapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService cs;

    @GetMapping("/contact")
    public ResponseEntity<List<Contact>> getAllContact(){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getAllContact());
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Integer id){
        return new ResponseEntity<>(cs.getContactById(id), HttpStatus.OK);
    }

    @DeleteMapping("/contact/{id}")
    public ResponseEntity<Void> deleteContactById(@PathVariable Integer id){
        cs.deleteContactById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/contact")
    public ResponseEntity<Contact> addNewContact(@RequestBody Contact contact){
        Integer contactId = cs.addNewContact(contact);
        return new ResponseEntity<>(cs.getContactById(contactId), HttpStatus.CREATED);
    }

    @PutMapping("/contact")
    public ResponseEntity<Contact> updateContactById(@RequestBody Contact contact){
        Contact updatedContact = cs.updateContactById(contact);
        return new ResponseEntity<>(updatedContact, HttpStatus.CREATED);
    }
}
