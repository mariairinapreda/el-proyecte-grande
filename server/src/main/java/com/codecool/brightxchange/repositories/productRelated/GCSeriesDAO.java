package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.productRelated.GCSeries;
import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GCSeriesDAO extends JpaRepository<GCSeries, Long> {
    @Modifying
    @Query("update GCSeries g set g.name= :name  where g.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);


    @Modifying
    @Query("update GCSeries gr set gr.family= :family  where gr.id= :id ")
    void updateGraphicsCardFamily(@Param("id") long id, @Param("family") GraphicsCardFamily graphicsCardFamily);

}
