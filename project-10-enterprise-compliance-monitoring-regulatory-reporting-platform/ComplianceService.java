package com.alhanoof.compliance.service;

import com.alhanoof.compliance.dto.ComplianceMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class ComplianceService {

    public ComplianceMetricsDTO getMetrics() {

        return new ComplianceMetricsDTO(
                850,
                810,
                25,
                6,
                "Monitoring Required"
        );
    }
}
