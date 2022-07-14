package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDAO extends JpaRepository<Supplier, Long> {
}
