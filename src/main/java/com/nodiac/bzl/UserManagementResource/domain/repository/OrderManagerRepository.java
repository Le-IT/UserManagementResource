package com.nodiac.bzl.UserManagementResource.domain.repository;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.OrderManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderManagerRepository extends CrudRepository<OrderManager, Long> {
}
