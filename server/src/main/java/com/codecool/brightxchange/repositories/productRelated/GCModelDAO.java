package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.GCModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GCModelDAO extends JpaRepository<GCModel, Long> {


    @Modifying
    @Query("update GCModel gcm set gcm.name= :name  where gcm.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);

}
