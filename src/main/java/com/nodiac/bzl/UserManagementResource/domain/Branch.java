package com.nodiac.bzl.UserManagementResource.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "BRANCHES")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String internalNumber;

    @OneToOne(mappedBy = "branch")
    private Warehouse warehouse;

    public Branch() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInternalNumber() {
        return internalNumber;
    }

    public void setInternalNumber(String internalNumber) {
        this.internalNumber = internalNumber;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch branch)) return false;
        return Objects.equals(getId(), branch.getId()) && Objects.equals(getName(), branch.getName()) && Objects.equals(getInternalNumber(), branch.getInternalNumber()) && Objects.equals(getWarehouse(), branch.getWarehouse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getInternalNumber(), getWarehouse());
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", internalNumber='" + internalNumber + '\'' +
                ", warehouse=" + warehouse +
                '}';
    }
}
