package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardDAO extends JpaRepository<Motherboard, Long> {
}
