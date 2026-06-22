package com.alhanoof.security.controller;

import com.alhanoof.security.dto.SecurityMetricsDTO;
import com.alhanoof.security.service.SecurityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    private final SecurityService service;

    public SecurityController(SecurityService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public SecurityMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String generateEvent() {
        return "Security event generated.";
    }
}
