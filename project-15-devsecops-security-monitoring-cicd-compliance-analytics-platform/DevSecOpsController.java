package com.alhanoof.devsecops.controller;

import com.alhanoof.devsecops.dto.DevSecOpsMetricsDTO;
import com.alhanoof.devsecops.service.DevSecOpsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devsecops")
public class DevSecOpsController {

    private final DevSecOpsService service;

    public DevSecOpsController(
            DevSecOpsService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public DevSecOpsMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createEvent() {
        return "DevSecOps security event created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "DevSecOps compliance report generated successfully.";
    }
}
