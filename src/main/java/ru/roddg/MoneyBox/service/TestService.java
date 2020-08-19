package ru.roddg.MoneyBox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.roddg.MoneyBox.entity.Test;
import ru.roddg.MoneyBox.repository.TestRepository;

import java.util.*;

@Service
public class TestService{

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Test save(Test test) {
        return testRepository.save(test);
    }

    public Optional<Test> findById(Long id) {
        return testRepository.findById(id);
    }

    public List<Test> findAll() {
        return testRepository.findAll();
    }

}
