package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageDAO extends JpaRepository<Storage, Long> {
}
