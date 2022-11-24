package com.nodiac.bzl.UserManagementResource.common;

import java.io.Serializable;

/**
 * Base-Class for DTO Objects
 * @param <PK> - type of the primary key
 */
public abstract class BaseDTO<PK extends Serializable> {
    private PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        if (getId() != null)
            return getId().hashCode();
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        BaseDTO<?> other = (BaseDTO<?>) obj;
        return id != null && id.equals(other.id);
    }
}
