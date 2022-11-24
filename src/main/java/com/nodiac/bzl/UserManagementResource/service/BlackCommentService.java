package com.nodiac.bzl.UserManagementResource.service;

import com.bzloeffler.intern.bestellformular.blackboard.domain.BlackComment;

public interface BlackCommentService {
    public void addComment(BlackComment comment);

    BlackComment findById(long id);
}
