package com.alhanoof.elk.controller;

import com.alhanoof.elk.dto.LogEventDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    @PostMapping
    public String createLog(
            @RequestBody LogEventDTO log) {

        return "Log received from "
                + log.getService();
    }

    @GetMapping("/statistics")
    public String statistics() {

        return """
                Total Logs: 1250
                Errors: 45
                Warnings: 120
                Info: 1085
                """;
    }
}
