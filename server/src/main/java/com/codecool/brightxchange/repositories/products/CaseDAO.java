package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
import com.codecool.brightxchange.model.products.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CaseDAO extends JpaRepository<Case, Long> {
    Set<Case> getAllByQuantityAfter();

    @Modifying
    @Query("update Case c set  c.currency= :currency, " +
            "c.price= :price," +
            " c.quantity= :quantity," +
            "c.model= :model," +
            " c.numberOfHDD= :numberOfHDD," +
            " c.numberOfSSD= :numberOfSSD where c.id= :id ")
    void update(@Param("id") long id,
                @Param("currency") PriceCurrency currency,
                @Param("price")Float price,
                @Param("quantity")int quantity,
                @Param("model")String model,
                @Param("numberOfHDD")int numberOfHDD,
                @Param("numberOfSSD")int numberOfSSD);

    @Modifying
    @Query("update Case c set c.caseType= :caseType  where c.id= :id ")
    void updateCaseType(@Param("id") long id, @Param("caseType")CaseType caseType);

    @Modifying
    @Query("update Case c set c.caseProducer= :caseProducer  where c.id= :id ")
    void updateCaseProducer(@Param("id") long id, @Param("caseProducer")CaseProducer caseProducer);


    @Modifying
    @Query("update Case c set c.supplier= :supplier  where c.id= :id ")
    void updateSupplier(@Param("id") long id, @Param("Supplier") Supplier supplier);

}
