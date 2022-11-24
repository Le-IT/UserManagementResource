package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.interneBestellung.domain.Branch;
import com.bzloeffler.intern.bestellformular.interneBestellung.domain.repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService{

    @Autowired
    private BranchRepository branchRepository;


    @Override
    public Optional<Branch> getById(long id) {
        return branchRepository.findById(id);
    }

    @Override
    public List<Branch> findAll() {
        return (List) branchRepository.findAll();
    }

    @Override
    public void update(Branch branch) {

    }

    @Override
    public boolean existsById(long id) {
        return branchRepository.existsById(id);
    }

    @Override
    public void addBranch(Branch branch) {
        if(branch.getId() != null ){
            if(!branchRepository.existsById(branch.getId())){
                branchRepository.save(branch);
            }

        }
    }

    @Override
    public void deleteAll() {
        branchRepository.deleteAll();
    }

    @Override
    public void deleteBranch(Branch branch) {
        branchRepository.delete(branch);
    }
}
