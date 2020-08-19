package ru.roddg.MoneyBox.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.roddg.MoneyBox.entity.Test;

@Repository
public interface TestRepository extends CassandraRepository<Test, Long> {

}
