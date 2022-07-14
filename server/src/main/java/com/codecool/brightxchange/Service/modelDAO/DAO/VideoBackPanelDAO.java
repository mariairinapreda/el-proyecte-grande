package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoBackPanelDAO extends JpaRepository<VideoBackPanel, Long> {
}
