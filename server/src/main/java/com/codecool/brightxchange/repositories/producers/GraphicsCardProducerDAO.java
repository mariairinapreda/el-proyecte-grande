package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardProducerDAO extends JpaRepository<GraphicsCardProducer, Long> {

    @Modifying
    @Query("update GraphicsCardProducer gcp set gcp.name= :name  where gcp.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);

}
