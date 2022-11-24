package com.nodiac.bzl.UserManagementResource.domain;

import com.nodiac.bzl.UserManagementResource.common.BaseDTO;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="DELIVERERS")
public class Deliverer extends BaseDTO<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliverer_id")
    private long id;

    private String derlivererNumber;

    private String name;

    @ManyToMany(mappedBy = "deliverers", cascade = CascadeType.ALL)
    private List<Product> products;

    public Deliverer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDerlivererNumber() {
        return derlivererNumber;
    }

    public void setDerlivererNumber(String derlivererNumber) {
        this.derlivererNumber = derlivererNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deliverer deliverer)) return false;
        return getId() == deliverer.getId() && getDerlivererNumber() == deliverer.getDerlivererNumber() && Objects.equals(getName(), deliverer.getName()) && Objects.equals(getProducts(), deliverer.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDerlivererNumber(), getName(), getProducts());
    }

    @Override
    public String toString() {
        return "Deliverer{" +
                "id=" + id +
                ", derlivererNumber=" + derlivererNumber +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
