package com.alhanoof.threatintel.controller;

import com.alhanoof.threatintel.dto.ThreatMetricsDTO;
import com.alhanoof.threatintel.service.ThreatIntelligenceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/threat-intelligence")
public class ThreatIntelligenceController {

    private final ThreatIntelligenceService service;

    public ThreatIntelligenceController(
            ThreatIntelligenceService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public ThreatMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/indicator")
    public String addIndicator() {
        return "Threat indicator added successfully.";
    }
}
