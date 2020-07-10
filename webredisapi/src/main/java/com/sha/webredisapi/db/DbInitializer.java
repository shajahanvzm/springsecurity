package com.sha.webredisapi.db;

import com.sha.webredisapi.model.Person;
import com.sha.webredisapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        personRepository.save(new Person("aaaa", "aaa", "aaa"));
        personRepository.save(new Person("bbbb", "bbb", "bbb"));
        personRepository.save(new Person("cccc", "ccc", "ccc"));
        personRepository.save(new Person("ddd", "ddd", "ddd"));
        personRepository.save(new Person("eee", "eee", "eee"));


    }
}
