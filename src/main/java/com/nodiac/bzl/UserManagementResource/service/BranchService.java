package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchService {


    Optional<Branch> getById(long id);


    List<Branch> findAll();

    void update(Branch branch);

    boolean existsById(long id);

    void addBranch(Branch branch);

    void deleteAll();

    void deleteBranch(Branch branch);
}

