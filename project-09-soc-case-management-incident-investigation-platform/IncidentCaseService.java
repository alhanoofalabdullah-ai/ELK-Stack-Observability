package com.alhanoof.soc.service;

import com.alhanoof.soc.dto.IncidentCaseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentCaseService {

    public List<IncidentCaseDTO> getCases() {

        return List.of(
                new IncidentCaseDTO(
                        1025L,
                        "Brute Force Attack",
                        "High",
                        "SOC Analyst",
                        "Investigating"
                )
        );
    }
}
