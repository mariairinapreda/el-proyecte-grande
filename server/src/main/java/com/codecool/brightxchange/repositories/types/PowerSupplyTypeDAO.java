package com.codecool.brightxchange.repositories.types;

import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyTypeDAO extends JpaRepository<PowerSupplyType, Long> {
    @Modifying
    @Query("update PowerSupplyType p set  p.name= :name  where p.id= :id ")
    void update(@Param("id") long id, @Param("name")String name);



}
