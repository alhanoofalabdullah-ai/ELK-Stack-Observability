package com.alhanoof.grc.service;

import com.alhanoof.grc.dto.GrcMetricsDTO;
import org.springframework.stereotype.Service;

@Service
public class GrcService {

    public GrcMetricsDTO getMetrics() {

        return new GrcMetricsDTO(
                265,
                18,
                42,
                11,
                92,
                "Healthy"
        );
    }
}
