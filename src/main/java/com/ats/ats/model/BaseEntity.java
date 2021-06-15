package com.ats.ats.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
@EqualsAndHashCode
@EntityListeners(EntityListener.class)
public abstract class BaseEntity {
    @Column(nullable = false, updatable = false)
    private Date createDate;

    @Column(insertable = false)
    private Date lastUpdateDate;

}
