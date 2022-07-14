package com.codecool.brightxchange.repositories.types;

import com.codecool.brightxchange.model.productTypes.CaseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CaseTypeDAO extends JpaRepository<CaseType,Long> {
    List<CaseType> findCaseTypesByIdAfter(Long id);


}
