package com.alhanoof.fraud.service;

import com.alhanoof.fraud.dto.FraudMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class FraudService {

    public FraudMetricsDTO getMetrics() {

        return new FraudMetricsDTO(
                1450000,
                214,
                58,
                17,
                "Monitoring"
        );
    }
}
