package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.InternalOrder;

import java.util.List;
import java.util.Optional;

public interface InternalOrderService {


    Optional<InternalOrder> getById(long id);

    List<InternalOrder> findAll();

    void update(InternalOrder internalOrder);

    boolean existsById(long id);

    void addOrder(InternalOrder internalOrder);

    void deleteAll();

    void deleteOrder(InternalOrder internalOrder);
}

