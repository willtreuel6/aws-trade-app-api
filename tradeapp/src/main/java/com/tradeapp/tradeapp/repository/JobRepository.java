package com.tradeapp.tradeapp.repository;


import com.tradeapp.tradeapp.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {

    List<Job> findAll();
}
