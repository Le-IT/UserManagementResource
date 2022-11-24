package com.nodiac.bzl.UserManagementResource.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nodiac.bzl.UserManagementResource.common.BaseDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User object model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Embeddable
@Table(name = "TEAMS")
public class ITeam extends BaseDTO<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="azrid")
    private String azrId;

    @Column(name="displayname")
    private String displayName;
    @Column(name="msdescription")
    private String description;

    @ManyToMany(mappedBy = "iTeams", cascade=CascadeType.ALL)
    List<IntranetUser> members = new ArrayList<>();


    public void setup(String id, String displayName) {
        this.azrId = id;
        this.displayName = displayName;
    }

    public ITeam() {
    }


    @Override
    public String toString() {
        return "Team{" +
                "id='" + azrId + '\'' +
                ", displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void addMember(IntranetUser user){
        members.add(user);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAzrId() {
        return azrId;
    }

    public void setAzrId(String azrId) {
        this.azrId = azrId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IntranetUser> getMembers() {
        return members;
    }

    public void setMembers(List<IntranetUser> members) {
        this.members = members;
    }
}