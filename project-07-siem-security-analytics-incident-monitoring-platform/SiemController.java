package com.alhanoof.siem.controller;

import com.alhanoof.siem.dto.SecurityIncidentDTO;
import com.alhanoof.siem.service.SiemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/siem")
public class SiemController {

    private final SiemService service;

    public SiemController(SiemService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public SecurityIncidentDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createEvent() {
        return "Security event generated successfully.";
    }
}
