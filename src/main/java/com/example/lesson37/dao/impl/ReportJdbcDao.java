package com.example.lesson37.dao.impl;

import com.example.lesson37.dao.ReportDao;
import com.example.lesson37.model.Report;
import lombok.extern.log4j.Log4j2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Component("defaultReportDao")
@Scope("prototype")
public class ReportJdbcDao implements ReportDao {
    @Override
    public void save(Report report) {
        log.info("Try to save report {}", report);
    }
}
