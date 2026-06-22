package com.alhanoof.erm.service;

import com.alhanoof.erm.dto.EnterpriseRiskDTO;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

    public EnterpriseRiskDTO getMetrics() {

        return new EnterpriseRiskDTO(
                185,
                24,
                7,
                16,
                "Monitoring"
        );
    }
}
