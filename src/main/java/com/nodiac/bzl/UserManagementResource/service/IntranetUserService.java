package com.nodiac.bzl.UserManagementResource.service;

import tech.nodiac.bzl.domain.IntranetUser;

import java.util.List;
import java.util.Optional;

public interface IntranetUserService {



    Optional<IntranetUser> getById(long id);

    Optional<IntranetUser> getByAzrId(String id);

    List<IntranetUser> findAll();

    List<IntranetUser> findAllReal();

    void update(IntranetUser user);

    boolean existsById(long id);

    boolean existsByAzrId(String id);


    String addUser(IntranetUser user);


    void deleteAll();
}
