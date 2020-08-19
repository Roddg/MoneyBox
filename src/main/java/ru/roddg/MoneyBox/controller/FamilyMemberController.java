package ru.roddg.MoneyBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.roddg.MoneyBox.entity.FamilyMember;
import ru.roddg.MoneyBox.service.FamilyService;

import java.util.*;

@RestController
@RequestMapping("/familymembers")
public class FamilyMemberController {

    private FamilyService familyService;

    @Autowired
    public FamilyMemberController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody FamilyMember familymembers) {
        return ResponseEntity.ok(familyService.save(familymembers));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Optional<FamilyMember> byId = familyService.findById(id);
        return Objects.isNull(byId)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(byId);
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(familyService.findAll());
    }
}
