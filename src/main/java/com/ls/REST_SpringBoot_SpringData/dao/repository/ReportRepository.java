package com.ls.REST_SpringBoot_SpringData.dao.repository;


import com.ls.REST_SpringBoot_SpringData.dao.entity.Reach;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface ReportRepository extends CrudRepository<Reach, Integer> {

    @Query(value = "select r from Reach r join fetch r.holdingCounter")
    List<Reach> findReachAll();
}