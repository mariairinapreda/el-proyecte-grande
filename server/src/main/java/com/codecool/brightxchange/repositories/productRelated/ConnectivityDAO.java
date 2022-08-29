package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectivityDAO extends JpaRepository<Connectivity, Long> {

    @Modifying
    @Query("update Connectivity c set  c.type= :type  where c.id= :id ")
    void update(@Param("id") long id, @Param("type")String type);

}
