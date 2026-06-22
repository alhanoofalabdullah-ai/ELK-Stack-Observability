package com.alhanoof.securityreporting.dto;

public class SecurityKPIDTO {

    private int securityIncidents;
    private int criticalIncidents;
    private int complianceScore;
    private int securityPostureScore;
    private String riskLevel;

    public SecurityKPIDTO(
            int securityIncidents,
            int criticalIncidents,
            int complianceScore,
            int securityPostureScore,
            String riskLevel) {

        this.securityIncidents = securityIncidents;
        this.criticalIncidents = criticalIncidents;
        this.complianceScore = complianceScore;
        this.securityPostureScore = securityPostureScore;
        this.riskLevel = riskLevel;
    }

    public int getSecurityIncidents() {
        return securityIncidents;
    }

    public int getCriticalIncidents() {
        return criticalIncidents;
    }

    public int getComplianceScore() {
        return complianceScore;
    }

    public int getSecurityPostureScore() {
        return securityPostureScore;
    }

    public String getRiskLevel() {
        return riskLevel;
    }
}
