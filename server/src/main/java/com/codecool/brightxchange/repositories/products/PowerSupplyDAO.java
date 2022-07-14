package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.PowerSupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyDAO extends JpaRepository<PowerSupply, Long> {
}
