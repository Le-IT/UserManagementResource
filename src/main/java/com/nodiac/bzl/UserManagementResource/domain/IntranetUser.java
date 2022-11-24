package com.nodiac.bzl.UserManagementResource.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 * User object model
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "USERS")
public class IntranetUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="azrID")
    private String azrId;


    @ElementCollection
    @CollectionTable(name = "azureusers_phone_numbers", joinColumns = @JoinColumn(name = "users_id"))
    @Column(name = "phone_number")
    private List<String> businessPhones = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(name = "azureusers_teams", joinColumns = @JoinColumn(name = "users_id"),inverseJoinColumns = @JoinColumn(name = "teams_id"))
    @Column(name = "msteams")
    private List<ITeam> iTeams = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "azureusers_shifts", joinColumns = @JoinColumn(name = "users_id"),inverseJoinColumns = @JoinColumn(name = "schicht_id"))
    @Column(name = "msshifts")
    private List<Schicht> schichten = new ArrayList<>();



    @Column(name="msdisplayname")
    private String displayName;
    @Column(name="msgivenname")
    private String givenName;

    @Column(name="msjobtitle")
    private String jobTitle;
    @Column(name="msmail")
    private String mail;
    @Column(name="mobile")
    private String mobilePhone;
    @Column(name="msofficelocation")
    private String officeLocation;
    @Column(name="mspreflang")
    private String preferredLanguage;
    @Column(name="mssurename")
    private String surname;
    @Column(name="mspresence")
    private String presence;


    public void addTeam(ITeam team){
        this.iTeams.add(team);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getGivenName() {
        return givenName;
    }


    public String toConcatedString() {
        return "User{" +
                "presence=" + presence + '\'' +
                "businessPhones=" + businessPhones + '\'' +
                ", displayName='" + displayName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", mail='" + mail + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void setup(String azrid, List<String> businessPhones, String displayName, String givenName, String jobTitle, String mail, String mobilePhone, String officeLocation, String preferredLanguage, String surname, String userPrincipalName, String presence) {
        this.azrId = azrid;
        this.businessPhones = businessPhones;
        this.displayName = displayName;
        this.givenName = givenName;
        this.jobTitle = jobTitle;
        this.mail = mail;
        this.mobilePhone = mobilePhone;
        this.officeLocation = officeLocation;
        this.preferredLanguage = preferredLanguage;
        this.surname = surname;
        this.presence = presence;
    }



    public String getAzrId() {
        return azrId;
    }

    public void setAzrId(String azrId) {
        this.azrId = azrId;
    }

    public List<String> getBusinessPhones() {
        return businessPhones;
    }

    public void setBusinessPhones(List<String> businessPhones) {
        this.businessPhones = businessPhones;
    }

    public List<ITeam> getTeams() {
        return iTeams;
    }

    public void setTeams(List<ITeam> iTeams) {
        this.iTeams = iTeams;
    }


    public List<Schicht> getSchichten() {
        return schichten;
    }

    public void setSchichten(List<Schicht> schichten) {
        this.schichten = schichten;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

}