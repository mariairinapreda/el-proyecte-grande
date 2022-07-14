package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.productRelated.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayDAO extends JpaRepository<Display, Long> {
}
