package ru.roddg.MoneyBox.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.roddg.MoneyBox.entity.FamilyMember;

@Repository
public interface FamilyMemberRepository extends CassandraRepository<FamilyMember, Long> {

}
