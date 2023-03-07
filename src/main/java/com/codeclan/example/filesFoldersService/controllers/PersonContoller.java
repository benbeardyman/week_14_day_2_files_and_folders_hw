package com.codeclan.example.filesFoldersService.controllers;

import com.codeclan.example.filesFoldersService.models.Person;
import com.codeclan.example.filesFoldersService.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonContoller {
    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public List<Person>getAllPeople(){
        return personRepository.findAll();
    }
}
