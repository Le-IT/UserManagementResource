package com.nodiac.bzl.UserManagementResource.domain.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.nodiac.bzl.domain.Schicht;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchichtRepository extends CrudRepository<Schicht, Long> {


    Optional<Schicht> findById(long id);
    
    Optional<Schicht> findByAzrId(String id);

    List<Schicht> findAll();


    boolean existsByAzrId(String id);
}