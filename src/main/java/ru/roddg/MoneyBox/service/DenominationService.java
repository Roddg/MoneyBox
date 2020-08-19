package ru.roddg.MoneyBox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.roddg.MoneyBox.entity.Denomination;
import ru.roddg.MoneyBox.repository.DenominationRepository;

import java.util.*;

@Service
public class DenominationService {

    private DenominationRepository denominationRepository;

    @Autowired
    public DenominationService(DenominationRepository denominationRepository) {
        this.denominationRepository = denominationRepository;
    }

    public Denomination save(Denomination skill) {
        return denominationRepository.save(skill);
    }

    public Optional<Denomination> findById(Long id) {
        return denominationRepository.findById(id);
    }

    public List<Denomination> findAll() {
        return denominationRepository.findAll();
    }

    public Denomination findByTitle(String title) {
        return denominationRepository.findByTitle(title).orElse(null);
    }
}
