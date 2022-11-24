package com.nodiac.bzl.UserManagementResource.domain;

import com.bzloeffler.intern.bestellformular.azure.domain.IntranetUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "BEITRAG")
public class BlackPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @ManyToOne()
    @JoinColumn(name = "users_id")
    IntranetUser contentCreator;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<BlackComment> comments;

    @Column(name = "userTitle")
    private String userTitle;

    @Column(name = "startDatum")
    private Date startDatum;

    @Column(name = "endDatum")
    private Date endDatum;

    @Column(name = "userStory")
    private String userStory;

    @Column(name = "userAllowComments")
    private boolean userAllowComments;

    @Column(name = "userAllowName")
    private boolean userAllowname;



    public String getTitle() {
        return userTitle;
    }

    public void setTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getStory() {
        return userStory;
    }

    public String getStoryShort() {
        if(userStory.length() > 50) {
            return userStory.substring(0, 50);
        }
        return userStory;
    }

    public void setStory(String userStory) {
        this.userStory = userStory;
    }

    public boolean isUserAllowComments() {
        return userAllowComments;
    }

    public void setUserAllowComments(boolean userAllowComments) {
        this.userAllowComments = userAllowComments;
    }

    public boolean isUserAllowname() {
        return userAllowname;
    }

    public void setUserAllowname(boolean userAllowname) {
        this.userAllowname = userAllowname;
    }



    public void setup(String title, String content, boolean allowName, boolean allowComments) {
        this.userTitle = title;
        this.userStory = content;
        this.userAllowname = allowName;
        this.userAllowComments = allowComments;
    }

    public BlackPost() {
    }

    public Long getId() {
        return id;
    }
}
