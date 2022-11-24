package com.nodiac.bzl.UserManagementResource.domain.repository;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Warehouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Long> {

}
