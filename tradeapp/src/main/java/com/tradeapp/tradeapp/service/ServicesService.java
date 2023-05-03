package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Services;
import com.tradeapp.tradeapp.repository.ServiceRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ServicesService {

    @Autowired
    private ServiceRepository sr;

    public int addNewService(@Valid Services service){
        if(service.getServiceId() != null && sr.findById(service.getServiceId()).isPresent()){
            String errMsg = String.format("Card with ID number %d already exist use PUT to update", service.getServiceId());
            throw new EntityExistsException(errMsg);
        }
        return sr.save(service).getServiceId();
    }
    public List<Services> getAllServices(){
        return sr.findAll();
    }

    public void deleteServiceById(Integer id){
        sr.deleteById(id);
    }

    public Services getServiceById(Integer id){
        return sr.findById(id).orElseThrow(() -> new NoSuchElementException("Service not found"));
    }

    public Services updateServiceById(Services services){
        if(services.getServiceId() == null)
            throw new BodyMissingRequiredPropertiesException("Include id in body");
        if(sr.findById(services.getServiceId()).isEmpty())
            throw new NoSuchElementException(String.format("A Service with ID %d does not exist so cant be updated.", services.getServiceId()));
        return sr.save(services);
    }

}
