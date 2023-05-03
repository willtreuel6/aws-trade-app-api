package com.tradeapp.tradeapp.service;


import com.tradeapp.tradeapp.error.BodyMissingRequiredPropertiesException;
import com.tradeapp.tradeapp.model.Job;
import com.tradeapp.tradeapp.repository.JobRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JobService {

    @Autowired
    private JobRepository jr;

    public int addNewJob(@Valid Job job){
        if(job.getJobId() != null && jr.findById(job.getJobId()).isPresent()){
            String errMsg = String.format("Job with ID number %d already exist use PUT to update", job.getJobId());
            throw new EntityExistsException(errMsg);
        }
        return jr.save(job).getJobId();
    }

    public List<Job> getAllJob(){
        return jr.findAll();
    }

    public List<Job> getJobByCustomerId(String id){
        List<Job> listOfJobs = new ArrayList<Job>();
        listOfJobs = jr.findAll();
        List<Job> listOfJobsFinal = new ArrayList<Job>();
        for(int i = 0;i < listOfJobs.size();i++){
            if(listOfJobs.get(i).getJobCustomerId().equals(id)){
                listOfJobsFinal.add(listOfJobs.get(i));
            }
        }
//        for(int i = 0;i < listOfJobs.size();i++){
//            listOfJobsFinal.add(listOfJobs.get(i));
//        }

        return listOfJobsFinal;
    }

    public void deleteJobById(Integer id){
        jr.deleteById(id);
    }

    public Job updateJobById(@Valid Job job){
        if(job.getJobId() == null)
            throw new BodyMissingRequiredPropertiesException("To update job you must include the ID in the body.");
        if(jr.findById(job.getJobId()).isEmpty())
            throw new NoSuchElementException(String.format("A job with ID %d does not exist so it cant be updated.", job.getJobId()));
        return jr.save(job);
    }

    public Job getJobById(Integer id){
        return jr.findById(id).orElseThrow(() -> new NoSuchElementException("Job not found"));
    }
}
