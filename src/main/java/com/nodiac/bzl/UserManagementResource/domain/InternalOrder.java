package com.nodiac.bzl.UserManagementResource.domain;

import com.bzloeffler.intern.bestellformular.azure.domain.IntranetUser;
import com.bzloeffler.intern.bestellformular.util.enums.EnOrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="INTERNALORDER")
public class InternalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /*
    status == 0 --> open
    status == 1 --> pending
    status == 2 --> done
    status == 4 --> failure
     */
    private EnOrderStatus status = EnOrderStatus.OPEN;

    // The user who start the Order
    @OneToOne
    private IntranetUser starter;

    // The user who confirms the Order  (need to have CONFIRMER role)
    @OneToOne
    private IntranetUser confirmer;

    // The products of the order
    @ElementCollection
    private Map<String, Integer> products;

    private int priority;

    private String branch;

    private Date dateOfOrder;

    private Date dueDate;

    @ManyToOne
    @JoinColumn(name="ordermanager_id", nullable = false)
    private OrderManager orderManager;

    public InternalOrder() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnOrderStatus getStatus() {
        return status;
    }

    public void setStatus(EnOrderStatus status) {
        this.status = status;
    }

    public IntranetUser getStarter() {
        return starter;
    }

    public void setStarter(IntranetUser starter) {
        this.starter = starter;
    }

    public IntranetUser getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(IntranetUser confirmer) {
        this.confirmer = confirmer;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternalOrder that)) return false;
        return getId() == that.getId() && getPriority() == that.getPriority() && getStatus() == that.getStatus() && Objects.equals(getStarter(), that.getStarter()) && Objects.equals(getConfirmer(), that.getConfirmer()) && Objects.equals(getProducts(), that.getProducts()) && Objects.equals(getBranch(), that.getBranch()) && Objects.equals(getDateOfOrder(), that.getDateOfOrder()) && Objects.equals(getDueDate(), that.getDueDate()) && Objects.equals(getOrderManager(), that.getOrderManager());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStatus(), getStarter(), getConfirmer(), getProducts(), getPriority(), getBranch(), getDateOfOrder(), getDueDate(), getOrderManager());
    }

    @Override
    public String toString() {
        return "InternalOrder{" +
                "id=" + id +
                ", status=" + status +
                ", starter=" + starter +
                ", confirmer=" + confirmer +
                ", products=" + products +
                ", priority=" + priority +
                ", branch='" + branch + '\'' +
                ", dateOfOrder=" + dateOfOrder +
                ", dueDate=" + dueDate +
                ", orderManager=" + orderManager +
                '}';
    }
}
