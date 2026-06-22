package com.alhanoof.databaseaudit.service;

import com.alhanoof.databaseaudit.dto.DatabaseAuditDTO;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAuditService {

    public DatabaseAuditDTO getMetrics() {

        return new DatabaseAuditDTO(
                450000,
                850,
                420,
                34,
                "Healthy"
        );
    }
}
