package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Deliverer;
import com.bzloeffler.intern.bestellformular.interneBestellung.domain.repositories.DelivererRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DelivererServiceImpl implements DelivererService {

    @Autowired
    DelivererRepository delivererRepository;

    @Override
    public Optional<Deliverer> getById(long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsByDerlivererNumber(String delivererNumber) {

        return delivererRepository.existsByDerlivererNumber(delivererNumber);
    }

    @Override
    public List<Deliverer> findAll() {
        return delivererRepository.findAll();
    }

    @Override
    public void update(Deliverer deliverer) {

    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public void addDeliverer(Deliverer deliverer) {
        delivererRepository.save(deliverer);
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteDeliverer(Deliverer deliverer) {

    }

    @Override
    public Optional<Deliverer> findByDerlivererNumber(String derlivererNumber) {
        return delivererRepository.findByDerlivererNumber(derlivererNumber);
    }
}
