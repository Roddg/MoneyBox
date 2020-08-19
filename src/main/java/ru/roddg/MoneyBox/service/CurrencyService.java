package ru.roddg.MoneyBox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.roddg.MoneyBox.entity.Currency;
import ru.roddg.MoneyBox.repository.CurrencyRepository;

import java.util.*;

@Service
public class CurrencyService {

    private CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public Currency save(Currency currency) {
        return currencyRepository.save(currency);
    }

    public Optional<Currency> findById(Long id) {
        return currencyRepository.findById(id);
    }

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }
}
