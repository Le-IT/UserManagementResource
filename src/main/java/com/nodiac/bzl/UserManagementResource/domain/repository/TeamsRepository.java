package com.nodiac.bzl.UserManagementResource.domain.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.nodiac.bzl.domain.ITeam;

import java.util.List;
import java.util.Optional;


@Repository
public interface TeamsRepository extends CrudRepository<ITeam, Long> {


    Optional<ITeam> findById(long id);
    
    Optional<ITeam> findByAzrId(String id);

    List<ITeam> findAll();


    boolean existsByAzrId(String id);
}