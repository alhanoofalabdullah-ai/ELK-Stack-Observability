package com.alhanoof.erm.controller;

import com.alhanoof.erm.dto.EnterpriseRiskDTO;
import com.alhanoof.erm.service.RiskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/risks")
public class RiskController {

    private final RiskService service;

    public RiskController(RiskService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public EnterpriseRiskDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/assessment")
    public String createAssessment() {
        return "Risk assessment created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Executive risk report generated successfully.";
    }
}
