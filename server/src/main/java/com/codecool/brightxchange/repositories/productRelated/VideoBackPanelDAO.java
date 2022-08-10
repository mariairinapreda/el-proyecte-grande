package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoBackPanelDAO extends JpaRepository<VideoBackPanel, Long> {

    @Modifying
    @Query("update VideoBackPanel vbp set vbp.numberOfDisplayPort= :numberOfDisplayPort," +
            "vbp.numberOfDVI= :numberOfDVI, " +
            "vbp.numberOfHDMI= :numberOfHDMI," +
            "vbp.numberOfJack= :numberOfJack," +
            "vbp.numberOfVGA= :numberOfVGA" +
            "  where vbp.id= :id ")
    void update(@Param("id") long id,
                @Param("numberOfDisplayPort")int numberOfDisplayPort,
                @Param("numberOfDVI")int numberOfDVI,
                @Param("numberOfHDMI") int numberOfHDMI,
                @Param("numberOfJack")int numberOfJack,
                @Param("numberOfVGA")int numberOfVGA);

}
