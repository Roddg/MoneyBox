package ru.roddg.MoneyBox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.roddg.MoneyBox.entity.FamilyMember;
import ru.roddg.MoneyBox.repository.FamilyMemberRepository;

import java.util.*;

@Service
public class FamilyService {

    private FamilyMemberRepository familyMemberRepository;

    @Autowired
    public FamilyService(FamilyMemberRepository familyMemberRepository) {
        this.familyMemberRepository = familyMemberRepository;
    }

    public FamilyMember save(FamilyMember language) {
        return familyMemberRepository.save(language);
    }

    public Optional<FamilyMember> findById(Long id) {
        return familyMemberRepository.findById(id);
    }

    public List<FamilyMember> findAll() {
        return familyMemberRepository.findAll();
    }
}

