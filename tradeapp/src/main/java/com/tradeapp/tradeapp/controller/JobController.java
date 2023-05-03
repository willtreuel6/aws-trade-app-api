package com.tradeapp.tradeapp.controller;


import com.tradeapp.tradeapp.model.Job;
import com.tradeapp.tradeapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JobController {

    @Autowired
    private JobService js;

    @GetMapping("/job")
    public ResponseEntity<List<Job>> getAllJob(){
        return ResponseEntity.status(HttpStatus.OK).body(js.getAllJob());
    }

    @GetMapping("/job/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Integer id){
        return new ResponseEntity<>(js.getJobById(id), HttpStatus.OK);
    }

    @GetMapping("/justomer/{id}")
    public ResponseEntity<List<Job>> getJobByCustomerId(@PathVariable String id){
        return new ResponseEntity<>(js.getJobByCustomerId(id), HttpStatus.OK);
    }


    @DeleteMapping("/job/{id}")
    public ResponseEntity<Void> deleteJobById(@PathVariable Integer id){
        js.deleteJobById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/job")
    public ResponseEntity<Job> addNewJob(@RequestBody Job job){
        Integer jobId = js.addNewJob(job);
        return new ResponseEntity<>(js.getJobById(jobId), HttpStatus.CREATED);
    }

    @PutMapping("/job")
    public ResponseEntity<Job> updateJobById(@RequestBody Job job){
        Job updatedJob = js.updateJobById(job);
        return new ResponseEntity<>(updatedJob, HttpStatus.CREATED);
    }
}
