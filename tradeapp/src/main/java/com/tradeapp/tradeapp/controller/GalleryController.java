package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Gallery;
import com.tradeapp.tradeapp.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class GalleryController {

    @Autowired
    private GalleryService gs;

    @GetMapping("/gallery")
    public ResponseEntity<List<Gallery>> getAllGallery() {
        return ResponseEntity.status(HttpStatus.OK).body(gs.getAllGallery());
    }

    @GetMapping("/gallery/{id}")
    public ResponseEntity<Gallery> getGalleryById(@PathVariable Integer id) {
        return new ResponseEntity<>(gs.getGalleryById(id), HttpStatus.OK);
    }

    @DeleteMapping("/gallery/{id}")
    public ResponseEntity<Void> deleteGalleryById(@PathVariable Integer id) {
        gs.deleteGalleryById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/gallery")
    public ResponseEntity<Gallery> addNewGallery(@RequestBody Gallery gallery) {
        Integer galleryId = gs.addNewGallery(gallery);
        return new ResponseEntity<>(gs.getGalleryById(galleryId), HttpStatus.CREATED);
    }

    @PutMapping("/gallery")
    public ResponseEntity<Gallery> updateGalleryById(@RequestBody Gallery gallery) {
        Gallery updatedGallery = gs.updateGalleryById(gallery);
        return new ResponseEntity<>(updatedGallery, HttpStatus.CREATED);
    }
}
