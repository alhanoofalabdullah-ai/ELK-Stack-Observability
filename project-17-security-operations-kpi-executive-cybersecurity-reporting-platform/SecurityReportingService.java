package com.alhanoof.securityreporting.service;

import com.alhanoof.securityreporting.dto.SecurityKPIDTO;
import org.springframework.stereotype.Service;

@Service
public class SecurityReportingService {

    public SecurityKPIDTO getKPIs() {

        return new SecurityKPIDTO(
                245,
                12,
                94,
                89,
                "Medium"
        );
    }
}
