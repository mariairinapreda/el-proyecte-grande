package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.FrontPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontPanelDAO extends JpaRepository<FrontPanel, Long> {

    @Modifying
    @Query("update FrontPanel fp set  fp.numberOfHeadphonesJack= :numberOfHeadphonesJack," +
            "fp.numberOfMicrophoneJack= :numberOfMicrophoneJack," +
            "fp.numberOfUSB2= :numberOfUSB2," +
            "fp.numberOfUSB3= :numberOfUSB3" +
            "  where fp.id= :id ")
    void update(@Param("id") long id,
                @Param("numberOfHeadphonesJack")int numberOfHeadphonesJack,
                @Param("numberOfMicrophoneJack")int numberOfMicrophoneJack,
                @Param("numberOfUSB2")int numberOfUSB2,
                @Param("numberOfUSB3")int numberOfUSB3);

}
