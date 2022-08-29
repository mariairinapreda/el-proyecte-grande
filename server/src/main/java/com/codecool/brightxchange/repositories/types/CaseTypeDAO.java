package com.codecool.brightxchange.repositories.types;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productTypes.CaseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CaseTypeDAO extends JpaRepository<CaseType,Long> {
    List<CaseType> findCaseTypesByIdAfter(Long id);

    @Modifying
    @Query("update CaseType c set c.name= :name  where c.id= :id ")
    void update(@Param("id") long id, @Param("name") String name);


}
