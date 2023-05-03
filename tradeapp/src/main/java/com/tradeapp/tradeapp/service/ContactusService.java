package com.tradeapp.tradeapp.service;

import com.tradeapp.tradeapp.model.Contactus;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.repository.ContactusRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactusService {

    @Autowired
    private ContactusRepository cr;

    public int addNewContactus(@Valid Contactus contactus){
        if(contactus.getContactusId() != null && cr.findById(contactus.getContactusId()).isPresent()){
            String errMsg = String.format("Contactus with ID number %d already exist use PUT to update", contactus.getContactusId());
            throw new EntityExistsException(errMsg);
        }
        return cr.save(contactus).getContactusId();
    }

    public List<Contactus> getAllContactus(){
        return cr.findAll();
    }

    public void deleteContactusById(Integer id){
        cr.deleteById(id);
    }

    public Contactus getContactusById(Integer id){
        return cr.findById(id).orElseThrow(() -> new NoSuchElementException("Contactus not found"));
    }



}
