package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Warehouse;

import java.util.List;
import java.util.Optional;

public interface WarehouseService {


    Optional<Warehouse> getById(long id);

    List<Warehouse> findAll();

    void update(Warehouse warehouse);

    boolean existsById(long id);

    void addWarehouse(Warehouse warehouse);

    void deleteAll();

    void deleteWarehouse(Warehouse warehouse);
}

