package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Homeservices;
import com.tradeapp.tradeapp.model.Job;
import com.tradeapp.tradeapp.service.HomeservicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeservicesController {

    @Autowired
    private HomeservicesService hs;

    @GetMapping("/homeservices")
    public ResponseEntity<List<Homeservices>> getAllHomeServices(){
        return ResponseEntity.status(HttpStatus.OK).body(hs.getAllHomeServices());
    }

    @GetMapping("/homeservices/{id}")
    public ResponseEntity<Homeservices> getHomeServiceById(@PathVariable Integer id){
        return new ResponseEntity<>(hs.getHomeServiceById(id), HttpStatus.OK);
    }

    @DeleteMapping("/homeservices/{id}")
    public ResponseEntity<Void> deleteHomeServiceById(@PathVariable Integer id){
        hs.deleteHomeServiceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/homeservices")
    public ResponseEntity<Homeservices> addNewHomeService(@RequestBody Homeservices homeservices){
        Integer homeservicesId = hs.addNewHomeService(homeservices);
        return new ResponseEntity<>(hs.getHomeServiceById(homeservicesId), HttpStatus.CREATED);
    }

    @PutMapping("/homeservices")
    public ResponseEntity<Homeservices> updateHomeServicesById(@RequestBody Homeservices homeservices){
        Homeservices updatedHomeservices = hs.updateHomeServiceById(homeservices);
        return new ResponseEntity<>(updatedHomeservices, HttpStatus.CREATED);
    }

}
