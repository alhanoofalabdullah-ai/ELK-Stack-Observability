package com.alhanoof.tprm.controller;

import com.alhanoof.tprm.dto.VendorRiskDTO;
import com.alhanoof.tprm.service.VendorRiskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendors")
public class VendorRiskController {

    private final VendorRiskService service;

    public VendorRiskController(
            VendorRiskService service) {

        this.service = service;
    }

    @GetMapping("/metrics")
    public VendorRiskDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/assessment")
    public String createAssessment() {
        return "Vendor assessment created successfully.";
    }

    @GetMapping("/report")
    public String generateReport() {
        return "Vendor risk report generated successfully.";
    }
}
