package com.alhanoof.cloudsecurity.service;

import com.alhanoof.cloudsecurity.dto.CloudSecurityMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class CloudSecurityService {

    public CloudSecurityMetricsDTO getMetrics() {

        return new CloudSecurityMetricsDTO(
                820,
                74,
                29,
                12,
                "Monitoring"
        );
    }
}
