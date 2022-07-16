package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GCModelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GCModelService")
public class GCModelService{
    private final GCModelDAO gcModelDAO;

    public GCModelService(GCModelDAO gcModelDAO) {
        this.gcModelDAO = gcModelDAO;
    }
}
