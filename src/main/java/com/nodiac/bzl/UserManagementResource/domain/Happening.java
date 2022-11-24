package com.nodiac.bzl.UserManagementResource.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "EREIGNIS")
public class Happening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "titleHap")
    private String userTitle;

    @Column(name = "storyHap")
    private String story;

    //@Column(name = "image")
    //private Image img;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    IntranetUser happeningCreator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getStory() {
        return story;
    }

    public void setSory(String story) {
        this.story = story;
    }
}
