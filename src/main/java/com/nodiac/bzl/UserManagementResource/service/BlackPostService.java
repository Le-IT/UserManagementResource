package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.blackboard.domain.BlackPost;

import java.util.List;


public interface BlackPostService {

    void addPost(BlackPost post);

    public List<BlackPost> findAllPosts();

    public BlackPost updatePost(BlackPost post);

    public BlackPost findById(long id);

    void savePost(BlackPost post);
}
