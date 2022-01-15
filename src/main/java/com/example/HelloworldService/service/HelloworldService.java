package com.example.HelloworldService.service;

import com.example.HelloworldService.dto.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloworldService {

    public List<Person> getAllPersons(){
        Person person1=new Person(1,"Susanta Chaterjee");
        Person person2=new Person(2,"Sorav Das");
        Person person3=new Person(3,"Sumit Saha");
        Person person4=new Person(4,"Amit Kumar");
        List<Person>  persons=new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        return persons;
    }

}
