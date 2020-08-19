package ru.roddg.MoneyBox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.roddg.MoneyBox.entity.Person;
import ru.roddg.MoneyBox.repository.PersonRepository;

import java.util.*;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
