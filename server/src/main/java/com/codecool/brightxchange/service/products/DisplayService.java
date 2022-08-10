package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.repositories.products.DisplayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DisplayService")
public class DisplayService {
    private final DisplayDAO displayDAO;

    public DisplayService(DisplayDAO displayDAO) {
        this.displayDAO = displayDAO;
    }

    public void addDisplay(Display display) {
        displayDAO.save(display);
    }

    public List<Display> getAll() {
        return displayDAO.findAll();
    }

    public Optional<Display> getDisplayById(long id) {
        return displayDAO.findById(id);
    }

    public void updateDisplay(long id, Display display) {
        displayDAO.update(id, display.getDiagonal(), display.getRefreshRate(), display.getResolution());
    }


}
