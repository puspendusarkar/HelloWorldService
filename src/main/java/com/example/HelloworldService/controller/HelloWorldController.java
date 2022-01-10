package com.example.HelloworldService.controller;

import com.example.HelloworldService.dto.Person;
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
    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getPerson(){
        Person person1=new Person(1,"Susanta");
        Person person2=new Person(2,"Sorav");
        Person person3=new Person(3,"Sumit");
        List<Person>  persons=new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
    }

}
