package com.alhanoof.audit.dto;

public class AuditMetricsDTO {

    private int totalAuditEvents;
    private int privilegedActions;
    private int complianceViolations;
    private int highRiskActivities;
    private String status;

    public AuditMetricsDTO(
            int totalAuditEvents,
            int privilegedActions,
            int complianceViolations,
            int highRiskActivities,
            String status) {

        this.totalAuditEvents = totalAuditEvents;
        this.privilegedActions = privilegedActions;
        this.complianceViolations = complianceViolations;
        this.highRiskActivities = highRiskActivities;
        this.status = status;
    }

    public int getTotalAuditEvents() {
        return totalAuditEvents;
    }

    public int getPrivilegedActions() {
        return privilegedActions;
    }

    public int getComplianceViolations() {
        return complianceViolations;
    }

    public int getHighRiskActivities() {
        return highRiskActivities;
    }

    public String getStatus() {
        return status;
    }
}
