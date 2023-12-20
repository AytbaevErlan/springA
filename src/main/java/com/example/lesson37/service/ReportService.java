package com.example.lesson37.service;


import org.springframework.stereotype.Service;

@Service
public interface ReportService {
    void generateAndSave();
    void generateSomeAndSave();
}
