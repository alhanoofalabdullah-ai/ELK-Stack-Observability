package com.alhanoof.dlp.service;

import com.alhanoof.dlp.dto.DlpMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class DlpService {

    public DlpMetricsDTO getMetrics() {

        return new DlpMetricsDTO(
                24500,
                84,
                15,
                6,
                "Monitoring"
        );
    }
}
