package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.DisplayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("DisplayService")
public class DisplayService implements DisplayDAO {
    @Autowired
    @Qualifier("DisplayMemory")
    private DisplayDAO displayDAO;
}
