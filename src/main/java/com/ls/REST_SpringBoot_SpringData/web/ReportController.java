package com.ls.REST_SpringBoot_SpringData.web;

import com.ls.REST_SpringBoot_SpringData.service.ReportService;
import com.ls.REST_SpringBoot_SpringData.web.entity.ReportReach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping(value = "/reach",
            produces = "application/json")
    public List<ReportReach> reach() {
        return this.reportService.getReachReport();
    }

}