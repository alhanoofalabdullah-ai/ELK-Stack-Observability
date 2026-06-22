package com.alhanoof.siem.service;

import com.alhanoof.siem.dto.SecurityIncidentDTO;
import org.springframework.stereotype.Service;

@Service
public class SiemService {

    public SecurityIncidentDTO getMetrics() {

        return new SecurityIncidentDTO(
                158000,
                28,
                4,
                17,
                "Warning"
        );
    }
}
