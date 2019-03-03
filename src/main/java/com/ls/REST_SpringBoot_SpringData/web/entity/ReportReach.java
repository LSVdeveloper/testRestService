package com.ls.REST_SpringBoot_SpringData.web.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"site", "reach"})
public class ReportReach {

    @JsonProperty("site")
    private int siteId;

    @JsonProperty("reach")
    private double reach;

    public ReportReach(){
    }

    public ReportReach(int siteId, double reach) {
        this.siteId = siteId;
        this.reach = reach;
    }

    public int getSiteId() {
        return siteId;
    }

    public double getReach() {
        return reach;
    }

    @Override
    public String toString() {
        return "ReportReach{" +
                "siteId=" + siteId +
                ", reach=" + reach +
                '}';
    }
}