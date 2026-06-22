package com.alhanoof.uba.controller;

import com.alhanoof.uba.dto.UserBehaviorDTO;
import com.alhanoof.uba.service.UbaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uba")
public class UbaController {

    private final UbaService service;

    public UbaController(UbaService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public UserBehaviorDTO getMetrics() {
        return service.getMetrics();
    }

    @PostMapping("/event")
    public String createEvent() {
        return "User activity event recorded successfully.";
    }
}
