package com.ls.REST_SpringBoot_SpringData.service;

import com.ls.REST_SpringBoot_SpringData.web.entity.ReportReach;

import java.util.List;


public interface ReportService {
    List<ReportReach> getReachReport();
}