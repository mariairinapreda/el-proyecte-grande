package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.HDD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HddDAO extends JpaRepository<HDD, Long> {
    @Modifying
    @Query("update HDD h set  h.quantity= :quantity, " +
            "h.price= :price," +
            " h.currency= :currency," +
            "h.connectionInterface= :connectionInterface," +
            "h.rotationSpeed= :rotationSpeed" +
            " where h.id= :id ")
    void update(@Param("id") long id,
                @Param("quantity") int quantity,
                @Param("price")Float price,
                @Param("currency")PriceCurrency currency,
                @Param("connectionInterface")String connectionInterface,
                @Param("rotationSpeed")int rotationSpeed);

    @Modifying
    @Query("update HDD h set h.supplier= :supplier  where h.id= :id ")
    void updateSupplier(@Param("id") long id, @Param("supplier") Supplier supplier);


}



