package com.tradeapp.tradeapp.repository;


import com.tradeapp.tradeapp.model.Hometext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HometextRepository extends CrudRepository<Hometext, Integer> {

    List<Hometext> findAll();
}
