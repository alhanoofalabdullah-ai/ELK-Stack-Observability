package com.alhanoof.audit.controller;

import com.alhanoof.audit.dto.AuditMetricsDTO;
import com.alhanoof.audit.service.AuditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/audit")
public class AuditController {

    private final AuditService service;

    public AuditController(AuditService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public AuditMetricsDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createAuditEvent() {
        return "Audit event recorded successfully.";
    }
}
