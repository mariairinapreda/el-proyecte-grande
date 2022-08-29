package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoolingSystemDAO extends JpaRepository<CoolingSystem, Long> {

    @Modifying
    @Query("update CoolingSystem cs set  cs.type= :type  where cs.id= :id ")
    void update(@Param("id") long id, @Param("type")String type);

}
