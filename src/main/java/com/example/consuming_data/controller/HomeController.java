package com.example.consuming_data.controller;

import com.example.consuming_data.model.User;
import com.example.consuming_data.service.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ServiceLayer serviceLayer;

    @Autowired
    public HomeController(ServiceLayer sl) {
        this.serviceLayer = sl;
    }

    @GetMapping("/")
    public ResponseEntity<User> getData() {
        return new ResponseEntity<>(serviceLayer.consumerAPI(), HttpStatus.OK);
    }
}
