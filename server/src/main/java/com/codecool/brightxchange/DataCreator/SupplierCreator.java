package com.codecool.brightxchange.DataCreator;

import com.codecool.brightxchange.model.Supplier;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component("SupplierCreator")
public class SupplierCreator {
    private final Set<Supplier> suppliers = new HashSet<>();

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

//    public void initialize(){
//        suppliers.add(new Supplier(1, "Bright Xchange"));
//    }
}
