package ru.roddg.MoneyBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.roddg.MoneyBox.entity.Test;
import ru.roddg.MoneyBox.service.TestService;

import java.util.*;

@RestController
@RequestMapping("/tests")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Test test) {
        return ResponseEntity.ok(testService.save(test));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Test> byId = testService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);

    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(testService.findAll());
    }
}
