package ru.roddg.MoneyBox.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.util.*;

@Table("persons")
public class Person {

    @Id
    @PrimaryKeyColumn(
            name = "id",
            ordinal = 2,
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING
    )
    @Getter
    @Setter
    private Long id;


    @Getter
    @Setter
    private String name;

    @CassandraType(type = CassandraType.Name.LIST, typeArguments = {CassandraType.Name.UDT}, userTypeName = "familymembers")
    @Getter
    @Setter
    private List<FamilyMember> memberList;

    @CassandraType(type = CassandraType.Name.LIST, typeArguments = {CassandraType.Name.UDT}, userTypeName = "denominations")
    @Getter
    @Setter
    private List<Denomination> denominationList;
}
