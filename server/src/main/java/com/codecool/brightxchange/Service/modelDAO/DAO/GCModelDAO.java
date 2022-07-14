package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.productRelated.GCModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GCModelDAO extends JpaRepository<GCModel, Long> {
}
