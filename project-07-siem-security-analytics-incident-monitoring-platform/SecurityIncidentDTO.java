package com.alhanoof.siem.dto;

public class SecurityIncidentDTO {

    private long securityEvents;
    private int activeIncidents;
    private int criticalIncidents;
    private int highRiskAssets;
    private String status;

    public SecurityIncidentDTO(
            long securityEvents,
            int activeIncidents,
            int criticalIncidents,
            int highRiskAssets,
            String status) {

        this.securityEvents = securityEvents;
        this.activeIncidents = activeIncidents;
        this.criticalIncidents = criticalIncidents;
        this.highRiskAssets = highRiskAssets;
        this.status = status;
    }

    public long getSecurityEvents() {
        return securityEvents;
    }

    public int getActiveIncidents() {
        return activeIncidents;
    }

    public int getCriticalIncidents() {
        return criticalIncidents;
    }

    public int getHighRiskAssets() {
        return highRiskAssets;
    }

    public String getStatus() {
        return status;
    }
}
