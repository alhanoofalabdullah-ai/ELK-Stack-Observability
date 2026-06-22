package com.alhanoof.grc.controller;

import com.alhanoof.grc.dto.GrcMetricsDTO;
import com.alhanoof.grc.service.GrcService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grc")
public class GrcController {

    private final GrcService service;

    public GrcController(GrcService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public GrcMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createEvent() {
        return "Governance event created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Executive GRC report generated successfully.";
    }
}
