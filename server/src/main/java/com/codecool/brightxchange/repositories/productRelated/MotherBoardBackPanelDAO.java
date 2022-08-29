package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherBoardBackPanelDAO extends JpaRepository<MotherBoardBackPanel, Long> {

    @Modifying
    @Query("update MotherBoardBackPanel mb set mb.numberOfDisplayPort= :numberOfDisplayPort, " +
            "mb.numberOfHDMI= :numberOfHDMI," +
            "mb.numberOfRJ45= :numberOfRJ45," +
            "mb.numberOfUSB2= :numberOfUSB2," +
            "mb.numberOfUSB3_1_A= :numberOfUSB3_1_A," +
            "mb.numberOfUSB3_2_A= :numberOfUSB3_2_A," +
            "mb.numberOfUSB3_2_B= :numberOfUSB3_2_B " +
            "  where mb.id= :id ")
    void update(@Param("id") long id,
                @Param("numberOfDisplayPort")int numberOfDisplayPort,
                @Param("numberOfHDMI") int numberOfHDMI,
                @Param("numberOfRJ45")int numberOfRJ45,
                @Param("numberOfUSB2")int numberOfUSB2,
                @Param("numberOfUSB3_1_A")int numberOfUSB3_1_A,
                @Param("numberOfUSB3_2_A")int numberOfUSB3_2_A,
                @Param("numberOfUSB3_2_B")int numberOfUSB3_2_B
                );


}
