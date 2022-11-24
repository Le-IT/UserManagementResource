package com.nodiac.bzl.UserManagementResource.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "KOMMENTAR")
public class BlackComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private BlackPost blackPost;

    @Column(name = "userComment")
    private String userComment;

    @Column(name = "timestamp")
    private Date timestamp;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setup(String userComment, Long id) {
        this.userComment = userComment;
        this.id = id;
    }

    public BlackComment() {}
}
