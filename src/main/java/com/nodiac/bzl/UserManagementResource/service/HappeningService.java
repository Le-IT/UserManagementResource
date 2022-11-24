package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.intranetAllgemein.domain.Happening;

import java.util.List;

public interface HappeningService {
    void addHappening(Happening happening);

    public List<Happening> findAllPosts();

    public Happening updateHappening(Happening happening);

    public Happening findById(long id);

    void savePost(Happening happening);
}
