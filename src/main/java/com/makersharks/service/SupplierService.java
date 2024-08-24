package com.makersharks.service;

import com.makersharks.model.Supplier;
import com.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int limit) {
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcesses);
        System.out.println("Suppliers found: " + suppliers.size());
        return suppliers.stream().limit(limit).toList();
    }

}
