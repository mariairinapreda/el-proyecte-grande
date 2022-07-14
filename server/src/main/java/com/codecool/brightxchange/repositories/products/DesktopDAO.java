package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.products.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopDAO extends JpaRepository<Desktop, Long> {
}
