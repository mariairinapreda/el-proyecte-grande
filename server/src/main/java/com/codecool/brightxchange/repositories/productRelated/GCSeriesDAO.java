package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GCSeriesDAO extends JpaRepository<ChipsetProducer, Long> {
}
