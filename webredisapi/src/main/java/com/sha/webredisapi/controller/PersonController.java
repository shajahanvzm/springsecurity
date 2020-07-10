package com.sha.webredisapi.controller;

import com.sha.webredisapi.model.Hello;
import com.sha.webredisapi.model.Person;
import com.sha.webredisapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("person")
    @Cacheable(value = "person")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("hello")
    public Hello getHello() {
        return new Hello("Hello");
    }


}
