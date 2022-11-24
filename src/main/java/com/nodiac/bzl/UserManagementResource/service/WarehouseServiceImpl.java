package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Warehouse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseServiceImpl implements WarehouseService{


    @Override
    public Optional<Warehouse> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Warehouse> findAll() {
        return null;
    }

    @Override
    public void update(Warehouse warehouse) {

    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteWarehouse(Warehouse warehouse) {

    }
}
