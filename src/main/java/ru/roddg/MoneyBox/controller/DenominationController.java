package ru.roddg.MoneyBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.roddg.MoneyBox.entity.Denomination;
import ru.roddg.MoneyBox.service.DenominationService;

import java.util.*;

@RestController
@RequestMapping("/denominations")
public class DenominationController {

    private DenominationService denominationService;

    @Autowired
    public DenominationController(DenominationService skillService) {
        this.denominationService = denominationService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Denomination denomination) {
        return ResponseEntity.ok(denominationService.save(denomination));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Denomination> byId = denominationService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(denominationService.findAll());
    }

    @GetMapping("/by/{title}")
    public ResponseEntity findByTitle(@PathVariable String title) {
        Denomination byTitle = denominationService.findByTitle(title);
        return Objects.isNull(byTitle)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byTitle);
    }
}
