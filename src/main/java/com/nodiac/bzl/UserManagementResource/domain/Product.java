package com.nodiac.bzl.UserManagementResource.domain;

import com.nodiac.bzl.UserManagementResource.common.BaseDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PRODUCTS")
public class Product extends BaseDTO<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "articleNumber")
    private int articleNumber;

    @Column(name = "name")
    private String name;


    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="deliverer_id", referencedColumnName = "deliverer_id")
    private List<Deliverer> deliverers = new ArrayList<>();

    @Column(name = "packagingUnit")
    private String packagingUnit;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;


    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Deliverer> getDeliverers() {
        return deliverers;
    }

    public void setDeliverers(List<Deliverer> deliverers) {
        this.deliverers = deliverers;
    }

    public void addDeliverer(Deliverer deliverer) {
        this.deliverers.add(deliverer);
    }

    public String getPackagingUnit() {
        return packagingUnit;
    }

    public void setPackagingUnit(String packagingUnit) {
        this.packagingUnit = packagingUnit;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getId() == product.getId() && getArticleNumber() == product.getArticleNumber() && Objects.equals(getName(), product.getName()) && Objects.equals(getDeliverers(), product.getDeliverers()) && Objects.equals(getPackagingUnit(), product.getPackagingUnit()) && Objects.equals(getWarehouse(), product.getWarehouse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getArticleNumber(), getName(), getDeliverers(), getPackagingUnit(), getWarehouse());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", articleNumber=" + articleNumber +
                ", name='" + name + '\'' +
                ", deliverers=" + deliverers +
                ", packagingUnit='" + packagingUnit + '\'' +
                ", warehouse=" + warehouse +
                '}';
    }
}
