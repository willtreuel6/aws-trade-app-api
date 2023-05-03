package com.tradeapp.tradeapp.repository;
import com.tradeapp.tradeapp.model.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends CrudRepository<Services, Integer> {

    @Override
    List<Services> findAll();
}