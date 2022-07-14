package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.ProcessorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProcessorService")
public class ProcessorService {
    @Autowired
    private ProcessorDAO processorDAO;
}
