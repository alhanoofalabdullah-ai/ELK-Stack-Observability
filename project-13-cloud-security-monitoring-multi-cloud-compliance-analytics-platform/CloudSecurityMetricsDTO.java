package com.alhanoof.cloudsecurity.dto;

public class CloudSecurityMetricsDTO {

    private int cloudAssets;
    private int securityAlerts;
    private int misconfigurations;
    private int complianceViolations;
    private String status;

    public CloudSecurityMetricsDTO(
            int cloudAssets,
            int securityAlerts,
            int misconfigurations,
            int complianceViolations,
            String status) {

        this.cloudAssets = cloudAssets;
        this.securityAlerts = securityAlerts;
        this.misconfigurations = misconfigurations;
        this.complianceViolations = complianceViolations;
        this.status = status;
    }

    public int getCloudAssets() {
        return cloudAssets;
    }

    public int getSecurityAlerts() {
        return securityAlerts;
    }

    public int getMisconfigurations() {
        return misconfigurations;
    }

    public int getComplianceViolations() {
        return complianceViolations;
    }

    public String getStatus() {
        return status;
    }
}
