package com.nodiac.bzl.UserManagementResource.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.nodiac.bzl.domain.ITeam;
import tech.nodiac.bzl.domain.repository.TeamsRepository;

import java.util.List;
import java.util.Optional;


@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamsRepository teamsRepository;


    @Override
    public Optional<ITeam> getById(long id) {
        return teamsRepository.findById(id);
    }
    @Transactional
    @Override
    public Optional<ITeam> getByAzrId(String id) {
        return teamsRepository.findByAzrId(id);
    }

    @Override
    public List<ITeam> findAll() {
        return teamsRepository.findAll();
    }





    @Override
    public boolean existsById(long id) {
        return teamsRepository.existsById(id);
    }

    @Override
    public boolean existsByAzrId(String id) {
        return teamsRepository.existsByAzrId(id);
    }

    @Override
    public String addTeam(ITeam iTeam) {
        if(teamsRepository.existsByAzrId(iTeam.getAzrId())){
            return "Failure: Team " +iTeam.getDisplayName() + " already in Database - ADDING USER ABORTED !!!";
        }
        else{
            try{
                teamsRepository.save(iTeam);
                return "Success: - Team:" +iTeam.getDisplayName() + " successfully added";
            }
            catch(Exception e){
                return "Failure: - Database Exception is raised" + e;
            }

        }
    }

    @Override
    public void deleteAll() {
        teamsRepository.deleteAll();
    }

    @Override
    public void update(ITeam iTeam) {
        ITeam iTeam1 = teamsRepository.findById(iTeam.getId()).get();
            teamsRepository.save(iTeam1);

    }


}
