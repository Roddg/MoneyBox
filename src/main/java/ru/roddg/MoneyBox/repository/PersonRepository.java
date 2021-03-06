package ru.roddg.MoneyBox.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.roddg.MoneyBox.entity.Person;
    
@Repository
public interface PersonRepository extends CassandraRepository<Person, Long> {

}
