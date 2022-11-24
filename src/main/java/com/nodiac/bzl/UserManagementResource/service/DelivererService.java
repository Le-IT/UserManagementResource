package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Deliverer;

import java.util.List;
import java.util.Optional;

public interface DelivererService {


    Optional<Deliverer> getById(long id);

    boolean existsByDerlivererNumber(String delivererNumber);

    List<Deliverer> findAll();

    void update(Deliverer deliverer);

    boolean existsById(long id);

    void addDeliverer(Deliverer deliverer);

    void deleteAll();

    void deleteDeliverer(Deliverer deliverer);

    Optional<Deliverer> findByDerlivererNumber(String derlivererNumber);
}

