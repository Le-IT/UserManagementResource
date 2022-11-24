package com.nodiac.bzl.UserManagementResource.domain.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.nodiac.bzl.domain.IntranetUser;

import java.util.List;
import java.util.Optional;

@Repository
public interface IntranetUserRepository extends CrudRepository<IntranetUser, Long> {


    Optional<IntranetUser> findById(long id);

    Optional<IntranetUser> findByAzrId(String azrId);

    boolean existsByAzrId(String id);


    List<IntranetUser> findAll();


}