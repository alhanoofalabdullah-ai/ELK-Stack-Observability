package com.alhanoof.threatintel.service;

import com.alhanoof.threatintel.dto.ThreatMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class ThreatIntelligenceService {

    public ThreatMetricsDTO getMetrics() {

        return new ThreatMetricsDTO(
                250000,
                142,
                11,
                7,
                "Critical"
        );
    }
}
