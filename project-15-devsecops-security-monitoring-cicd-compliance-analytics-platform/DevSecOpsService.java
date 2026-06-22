package com.alhanoof.devsecops.service;

import com.alhanoof.devsecops.dto.DevSecOpsMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class DevSecOpsService {

    public DevSecOpsMetricsDTO getMetrics() {

        return new DevSecOpsMetricsDTO(
                12500,
                315,
                18,
                11890,
                "Monitoring"
        );
    }
}
