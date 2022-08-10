package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.GCModel;
import com.codecool.brightxchange.repositories.productRelated.GCModelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GCModelService")
public class GCModelService{
    private final GCModelDAO gcModelDAO;

    public GCModelService(GCModelDAO gcModelDAO) {
        this.gcModelDAO = gcModelDAO;
    }

    public void addGraphicCardModel(GCModel gcModel){
        gcModelDAO.save(gcModel);
    }

    public List<GCModel> getAll(){
        return gcModelDAO.findAll();
    }

    public Optional<GCModel> getGCModelById(long id){
        return gcModelDAO.findById(id);
    }

    public void updateGCModel(long id, GCModel gcModel){
        gcModelDAO.update(id, gcModel.getName());
    }



}
