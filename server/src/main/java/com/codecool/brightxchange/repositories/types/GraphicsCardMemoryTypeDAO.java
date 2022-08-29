package com.codecool.brightxchange.repositories.types;

import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardMemoryTypeDAO extends JpaRepository<GraphicsCardMemoryType, Long> {
    @Modifying
    @Query("update GraphicsCardMemoryType g set  g.name= :name  where g.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);



}
