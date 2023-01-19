package com.app.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class BaseModel {
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false, updatable = false)
    private Date updatedAt;

    @Column(name = "isActive", nullable = false, columnDefinition = "boolean default true")
    private boolean isActive;

    @PrePersist
    protected void prePersist() {
        if (this.createdAt == null)
            createdAt = new Date();
        if (this.updatedAt == null)
            updatedAt = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.updatedAt = new Date();
    }
}
