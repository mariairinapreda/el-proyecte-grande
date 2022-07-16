package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.DesktopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DesktopService")
public class DesktopService {

    private final DesktopDAO desktopDAO;

    public DesktopService(DesktopDAO desktopDAO) {
        this.desktopDAO = desktopDAO;
    }
}
