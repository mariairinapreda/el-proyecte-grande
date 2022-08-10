package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.products.Cooler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Currency;

@Repository
public interface CoolerDAO extends JpaRepository<Cooler, Long> {
    @Modifying
    @Query("update Cooler c set  c.description= :description," +
            " c.quantity= :quantity, " +
            "c.price= :price," +
            " c.currency= :currency, " +
            "c.dimensions= :dimensions where c.id= :id ")
    void update(@Param("id") long id,
                @Param("description") String description,
                @Param("currency") PriceCurrency currency,
                @Param("dimensions") String dimensions,
                @Param("price") Float price,
                @Param("quantity")int quantity);

    @Modifying
    @Query("update Cooler c set c.supplier= :supplier  where c.id= :id ")
    void updateSupplier(@Param("id") long id, @Param("supplier") Supplier supplier);


}
