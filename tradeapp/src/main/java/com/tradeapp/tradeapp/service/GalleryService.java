package com.tradeapp.tradeapp.service;

import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Gallery;
import com.tradeapp.tradeapp.repository.GalleryRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GalleryService {


    @Autowired
    private GalleryRepository gr;

    public int addNewGallery(@Valid Gallery gallery){
        if(gallery.getGalleryId() != null && gr.findById(gallery.getGalleryId()).isPresent()){
            String errMsg = String.format("Gallery with ID number %d already exist use PUT to update", gallery.getGalleryId());
            throw new EntityExistsException(errMsg);
        }
        return gr.save(gallery).getGalleryId();
    }

    public List<Gallery> getAllGallery(){
        return gr.findAll();
    }

    public void deleteGalleryById(Integer id){
        gr.deleteById(id);
    }

    public Gallery updateGalleryById(@Valid Gallery gallery){
        if(gallery.getGalleryId() == null)
            throw new BodyMissingRequiredPropertiesException("To update gallery you must include the ID in the body.");
        if(gr.findById(gallery.getGalleryId()).isEmpty())
            throw new NoSuchElementException(String.format("A Employee with ID %d does not exist so it cant be updated.", gallery.getGalleryId()));
        return gr.save(gallery);
    }

    public Gallery getGalleryById(Integer id){
        return gr.findById(id).orElseThrow(() -> new NoSuchElementException("Gallery not found"));
    }


}
