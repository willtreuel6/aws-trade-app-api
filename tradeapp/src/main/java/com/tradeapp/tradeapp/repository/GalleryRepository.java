package com.tradeapp.tradeapp.repository;

import com.tradeapp.tradeapp.model.Employee;
import com.tradeapp.tradeapp.model.Gallery;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GalleryRepository extends CrudRepository<Gallery,Integer > {
    List<Gallery> findAll();
}
