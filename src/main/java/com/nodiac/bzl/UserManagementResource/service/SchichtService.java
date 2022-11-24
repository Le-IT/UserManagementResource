package com.nodiac.bzl.UserManagementResource.service;

import tech.nodiac.bzl.domain.Schicht;

import java.util.List;
import java.util.Optional;

public interface SchichtService {



    Optional<Schicht> getById(long id);

    

    Optional<Schicht> getByAzrId(String id);

    List<Schicht> findAll();

   
    

    boolean existsById(long id);

    boolean existsByAzrId(String id);


    void addTeam(Schicht schicht);

    void deleteAll();

    void update(Schicht schicht);
}
