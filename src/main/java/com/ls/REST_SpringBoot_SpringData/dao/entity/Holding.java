package com.ls.REST_SpringBoot_SpringData.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "holding")
public class Holding implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "holding_id", nullable = false)
    private Integer holdingId;

    @Column(name = "holding_title", nullable = false)
    private String holdingTitle;

    public Integer getHoldingId() {
        return holdingId;
    }

    public String getHoldingTitle() {
        return holdingTitle;
    }

    @Override
    public String toString() {
        return "Holding{" +
                "holdingId=" + holdingId +
                ", holdingTitle='" + holdingTitle + '\'' +
                '}';
    }
}