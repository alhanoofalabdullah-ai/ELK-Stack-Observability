package com.alhanoof.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FraudMonitoringApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                FraudMonitoringApplication.class,
                args
        );
    }
}
