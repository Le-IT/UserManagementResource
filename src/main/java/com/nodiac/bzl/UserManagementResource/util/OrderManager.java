package com.nodiac.bzl.UserManagementResource.util;

import com.bzloeffler.intern.bestellformular.azure.domain.IntranetUser;
import com.nodiac.bzl.UserManagementResource.domain.InternalOrder;
import com.nodiac.bzl.UserManagementResource.domain.IntranetUser;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name="ORDERMANAGERS")
public class OrderManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "orderManager")
    private List<InternalOrder> orders_open;


    public OrderManager() {
    }

    @OneToOne
    private IntranetUser confirmer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<InternalOrder> getOrders_open() {
        return orders_open;
    }

    public void setOrders_open(List<InternalOrder> orders_open) {
        this.orders_open = orders_open;
    }


    public IntranetUser getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(IntranetUser confirmer) {
        this.confirmer = confirmer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderManager that = (OrderManager) o;
        return getId() == that.getId() && Objects.equals(getOrders_open(), that.getOrders_open()) && Objects.equals(getConfirmer(), that.getConfirmer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOrders_open(), getConfirmer());
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "id=" + id +
                ", orders_open=" + orders_open +
                ", confirmer=" + confirmer +
                '}';
    }
}
