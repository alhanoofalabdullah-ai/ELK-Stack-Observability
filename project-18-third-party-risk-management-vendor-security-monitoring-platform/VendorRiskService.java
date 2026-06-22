package com.alhanoof.tprm.service;

import com.alhanoof.tprm.dto.VendorRiskDTO;
import org.springframework.stereotype.Service;

@Service
public class VendorRiskService {

    public VendorRiskDTO getMetrics() {

        return new VendorRiskDTO(
                420,
                18,
                74,
                11,
                "Monitoring"
        );
    }
}
