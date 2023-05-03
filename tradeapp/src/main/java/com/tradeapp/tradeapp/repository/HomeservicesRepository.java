package com.tradeapp.tradeapp.repository;


import com.tradeapp.tradeapp.model.Homeservices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeservicesRepository extends CrudRepository<Homeservices, Integer> {

    List<Homeservices> findAll();
}
