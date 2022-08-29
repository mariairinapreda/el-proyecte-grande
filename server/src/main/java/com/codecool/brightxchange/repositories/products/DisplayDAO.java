package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.productRelated.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayDAO extends JpaRepository<Display, Long> {

    @Modifying
    @Query("update Display d set  d.diagonal= :diagonal,  " +
            " d.refreshRate= :refreshRate," +
            "d.resolution= :resolution" +
            " where d.id= :id ")
    void update(@Param("id") long id,
                @Param("diagonal") Float diagonal,
                @Param("refreshRate") int refreshRate,
                @Param("resolution")String resolution);
}



