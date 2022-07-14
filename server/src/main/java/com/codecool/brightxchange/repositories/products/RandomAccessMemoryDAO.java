package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.RandomAccessMemory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomAccessMemoryDAO extends JpaRepository<RandomAccessMemory, Long> {
}
