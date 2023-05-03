package com.tradeapp.tradeapp.controller;

import com.tradeapp.tradeapp.model.About;
import com.tradeapp.tradeapp.model.Employee;
import com.tradeapp.tradeapp.service.AboutService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AboutController {

    @Autowired
    private AboutService as;

    @GetMapping("/about")
    public ResponseEntity<List<About>> getAllAbout(){
        return ResponseEntity.status(HttpStatus.OK).body(as.getAllAbout());
    }

    @GetMapping("/about/{}")
    public ResponseEntity<About> getAboutById(@PathVariable Integer id){
        return new ResponseEntity<>(as.getAboutById(id), HttpStatus.OK);
    }

    @DeleteMapping("/about/{id}")
    public ResponseEntity<Void> deleteAboutById(@PathVariable Integer id) {
        as.deleteAboutById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/about")
    public ResponseEntity<About> addNewAbout(@RequestBody About about) {
        Integer aboutId = as.addNewAbout(about);
        return new ResponseEntity<>(as.getAboutById(aboutId), HttpStatus.CREATED);
    }

    @PutMapping("/about")
    public ResponseEntity<About> updateAboutById(@RequestBody About about) {
        About updatedAbout = as.updateAboutById(about);
        return new ResponseEntity<>(updatedAbout, HttpStatus.CREATED);
    }

}
