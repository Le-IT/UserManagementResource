package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.intranetAllgemein.domain.Happening;
import com.bzloeffler.intern.bestellformular.intranetAllgemein.domain.repository.HappeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HappeningServiceImpl implements HappeningService {

    @Autowired
    HappeningRepository happeningRepository;

    @Override
    public void addHappening(Happening happening) {
        happeningRepository.save(happening);
    }

    @Override
    public List<Happening> findAllPosts() {
        return (List<Happening>) happeningRepository.findAll();
    }

    @Override
    public Happening updateHappening(Happening happening) {
        Optional<Happening> happening1 = happeningRepository.findById(happening.getId());
        if(happening1.isPresent()){
            happeningRepository.save(happening);
            return happening;
        }
        else return null;
    }

    @Override
    public Happening findById(long id) {
        if(happeningRepository.findById(id).isPresent()){return happeningRepository.findById(id).get();}
        else return null;
    }

    @Override
    public void savePost(Happening happening) {
        happeningRepository.save(happening);
    }
}
