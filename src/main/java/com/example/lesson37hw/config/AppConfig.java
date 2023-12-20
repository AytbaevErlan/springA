package com.example.lesson37hw.config;

import com.example.lesson37.dao.ReportDao;
import com.example.lesson37.dao.impl.ReportJpaDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.lesson37hw")
public class AppConfig {

    @Bean
//    @Qualifier("reportJpaDao")
    @Primary
    ReportDao reportJpaDao(){
        return new ReportJpaDao();
    }


    @Bean
    String helloWorld(){
        return "Hello World!";
    }
}