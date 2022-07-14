package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.PriceCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceCurrencyDAO extends JpaRepository<PriceCurrency, Long> {
}
