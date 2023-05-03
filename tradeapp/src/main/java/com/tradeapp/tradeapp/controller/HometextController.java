package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Customer;
import com.tradeapp.tradeapp.model.Hometext;
import com.tradeapp.tradeapp.service.HometextService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HometextController {

    @Autowired
    private HometextService hs;

    @GetMapping("/hometext")
    public ResponseEntity<List<Hometext>> getAllHomeText(){
        return ResponseEntity.status(HttpStatus.OK).body(hs.getAllHomeText());
    }

    @GetMapping("/hometext/{id}")
    public ResponseEntity<Hometext> getHomeTextById(@PathVariable Integer id){
        return new ResponseEntity<>(hs.getHomeTextById(id), HttpStatus.OK);
    }

    @DeleteMapping("/hometext/{id}")
    public ResponseEntity<Void> deleteHomeTextById(@PathVariable Integer id){
        hs.deleteHomeTextById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*
    @PostMapping("/hometext")
    public ResponseEntity<Hometext> addNewHomeText(@RequestBody Hometext hometext){
        Integer hometextId = hs.addNewHometext(hometext);
        return new ResponseEntity<>(hs.getHomeTextById(hometextId), HttpStatus.CREATED);
    }
    */


    @PutMapping("/hometext")
    public ResponseEntity<Hometext> updateHomeTextById(@RequestBody Hometext hometext){
        Hometext updatedHometext = hs.updateHomeTextById(hometext);
        return new ResponseEntity<>(updatedHometext, HttpStatus.CREATED);
    }
}
