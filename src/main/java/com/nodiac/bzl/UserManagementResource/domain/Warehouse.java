package com.nodiac.bzl.UserManagementResource.domain;


import com.bzloeffler.intern.bestellformular.interneBestellung.util.IntegerWrapper;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="WAREHOUSES")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int internalNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Branch branch;

    @ElementCollection
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_amount_mapping",
            joinColumns = {@JoinColumn(name = "warehouse_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "integerWrapper_id", referencedColumnName = "id")})
    @MapKeyJoinColumn(name = "product_id")
    private Map<Product, IntegerWrapper> storedProducts;

    public Warehouse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInternalNumber() {
        return internalNumber;
    }

    public void setInternalNumber(int internalNumber) {
        this.internalNumber = internalNumber;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Map<Product, IntegerWrapper> getStoredProducts() {
        return storedProducts;
    }

    public void addStoredProductAndAmount(Product product, IntegerWrapper amount) {
        this.storedProducts.put(product,amount);
    }
}
