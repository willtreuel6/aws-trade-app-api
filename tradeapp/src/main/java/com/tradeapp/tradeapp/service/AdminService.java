package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Admin;
import com.tradeapp.tradeapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import jakarta.persistence.EntityExistsException;

@Service
public class AdminService {

    @Autowired
    private AdminRepository ar;


    public List<Admin> getAllAdmin(){
        return ar.findAll();
    }

    public Admin getAdminById(Integer id){
        return ar.findById(id).orElseThrow(() -> new NoSuchElementException("Admin not found!"));
    }

    public void deleteAdminById(Integer id){
        ar.deleteById(id);
    }

    public int addNewAdmin(@Valid Admin admin){
        if(admin.getAdminId() != null && ar.findById(admin.getAdminId()).isPresent()){
            String errMsg = String.format("Admin with ID number already exists", admin.getAdminId());
            throw new EntityExistsException(errMsg);
        }
        return ar.save(admin).getAdminId();
    }

    public Admin updateAdminById(Admin admin){
        if(admin.getAdminId() == null)
            throw new BodyMissingRequiredPropertiesException("Include id in body");
        if(ar.findById(admin.getAdminId()).isEmpty())
            throw new NoSuchElementException(String.format("An admin with ID %d does not exist so cant be updated.", admin.getAdminId()));
        return ar.save(admin);
    }



}
