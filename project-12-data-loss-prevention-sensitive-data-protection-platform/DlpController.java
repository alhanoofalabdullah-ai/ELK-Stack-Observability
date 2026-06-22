package com.alhanoof.dlp.controller;

import com.alhanoof.dlp.dto.DlpMetricsDTO;
import com.alhanoof.dlp.service.DlpService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dlp")
public class DlpController {

    private final DlpService service;

    public DlpController(DlpService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public DlpMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/alert")
    public String createAlert() {
        return "DLP alert created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "DLP report generated successfully.";
    }
}
