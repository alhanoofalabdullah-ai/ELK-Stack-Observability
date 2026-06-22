package com.alhanoof.uba.dto;

public class UserBehaviorDTO {

    private int activeUsers;
    private int highRiskUsers;
    private int criticalAlerts;
    private int insiderThreatIndicators;
    private String status;

    public UserBehaviorDTO(
            int activeUsers,
            int highRiskUsers,
            int criticalAlerts,
            int insiderThreatIndicators,
            String status) {

        this.activeUsers = activeUsers;
        this.highRiskUsers = highRiskUsers;
        this.criticalAlerts = criticalAlerts;
        this.insiderThreatIndicators = insiderThreatIndicators;
        this.status = status;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public int getHighRiskUsers() {
        return highRiskUsers;
    }

    public int getCriticalAlerts() {
        return criticalAlerts;
    }

    public int getInsiderThreatIndicators() {
        return insiderThreatIndicators;
    }

    public String getStatus() {
        return status;
    }
}
