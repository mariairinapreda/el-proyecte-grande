package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.HddDAO;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("HddService")
public class HddService {
    @Autowired
    @Qualifier("HddMemory")
    private HddDAO hddDAO;
}
