package com.ls.REST_SpringBoot_SpringData.service.impl;

import com.ls.REST_SpringBoot_SpringData.dao.entity.Reach;
import com.ls.REST_SpringBoot_SpringData.web.entity.ReportReach;
import com.ls.REST_SpringBoot_SpringData.dao.repository.ReportRepository;
import com.ls.REST_SpringBoot_SpringData.service.ReportService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ReportServiceImpl implements ReportService {

    private static final Logger LOGGER = LogManager.getLogger(ReportServiceImpl.class);
    private final ReportRepository reportRepository;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public List<ReportReach> getReachReport() {
        List<Reach> reachList = reportRepository.findReachAll();

        return reachList.stream()
                .map(reach ->
                        new ReportReach(
                                reach.getSite().getSiteId(),
                                roundReach(convertPercentToReach(reach.getReachPercent(), reach.getHoldingCounter().getCount()))
                        )
                )
                .sorted(Comparator.comparing(ReportReach::getSiteId))
                .collect(Collectors.toList());
    }

    private double roundReach(double reach) {
        LOGGER.debug("Reach=[{}] before round", reach);

        int newScale = 2;
        BigDecimal reachBD = new BigDecimal(reach).setScale(newScale, RoundingMode.UP);

        LOGGER.debug("Reach=[{}] after round", reachBD);
        return reachBD.doubleValue();
    }

    private double convertPercentToReach(double percent, int count) {
        return percent * count / 100;
    }
}