package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GCConnectionInterfaceDAO extends JpaRepository<GCConnectionInterface, Long> {
}
