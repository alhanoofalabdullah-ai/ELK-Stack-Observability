package com.alhanoof.fraud.controller;

import com.alhanoof.fraud.dto.FraudMetricsDTO;
import com.alhanoof.fraud.service.FraudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class FraudController {

    private final FraudService service;

    public FraudController(FraudService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public FraudMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/alert")
    public String createAlert() {
        return "Fraud alert created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Fraud report generated successfully.";
    }
}
