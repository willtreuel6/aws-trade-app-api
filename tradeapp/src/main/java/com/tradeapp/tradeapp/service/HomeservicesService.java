package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.model.Homeservices;
import com.tradeapp.tradeapp.repository.HomeservicesRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HomeservicesService {

    @Autowired
    private HomeservicesRepository hr;

    public int addNewHomeService(@Valid Homeservices homeservices){
        if(homeservices.getHomeservicesId() != null && hr.findById(homeservices.getHomeservicesId()).isPresent()){
            String errMsg = String.format("Home Service with ID number %d already exist use PUT to update", homeservices.getHomeservicesId());
            throw new EntityExistsException(errMsg);
        }
        return hr.save(homeservices).getHomeservicesId();
    }

    public List<Homeservices> getAllHomeServices(){
        return hr.findAll();
    }

    public void deleteHomeServiceById(Integer id){
        hr.deleteById(id);
    }

    public Homeservices updateHomeServiceById(@Valid Homeservices homeservices){
        if(homeservices.getHomeservicesId() == null)
            throw new BodyMissingRequiredPropertiesException("To update Home Service you must include the ID in the body.");
        if(hr.findById(homeservices.getHomeservicesId()).isEmpty())
            throw new NoSuchElementException(String.format("A Home Service with ID %d does not exist so it cant be updated.", homeservices.getHomeservicesId()));
        return hr.save(homeservices);
    }

    public Homeservices getHomeServiceById(Integer id){
        return hr.findById(id).orElseThrow(() -> new NoSuchElementException("Home Service not found"));
    }
}
