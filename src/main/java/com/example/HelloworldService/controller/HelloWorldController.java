package com.example.HelloworldService.controller;

import com.example.HelloworldService.dto.Person;
import com.example.HelloworldService.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/hellowolrd")
public class HelloWorldController {
    @Autowired
    HelloworldService helloworldService;
    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getPerson(){

        List<Person>  persons=helloworldService.getAllPersons();

        return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
    }

}
