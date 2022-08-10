package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.codecool.brightxchange.model.products.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopDAO extends JpaRepository<Desktop, Long> {

    @Modifying
    @Query("update Desktop d set  d.quantity= :quantity, " +
            " d.description= :description," +
            "d.price= :price," +
            " d.currency= :currency" +
            " where d.id= :id ")
    void update(@Param("id") long id,
                @Param("currency") PriceCurrency currency,
                @Param("price")Float price,
                @Param("quantity")int quantity);

    @Modifying
    @Query("update Desktop d set d.supplier= :supplier  where d.id= :id ")
    void updateSupplier(@Param("id") long id, @Param("supplier") Supplier supplier);

    @Modifying
    @Query("update Desktop d set d.backPanel= :backPanel  where d.id= :id ")
    void updateBackPanel(@Param("id") long id, @Param("backPanel") MotherBoardBackPanel backPanel);



    @Modifying
    @Query("update Desktop d set d.connectivity= :connectivity  where d.id= :id ")
    void updateConnectivity(@Param("id") long id, @Param("connectivity") Connectivity connectivity);

    @Modifying
    @Query("update Desktop d set d.coolingSystem= :coolingSystem  where d.id= :id ")
    void updateCoolingSystem(@Param("id") long id, @Param("coolingSystem") CoolingSystem coolingSystem);


    @Modifying
    @Query("update Desktop d set d.frontPanel= :frontPanel  where d.id= :id ")
    void updateFrontPanel(@Param("id") long id, @Param("frontPanel") FrontPanel frontPanel);

    @Modifying
    @Query("update Desktop d set d.desktopCase= :desktopCase  where d.id= :id ")
    void updateCase(@Param("id") long id, @Param("desktopCase") Case desktopCase);

    @Modifying
    @Query("update Desktop d set d.graphicsCard= :graphicsCard  where d.id= :id ")
    void updateGraphicsCard(@Param("id") long id, @Param("graphicsCard") GraphicsCard graphicsCard);

    @Modifying
    @Query("update Desktop d set d.memory= :memory  where d.id= :id ")
    void updateMemory(@Param("id") long id, @Param("memory") RandomAccessMemory memory);

    @Modifying
    @Query("update Desktop d set d.motherboard= :motherboard  where d.id= :id ")
    void updateMotherBoard(@Param("id") long id, @Param("motherboard") Motherboard motherboard);

    @Modifying
    @Query("update Desktop d set d.powerSupply= :powerSupply  where d.id= :id ")
    void updatePowerSupply(@Param("id") long id, @Param("powerSupply") PowerSupply powerSupply);

    @Modifying
    @Query("update Desktop d set d.processor= :processor  where d.id= :id ")
    void updateProcessor(@Param("id") long id, @Param("processor") Processor processor);

    @Modifying
    @Query("update Desktop d set d.storage= :storage  where d.id= :id ")
    void updateStorage(@Param("id") long id, @Param("storage") Storage storage);


}



