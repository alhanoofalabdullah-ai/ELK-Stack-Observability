package com.alhanoof.audit.service;

import com.alhanoof.audit.dto.AuditMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class AuditService {

    public AuditMetricsDTO getMetrics() {

        return new AuditMetricsDTO(
                78500,
                1245,
                18,
                33,
                "Compliant"
        );
    }
}
