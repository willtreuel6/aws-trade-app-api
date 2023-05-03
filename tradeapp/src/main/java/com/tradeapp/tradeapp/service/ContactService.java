package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Contact;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.repository.ContactRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactService {

    @Autowired
    private ContactRepository cr;

    public int addNewContact(@Valid Contact contact){
        if(contact.getContactId() != null && cr.findById(contact.getContactId()).isPresent()){
            String errMsg = String.format("Contact with ID number %d already exist use PUT to update", contact.getContactId());
            throw new EntityExistsException(errMsg);
        }
        return cr.save(contact).getContactId();
    }

    public List<Contact> getAllContact(){
        return cr.findAll();
    }

    public void deleteContactById(Integer id){
        cr.deleteById(id);
    }

    public Contact updateContactById(@Valid Contact contact){
        if(contact.getContactId() == null)
            throw new BodyMissingRequiredPropertiesException("To update contact you must include the ID in the body.");
        if(cr.findById(contact.getContactId()).isEmpty())
            throw new NoSuchElementException(String.format("A Contact with ID %d does not exist so it cant be updated.", contact.getContactId()));
        return cr.save(contact);
    }
    public Contact getContactById(Integer id){
        return cr.findById(id).orElseThrow(() -> new NoSuchElementException("Contact not found"));
    }

}
