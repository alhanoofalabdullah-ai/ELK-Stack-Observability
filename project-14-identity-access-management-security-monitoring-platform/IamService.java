package com.alhanoof.iam.service;

import com.alhanoof.iam.dto.IamMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class IamService {

    public IamMetricsDTO getMetrics() {

        return new IamMetricsDTO(
                5400,
                175,
                215,
                12,
                "Monitoring"
        );
    }
}
