package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.About;
import com.tradeapp.tradeapp.model.Employee;
import com.tradeapp.tradeapp.repository.AboutRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AboutService {

    @Autowired
    private AboutRepository ar;

    public int addNewAbout(@Valid About about){
        if(about.getAboutId() != null && ar.findById(about.getAboutId()).isPresent()){
            String errMsg = String.format("About with ID number %d already exist use PUT to update", about.getAboutId());
            throw new EntityExistsException(errMsg);
        }
        return ar.save(about).getAboutId();
    }

    public List<About> getAllAbout(){
        return ar.findAll();
    }

    public void deleteAboutById(Integer id){
        ar.deleteById(id);
    }

    public About updateAboutById(@Valid About about){
        if(about.getAboutId() == null)
            throw new BodyMissingRequiredPropertiesException("To update about you must include the ID in the body.");
        if(ar.findById(about.getAboutId()).isEmpty())
            throw new NoSuchElementException(String.format("An About with ID %d does not exist so it cant be updated.", about.getAboutId()));
        return ar.save(about);
    }

    public About getAboutById(Integer id){
        return ar.findById(id).orElseThrow(() -> new NoSuchElementException("About not found"));
    }
}
