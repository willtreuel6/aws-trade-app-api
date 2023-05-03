package com.tradeapp.tradeapp.repository;

import com.tradeapp.tradeapp.model.About;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AboutRepository extends CrudRepository<About, Integer> {

    List<About> findAll();
}
