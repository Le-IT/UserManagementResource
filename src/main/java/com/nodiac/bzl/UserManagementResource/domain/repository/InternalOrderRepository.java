package com.nodiac.bzl.UserManagementResource.domain.repository;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.InternalOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InternalOrderRepository extends CrudRepository<InternalOrder, Long> {
    Optional<InternalOrder> findById(long id);
}
