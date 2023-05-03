package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Homeservices;
import com.tradeapp.tradeapp.model.Hometext;
import com.tradeapp.tradeapp.repository.HometextRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HometextService {

    @Autowired
    private HometextRepository hr;

    public int addNewHometext(@Valid Hometext hometext){
        if(hometext.getHometextId() != null && hr.findById(hometext.getHometextId()).isPresent()){
            String errMsg = String.format("Home Text with ID number %d already exist use PUT to update", hometext.getHometextId());
            throw new EntityExistsException(errMsg);
        }
        return hr.save(hometext).getHometextId();
    }

    public List<Hometext> getAllHomeText(){
        return hr.findAll();
    }

    public void deleteHomeTextById(Integer id){
        hr.deleteById(id);
    }

    public Hometext updateHomeTextById(@Valid Hometext hometext){
        if(hometext.getHometextId() == null)
            throw new BodyMissingRequiredPropertiesException("To update Home Text you must include the ID in the body.");
        if(hr.findById(hometext.getHometextId()).isEmpty())
            throw new NoSuchElementException(String.format("A Home Text with ID %d does not exist so it cant be updated.", hometext.getHometextId()));
        return hr.save(hometext);
    }

    public Hometext getHomeTextById(Integer id){
        return hr.findById(id).orElseThrow(() -> new NoSuchElementException("Home Text not found"));
    }

}
