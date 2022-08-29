package com.codecool.brightxchange.repositories.types;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomAccessMemoryTypeDAO extends JpaRepository<RandomAccessMemoryType, Long> {


    @Modifying
    @Query("update RandomAccessMemoryType ram set ram.name= :name where ram.id= :id")
    void update(@Param("id") long id, @Param("name")String name);



}
