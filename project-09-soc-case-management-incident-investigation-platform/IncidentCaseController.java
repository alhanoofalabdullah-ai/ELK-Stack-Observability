package com.alhanoof.soc.controller;

import com.alhanoof.soc.dto.IncidentCaseDTO;
import com.alhanoof.soc.service.IncidentCaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cases")
public class IncidentCaseController {

    private final IncidentCaseService service;

    public IncidentCaseController(
            IncidentCaseService service) {

        this.service = service;
    }

    @GetMapping
    public List<IncidentCaseDTO> getCases() {

        return service.getCases();
    }

    @PostMapping
    public String createCase() {

        return "SOC Case Created Successfully";
    }

    @PutMapping("/{id}/close")
    public String closeCase(
            @PathVariable Long id) {

        return "Case " + id + " Closed Successfully";
    }
}
