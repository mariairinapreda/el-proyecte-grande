package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardFamilyDAO extends JpaRepository<GraphicsCardFamily, Long> {


    @Modifying
    @Query("update GraphicsCardFamily gcf set  gcf.name= :name  where gcf.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);



}
