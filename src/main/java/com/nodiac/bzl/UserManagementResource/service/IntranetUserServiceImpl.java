package com.nodiac.bzl.UserManagementResource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nodiac.bzl.domain.IntranetUser;
import tech.nodiac.bzl.domain.repository.IntranetUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class IntranetUserServiceImpl implements IntranetUserService {

    @Autowired
    private IntranetUserRepository intranetUserRepository;


    @Override
    public Optional<IntranetUser> getById(long id) {
        return intranetUserRepository.findById(id);
    }

    @Override
    public Optional<IntranetUser> getByAzrId(String id) {
        return intranetUserRepository.findByAzrId(id);
    }

    @Override
    public List<IntranetUser> findAll() {
        return intranetUserRepository.findAll();
    }

    @Override
    public List<IntranetUser> findAllReal() {
        List<IntranetUser> allRealUsers = new ArrayList<>();
        List<IntranetUser> allUsers = intranetUserRepository.findAll();
        for(IntranetUser userReal : allUsers){
            if(userReal.getJobTitle()!=null){
                allRealUsers.add(userReal);
            }
        }
        return allRealUsers;
    }

    @Override
    public void update(IntranetUser user) {
        if(intranetUserRepository.existsById(user.getId())){
            intranetUserRepository.save(user);
        }


    }

    @Override
    public boolean existsById(long id) {
        return intranetUserRepository.existsById(id);
    }

    @Override
    public boolean existsByAzrId(String id) {
        return intranetUserRepository.existsByAzrId(id);
    }

    @Override
    public String addUser(IntranetUser user) {
        if(intranetUserRepository.existsByAzrId(user.getAzrId())){
            return "Failure: User already in Database - ADDING USER ABORTED !!!";
        }
        else{
            try{
                intranetUserRepository.save(user);
                return "Success: - User successfully added";
            }
            catch(Exception e){
                return "Failure: - Database Exception is raised" + e;
            }

        }
    }

    @Override
    public void deleteAll() {
        intranetUserRepository.deleteAll();
    }


}
