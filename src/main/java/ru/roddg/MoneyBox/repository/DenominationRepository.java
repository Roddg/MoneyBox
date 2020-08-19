package ru.roddg.MoneyBox.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
import ru.roddg.MoneyBox.entity.Denomination;

import java.util.*;

@Repository
public interface DenominationRepository extends CassandraRepository<Denomination, Long> {

    @Query("select * from moneyboxkeyspace.skills where title = ?0 ALLOW FILTERING")
    Optional<Denomination> findByTitle(String title);
}
