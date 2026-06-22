package com.alhanoof.security.service;

import com.alhanoof.security.dto.SecurityMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public SecurityMetricsDTO getMetrics() {

        return new SecurityMetricsDTO(
                245,
                12800,
                12,
                18,
                "Warning"
        );
    }
}
