package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.DesktopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("DesktopService")
public class DesktopService {

    @Autowired
    @Qualifier("DesktopMemory")
    private DesktopDAO desktopDAO;

}
