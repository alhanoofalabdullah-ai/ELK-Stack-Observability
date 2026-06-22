package com.alhanoof.security.dto;

public class SecurityMetricsDTO {

    private int failedLogins;
    private int successfulLogins;
    private int criticalAlerts;
    private int suspiciousActivities;
    private String status;

    public SecurityMetricsDTO(
            int failedLogins,
            int successfulLogins,
            int criticalAlerts,
            int suspiciousActivities,
            String status) {

        this.failedLogins = failedLogins;
        this.successfulLogins = successfulLogins;
        this.criticalAlerts = criticalAlerts;
        this.suspiciousActivities = suspiciousActivities;
        this.status = status;
    }

    public int getFailedLogins() {
        return failedLogins;
    }

    public int getSuccessfulLogins() {
        return successfulLogins;
    }

    public int getCriticalAlerts() {
        return criticalAlerts;
    }

    public int getSuspiciousActivities() {
        return suspiciousActivities;
    }

    public String getStatus() {
        return status;
    }
}
