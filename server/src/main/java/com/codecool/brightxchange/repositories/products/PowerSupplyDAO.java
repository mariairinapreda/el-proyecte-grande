package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.codecool.brightxchange.model.products.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyDAO extends JpaRepository<PowerSupply, Long> {
    @Modifying
    @Query("update PowerSupply ps set" +
            " ps.price= :price," +
            " ps.quantity = :quantity," +
            " ps.certification = :certification," +
            " ps.power = :power" +
            " where ps.id= :id ")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("quantity") Integer quantity,
                @Param("certification") String certification,
                @Param("power") Integer power
    );

    @Modifying
    @Query("update PowerSupply ps set ps.supplier = :supplier where ps.id = :id")
    void updateSupplier(@Param("id") long id,
                        @Param("supplier") Supplier supplier);


    @Modifying
    @Query("update PowerSupply ps set ps.powerSupplyProducer = :powerSupplyProducer where ps.id = :id")
    void updatePowerSupplyProducer(@Param("id") long id,
                                   @Param("powerSupplyProducer")PowerSupplyProducer powerSupplyProducer);


    @Modifying
    @Query("update PowerSupply ps set ps.powerSupplyType = :powerSupplyType where ps.id = :id")
    void updatePowerSupplyType(@Param("id") long id,
                               @Param("powerSupplyType")PowerSupplyType powerSupplyType);
}
