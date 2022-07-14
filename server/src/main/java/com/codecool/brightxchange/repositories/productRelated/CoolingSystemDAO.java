package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoolingSystemDAO extends JpaRepository<CoolingSystem, Long> {
}
