package com.tradeapp.tradeapp.repository;


import com.tradeapp.tradeapp.model.Contactus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactusRepository extends CrudRepository<Contactus, Integer> {

    List<Contactus> findAll();

}
