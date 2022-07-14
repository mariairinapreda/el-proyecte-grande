package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.GraphicsCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardDAO extends JpaRepository<GraphicsCard, Long> {
}
