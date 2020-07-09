package com.sha.webredisapi.service;

import com.sha.webredisapi.model.Person;
import com.sha.webredisapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPerson(){
       return personRepository.findAll();
    }

}
