package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GCConnectionInterfaceDAO extends JpaRepository<GCConnectionInterface, Long> {

    @Modifying
    @Query("update GCConnectionInterface g set  g.name= :name  where g.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);

}
