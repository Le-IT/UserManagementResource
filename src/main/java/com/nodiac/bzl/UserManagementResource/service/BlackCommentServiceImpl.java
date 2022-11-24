package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.blackboard.domain.BlackComment;
import com.bzloeffler.intern.bestellformular.blackboard.domain.repository.BlackCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackCommentServiceImpl implements BlackCommentService {

    @Autowired
    private BlackCommentRepository blackCommentRepository;

    @Override
    public void addComment(BlackComment comment) {

    }

    @Override
    public BlackComment findById(long id) {
        if(blackCommentRepository.findById(id).isPresent()){return blackCommentRepository.findById(id).get();}
        else return null;
    }
}
