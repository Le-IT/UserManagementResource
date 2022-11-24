package com.nodiac.bzl.UserManagementResource.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nodiac.bzl.UserManagementResource.common.BaseDTO;

import javax.persistence.*;
import java.util.List;

/**
 * User object model
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Embeddable
@Table(name = "SCHICHTEN")
public class Schicht extends BaseDTO<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="azrid")
    private String azrId;



    @Column(name="displayname")
    private String displayName;
    @Column(name="msdescription")
    private String description;

    @ManyToMany(mappedBy = "schichten", fetch = FetchType.EAGER)
    List<IntranetUser> members;


    public void setup(String id, String displayName) {
        this.azrId = id;
        this.displayName = displayName;
    }

    public Schicht() {
    }



    @Override
    public String toString() {
        return "Schicht{" +
                "id='" + azrId + '\'' +
                ", displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}