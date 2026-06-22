package com.alhanoof.threatintel.dto;

public class ThreatMetricsDTO {

    private long securityEvents;
    private int iocMatches;
    private int criticalThreats;
    private int activeInvestigations;
    private String status;

    public ThreatMetricsDTO(
            long securityEvents,
            int iocMatches,
            int criticalThreats,
            int activeInvestigations,
            String status) {

        this.securityEvents = securityEvents;
        this.iocMatches = iocMatches;
        this.criticalThreats = criticalThreats;
        this.activeInvestigations = activeInvestigations;
        this.status = status;
    }

    public long getSecurityEvents() {
        return securityEvents;
    }

    public int getIocMatches() {
        return iocMatches;
    }

    public int getCriticalThreats() {
        return criticalThreats;
    }

    public int getActiveInvestigations() {
        return activeInvestigations;
    }

    public String getStatus() {
        return status;
    }
}
