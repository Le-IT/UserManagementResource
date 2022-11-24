package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.blackboard.domain.BlackPost;
import com.bzloeffler.intern.bestellformular.blackboard.domain.repository.BlackPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlackPostServiceImpl implements BlackPostService{

    @Autowired
    private BlackPostRepository blackPostRepository;
    @Override
    public void addPost(BlackPost post) {
        blackPostRepository.save(post);
    }

    @Override
    public List<BlackPost> findAllPosts() {return (List<BlackPost>) blackPostRepository.findAll();}

    @Override
    public BlackPost updatePost(BlackPost post) {
        Optional<BlackPost> blackPost = blackPostRepository.findById(post.getId());
        if(blackPost.isPresent()){
            blackPostRepository.save(post);
            return post;
        }
        else return null;
    }

    @Override
    public BlackPost findById(long id) {
        if(blackPostRepository.findById(id).isPresent()){return blackPostRepository.findById(id).get();}
        else return null;
    }

    @Override
    public void savePost(BlackPost post) {
        blackPostRepository.save(post);
    }


}
