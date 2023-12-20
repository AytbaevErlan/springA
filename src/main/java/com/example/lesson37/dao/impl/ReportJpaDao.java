package com.example.lesson37.dao.impl;

import com.example.lesson37.dao.ReportDao;
import com.example.lesson37.model.Report;
import lombok.extern.log4j.Log4j2;


@Log4j2
//@Component
//@Primary
public class ReportJpaDao implements ReportDao {

    @Override
    public void save(Report report) {
        log.info("Try to save as an entity " + report);
    }
}
