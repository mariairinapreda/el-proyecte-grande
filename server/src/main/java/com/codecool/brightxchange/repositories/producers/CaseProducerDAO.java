package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.producers.CaseProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseProducerDAO  extends JpaRepository<CaseProducer, Long> {

    @Modifying
    @Query("update CaseProducer cp set  cp.name= :name  where cp.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);

}
