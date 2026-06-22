package com.alhanoof.iam.controller;

import com.alhanoof.iam.dto.IamMetricsDTO;
import com.alhanoof.iam.service.IamService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iam")
public class IamController {

    private final IamService service;

    public IamController(IamService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public IamMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/alert")
    public String createAlert() {
        return "IAM alert generated successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "IAM report generated successfully.";
    }
}
