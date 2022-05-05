package com.group.springdatarestaurant.service;

import com.group.springdatarestaurant.entity.Manager;
import com.group.springdatarestaurant.repository.CustomerRepository;
import com.group.springdatarestaurant.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository repository;

    public Manager SaveManager(Manager manager){
       return repository.save(manager);
    }

    public List<Manager>getManagers(){
        return repository.findAll();
    }
    public Manager getManagerById(Integer id){
        return repository.findById(id).orElse(null);
    }
    public Manager getManagerByName(String name){
        return repository.findByName(name);
    }
    public String deleteManager(Integer id){
        repository.deleteById(id);
        return "Manager removed !!";
    }

}
