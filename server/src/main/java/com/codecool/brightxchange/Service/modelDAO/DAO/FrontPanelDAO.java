package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.productRelated.FrontPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontPanelDAO extends JpaRepository<FrontPanel, Long> {
}
