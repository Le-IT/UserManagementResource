package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.InternalOrder;
import com.bzloeffler.intern.bestellformular.interneBestellung.domain.repositories.InternalOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternalOrderServiceImpl implements InternalOrderService {

    @Autowired
    InternalOrderRepository internalOrderRepository;


    @Override
    public Optional<InternalOrder> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<InternalOrder> findAll() {
        return null;
    }

    @Override
    public void update(InternalOrder internalOrder) {

    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public void addOrder(InternalOrder internalOrder) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteOrder(InternalOrder internalOrder) {

    }
}
