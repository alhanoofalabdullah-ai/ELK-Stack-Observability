package com.alhanoof.securityreporting.controller;

import com.alhanoof.securityreporting.dto.SecurityKPIDTO;
import com.alhanoof.securityreporting.service.SecurityReportingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/security-reporting")
public class SecurityReportingController {

    private final SecurityReportingService service;

    public SecurityReportingController(
            SecurityReportingService service) {

        this.service = service;
    }

    @GetMapping("/kpis")
    public SecurityKPIDTO getKPIs() {
        return service.getKPIs();
    }

    @PostMapping("/report")
    public String generateReport() {
        return "Executive report generated successfully.";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Executive dashboard generated successfully.";
    }
}
