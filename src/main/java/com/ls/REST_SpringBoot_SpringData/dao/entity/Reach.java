package com.ls.REST_SpringBoot_SpringData.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reach")
public class Reach implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "site_id", insertable = false, updatable = false)
    private Site site;

    @ManyToOne
    @JoinColumn(name = "holding_id", insertable = false, updatable = false)
    private HoldingCounter holdingCounter;

    @Column(name = "reach_percent", nullable = false)
    private Double reachPercent;

    public Site getSite() {
        return site;
    }

    public Integer getId() {
        return id;
    }

    public HoldingCounter getHoldingCounter() {
        return holdingCounter;
    }

    public Double getReachPercent() {
        return reachPercent;
    }

    @Override
    public String toString() {
        return "Reach{" +
                "id=" + id +
                ", site=" + site +
                ", holdingCounter=" + holdingCounter +
                ", reachPercent=" + reachPercent +
                '}';
    }
}