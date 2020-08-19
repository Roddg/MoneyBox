package ru.roddg.MoneyBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.roddg.MoneyBox.entity.Person;
import ru.roddg.MoneyBox.service.PersonService;

import java.util.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Person person) {
        return ResponseEntity.ok(personService.save(person));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Person> byId = personService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);

    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(personService.findAll());
    }
}
