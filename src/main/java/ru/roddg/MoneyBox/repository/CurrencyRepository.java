package ru.roddg.MoneyBox.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.roddg.MoneyBox.entity.Currency;

@Repository
public interface CurrencyRepository extends CassandraRepository<Currency, Long> {

}
