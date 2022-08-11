package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.GCSeries;
import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import com.codecool.brightxchange.repositories.productRelated.GCSeriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GCSeriesService")
public class GCSeriesService {
    private final GCSeriesDAO gcSeriesDAO;

    public GCSeriesService(GCSeriesDAO gcSeriesDAO) {
        this.gcSeriesDAO = gcSeriesDAO;
    }

    public void addGCSeriesService(GCSeries gcSeries){
        gcSeriesDAO.save(gcSeries);
    }
    public List<GCSeries> getAll(){
        return gcSeriesDAO.findAll();
    }

    public Optional<GCSeries> getById(long id){
        return gcSeriesDAO.findById(id);
    }

    public  void updateGCSeries(long id, GCSeries gcSeries){
        gcSeriesDAO.update(id, gcSeries.getName());
    }

    public void updateCardFamily(long id, GraphicsCardFamily graphicsCardFamily){
        gcSeriesDAO.updateGraphicsCardFamily(id, graphicsCardFamily);
    }




}
