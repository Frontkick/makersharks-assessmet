package com.makersharks.controller;

import com.makersharks.model.Supplier;
import com.makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcesses,
            @RequestParam(defaultValue = "10") int limit) {

        List<Supplier> suppliers = supplierService.getSuppliers(location, natureOfBusiness, manufacturingProcesses, limit);
        return ResponseEntity.ok(suppliers);
    }
}
