package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.products.Cooler;
import com.codecool.brightxchange.repositories.products.CoolerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service("CoolerService")
public class CoolerService {
    private final CoolerDAO coolerDAO;

    public CoolerService(CoolerDAO coolerDAO) {
        this.coolerDAO = coolerDAO;
    }

    public List<Cooler> getAll() {
        return coolerDAO.findAll();
    }

    public Optional<Cooler> getById(long id) {
        return coolerDAO.findById(id);
    }

    public void addCooler(Cooler cooler) {
        coolerDAO.save(cooler);
    }

    public void updateCooler(long id, Cooler cooler) {
        coolerDAO.update(id, cooler.getDescription(), cooler.getCurrency(), cooler.getDimensions(), cooler.getPrice(), cooler.getQuantity());
    }
    public void updateSupplier(long id, Supplier supplier){
        coolerDAO.updateSupplier(id, supplier);
    }


}
