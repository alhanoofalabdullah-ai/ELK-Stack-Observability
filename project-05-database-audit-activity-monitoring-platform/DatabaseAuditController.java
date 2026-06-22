package com.alhanoof.databaseaudit.controller;

import com.alhanoof.databaseaudit.dto.DatabaseAuditDTO;
import com.alhanoof.databaseaudit.service.DatabaseAuditService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/database-audit")
public class DatabaseAuditController {

    private final DatabaseAuditService service;

    public DatabaseAuditController(
            DatabaseAuditService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public DatabaseAuditDTO getMetrics() {

        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createAuditEvent() {

        return "Database audit event recorded successfully.";
    }
}
