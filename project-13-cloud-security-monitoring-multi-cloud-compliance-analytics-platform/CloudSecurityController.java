package com.alhanoof.cloudsecurity.controller;

import com.alhanoof.cloudsecurity.dto.CloudSecurityMetricsDTO;
import com.alhanoof.cloudsecurity.service.CloudSecurityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cloud-security")
public class CloudSecurityController {

    private final CloudSecurityService service;

    public CloudSecurityController(
            CloudSecurityService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public CloudSecurityMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/alert")
    public String createAlert() {
        return "Cloud security alert created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Cloud compliance report generated successfully.";
    }
}
