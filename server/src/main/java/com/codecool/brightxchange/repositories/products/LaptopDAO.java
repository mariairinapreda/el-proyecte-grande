package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDAO extends JpaRepository<Laptop, Long> {
}
