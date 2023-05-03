package com.tradeapp.tradeapp.repository;


import com.tradeapp.tradeapp.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

    @Override
    List<Admin> findAll();
}
