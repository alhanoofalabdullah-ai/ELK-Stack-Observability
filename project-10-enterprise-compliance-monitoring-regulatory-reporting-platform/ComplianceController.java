package com.alhanoof.compliance.controller;

import com.alhanoof.compliance.dto.ComplianceMetricsDTO;
import com.alhanoof.compliance.service.ComplianceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compliance")
public class ComplianceController {

    private final ComplianceService service;

    public ComplianceController(
            ComplianceService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public ComplianceMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createEvent() {
        return "Compliance event created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Compliance report generated successfully.";
    }
}
