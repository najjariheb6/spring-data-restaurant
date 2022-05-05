package com.group.springdatarestaurant.controller;

import com.group.springdatarestaurant.entity.Manager;
import com.group.springdatarestaurant.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    private ManagerService service;

    @PostMapping("/addmanager")
    public Manager addManager(@RequestBody Manager manager){
        return service.SaveManager(manager);
    }
    @GetMapping("/getmanagers")
    public List<Manager>findAllManagers(){
        return service.getManagers();
    }
}
