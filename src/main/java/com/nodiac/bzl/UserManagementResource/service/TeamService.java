package com.nodiac.bzl.UserManagementResource.service;


import tech.nodiac.bzl.domain.ITeam;

import java.util.List;
import java.util.Optional;

public interface TeamService {



    Optional<ITeam> getById(long id);

    

    Optional<ITeam> getByAzrId(String id);

    List<ITeam> findAll();

   
    

    boolean existsById(long id);

    boolean existsByAzrId(String id);


    String addTeam(ITeam iTeam);

    void deleteAll();

    void update(ITeam iTeam);
}
