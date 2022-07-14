package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorDAO extends JpaRepository<Monitor, Long> {
}
