package com.ls.REST_SpringBoot_SpringData.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "holding_counter")
public class HoldingCounter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "count", nullable = false)
    private Integer count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "holding_id", insertable = false, updatable = false)
    private Holding holding;

    public Integer getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public Holding getHolding() {
        return holding;
    }



    @Override
    public String toString() {
        return "HoldingCounter{" +
                "count=" + count +
                ", holding=" + holding +
                '}';
    }
}