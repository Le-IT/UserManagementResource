package com.nodiac.bzl.UserManagementResource.domain.repository;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Deliverer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface DelivererRepository extends CrudRepository<Deliverer, Long> {

    Optional<Deliverer> findById(long id);

    boolean existsByDerlivererNumber(String delivererNumber);

    List<Deliverer> findAll();

    Optional<Deliverer> findByDerlivererNumber(String derlivererNumber);
}
