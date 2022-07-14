package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardFamilyDAO extends JpaRepository<GraphicsCardFamily, Long> {
}
