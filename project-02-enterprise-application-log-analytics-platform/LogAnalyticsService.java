package com.alhanoof.loganalytics.service;

import com.alhanoof.loganalytics.dto.LogStatisticsDTO;
import org.springframework.stereotype.Service;

@Service
public class LogAnalyticsService {

    public LogStatisticsDTO getStatistics() {

        return new LogStatisticsDTO(
                25000,
                450,
                1100,
                23450,
                "Healthy"
        );
    }
}
