package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.HDD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HddDAO extends JpaRepository<HDD, Long> {
}
