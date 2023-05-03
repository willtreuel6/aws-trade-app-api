package com.tradeapp.tradeapp.repository;

import com.tradeapp.tradeapp.model.Admin;
import com.tradeapp.tradeapp.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    @Override
    List<Contact> findAll();
}
