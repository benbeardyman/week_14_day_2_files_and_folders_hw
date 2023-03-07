package com.codeclan.example.filesFoldersService.controllers;

import com.codeclan.example.filesFoldersService.models.Folder;
import com.codeclan.example.filesFoldersService.models.Person;
import com.codeclan.example.filesFoldersService.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonContoller {
    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public List<Person>getAllPeople(){
        return personRepository.findAll();
    }

    @GetMapping(value = "/people/{id}")
    public ResponseEntity<Optional<Person>> getPerson(@PathVariable Long id){
        Optional <Person> optionalPerson = personRepository.findById(id);
        if (optionalPerson.isPresent()){
            return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(optionalPerson, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/people")
    public ResponseEntity<Person>postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
