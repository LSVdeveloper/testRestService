package com.ls.REST_SpringBoot_SpringData.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "site")
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "site_id", nullable = false)
    private Integer siteId;

    @Column(name = "site_title", nullable = false)
    private String siteTitle;

    public Integer getSiteId() {
        return siteId;
    }

    public String getSiteTitle() {
        return siteTitle;
    }

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", siteTitle='" + siteTitle + '\'' +
                '}';
    }
}