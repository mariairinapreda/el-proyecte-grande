package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.VentProducer;
import com.codecool.brightxchange.model.products.Vent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VentDAO extends JpaRepository<Vent, Long> {
    @Modifying
    @Query("update Vent v set" +
            " v.rotationSpeed= :rotationSpeed," +
            " v.currency= :currency," +
            " v.price= :price," +
            "v.quantity= :quantity," +
            "v.description= :description,"+
            "v.dimensions= :dimensions,"+
            "v.ventDimensions= :dimensions,"+
            "v.ventsNumber= :ventsNumber"+
            " where v.id= :id ")
    void update(@Param("id") long id,
                @Param("rotationSpeed") int rotationSpeed,
                @Param("currency") PriceCurrency currency,
                @Param("price") float price,
                @Param("quantity")int quantity,
                @Param("description") String description,
                @Param("dimensions")String dimensions,
                @Param("ventDimensions")int ventDimensions,
                @Param("ventsNumber")int ventsNumber);




    @Modifying
    @Query("update Vent  v set v.supplier = :supplier where v.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier") Supplier supplier);


    @Modifying
    @Query("update Vent  v set v.ventProducer = :ventProducer where v.id = :id")
    void updateProducer(@Param("id") float id,
                        @Param("ventProducer") VentProducer ventProducer);
}
