package com.alhanoof.databaseaudit.dto;

public class DatabaseAuditDTO {

    private long totalQueries;
    private long privilegedActions;
    private long failedQueries;
    private long securityEvents;
    private String status;

    public DatabaseAuditDTO(
            long totalQueries,
            long privilegedActions,
            long failedQueries,
            long securityEvents,
            String status) {

        this.totalQueries = totalQueries;
        this.privilegedActions = privilegedActions;
        this.failedQueries = failedQueries;
        this.securityEvents = securityEvents;
        this.status = status;
    }

    public long getTotalQueries() {
        return totalQueries;
    }

    public long getPrivilegedActions() {
        return privilegedActions;
    }

    public long getFailedQueries() {
        return failedQueries;
    }

    public long getSecurityEvents() {
        return securityEvents;
    }

    public String getStatus() {
        return status;
    }
}
