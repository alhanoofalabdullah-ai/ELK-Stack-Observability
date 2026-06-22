package com.alhanoof.loganalytics.controller;

import com.alhanoof.loganalytics.dto.LogStatisticsDTO;
import com.alhanoof.loganalytics.service.LogAnalyticsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
public class LogAnalyticsController {

    private final LogAnalyticsService service;

    public LogAnalyticsController(
            LogAnalyticsService service) {

        this.service = service;
    }

    @GetMapping("/statistics")
    public LogStatisticsDTO statistics() {

        return service.getStatistics();
    }

    @PostMapping("/generate")
    public String generateLogs() {

        return "Application logs generated successfully.";
    }
}
