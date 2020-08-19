package ru.roddg.MoneyBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.roddg.MoneyBox.service.CurrencyService;
import ru.roddg.MoneyBox.entity.Currency;

import java.util.*;

@RestController
@RequestMapping("/currencys")
public class CurrencyController {

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService questionService) {
        this.currencyService = questionService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Currency currency) {
        return ResponseEntity.ok(currencyService.save(currency));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<Currency> byId = currencyService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(currencyService.findAll());
    }
}

