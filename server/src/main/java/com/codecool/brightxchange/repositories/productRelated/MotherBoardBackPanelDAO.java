package com.codecool.brightxchange.repositories.productRelated;

import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherBoardBackPanelDAO extends JpaRepository<MotherBoardBackPanel, Long> {
}
